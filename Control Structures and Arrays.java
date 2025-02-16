//--------------------------- Ten10
class Main {
  public static void main(String[] args) {
	  //using for loop
	   for(int i=10; i>1; i--){
              System.out.println("The value of i is: "+i);
         }    

	//using while loop
	int j=0;
	while(j<11){
		System.out.println("The value of i is: "+j);
		j++;
	}
  }
}

// ----------------------------Hello User
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
	System.out.println("Hello User please Enter your Name: ");
	String name=sc.nextLine();
	System.out.println("Enter your lucky number");
	int lucky=sc.nextInt();
	System.out.println("Hello "+name +", Your lucky number " +lucky +" shows you are really hardworking.Keep it up!");

  }
}

//----------------------------------- Grading System
import java.util.*;

class Main {
  public static void main(String[] args) {
	int sum=0;
    String result;
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of Subjects: ");
	int noOfSubjects = sc.nextInt();
	int marks[]=new int[noOfSubjects]; //intializing array
	System.out.println("Enter the marks of " +noOfSubjects +" Subjects.Press Enter to give marks for another subject");
	//entering marks
	for(int i=0;i<noOfSubjects;i++){
		marks[i]=sc.nextInt();
	}//calculating sum
	for(int j=0;j<noOfSubjects;j++){
		sum=sum+marks[j];
	}//generating result
	int percentage=sum/noOfSubjects;
	//can also be written as
	//int percentage=(sum/noOfSubjects*100)*100;
	System.out.println(percentage);
	if(percentage>= 95){
		result="You scored O grade. Great Work!";

	}else if(percentage>90 && percentage<95){
		result="You scored A+.Well Done!";
	}
	//make sure to to create grading for other marks too
	//percentage can also be converted to cgpa
	else {
		result="you passed";
	}
	System.out.println(result);
  }
}

	// ------------------------Ulta
class Main {
  public static void main(String[] args) {
	//students can even take manual inputs
	
    int num = 42157, reversed = 0;

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
	
  }

  //another method

  /*int num = 75124, reversed = 0;

    for(;num != 0; num /= 10) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
    }

    System.out.println("Reversed Number: " + reversed);
	*/
}
