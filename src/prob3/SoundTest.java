package prob3;

public class SoundTest {

	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	//내가 잘 모르는 부분! 
	public static void printSound(Object obj){
		if(obj instanceof Cat){
			System.out.println(((Cat)obj).sound());
		}else if(obj instanceof Dog){
			System.out.println(((Dog)obj).sound());
		}else if(obj instanceof Sparrow){
			System.out.println(((Sparrow)obj).sound());
		}else{
			System.out.println(((Duck)obj).sound());
		}
	}
}
