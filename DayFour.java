

//.........Inheritance............



class Animal {

    // field and method of the parent class
    String name;
    public void eat() {
      System.out.println("I can eat");
    }
  }
  
  // inherit from Animal
  class JerryTheMouse extends Animal {
  
    // new method in subclass
    public void display() {
      System.out.println("My name is " + name);
    }
  }
  
  class DayFour {
    public static void main(String[] args) {
  
      // create an object of the subclass
      JerryTheMouse mouse = new JerryTheMouse(); // Corrected the object creation
  
      // access field of superclass
      mouse.name = "Jerry, the mouse";
      mouse.display();
  
      // call method of superclass
      // using object of subclass
      mouse.eat();
  
    }
  }
  