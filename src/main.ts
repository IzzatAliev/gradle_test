class Main {

  public generateComputer(): void {
      let set: Set<Computer> = new Set<Computer>(); 
    for (let i = 0; i < 10; i++) {
      let computer: Computer = new Computer(1, "BMW");
        set.add(computer);
    }
    console.log(set);
  }
}

class Computer {
  id: number;
  name: string;

  constructor(_id: number, _name: string) {
    this.id = _id;
    this.name = _name;
  }
}
