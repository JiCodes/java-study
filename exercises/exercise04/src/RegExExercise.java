import java.util.regex.Pattern;
public class RegExExercise {
    public static void main(String[] args) {
        // Pattern 1: Email address
        Pattern emailPattern = Pattern.compile("^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$");

        String email1 = "testUser1@NnnEeeUniversity.edu";
        String email2 = "not.a-valid#email,org";
        System.out.println("result for Email pattern:");
        System.out.println(email1 + ": " + emailPattern.matcher(email1).matches());
        System.out.println(email2 + ": " + emailPattern.matcher(email2).matches() + "\n");

        // Pattern 2: Phone number
        Pattern phonePattern = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$");
        String phone1 = "669-786-8351";
        String phone2 = "6697868351";
        System.out.println("Phone pattern:");
        System.out.println(phone1 + ": " + phonePattern.matcher(phone1).matches());
        System.out.println(phone2 + ": " + phonePattern.matcher(phone2).matches() + "\n");

        // Pattern 3: URL
        Pattern urlPattern = Pattern.compile("^https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        String url1 = "https://www.nnneeeuniversity.edu";
        String url2 = "hppt//:xyz.ascii256@gmail.net";
        System.out.println("URL pattern:");
        System.out.println(url1 + ": " + urlPattern.matcher(url1).matches());
        System.out.println(url2 + ": " + urlPattern.matcher(url2).matches() + "\n");

        // Pattern 4: Date in MM/DD/YYYY format
        Pattern datePattern = Pattern.compile("^(0\\d|1[0-2])/([0-2]\\d|3[0-1])/\\d{4}$");
        String date1 = "03/18/2023";
        String date2 = "19/84/0042";
        System.out.println("Date pattern:");
        System.out.println(date1 + ": " + datePattern.matcher(date1).matches());
        System.out.println(date2 + ": " + datePattern.matcher(date2).matches() + "\n");

        // Pattern 5: Password that contains at least one uppercase, one lowercase, one digit, and one special character
        Pattern passwordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        String password1 = "1Password*";
        String password2 = "adminadmin";
        System.out.println("Password pattern:");
        System.out.println(password1 + ": " + passwordPattern.matcher(password1).matches());
        System.out.println(password2 + ": " + passwordPattern.matcher(password2).matches());
    }
}
