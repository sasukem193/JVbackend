public class Books {
    private String bookName;
    private String authorName;
    private String category;



    public Books(String bookName, String authorName, String category) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.category = category;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void showData(){
        System.out.println("Book: "+getBookName()
                +" written by "+ getAuthorName()
                + " with category "+getCategory());
    }
}
