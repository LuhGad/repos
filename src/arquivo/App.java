/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.IOException;

/**
 *
 * @author Luciana
 */
public class App {
     public static void main(String[] args) throws IOException {
        String path = "/Users/lucia/Desktop/testa/testeArquivo.txt";
        Pessoa pessoa = new Pessoa("Luciana");
        File.fileWriter(path, pessoa);
    }
    
}
