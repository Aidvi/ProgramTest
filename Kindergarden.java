import java.util.ArrayList;
public class Kindergarden{
    private Manager manager;
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Child> children = new ArrayList<>();


    public void setManager(Manager newmanager){
        if(newmanager.getName().equalsIgnoreCase("Per Jensen")){
            System.out.println("No managers allowed, Named Per Jensen");
        } else {
            this.manager = newmanager;
        }
    }

    public void addChild(Child child){
        if(this.children.size() !=50){
            this.children.add(child);
        } else { 
            System.out.println("This kindergarden has reached the maximum amount of children");
        }
    }
    public void addTeacher(Teacher currentTeacher){
        if(currentTeacher.getHourlySalary() < 250.00 && this.manager.getSalaryBudget() > this.calculateTotalSalary()){
            this.teachers.add(currentTeacher);
        } else { 
            System.out.println("No teachers allowed with an HourlySalary over 250");
        }
}
    public int childCount(){
        return this.children.size();
    }
    public void printChildren(){
        for(int i = 0; i < this.childCount(); i++){
            Child currentChild = this.children.get(i);
            System.out.println("Name: " + currentChild.getName());
        }
    }
    public int teacherCount(){
        return this.teachers.size();
    }
    public void printTeacher(){
        for(int i = 0; i < this.teacherCount(); i++){
            Teacher currentTeacher = this.teachers.get(i);
            System.out.println("Name: " + currentTeacher.getName() + "\nHourly Salary: " + currentTeacher.getHourlySalary());
            System.out.println();
        }
    }
    public double calculateTotalSalary(){
        double sum = 0;
        for(int i = 0; i < this.teacherCount(); i++){
            sum += this.teachers.get(i).getHourlySalary();
        }
        return sum;
    }
    public double calculateAverageSalary(double sum){
        double average = sum / this.teacherCount();
        return average;
    }
}