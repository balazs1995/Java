public class Cat extends Animals {
  public Cat(){}
  public void kind() {
    setName("Cica");
    System.out.println("Én egy macska vagyok.");

    System.out.println("A macska neve: "+getName());

    setWeight(50);
    System.out.println("A macska súlya: "+getWeight()+" kg");
  }

}
