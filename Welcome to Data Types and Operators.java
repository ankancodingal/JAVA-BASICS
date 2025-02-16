// Calcii
class Main {
  public static void main(String[] args) {
    int a=10;
	int b=5;
	int sum=a+b;
	int diff=a-b;
	int mult=a*b;
	int div=a/b;
	String magic="===========Magic=========";
	System.out.println("==========Method 1===========");
	System.out.println("Additon of a&b: "+sum);
	System.out.println("Subtraction  of a&b:"+diff);
	System.out.println("Multiplication of a&b: "+mult);
	System.out.println("Division  of a&b: "+div);
	System.out.println("=============Method 2============");
	System.out.println("Additon of a&b: "+(a+b));
	System.out.println("Subtraction  of a&b:"+(a-b));
	System.out.println("Multiplication of a&b: "+(a*b));
	System.out.println("Division  of a&b: "+(a/b));
	System.out.println("Remainder : " +(a%b));
	System.out.println(magic);
	System.out.println("Addition: "+(a+b)+" Subtraction: "+(a-b)+" Multiplication: "+(a*b)+" Division: "+(a/b));
  }
}


// Mind Riddler
class Main {
  public static void main(String[] args) {

	int a=10;
	int b=5;
    System.out.println("==============Guess the Answers==========");

	System.out.println("Uninary Operator"+ (a++));
	System.out.println("Uninary Operator"+ (++b));
	System.out.println("Binary Operator");
	System.out.println("1+2 " +1+2);
	System.out.println("1+2 " +(1+2));
	System.out.println(1+2 +" =3");
	int increment = ++a * b++;
	System.out.println(increment);
	//uncomment the next lines to know the values
	//System.out.println("Current Value of a: " +a);
	//System.out.println("Current Value of b: " +b);
	System.out.println("Ternany Operator");
	int largestNumber=(a>b)?a:b;
	System.out.println("Largest of 2 numbers: "+largestNumber);

  }
}

// Maggieclass Main {
  public static void main(String[] args) {
    System.out.println("My Maggie Recipe");
	Maggie();
  }

  public static void Maggie(){
	  System.out.println("1.Boil water in pan");
	  System.out.println("2.Now add your special maggie recipe after this");
  }
}


