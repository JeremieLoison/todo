/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.jerem.todoDAO;

import fr.jerem.todo.TodoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Administrateur
 */
public abstract class TodoDAO implements DAOTodoInterface<TodoDTO, TodoDAO> {

    private Connection dataConnection;
    private PreparedStatement pStatement;
    private ResultSet resultSet;

    public TodoDAO(Connection dataConnection) {
        this.dataConnection = dataConnection;
    }
    public TodoDAO(PreparedStatement pStatement) {
        this.pStatement = pStatement;
   

    }

    private int insert(TodoDTO entity) throws SQLException {
        String sql = "INSERT INTO tachelist (tache, categorie, fait ) VALUES (?,?,?)";
        pStatement = dataConnection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        pStatement = dataConnection.prepareStatement(sql);
        pStatement.setString(1, entity.getTache());
        pStatement.setString(2, entity.getCategorie());
        pStatement.setString(3, String.valueOf(entity.getFait()));
             
        return pStatement.executeUpdate();

    }

  private int update(TodoDTO entity) throws SQLException {
        String sql = "UPDATE tachelist SET tache=?, categorie=? fait=? WHERE id=?";

        pStatement = dataConnection.prepareStatement(sql);
        
        pStatement.setString(1, entity.getTache());
        pStatement.setString(2, entity.getCategorie());
        pStatement.setString(3, entity.getFait());

        return pStatement.executeUpdate();

    }

  

    /**
     * Suppression d'une entité en fonction de son identifiant
     *
     * @param entity
     */
}

/*
    ok-----Annonce de la fonction INSERT + String sql
    Update  +sql
    Delete + sql
    RAZ + sql
 */

