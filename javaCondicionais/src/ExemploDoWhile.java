

import java.util.Random;
public class ExemploDoWhile {
public static void main(String[] args) {
    System.out.println("DISCANDO...");
    do { 
        //executar repetidas vezes ate atender
        System.out.println("telefone tocando");
    }while(tocando());
    System.out.println("Alô?!");


    
}
private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu? " + atendeu);
    //NEGANDO A CONTINUA~ÇAO DO TOCANDO. exclamação nega o boleano.

    return ! atendeu;
}
}