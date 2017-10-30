/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jerem.todoDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Administrateur
 * 
 * @param <DAO>
 * @param <T>
 *
 */
public interface DAOTodoInterface<T, DAO> {
    
    /**
     * Suppression d'une entité en fonction de son identifiant
     * @param entity
     * 
     * @throws java.sql.SQLException
     */
    void deleteOneById(T entity) throws SQLException;

    int save(T entity) throws SQLException;

    DAO findOneById(int id) throws SQLException;
  
    T getOne() throws SQLException;

    Map<String, String> getOneAsMap() throws SQLException;
    
    List<T> getAll() throws SQLException;
    
    List<Map<String, String>> getAllAsArray() throws SQLException;


    void deleteButtonActionPerformed(java.awt.event.ActionEvent evt);

    void razButtonActionPerformed(java.awt.event.ActionEvent evt);

    void todoListTableComponentAdded(java.awt.event.ContainerEvent evt);

    void updateButtonActionPerformed(java.awt.event.ActionEvent evt);
}
