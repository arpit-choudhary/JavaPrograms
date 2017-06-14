package newPackage1;

public class Table {

	public Table(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		
		Table obj=new Table("arpit");
		obj.findTable(8);
	}
		
	public void findTable(int a)
		{
			int i=1;
			while(i<11)
			{
				System.out.println(i*a);
				i++;
				
			}
		}
	

}
