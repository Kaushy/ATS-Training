package Library;

interface LibraryInterface {
        public void addBook(Book book); // interface method (does not have a body)
        public void removeBook(String Title);
        public void searchBook(String titleName);
        public void getAllDettailsofBook();
        public void searchGenre(String genreName);

}
