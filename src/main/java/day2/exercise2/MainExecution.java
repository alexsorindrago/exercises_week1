package day2.exercise2;

public class MainExecution {
    public static void main(String[] args) {

        // method call for employee codes

        EmployeeService service = new EmployeeService();
        String codes[] = service.getEmployeeCodes();

        for (String empid : codes) {
            System.out.println(empid);
        }

        // method call for employee with location

        service.getEmployeeCodesWithLocation();


        // method call for email provider occurrence

        EmailService emailService = new EmailService();

        emailService.countEmailProvider(emailService.emails);

    }

}
