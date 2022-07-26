package day2.exercise2;

public class EmployeeService {
    private String employees[] = {"101001011", "102001022", "103002011", "104003080", "105002020", "106002080"};
    /*
     * Note : employee codes are designed in following way:
     * a) first 3 digits are employee code
     * b) next 3 digits are related to their department id.
     * c) and last 3 digits are the city code of their work location
     *     for example
     *       011 : Delhi
     *       022 : Mumbai
     *       080 : Banglore
     *       020 : Pune
     * */

    public String[] getEmployeeCodes() {
        String codes[] = new String[employees.length];
        int count = -1;
        for (String empid : employees) {
            codes[++count] = empid.substring(0, 3);
        }

        return codes;
    }

    public void getEmployeeCodesWithLocation() {
        String[] locationCode = new String[employees.length];
        int count = -1;

        for (String empLocationCode : employees) {
            String location = empLocationCode.substring(6);
            switch (location) {
                case "011":
                    System.out.println(empLocationCode.substring(0, 3) + " is in " + (locationCode[++count] = "Delhi"));
                    break;
                case "022":
                    System.out.println(empLocationCode.substring(0, 3) + " is in " + (locationCode[++count] = "Mumbai"));
                    break;
                case "080":
                    System.out.println(empLocationCode.substring(0, 3) + " is in " + (locationCode[++count] = "Bangalore"));
                    break;
                case "020":
                    System.out.println(empLocationCode.substring(0, 3) + " is in " + (locationCode[++count] = "Pune"));
                    break;

                default:
                    locationCode[++count] = "Unknown location";

            }
        }
    }

}
