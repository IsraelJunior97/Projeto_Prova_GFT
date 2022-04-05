package Atividade4;

import java.util.Objects;
import java.util.Scanner;

public class Atividade4 {

    static String letra;



    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        letra= leitor.nextLine();

        if(Objects.equals(letra, "A") || Objects.equals(letra, "a") || Objects.equals(letra, "E") || Objects.equals(letra, "e") || Objects.equals(letra, "I") || Objects.equals(letra, "i") || Objects.equals(letra, "O") || Objects.equals(letra, "o") || Objects.equals(letra, "U") || Objects.equals(letra, "u")){
            System.out.println("vogal");
        }else{
            System.out.println("Consoante");
        }

    }
}