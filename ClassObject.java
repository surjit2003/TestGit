
public class ClassObject {
	int age;
	String name;
	String profession;
	static String country="India";
	
	ClassObject(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public void ClassObject() {
		System.out.println("testing method name");
		
	}
	public void display(int i) {
		age=i;
		
	}
	public void change() {
		country="England";
		
	}
	public void display() {
		System.out.println("Name="+name+ " age= "+age+ " Profession=" +profession+ " Country=" +country);
	}
	static public void main(String args[]) {
		ClassObject obj1=new ClassObject(20,"John");
		//obj1.ClassObject();
		obj1.display();
		obj1.change();
		obj1.display();
		
		//obj1.display(40);
		//obj1.display();
	}

}
