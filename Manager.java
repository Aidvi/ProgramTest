public class Manager{
    private String name;
    private double salaryBudget;

    public Manager(String name, double salaryBudget){
        this.name = name;
        this.salaryBudget = salaryBudget;
    }
    public String getName(){
        return this.name;
    }
    public double getSalaryBudget(){
        return this.salaryBudget;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalaryBudget(double salaryBudget){
        this.salaryBudget = salaryBudget;
    }

}
