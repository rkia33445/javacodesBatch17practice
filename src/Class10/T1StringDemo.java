package Class10;

public class T1StringDemo {
    public static void main(String[] args) {
        String username="Rokhay";
        String password="Abc1234567";
        String confirmPassword="Abc1234567";
        if (username.isEmpty()||password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }else if (password.length()<8){
            System.out.println("Password is too short");
        }else if (password.contains(username)){
            System.out.println("password cannot contain username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Password do not match");

        }else {
            System.out.println("Your username and password has been created");
        }
    }
}
