import java.util.Scanner;
public class Atividade02 {
    
    public static void main(String[] args) {
        double c,f,k;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a temperatura em celcius:");
        c = scanner.nextDouble();
        scanner.close();
        f = (c*9/5)+32;
        k= c+273.15;
        System.out.println("Temperatura em Celsius: " + c+ "°C");
        System.out.println("Temperatura em Fahrenheint: " + f+ "°F");
        System.out.println("Temperatura em Kelvin: " + k+ "K");
    }
    
}