/*public class Animals {
	public void kind() {
	}
		public Animals(){
	  }
		public void said(){
			System.out.println(" Állat is vagyok.\t");
		}

}
*/

public class Animals {
	public void kind() {
		kind();
}
	private String name;

	private int weight;


	public Animals() {}

	final protected void setName(String name) {
			this.name = name;
				}

	public String getName() {
		return name;
}

	final protected void setWeight(int weight){
		this.weight=weight;
	}

	public int getWeight(){
		return weight;
	}

}
