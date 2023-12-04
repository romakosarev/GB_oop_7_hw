package observer;

public class App {
    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Gxxgle", publisher, 50000);
        Company yandex = new Company("Yandex", publisher, 850000);
        Company apple = new Company("Apple", publisher, 300000);
        Company newSoft = new Company("NewSoft", publisher, 20000);
        Company oldSoft = new Company("OldSoft", publisher, 300000);
        Company softLine = new Company("SoftLine", publisher, 5000);


        Employee[] employees = EmployeeFabric.generateEmployees(5);
        for (Employee e : employees) {

            publisher.registerObserver(e);

        }

        for (int i = 0; i < 3; i++) {
            google.needEmployee(EmployeeType.Student, JobType.Junior);
            yandex.needEmployee(EmployeeType.Worker, JobType.Cleaner);
            apple.needEmployee(EmployeeType.Master, JobType.TeamLead);
            newSoft.needEmployee(EmployeeType.Worker, JobType.Security);
            oldSoft.needEmployee(EmployeeType.Master, JobType.Senior);
            softLine.needEmployee(EmployeeType.Student, JobType.Intern);
        }


    }
}