import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner (System.in); //Scanner para entrada de dados
        double diaria = 100; //Valor fixo da diária do hotel
        double aumento = 0; //Aumento fixo a partir de dia 2
        int res = 31; //Dias restantes que precisam ser pagos

        System.out.print("Qual dia você chegará no hotel? ");
        int chegada = keyboardScanner.nextInt(); //Chegada no hotel
        
        //Calculo se a pessoa chegar no dia 1
        if (chegada == 1) {
            double total = 31*diaria;
            System.out.println("O valor total a pagar será: "+total);
        } 
        
        else {
            //Calculo se a pessoa chegar entre o dia 2 e dia 15  
            if (chegada < 16) {
                while (chegada > 1) {
                    aumento += 50;
                    res --;
                    chegada --;
                }
                System.out.println(res);
                double valor = diaria+aumento;
                double total = res * valor;
                System.out.println("O valor a pagar por cada diária é: R$"+valor);
                System.out.println("O valor total a pagar é: R$"+total);
            }  
            
            //Calculo se a pessoa chegar depois do dia 15
            else if (chegada > 15 && chegada < 32) {
                chegada = 0;
                res = 0;

                while (chegada <= 15) {
                    aumento += 50;
                    res ++;
                    chegada++;
                    System.out.println(aumento);
                    System.out.println(res);
                    System.out.println(chegada);
                }
                double valor = diaria+aumento;
                double total = res * valor;
                System.out.println("O valor a pagar por cada diária é: R$"+valor);
                System.out.println("O valor total a pagar é: R$"+total); 
            }
        }
        

        

    }
}