import java.util.ArrayList;
public class Zoo{

  public static void main(String[] args){

    int fullweight = 0 ;

   Fox fox = new Fox();
   Tiger tiger = new Tiger();
   Lion lion = new Lion();
   Dog dog = new Dog();
   Cat cat = new Cat();

   ArrayList<Animals> zoo = new ArrayList<Animals>();
   zoo.add(new Fox());
   zoo.add(new Lion());
   zoo.add(new Tiger());
   zoo.add(new Dog());
   zoo.add(new Cat());

   for (Animals anim: zoo) {
   		anim.kind();
   }

  /*  ArrayList<Animals> weight2 = new ArrayList<Animals>();
    weight2.add(new Lion());
    weight2.add(new Dog());
    weight2.add(new Tiger());
    weight2.add(new Fox());

    for(Animals anim:weight2){
      anim.getWeight();
      anim.kind();
      fullweight+=anim.getWeight();

    }*/
  //  System.out.println("Állatok összes súlya: " + fullweight +" kg.");



  }
}
