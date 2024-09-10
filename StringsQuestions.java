
public class StringsQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    //create a string variable
		    String greet="Hello World";//declaration and assignment
		    String wish;//declaration
		    wish="Good Morning";//assignment
		    
		    //print a string variable
		    System.out.println("String:"+greet);
		    System.out.println("Wish Message:"+wish);
		    
		    //get the length of string
		    int lengthGreet=greet.length();
		    int lengthWish=wish.length();
		    System.out.println("Length of greet:"+lengthGreet);
		    System.out.println("Length of wish:"+lengthWish);
		    
		    //join two java strings
		    String firstName="John";
		    String lastName="Doe";
		    String fullName;
		    
		    //string join with + operator
		    fullName="Mr. "+firstName+" "+lastName;
		    System.out.println(fullName);
		    
		    //string join with concat() function
		    fullName="Mr. ".concat(firstName).concat(" ").concat(lastName);
		    System.out.println(fullName);
		    
		    //compare two strings
		    
		    String x="Hello";
		    String y="Hello";
		    
		    System.out.println(x==y);
		    
		    String a=new String("Hello");
		    String b=new String("hello");
		    
		    System.out.println(a.equals(b));//false
		    System.out.println(a.equalsIgnoreCase(b));//true
		    
		    //escape characters
		    
		    String sentence="Hello \"Rakesh\" ";
		    
		    System.out.println(sentence);
		    
		    //  \"    "
		    // \'     '
		    // \n     new line character
		    // \b     backspace
		    //  \r   carriage return
		    //  \t tab space
		    
		    System.out.println(sentence.contains("Hello"));
		    
		    
		    String str1="I";
		    String str2="Love";
		    String str3="Java";
		    
		    System.out.println(String.join("-",str1,str2,str3));
		    
		    
		    //Substring
		    System.out.println("Good Morning".substring(2));//od Morning
		    System.out.println("Good Morning".substring(2,6));//od M
		    System.out.println("Good Morning".subSequence(0, 4));//Good
		    
		    
		    //Replace
		    
		    String str4="Ramesh  Ramesh Yadav Vaibhav";
		    
		    System.out.println(str4.replace("Ramesh","Ajay"));
		    
		    System.out.println(str4.replaceAll("[av]","-"));
		    
		    //get specific character
		    
		    System.out.println(str4.charAt(0));
		    
		    //upper case
		    System.out.println(str4.toUpperCase());
		    //lower case
		    System.out.println(str4.toLowerCase());
		    
		    //SPlit a string into array
		    String fruits="Apple Grapes Banana Mango Orange";
		    String fruitArr[]=fruits.split(" ");
		    
		    System.out.println(fruitArr.length);
		    System.out.println(fruitArr[0]);
		    
		    for(String e:fruitArr) {
		      System.out.println(e);
		    }
		    
		    //string to character array
		    
		    String str5="Akash";
		    
		    char chrArr[]=str5.toCharArray();
		    
		    System.out.println(chrArr[0]);
		    
		    for(char e:chrArr) {
		      System.out.println(e);
		    }
		    
		    
		    //String is empty or not
		    String str6=" Akash";
		    str6=str6.trim();
		    System.out.println(str6.isEmpty());
		    System.out.println(str6);
		    
		    
		    

		  }

		

	}


