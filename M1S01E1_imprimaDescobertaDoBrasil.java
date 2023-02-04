package semana1;

import java.util.Scanner;

public  class  Ex01_impimaDescobertaBrasil {
public static void main (String [] args){

    Scanner ler = new Scanner (System.in);

    /*[M1S01] Ex 1 - Imprima descoberta do Brasil
    Crie um programa que receberá nas variáveis dia, mes, ano e pais os respectivos valores
    22 de abril de 1500 e Brasil. O programa deve exibir a seguinte mensagem:
    “O Brasil foi descoberto no dia 22 de abril de 1500!”, usando os valores das variáveis.
    */

    int  dia = 22 ;
    String  mes = "Abril" ;
    int  ano = 1500 ;
    String  pais = "Brasil" ;

 System.out.println ( "Quando o Brasil foi descoberto?\n" + "O " + pais + " foi descoberto no dia " + dia
        + " de " + mes + " de " + ano + ".");

    }
}
