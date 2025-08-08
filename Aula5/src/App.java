import br.com.user.User;

public class App {
    public static void main(String[] args) {
        User userA = new User();

        userA.firstName = "Aldo";
        userA.lasttName = "Ribeiro";
        userA.idade = 40;

        System.out.println(userA.firstName + " " + userA.lasttName);
        System.out.println(userA.idade);


    }
}
