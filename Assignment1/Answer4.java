class Employee{
    public  int empid;
    public String name;
    public double salary;
}
public class Answer4 {

    public static Employee findById(Employee[] eArr,int id){
        for(Employee e : eArr){
            if(e.empid == id)return e;
        }
        return null;
    }
    public static Employee findByName(Employee[] eArr,String name){
        for(Employee e : eArr){
            if(e.name.equals(name)){
                return e;
            }
        }
        return null;
    }
    public static Employee findBySalary(Employee[] eArr,Double sal){
        for(Employee e : eArr){
            if(e.salary == sal){
                return e;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
