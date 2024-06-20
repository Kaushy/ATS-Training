package Library;

interface LibraryInterface {
        public void addBook(Book book); // interface method (does not have a body)
        public void removeBook(String isbn);
        public Book searchBook(String Title);
        public void getAllDettailsofBook();

}
