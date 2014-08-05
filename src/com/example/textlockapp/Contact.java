package com.example.textlockapp;

public class Contact implements Comparable<Contact>{
private String fname;
private String lname;
private String number;
private String key;
	
	
	public Contact(String fn, String ln, String in_number){
		this.fname = fn;
		this.lname = ln;
		this.number = in_number;
	}
	
	
    public String getFname() {
        return fname;
    }

    
    // set the first name
     
    public void setFname(String title) {
        this.fname = title;
    }

 
    public String getLname() {
        return lname;
    }


    public void setLname(String author) {
        this.lname = author;
    }


    public String getNumber() {
        return number;
    }


    public void setYear(String year) {
        this.number = year;
    }
    
    @Override
    public int compareTo(Contact book) {
        return this.getFname().compareTo(book.getFname());
    }
}
