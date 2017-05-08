package com.glarimy.cmad.essentials.staging.service;

import com.glarimy.cmad.essentials.staging.api.Book;
import com.glarimy.cmad.essentials.staging.api.BookNotFoundException;
import com.glarimy.cmad.essentials.staging.api.Library;
import com.glarimy.cmad.essentials.staging.api.LibraryException;
import com.glarimy.cmad.essentials.staging.dao.JpaDAO;

public class LibraryImpl implements Library {
	private JpaDAO dao = new JpaDAO();

	@Override
	public Book find(int isbn) throws BookNotFoundException, LibraryException {
		System.out.println("Service finding " + isbn);
		Book book = dao.read(isbn);
		if (book == null)
			throw new BookNotFoundException();
		return book;
	}

}
