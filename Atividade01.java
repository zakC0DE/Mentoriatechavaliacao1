import java.util.Scanner;
public class Atividade01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as 8 notas do aluno");
        
        double n1, n2, n3, n4,n5,n6,n7,n8,medias;
        n1 = scanner.nextDouble();
        n2 =scanner.nextDouble();
        n3 =scanner.nextDouble();
        n4 =scanner.nextDouble();
        n5 =scanner.nextDouble();
        n6 =scanner.nextDouble();
        n7 = scanner.nextDouble();
        n8 = scanner.nextDouble();
        
        scanner.close();
        
        System.out.println("1° Bimestre:" + (n1+n2 )/2);
        System.out.println("2° Bimestre:" + (n3+n4 )/2);
        System.out.println("1° Semestre:" + (n1+n2+n3+n4)/4);
        System.out.println("3° Bismestre:" + (n5+n6)/2);
        System.out.println("4° Bismestre:" + (n7+n8)/2);
        System.out.println("2° Semestre:" + (n5+n6+n7+n8)/4);
        System.out.println("Media final:" + (n1+n2+n3+n4+n5+n6+n7+n8)/8);
        
    }
    
}