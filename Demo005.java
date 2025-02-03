public class Demo005 {
    public static void main(String[] args) {
        String username = "user01";
        String pwd = "user_01";
        while((username == "user01") && (pwd == "user_01")) {
            System.out.println("Succesfully login");
            break;
        }
    }
}
