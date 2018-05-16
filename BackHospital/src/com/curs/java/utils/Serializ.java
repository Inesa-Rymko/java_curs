package com.curs.java.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.curs.java.repository.ARepository;

public class Serializ {

	public static ARepository deserialize(final String path) throws ClassNotFoundException, IOException {
		ARepository result = null;
		FileInputStream fileStream = new FileInputStream(path);
		ObjectInputStream objectStream = new ObjectInputStream(fileStream);
		result = (ARepository) objectStream.readObject();
		return result;
	}

	public static void serialize(ARepository repository, final String file) throws IOException {
		FileOutputStream fileStream = new FileOutputStream(file);
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		objectStream.writeObject(repository);
	}

}
