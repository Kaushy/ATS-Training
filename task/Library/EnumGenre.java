package Library;
enum EnumGenre {
    SCIENCE("science"),
    SOCIAL("social"),
    MATHS("maths");

    private String genre;

    EnumGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public static EnumGenre getEnum(String value) {

        for (EnumGenre e : EnumGenre.values()) {
            if (e.getGenre().equals(value)) {
                return e;
            }
        }
        return null;
    }


}
