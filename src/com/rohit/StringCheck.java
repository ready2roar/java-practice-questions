package src.com.rohit;

public class StringCheck {

    public static void main(String[] args) {
        String s = "middleware.middleware_data_$flag hgggghg h ghgh gh gh;";
       // s = "message";
        Long flag = 1l;
        String[] test = s.split("(test to test)");

        String query = s.replace("$flag", flag.toString());
        String f = flag.toString();

        System.out.println(query);
        System.out.println(s);
        System.out.println(f);










    }

    public static final String updateQuery(String pageNumber, String offset) {

        // i want to get records from query based on offset and pageNumber in such a way that if offset is 100 i want only 100 records
        /*
        if offset = 100 and pageNumber is 1
        i need 1 to 100 records
        if offset in 100 and pageNumber is 2
        i need 101 to 200

        if offset in 50 and pageNumber is 2
        i need 51 to 100 records

        to achieve above scenario what change need to be done on query
         */
        String query =  "select employeeId, employeeName, EmployeeAddress, version, title from employee order by employeeId desc";

        return query;
    }


}
