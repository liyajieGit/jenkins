/*import java.io.Serializable;

import org.springframework.beans.BeanMetadataAttributeAccessor;
import org.springframework.beans.BeanUtils;


public class Dog  implements  Cloneable ,Serializable {
	
	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 7856338988987604270L;
	*//**
	 * 
	 *//*
	//private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	
	public Dog(int age,String name){
		
		
		
		this.age=age;
		this.name=name;
		
	}
	
	
		
		
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	//	A a=new A();
		//a.setName("test");
		Dog  d=new Dog(this.age, this.name);
		System.out.println("doing  clone");
		return d;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}
		
		
	public static void main(String[] args) throws CloneNotSupportedException {
	
		Dog  d1=new Dog(1,"d1");
		Dog d2=BeanUtils.cloneBean(d1);
		
		//d1.a.setName("test1");;
		
		
		System.out.println(d1.getAge()+"  "+d1.getName());
		
		System.out.println(d2.getAge()+"  "+d2.getName());
		
		
		
	}	

	

}
class  A implements Cloneable{
	
	
	private String name;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}}

*/