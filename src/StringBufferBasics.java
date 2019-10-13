
public class StringBufferBasics {
//StringBuffer peer class of String.StringBuffer is growable and writable character sequence
//String class objects are immutable and it is fixed length.
//StringBuilder is same as StringBuffer for bith objects are mutable.
//stringBuilder and String buffer use in multithreading and StringBuffer has synchonization 
	//but string builder not have syntronization
	//to use object of StringBuilder is not safe
	
	public static void main(String[] args) {
		String s1="Unitedstates";
	
		System.out.println("String :"+s1);//s1 is not change 
		
		String s4=new String("Unitedstates");
		concat1(s4);
		System.out.println("String :"+s4);//s1 is not change 
		
		StringBuffer s2= new StringBuffer("Unitedstates");
		concat2(s2);
		System.out.println("StringBuffer :"+s2);//s2 is changed
		
		StringBuilder s3= new StringBuilder("Unitedstates");
		concat2(s3);
		System.out.println("StringBuffer :"+s3);//s3 is changed

	}
	public static void concat1(String s1) {
		s1=s1+"america";
		//System.out.println("String :"+s1);//s1 is not change 
	}
	public static void concat2(StringBuffer s2) {
		s2.append(s2);
	}
	public static void concat2(StringBuilder s3) {
		s3.append(s3);
	}
}
