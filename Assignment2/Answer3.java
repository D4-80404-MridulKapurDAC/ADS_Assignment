import java.util.Arrays;
class Employee{
    int id;
    String name;
    double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, sal:%f \n",id,name,sal);
    }
}
public class Main {
    public static void selSort(Employee[] nums){
        int comp=0;
        for(int i=1;i<nums.length;i++){
            Employee x=nums[i];
            int j=i-1;
            while (j>=0 && nums[j].sal>x.sal){
                comp++;
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=x;
        }
        System.out.println("Comparisons :"+comp);

    }
    public static void main(String[] args) {
        Employee[] nums={new Employee(1,"sneha",100),new Employee(2,"sagar",500),new Employee(3,"mridul",700),new Employee(4,"prateek",800),new Employee(5,"priyanka",200)};
        selSort(nums);
        for (Employee x:nums) {
            System.out.print(x+" ");
        }
        //System.out.println(Arrays.toString(nums));
    }
}
