public class Main{
    
    public static void main(String[] args){
        Kindergarden kindergarden = new Kindergarden();
        Manager hans = new Manager("Hans", 400);
        Child per = new Child("Per");
        Child hanna = new Child("Hanna");
        Child hubert = new Child("Hubert");
        Child caroline = new Child("caroline");
        Teacher jens = new Teacher();
        Teacher helle = new Teacher();

        jens.setName("Jens Henriksen");
        jens.setHourlySalary(180.00);
        helle.setName("Helle Petersen");
        helle.setHourlySalary(185.00);
        
        kindergarden.setManager(hans);
        kindergarden.addTeacher(jens);
        kindergarden.addTeacher(helle);
        kindergarden.addChild(per);
        kindergarden.addChild(hanna);
        kindergarden.addChild(hubert);
        kindergarden.addChild(caroline);

        kindergarden.printChildren();
        kindergarden.printTeacher();

        System.out.println(kindergarden.calculateAverageSalary(kindergarden.calculateTotalSalary()));

    } 
}