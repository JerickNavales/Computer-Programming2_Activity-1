package Program;

public class FindingTheFirst {

  public static void main(String[] args) {
  
 
  String inputStr = "jericknavales";
  for(char i :inputStr.toCharArray()){
  if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)){
  System.out.println("First non-repeating character is; "+i);
     break;
     
    
   }
    
  }
     
    }
 
      

  }


