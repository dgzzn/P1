/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 17214290023
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("##.##");
        String eleitor;
        int continuar, voto = 0 ;
        double por1, por2, porBranco, porNulo, votos1 = 0, votos2 = 0, votosBrancos = 0, votosNulos = 0, totalVotos = 0;
        do{ //Nome do eleitor
            System.out.println("Eleitor, informe seu nome: ");
            eleitor = scan.next();
            do { //Escolher candidato
                System.out.println("Informe o número correspondente ao seu voto!");
                System.out.println("1 - João das Couves\n2 - Maria das Neves\n"
                        + "0 - Branco\n-1 - Nulo");
                voto = scan.nextInt();
                
            } while (voto < -1 || voto > 2);
            
            //Contando votos
            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 0:
                    votosBrancos++;
                    break;
                default:
                    votosNulos++;
                    break;
            }
            totalVotos++;
            do{
                System.out.println("Iniciar votação com novo eleitor?\n0 - Não\n1 - Sim");
                continuar = scan.nextInt();
            }while(continuar < 0 || continuar > 1);
            
        
        if(votos1 == 0){
            por1 = 0;
        }else{por1 = (100*votos1)/totalVotos;}
        if(votos2 == 0){
            por2 = 0;
        }else{por2 = (100*votos2)/totalVotos;}
        if(votosBrancos == 0){
            porBranco = 0;
        }else{porBranco = (100/votosBrancos/totalVotos);}
        if(votosNulos == 0){
            porNulo = 0;
        }else{porNulo = (100*votosNulos)/totalVotos;}
        }while(continuar == 1);
        System.out.println("Total de votos: "+totalVotos+"\nJoão das Couves: "+votos1+" votos ("+dc.format(por1)+"%)\n"
                + "Maria das Neves: "+votos2+" votos ("+dc.format(por2)+"%)\nVotos em Branco: "+votosBrancos+" votos ("+dc.format(porBranco)+"%)\n"
                        + "Votos Nulos: "+votosNulos+" votos ("+dc.format(porNulo)+"%)");
    }
}
