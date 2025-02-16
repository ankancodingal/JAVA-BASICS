// ============================Students
//this activity is mainly to undersand the concept of inheritance
//Parent Class
class Parent
{
    int age,id;
    String name;
    void naming(String name)
    {
        System.out.println("Name:"+name);
    }
}

//child class
class Child extends Parent
{
    void ageN(int age)
    {
        System.out.println("Age of student is:"+age);
    }
}
class Main
{
    public static void main(String [] er)
    {
        Child s= new Child();//creating object of child class
        s.naming("Aashish");
        s.ageN(14);
    }
    
}
// ============================Animals
//this activity is mainly to explain multi-level inheritance
//parent class
class Animal{
	void eat(){
		System.out.println("eating...Animal class...eat method");
		}
}
//child class
class Lion extends Animal{
	void roar(){
		System.out.println("Roar...Lion class...roar method");
		}
}
//child of child
class BabyLion extends Lion{
	void weep(){
		System.out.println("weeping...BabyLion class...weep method");
		}
}

class Main{
	public static void main(String args[]){
	BabyLion obj=new BabyLion();//object of child of child class
	obj.weep();
	obj.roar();
	obj.eat();
	}
}
 
// ============================	Mammals
//this activity is mainly to explain Hierarchical inheritance
//parent class
class Mammals{
	void mam(){
		System.out.println("Inside Mammals Class");
		}
}
//child class
class Lion extends Mammals{
	void roar(){
		System.out.println("Inside Lion class ");
		}
}
//child 
class Human extends Mammals{
	void hum(){
		System.out.println("Inside Human");
		}
}

class Main{
	public static void main(String args[]){
	Lion obj=new Lion();//object of child of child class
	obj.hum();//this will result in error to run this we have to create object of Human
	obj.roar();
	obj.mam();
	}
}
 
// ============================		Age
class Main {

    int age;
    Main(int age){
        age = age;
		//this.age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(24);
        System.out.println("obj.age = " + obj.age);
    }
}
