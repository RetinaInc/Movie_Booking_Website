/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.movieplex7.batch;

import static com.sun.org.apache.bcel.internal.util.SecuritySupport.getResourceAsStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import javax.batch.api.chunk.AbstractItemReader;
import javax.batch.api.chunk.ItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author Development
 */
@Named
@Dependent
public class SalesReader extends AbstractItemReader implements ItemReader {

    private BufferedReader reader;

    @Override
    public String readItem() {
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }

    @Override
    public void open(Serializable checkpoint) throws Exception {
        reader = new BufferedReader(
                new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/sales.csv")));
    }

}
