package Atividade3;

import java.util.Scanner;

public class Atividade3 {

    static double valortotal;
    static double valorcliente;
    static double N;


    public static void main(String[] args){

    Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor total: ");
        valortotal= leitor.nextFloat();

        System.out.println("Digite o valor Dado pelo cliente: ");
        valorcliente= leitor.nextFloat();

        int notasde100 = 0,notasde50 = 0,notasde20 = 0,notasde10 = 0,notasde5 = 0,notasde2 = 0 ,notasde1 = 0;
        float moeda50 = 0,moeda25 = 0,moeda10 = 0,moeda5 = 0,moeda1 = 0;

        if(valortotal>valorcliente){
            System.out.println("ERRO");
        }
        double N = (valorcliente-valortotal);

        //System.out.println(N);
        if(N >= 100){
            notasde100 = (int) (N/100);
        }
        System.out.print("nota(s) de R$ 100,00: ");
        System.out.println(notasde100);

        if(N >= 50){
            notasde50= (int) ((N-(notasde100*100))/50);
        }

        System.out.print("nota(s) de R$ 50,00: ");
        System.out.println(notasde50);

        if(N >= 20)
        {
            notasde20= (int) ((N-(notasde100 * 100) - (notasde50 * 50)) / 20);
        }
        System.out.print("nota(s) de R$ 20,00: ");
        System.out.println(notasde20);

        if(N >= 10){
            notasde10 = (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20))/10);
        }
        System.out.println("nota(s) de R$ 10,00: ");
        System.out.println(notasde10);
        if(N>=5)
        {
            notasde5= (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10))/5);
        }
        System.out.println("nota(s) de R$ 5,00: ");
        System.out.println(notasde5);
        if(N >= 2){
            notasde2= (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5))/2);
        }
        System.out.println("nota(s) de R$ 2,00: ");
        System.out.println(notasde2);
        if(N >= 1){
            notasde1= (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5)-(notasde2*2)) / 1);
        }
        System.out.println("nota(s) de R$ 1,00: ");
        System.out.println(notasde1);


        if(N>=0.50f){
            moeda50 = (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5)-(notasde2*2)-(notasde1*1)-(moeda50*0.50f)/ 0.50f));
        }
        System.out.print("Modeda de 50 centavos: ");
        System.out.println(moeda50);

        if(N>=0.25f){
            moeda25 = (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5)-(notasde2*2)-(notasde1*1)-(moeda50*0.50f)-(moeda25*0.25f)/ 0.25f));
        }
        System.out.print("Modeda de 25 centavos: ");
        System.out.println(moeda25);

        if(N>=0.10f){
            moeda10 = (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5)-(notasde2*2)-(notasde1*1)-(moeda50*0.50f)-(moeda25*0.25f)-(moeda10*0.10)/ 0.10f));
        }
        System.out.print("Modeda de 10 centavos: ");
        System.out.println(moeda10);

        if(N>=0.05f){
            moeda5 = (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5)-(notasde2*2)-(notasde1*1)-(moeda50*0.50f)-(moeda25*0.25f)-(moeda10*0.10)-(moeda5*0.05)/ 0.05f));
        }
        System.out.print("Modeda de 5 centavos: ");
        System.out.println(moeda5);


        if(N>=0.01f){
            moeda1 = (int) ((N-(notasde100*100)-(notasde50*50)-(notasde20*20)-(notasde10*10)-(notasde5*5)-(notasde2*2)-(notasde1*1)-(moeda50*0.50f)-(moeda25*0.25f)-(moeda10*0.10)-(moeda5*0.05)-(moeda1*0.01)/ 0.01f));
        }
        System.out.print("Modeda de 1 centavos: ");
        System.out.println(moeda1);


    }

    }


