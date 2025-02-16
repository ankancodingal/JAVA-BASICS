// ==================================Overload
class Student 
{
	int id;
	String name;
	float stipend;
	
	Student(){}

	Student(int id, String name){
		this.id = id;
		this.name = name;
	}

	Student(int id, String name, float stipend){
		this.id = id;
		this.name = name;
		this.stipend=stipend;
		
	}

	void displayDetails(){
		System.out.println(this.id + " | " + this.name + " | " + this.stipend);
	}
} //Student

class Main 
{
	public static void main(String[] args) 
	{
       Student st1=new Student(); //default constructor
	   Student st2=new Student(45,"Aashish"); //overloaded constructor with 2 parameters
	   Student st3=new Student(234,"Cody",10000);//overloaded constructor with 3 parameters

       st1.displayDetails();
       st2.displayDetails();
       st3.displayDetails();
	}
}
// ==================================Override
class Parent{
	public void sayHello(){
		System.out.println("Hello from Parent");
	}
}

class Child extends Parent{
	@Override
	public void sayHello(){
		System.out.println("Hello from Chid");
	}
}


class Main
{
	public static void main(String[] args) 
	{
		Parent p = new Child();   //for calling hello from child
		//Parent p = new Parent();  //for calling hello from parent
		p.sayHello();
	}
}

// ==================================Super
//Superclass 
class Superclass
{
 int number = 56;
}
//Child class or subclass or derived class
class Subclass extends Superclass
{
 /* The same variable num is declared in the Subclass
 * which is already present in the Superclass
 */
 int number = 96;
 void printNumber(){
System.out.println(number);
//System.out.println(super.number);
 }
}
class Main{
 public static void main(String args[]){
Subclass sub= new Subclass();
sub.printNumber();
 }
}


// ==================================Access

class Parent{
	protected void protect(){
		System.out.println("I'm inside protected method");
	}
}
class child extends Parent{
	private void privateMethod(){
		System.out.println("I'm inside private method");

	}
}



class Main {
  public static void main(String[] args) {

	  child kid = new child();
	  //kid.privateMethod();
	  
    System.out.println("Hello world!");
  }
}
