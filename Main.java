import java.util.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next(); 
    //StringBuilder sb=new StringBuilder();
    char c[]=new char[s.length()];
    int in=0;
    for(int i=0;i<s.length();i++){
      c[in]=s.charAt(i);
      permutation(s.length(),s,c,1);
    }
  }
  public static void permutation(int l,String s,char c[],int in){
      for(int i=0;i<l;i++){        
        if(place(c,s.charAt(i))){
          c[in]=s.charAt(i);
          if(in==l-1){
            for(int j=0;j<c.length;j++){
              System.out.print(c[j]+" ");
            }
            System.out.println();
          }
          else{
            permutation(l, s,c,in+1);
            c[in+1]=' ';           
          }
        }
      }
  }
  public static boolean place(char c[],char a){
      for(int i=0;i<c.length;i++){
        if(c[i]==a){
          return false;
        }
      }
      return true;
  }
}
