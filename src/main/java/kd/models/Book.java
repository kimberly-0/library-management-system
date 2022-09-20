package kd.models;

/**
 * The Book class is responsible for creating an Book object.
 * 
 * Updated on 19/09/2022
 * 
 * @author Kimberly Dijkmans
 */
public class Book implements Comparable<Book> {

    private String title, authorFirstName, authorSurname;
    private boolean onLoan;
    private User borrower;

    /**
     * This constructor creates a new Book with a set title and author, and the loan
     * status will be false by default with no borrower
     * 
     * @param title           The title of the book
     * @param authorFirstName The first name of the author of the book
     * @param authorSurname   The surname of the author of the book
     */
    public Book(String title, String authorFirstName, String authorSurname) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
        this.onLoan = false;
        this.borrower = null;
    }

    /**
     * 
     * This constructor creates a new Book with a set title, author, loan status and
     * borrower
     * 
     * @param title           The title of the book
     * @param authorFirstName The first name of the author of the book
     * @param authorSurname   The surname of the author of the book
     * @param onLoan          The loan status of the book
     *                        <code>true</code> if the book is currently on loan
     *                        <code>false</code> if the book is not currently on
     *                        loan
     * @param borrower        The borrower of the book if the book is on loan
     *                        <code>null</code> if the book is not on loan
     */
    public Book(String title, String authorFirstName, String authorSurname, boolean onLoan, User borrower) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurname;
        this.onLoan = onLoan;
        this.borrower = borrower;
    }

    /**
     * @return title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return first name of the author of the book
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * @return surname of the author of the book
     */
    public String getAuthorSurname() {
        return authorSurname;
    }

    /**
     * @return <code>true</code> if book is on loan
     *         <code>false</code> if book is not on loan
     */
    public boolean isOnLoan() {
        return onLoan;
    }

    /**
     * @return current borrower of the book
     */
    public User getBorrower() {
        return borrower;
    }

    /**
     * This method sets the loan status of the book
     * 
     * @param b <code>true</code> if book is on loan
     *          <code>false</code> if book is not on loan
     */
    public void setOnLoan(boolean b) {
        this.onLoan = b;
    }

    /**
     * This method sets the current borrower of the book
     * 
     * @param u The user who is currently borrowing the book
     */
    public void setBorrower(User u) {
        this.borrower = u;
    }

    /**
     * This method compares the author's surname to sort in ascending order
     * 
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Book b) {
        int snCmp = authorSurname.compareTo(b.authorSurname);
        if (snCmp != 0)
            return snCmp;
        else
            return 0;
    }

    /**
     * This method overrides the default toString method provided by the Object
     * class to ensure the values are showcased when the object is printed. A
     * conditional statement is used to only show the borrower if the book is
     * currently on loan.
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s%s%s%s%s %s%s%s%s",
                "Book -> ",
                "title: ", title,
                " | author: ", authorFirstName, authorSurname,
                " | on loan: ", (onLoan ? "yes" : "no"),
                (borrower != null ? " | borrower: " + borrower.getFirstName() + " " + borrower.getSurname() : ""));
    }

    /**
     * This method overrides the default equals method provided by the Object class
     * so that the program perceives books with the same name to be the same Book
     * and not allow multiple books with the same name. This keeps the program
     * simple and allows for the main focus to be on the generic SortedArrayList
     * class and the Comparable interface.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (!(obj instanceof Book))
            return false;

        final Book user = (Book) obj;
        return title.equals(user.title)
                && authorFirstName.equals(user.authorFirstName)
                && authorSurname.equals(user.authorSurname)
                && onLoan == user.onLoan
                && (borrower == null ? borrower == user.borrower : borrower.equals(user.borrower));
    }
}
