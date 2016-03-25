/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Luciana
 */
public class File {

    public static void fileWriter(String path, Pessoa pessoa) throws FileNotFoundException, IOException {
        BufferedWriter bufferReader = new BufferedWriter(new FileWriter(path));
        String line = "";
        bufferReader.append("Nome: " + pessoa.getNome() + "\n");
        bufferReader.close();
    }
}
