package studentlist;

/**
 * This class +++Insert Description Here+++
 * @author Long Ong
 */
import java.util.Scanner;
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] sList=new Student[5];
        
        Scanner input=new Scanner(System.in);
        
        for(int i=0;i<sList.length;i++){
            System.out.println("Enter id:");
            int id=input.nextInt();
            System.out.println("Enter name:");
            String name=input.next();
            
            sList[i]=new Student(id,name);
        }
        
    }

}
