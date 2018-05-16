package com.curs.java.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.curs.java.model.Entity;

public abstract class ARepository extends Entity  implements Serializable {

	public List<Entity> repository;
	
	protected ARepository(){
        repository = new ArrayList<>();
    }
	
	static final long serialVersionUID = 1L;

	/* public abstract boolean update(String[] fields);
	 public abstract boolean add(final String[] fields);
	 
	 public boolean add(final Entity entity) {
	        if (!isFreeId(entity.getId())) {
	            return false;
	        }
	        repository.add(entity);
	        return true;
	    }

	public boolean isFreeId(Integer id) {
		for (final Entity entity : repository) {
            if (id.equals(entity.getId())) {
                return false;
            }
        }
        return true;
    }*/
	}
	 
   
