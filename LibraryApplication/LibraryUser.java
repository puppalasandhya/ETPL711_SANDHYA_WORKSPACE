package com.evergent.corejava.casestudy;

public interface LibraryUser {
	public void registerAccount(int Age) throws InvalidAgeException;
    public void requestBook(String Book) throws InvalidBookTypeException;
}
