package day5;
import java.io.File;
import java.util.Date;
public class Exercise1 {

	public static void main(String[] args) 
	{
		File file = new File("C:\\Users\\hindu\\Desktop");
		String[] fileList =file.list();
		for(String name:fileList) {
			 System.out.println(name);
		}
	}

}