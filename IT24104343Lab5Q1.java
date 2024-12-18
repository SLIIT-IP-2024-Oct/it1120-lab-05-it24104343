import java.util.Scanner;
class IT24104343Lab5Q1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

    System.out.println("Enter the first input");
    
    int firstNumber = myObj.nextInt();
    
    System.out.println("Enter the second input");
    
    int secondNumber = myObj.nextInt();
    
    
    System.out.println("Enter the third input");
    
    int thirdNumber = myObj.nextInt();
    
	System.out.println("The user entered numbers are " + firstNumber + "," + secondNumber + "," + thirdNumber);
	
    if(firstNumber<secondNumber){
        
        if(firstNumber<thirdNumber){
            System.out.println("The smallest number is " + firstNumber );
        }
    }
    if(secondNumber<firstNumber){
        
        if(secondNumber<thirdNumber){
            System.out.println("The smallest number is " + secondNumber );
        }


    else{ 
        
        System.out.println("The smallest number is " + thirdNumber);
    
    }
        
        
    }
    

    //Largest Number

    if(firstNumber<secondNumber){
        
        if(firstNumber>thirdNumber){
            System.out.println("The largest number is " + firstNumber );
        }
    }

    if(secondNumber<firstNumber){
        
        if(secondNumber>thirdNumber){
            System.out.println("The largest number is " + secondNumber );
        }
    
    }

    else{ 
        
        System.out.println("The largest number is " + thirdNumber);
    
    }
   
  }
}