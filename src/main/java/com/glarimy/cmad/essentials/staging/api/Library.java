package com.glarimy.cmad.essentials.staging.api;

public interface Library {
	public Book find(int isbn) throws BookNotFoundException, LibraryException;
}
