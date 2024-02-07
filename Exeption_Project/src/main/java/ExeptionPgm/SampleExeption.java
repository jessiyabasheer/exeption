package ExeptionPgm;

public class SampleExeption {
	public void display()
	{
		int a=10;
		try{
			int b=a/0;
			System.out.println(b);
			
		}
		/*catch(Exception e) {
			System.out.println("exception handled");
			//System.out.println(e);
			e.printStackTrace();
		}*/
		finally {
			System.out.println("finally block");
		}
	}

	public static void main(String[] args) {
		SampleExeption obj=new SampleExeption();
	//	System.out.println("end of the statement");
		obj.display();
		System.out.println("end of the statement");
	}

}
