import java.util.Scanner;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

public static void main(String[] args){

  if (args.length != 1){
      System.err.println("java test outputFileName");
      return ;
  }


  try {
        Cat.print(args[0]);

   		} catch (IOException ex) {
   			ex.printStackTrace();
   		}

  }

}
