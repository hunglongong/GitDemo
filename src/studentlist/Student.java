
package studentlist;

/**
 *
 * @author Long Ong
 */
public class Student {
    private int studId;
    private String studName;
    
    public Student(){}
    
    public Student(int studId, String studName){
        this.studId=studId;
        this.studName=studName;
    }
    
    public int getStudId(){
        return studId;
    }
    
    public void setStudId(int id){
        studId= id;
    }
    
    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
        //nothing
    }
    
}
