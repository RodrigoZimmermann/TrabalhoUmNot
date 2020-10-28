/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoumnot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Rodrigo Luís Zimmermann
 */
public class TrabalhoUmNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        FileInputStream fis = null;
        String contatena = "";
        boolean contate = false;
        boolean naoInsere = false;
        String texto = "";
        int c;
        PilhaVetor<String> pv = new PilhaVetor(100);
        try {
            fis = new FileInputStream("C:\\Users\\rodri\\Desktop\\arquivo.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("deu pau");
        }
        while ((c = fis.read()) != -1) {
            texto = String.valueOf((char) c);

            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == '<') {
                    contate = true;
                }
                if (contate == true) {
                    if (texto.charAt(i) == ' ') {
                        contatena = "";
                        contate = false;
                    }
                    contatena += texto.charAt(i);
                    if (pv.peek().equals(contatena.replace("<", "").replace(">", "").replace("/", ""))) {
                        naoInsere = true;
                        pv.pop();
                    }
                    if (texto.charAt(i) == '>') {
                        if (!naoInsere) {
                            pv.push(contatena.replace("<", "").replace(">", "").replace("/", ""));
                        }
                        naoInsere = false;
                        contatena = "";
                        contate = false;
                    }
                }
            }
        }
        System.out.println(pv.estaVazia());
    }
}
