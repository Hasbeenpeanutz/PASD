class Book {
     String code;
     String title;
     int year;
     String status;
     String publisher;

    public Book(String code, String title, int year, String publisher) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.status = "Available";
        this.publisher = publisher;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void printBook() {
        System.out.println("Code: " + code + " | Title: " + title + " | Year: " + year + "| Publisher: " + publisher);
    }
}
