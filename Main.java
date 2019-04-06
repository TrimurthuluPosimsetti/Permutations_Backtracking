import java.util.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next(); //raeding the string
    //StringBuilder sb=new StringBuilder();
    char c[]=new char[s.length()];//char Array to store string length tuple
    int in=0;
    for(int i=0;i<s.length();i++){
      c[in]=s.charAt(i);
      permutation(s.length(),s,c,1);//calling permuation function with length of string,string,output array,initial index of c array
    }
  }
  public static void permutation(int l,String s,char c[],int in){
      for(int i=0;i<l;i++){        
        if(place(c,s.charAt(i))){//calling place function to check wheather s.charAt(i) is already exits in the c array or not
          c[in]=s.charAt(i);
          if(in==l-1){//base case when l-1==in that is one output so we print it
            for(int j=0;j<c.length;j++){
              System.out.print(c[j]+" ");
            }
            System.out.println();
          }
          else{
            permutation(l, s,c,in+1);
            c[in+1]=' '; //after backtrack we are changing modified place with initial value    
          }
        }
      }
  }
  
  /*return true when wlwmwnt not found else false when element found*/
  public static boolean place(char c[],char a){
      for(int i=0;i<c.length;i++){
        if(c[i]==a){
          return false;
        }
      }
      return true;
  }
}
