// Employee

class Employee 
{
	int empno;
	String name;
	float sal;
	
	Employee(){
        System.out.println("*****");
        empno = 101;
		name = "Aashish";
		sal = 5000f;
	}

	void displayDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
} 

class Main 
{
	public static void main(String[] args) 
	{

       Employee emp1 = new Employee();
       Employee emp2 = new Employee();
       Employee emp3 = new Employee();

       emp1.displayDetails();
       emp2.displayDetails();
       emp3.displayDetails();
	}
}

	//----------------------------------- Static Counter
//run this program using javac Counter.java - > java Counter
class Counter {
	//uncomment the below lines to know the importance of static keyword

	int number=10;
	//static int number=10;

	void increment(){
		number=number+1;
	}
  public static void main(String[] args) {
    Counter obj1=new Counter();
	Counter obj2=new Counter();
	Counter obj3=new Counter();
	//Guess the answer
	obj1.increment();
	obj2.increment();
	obj3.increment();

	//to check your answers uncomment the next lines
	
	//System.out.println(obj1.number);
	//System.out.println(obj2.number);
	//System.out.println(obj3.number);
 }
}

// ---------------------------------Shabd---------------------------
class Main {
  public static void main(String[] args) {
	//user input process can also be used rather than giving manual inputs
    String first="Cod";
	String second="ingal";
	String codingal=first+second;
	String codingalTrick="Welcome"+"to"+"Codingal";
	String codingalCapital=codingal.toUpperCase();
	String codingalSmall = codingalCapital.toLowerCase();
	//correct spelling is length not lenght
	int lengthOfCodingal=codingal.length();
	int lengthOfCodingalTrick=codingalTrick.length();
	int sum=lengthOfCodingal+lengthOfCodingalTrick;

	//Guess the answer before running
	// a msg can also be added for the output screen if required
	System.out.println(codingal);
	System.out.println(codingalTrick);
	System.out.println(codingalCapital);
	System.out.println(codingalSmall);
	System.out.println(sum);

  }
}

// ---------------------------------------------Report Card
import java.util.Scanner;

 class Main 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter number of subjects: ");
		int no = sc.nextInt();

		/*-- create an integer array to store no subject marks --*/
		int[] marks = new int[no];

		marksEntry(marks); //method call

		printReportCard(name, marks, no); //method call
	}

	/*---- method for marks entry ---*/
	static void marksEntry(int[] marks){
		for(int i=0;i<marks.length;i++){
			System.out.print("enter mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	}

	/*---- method for generating report card ---*/
	static void printReportCard(String name, int[] marks, int no){
		System.out.println("---------------------------------------");
		System.out.println("\t REPORT CARD");
		System.out.println("NAME: "+name);
		System.out.println("---------------------------------------");

		System.out.println("  SUBJECT \t MARK");
		System.out.println("---------------------------------------");
		
		int total = 0;

		for(int i=0;i<marks.length;i++){
			System.out.println("Subject-"+(i+1)+"\t  "+ marks[i]);
			total += marks[i];
		}
		System.out.println("---------------------------------------");

		float avg = ((float)total) / no;
		//System.out.println("TOTAL: "+total+"\tAVERAGE: "+avg);
	    System.out.printf("TOTAL: %d \tAVERAGE: %.2f \n", total,avg);
		System.out.println("---------------------------------------");
	}
}


