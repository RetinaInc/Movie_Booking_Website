/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.movieplex7.batch;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.batch.api.chunk.AbstractItemWriter;
import javax.batch.api.chunk.ItemWriter;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.AbstractWriter;
import javax.swing.text.BadLocationException;
import javax.transaction.Transactional;
import org.glassfish.movieplex7.entities.Sales;

/**
 *
 * @author Development
 */
@Named
@Dependent
public class SalesWriter extends AbstractItemWriter implements ItemWriter {

    @Override
    @Transactional
    public void writeItems(List list) {
        for (Sales sales : (List<Sales>) list) {
            entityManager.persist(sales);
        }
    }

    @PersistenceContext
    EntityManager entityManager;

}
