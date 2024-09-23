import java.util.Scanner;

class invalidEmailException extends Exception{
    public invalidEmailException(String message){
        super(message);
    }

}
public class codelab1 {
    public static void validateEmail(String email)throws invalidEmailException{
        if(!email.endsWith("@webmail.umm.ac.id")) {
            throw new invalidEmailException("Alamat email harus diakhri dengan '@webmail.umm.ac.id");
        }
    }
public static void main(String[]args ) {
    Scanner scanner = new Scanner(System.in);
    boolean isValidEmail = false;

    while (!isValidEmail) {
        System.out.print("Masukkan alamat email anda (harus diakhiri dengan '@webmail.umm.ac.id): ");
        String email = scanner.nextLine().trim();
        try {
            validateEmail(email);
            isValidEmail = true;
            System.out.println("Alamat email anda: " + email);
        } catch (invalidEmailException e) {
            System.out.println("Kesalahan validasi Email:" + e.getMessage());
            System.out.println("Silahkan coba lagi");
        }
    }
    scanner.close();
}
    }

