package Filehandling;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IntroductiontoFH {
	
	public static void main(String[] args) throws IOException {
		
		//to create a folder
		
		File folder = new File("d:\\FileHandling");
		folder.mkdir();
		
		// to create the file in that folder
		
		File file1 = new File(folder,"Student.txt");
		try {
			file1.createNewFile();
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
		File file2 = new File(folder,"frnd.txt");
		try {
			file2.createNewFile();
		}catch(IOException e ) {
			e.printStackTrace();
		}
		
		if(folder.exists()) {
			File[] list = folder.listFiles();
			for(int i=0;i<list.length;i++) {
				System.out.println(list[i].getName());
			}
		}
		
		// write data to file 
		
		FileWriter writer = new FileWriter(file1);
		writer.write("hello vishnu");
		writer.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
		bw.write("Hello RishiRao");
		bw.close();
		
		
		
		
	}

}
