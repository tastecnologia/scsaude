package br.com.saudesc.ejb.beans.interfaces;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FichaDAO
 */
@Stateless
@LocalBean
public class FichaDAO implements FichaDAORemote, FichaDAOLocal {

    /**
     * Default constructor. 
     */
    public FichaDAO() {
        // TODO Auto-generated constructor stub
    }

}
