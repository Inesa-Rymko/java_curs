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

	
	}
	 
   
