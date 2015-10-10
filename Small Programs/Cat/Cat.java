import java.util.Scanner;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Cat{
  public static void print(String outputfile ) throws IOException {

    System.out.println("\nÉn egy macska vagyok. \n Add meg a nevem: ");
    Scanner in = new Scanner(System.in);
    String name ;
    name = in.nextLine();
    int weight;
    weight = (int)((Math.random()*901)+100);

    BufferedWriter output = new BufferedWriter(new FileWriter(outputfile));

      output.write("\nDatas:\n");
      output.write("A macska neve: " + name + "\n");
      output.write("A " + name  + " súlya : " + weight + "\n");

output.close();
}

}
