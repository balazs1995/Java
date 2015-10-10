public class Dog extends Animals {
  public Dog(){}
  public void kind() {
    setName("Bodri");
    System.out.println("A kutya neve: "+getName());

    System.out.println("Wao");
    setWeight(50);
    System.out.println("A kutya súlya: "+getWeight()+" kg");
  }

}
