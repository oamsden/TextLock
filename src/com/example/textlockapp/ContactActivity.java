package com.example.textlockapp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import android.content.Context;
import android.content.res.AssetManager;
import java.util.Vector;
import java.util.Scanner;
import java.util.Collections;

public class UserService {

    public static Vector<Contact> getUserList() {
    	
    	
    	/*Context c;
    	AssetManager am = c.getAssets();
    	InputStream filestream = am.open("contactslist.txt");
    	*/
    	
        Vector<Contact> bookList = new Vector<Contact>();
        
        
    
        Contact book = new Contact("Mike ", "Weldon ", "7326748880");
        bookList.add(book);
        
        book = new Contact("Orrin ", "Amsden ", "1234567890");
        bookList.add(book);
        
        Collections.sort(bookList);
        return bookList;
    }

  
}
