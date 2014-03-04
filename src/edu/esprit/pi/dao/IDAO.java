/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.pi.dao;

import edu.esprit.pi.technique.ConnectionFactory;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author esprit
 */

// Type abstrait IDAO (Direct Access Object) 
// il encapsule la source de données : connection
// il présente des méthode CRUD abstaites (Contract à remplir par les Objets IDAO concrets ex: EmployeeDAO)
// rq: la généricite <T> nous permets d'avoir un contrat unique pour toutes les classes persistantes
public abstract class IDAO<T> {
    
    //source de données
    protected Connection connection = ConnectionFactory.getInstance().getConnection();
    
    //contrat
    public abstract T find(int id);
    public abstract void create(T t);
    public abstract void update(T t);
    public abstract void delete(T t);
    public abstract List<T> findAll();
    
    
    
}
