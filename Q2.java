/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

import java.util.Scanner;

/**
 *
 * @author 17214290023
 */
public class Q2 {
    public static void main(String[] args) {
        /*
        RefaÃ§a o exercÃ­cio anterior porÃ©m, ao final do procedimento,
        pergunte ao usuÃ¡rio se deseja receber livros de outro aluno.
        Se a resposta for 1, repita a operaÃ§Ã£o. Ao final, o sistema deverÃ¡
        falar o nome e o valor do aluno que mais pagou multa. (OBS: o valor unitÃ¡rio da multa deverÃ¡
        ser lido somente, ou seja, nÃ£o faz parte do loop).
        */
        Scanner scan = new Scanner(System.in);
        int matricula, qtdLivros, diasAtraso, maiorDevedor = 0, continuar;
        double valorMulta, totalMulta = 0, maiorMulta = 0, total = 0;
        
        
        System.out.println("Informe o valor da multa por dia de atraso: ");
        valorMulta = scan.nextDouble();
        
        do{
            System.out.println("Informa a matrícula do aluno: ");
            matricula = scan.nextInt();
            System.out.println("Informe a quantidade de livros a serem devolvidos: ");
            qtdLivros = scan.nextInt();
            
            for (int i = 1; i <= qtdLivros; i++) {
                System.out.println(i + "º livro\nDias de atraso: ");
                diasAtraso = scan.nextInt();
                if (diasAtraso > 0) {
                    totalMulta += valorMulta * diasAtraso;
                }
                 
            }
            if(totalMulta > total){
                total = totalMulta;
                maiorDevedor = matricula;
            }
            //System.out.println("Total multa = "+totalMulta);
            
            totalMulta = 0;
            System.out.println("Digite 1 para executar novamente: ");
            continuar = scan.nextInt();
        }while(continuar == 1);
        
        System.out.println("O aluno que mais pagou multa, no total de R$"+total+" foi o aluno de matrícula "+maiorDevedor);
    }
}
