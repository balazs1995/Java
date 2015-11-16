import java.util.Scanner;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.*;

class FileNotFoundException extends Exception{
	public FileNotFoundException(){
		super();
	}
	public FileNotFoundException(String str){
		super(str);
	}
}

public class Test {

public static void main(String[] args){



  if (args.length != 2){
      System.err.println("java test outputFileName catName");
      return ;
  }

  String outputfile = args[0];
  String catName = args[1];

  Cat cat = new Cat();


  ArrayList<String> names = new ArrayList<String>();

  names.add("Macsek");
  names.add("Macsek1");
  names.add("Macsek2");
  names.add("Macsek3");
  names.add("Macsek4");
  names.add(2,"Garfild");

  int weight2[] = new int[6];

  for (int i = 0; i<names.size(); i++){
      weight2[i] = (int) ((Math.random()*31)+20);
  }

  int sum = IntStream.of(weight2).sum();

    for(int k =0; k<names.size(); k++){

 try{

  throw new FileNotFoundException("nincs");


 }catch(FileNotFoundException inex_e){
  System.out.println("FileNotFoundException");
 }
 }


  System.out.println("\nÉn egy macska vagyok. \n Add meg a nevem: ");

  cat.data();

  try {
            BufferedWriter output = new BufferedWriter(new FileWriter(outputfile));

            output.write("\nDatas:\n");
            output.write("A macska neve: " + cat.getName() + "\n");
            output.write("A macska beadott Neve: " + catName+"\n");
            output.write("\n"+"A " + cat.getName()  + " súlya : " + cat.getWeight() +" kg"+"\n");

            output.write("A tömben lévő macskák nevei: ");

            for(int i=0;i<weight2.length;i++){

              if(names.contains("Garfild")){

                cat.setWeight(50);
                int pos = names.indexOf("Garfild");
                weight2[pos]=cat.getWeight();

              }

       output.write("\n"+"A macska neve: "+names.get(i)+"  "+weight2[i]+" kg" +"\n");
}
        output.write("\n"+"A tömben lévő macskák súlyának összeg: " + sum+"\n");
        output.close();

   		} catch (IOException ex) {
   			ex.printStackTrace();
   		}
  }

}
