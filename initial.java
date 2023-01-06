import java.util.Scanner;
import java.util.*;
//import  javafx.util.Pair


public class initial{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amnt = sc.nextInt();
    int c;
    
    int arri[] = new int[amnt];
    for(int i=0; i<arri.length; i++){
      arri[i] = sc.nextInt();
    }

    boolean ascending = true;
    for(int i=0; i<arri.length-1; i++){
      if(arri[i]>arri[i+1]){
        ascending = false;
      }
    }

    if(ascending){
      System.out.println("it is ass ending");
    }
    else{
      System.out.println("not ass ending");
      System.out.println("here is");
    }
    
    for(int i=0; i<arri.length; i++){
      for(int j=i+1; j<arri.length; j++){
        if(arri[i]>arri[j]){
          c = arri[i];
          arri[i] = arri[j];
          arri[j] = c;
        }
      }
    }

    for(int i=0; i<arri.length; i++){
      System.out.println(arri[i]);
    }

 }

} 