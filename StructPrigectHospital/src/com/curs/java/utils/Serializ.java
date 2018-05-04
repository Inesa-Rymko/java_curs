package com.curs.java.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.curs.java.repository.ARepository;


public class Serializ {

	private static final Logger logger = Logger.getLogger(Serializ.class.getName());
	
    private static final String FILE_DOEST_EXISTS = "File doesn't exists";
    private static final String CLASS_IS_NOT_SERIALIZABLE = "Class is not serializable";

    public static  ARepository deserialize(final String path) {
    	ARepository result = null;
        try (FileInputStream fileStream = new FileInputStream(path);
             ObjectInputStream objectStream = new ObjectInputStream(fileStream)) {
            result = (ARepository) objectStream.readObject();
        } catch (final IOException e) {
        	 logger.info(FILE_DOEST_EXISTS);
        } catch (final ClassNotFoundException e) {
            logger.info (CLASS_IS_NOT_SERIALIZABLE);
        }
        return result;
    }

    public static  void  serialize(ARepository repository, final String file) {
        try (FileOutputStream fileStream = new FileOutputStream(file);
             ObjectOutputStream objectStream = new ObjectOutputStream(fileStream)) {
            objectStream.writeObject(repository);
        } catch (final IOException e) {
        	 logger.info( FILE_DOEST_EXISTS);
        }
		
    }

}
