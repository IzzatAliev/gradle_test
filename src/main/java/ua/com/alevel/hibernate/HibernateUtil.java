package ua.com.alevel.hibernate;

import jakarta.persistence.criteria.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.io.File;
import java.sql.SQLException;

public class HibernateUtil {

    public static void main(String[] args) throws SQLException {
        HibernateUtil hibernateUtil = new HibernateUtil();
        hibernateUtil.connect();
    }

    public void connect() throws SQLException {
        try (SessionFactory sessionFactory = new Configuration()
                .configure(new File("src/main/resources/hibernate.cfg.xml"))
                .buildSessionFactory();
             Session session = sessionFactory.openSession();) {
            session.getTransaction().begin();
            session.persist(new Car("toyota", "x570", 600.0));
//            session.beginTransaction().commit(); NO NEED
//            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); //DDL
//            CriteriaQuery<Car> criteriaQuery = criteriaBuilder.createQuery(Car.class);//DML
//            Root<Car> root = criteriaQuery.from(Car.class);
            session.flush();
        }
    }
}
