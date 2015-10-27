import java.util.Scanner;
import java.util.Random;

public class Cat{

  private String name ;
  private int weight;

  public void setWeight(int weight){
    this.weight = weight;
  }

  public int getWeight(){
    return weight;
  }

  public void setName(String name) {
        this.name = name;
	}

  public String getName(){
    return name;
  }

  public void data(){
    Scanner in = new Scanner(System.in);
    setName(in.nextLine());
    setWeight((int)((Math.random()*901)+100));
  }
  }
