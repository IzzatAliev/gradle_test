package ua.com.alevel.mail_sender;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class MailSender {

    static String to;
    static String from;
    static String password;
    static String host;

    private static void config() throws ConfigurationException {
        PropertiesConfiguration configuration = new PropertiesConfiguration();
        configuration.load("src/main/resources/application.properties");
        to = configuration.getString("to");
        from = configuration.getString("from");
        password = configuration.getString("password");
        host = configuration.getString("host");
    }

    public static void main(String[] args) throws Exception {
        config();
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });
        session.setDebug(true); //console debug
        for (int i = 0; i < 5; i++)
        {
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject("MultiPart gradle" + i);
        Multipart multipart = new MimeMultipart();
        BodyPart bodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource("iua.doc");
        System.out.println(source.getInputStream().read());
        bodyPart.setDataHandler(new DataHandler(source));
        bodyPart.setFileName("iua.doc");
        multipart.addBodyPart(bodyPart);
        message.setContent(multipart);
        System.out.println("sending...");
        Transport.send(message);
        System.out.println("Sent message successfully....");
        }
    }
}
