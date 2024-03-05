import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Arrays para armazenar emails e senhas
    private static ArrayList<String> list_emails = new ArrayList<>();
    private static ArrayList<String> list_passwords = new ArrayList<>();
    private static ArrayList<String> list_citys = new ArrayList<>();
    private static ArrayList<String> list_contrys = new ArrayList<>();
    private static ArrayList<String> list_mobile = new ArrayList<>();

    public static void main(String[] args) {
        choose();
    }

    public static void choose(){
        Scanner choose_LR = new Scanner(System.in);
        System.out.println("Possui uma conta ou deseja criar uma ? \nDigite [L] para fazer login ou [R] para registrar-se ");
        String choose_L_or_R = choose_LR.nextLine().toLowerCase();
        try
        {
            if (choose_L_or_R.equals("l")) {
                login();
            } else if (choose_L_or_R.equals("r")) {
                register();
            } else {
                System.out.println("Digite apenas um dos caminhos anunciados.");
                choose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void login(){
        login_message();

        Scanner scanner = new Scanner(System.in);
        String email = "";

        while (email.isEmpty()) {
            System.out.print("Email: ");
            email = scanner.nextLine().trim();

            if (email.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira um email válido.");
            }
        }


        String password = "";

        while (password.isEmpty()) {
            System.out.print("Usuário: ");
            password = scanner.nextLine().trim();

            if (password.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira uma senha válida.");
            }
        }


        // Verificar se o email e a senha coincidem com os arrays correspondentes
        boolean loginSuccessful = false;
        for (int i = 0; i < list_emails.size(); i++) {
            if (list_emails.get(i).equalsIgnoreCase(email) && list_passwords.get(i).equals(password)) {
                loginSuccessful = true;
                break;
            }
        }

        if (loginSuccessful) {
            System.out.println("Login bem sucedido!");
        } else {
            System.out.println("Email ou senha incorretos. Tente novamente.");
            choose();
        }
    }

    public static void login_message(){
        System.out.println("*-----* Login *-----*");
    }

    public static void register() {
        register_message();


        Scanner scanner = new Scanner(System.in);
        String userName = "";

        while (userName.isEmpty()) {
            System.out.print("Usuário: ");
            userName = scanner.nextLine().trim();

            if (userName.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira um usuário válido.");
            }
        }


        String email = "";

        while (email.isEmpty()) {
            System.out.print("Email: ");
            email = scanner.nextLine().trim();

            if (email.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira um email válido.");
            }
        }


        String country = "";

        while (country.isEmpty()) {
            System.out.print("Estado: ");

            if (country.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira um estado válido.");
            }
        }


        String city = "";

        while (city.isEmpty()) {
            System.out.print("City: ");

            if (city.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira uma cidade válida.");
            }
        }


        System.out.print("Número de Celular (com ddd da cidade e sem espaços): ");
        String mobile = scanner.nextLine();
        mobile = mobile.trim();

        // Verifica se o email já existe na lista
        if (list_emails.contains(email)) {
            System.out.println("Este email já está registrado. Por favor, escolha outro.");
            register(); // Chama novamente o método de registro
            return; // Retorna para evitar adicionar o email repetido à lista
        }

        String password  = "";

        while (password.isEmpty()) {
            System.out.print("Senha: ");
            password = scanner.nextLine().trim();

            if (password.isEmpty()) {
                System.out.println("O campo não pode ficar vazio. Por favor, insira uma senha válida.");
            }
        }


        // Adiciona o email e a senha aos arrays correspondentes
        list_emails.add(email);
        list_passwords.add(password);
        list_citys.add(city);
        list_contrys.add(country);
        list_mobile.add(mobile);

        System.out.println("Conta criada com sucesso!");
        login(); // Chama o método de login após o registro
    }

    public static void register_message(){
        System.out.println("*-----* Cadastre-se *-----*");
    }
}
