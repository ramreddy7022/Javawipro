package day5;
import java.io.File;
import java.io.FilenameFilter;
public class Exercise2 {
       public static void main(String a[]){
        File file = new File("C:\\Users\\hindu\\Downloads\\Prodigy Source Code -20250725T044402Z-1-001.zip\\Prodigy Source Code ");
           String[] list = file.list(new FilenameFilter() {
           @Override
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".py")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}

