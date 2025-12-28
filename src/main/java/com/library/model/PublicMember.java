package com.library.model;

public class PublicMember extends Member {
    private static final int MAX_BOOKS = 2;
    private static final int LOAN_PERIOD = 7;
    
    // Constructor
    public PublicMember(String memberId, String name) {
        super(memberId, name);
    }
    
    @Override
    public int getMaxBooks() {
        return MAX_BOOKS;
    }
    
    @Override
    public int getLoanPeriodDays() {
        return LOAN_PERIOD;
    }
    
    @Override
    public String toString() {
        return "Public Member - " + super.toString() + " (Loan Period: " + LOAN_PERIOD + " days)";
    }
}
