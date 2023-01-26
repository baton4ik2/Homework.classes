public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Bulat", "Akbirov");
        Author author2 = new Author("Ilnur", "Safin") ;
        Book bulat = new Book(author1, 2019, "Ltd. Xyesos");
        System.out.println("Name of 1st author - " + bulat.getAuthorName().getFullName());
        System.out.println("Год публикации книги - " + bulat.getAgeOfPublication());
        System.out.println("Издательство - " + bulat.getPublisherName());
        bulat.setAgeOfPublication(2022);
        System.out.println("Год публикации книги (2 тираж) - " + bulat.getAgeOfPublication());
        Book ilnur = new Book(author2, 2017, "Pizdabol Corp.");
        System.out.println("Name of 2nd author - = " + ilnur.getAuthorName().getSurName());
        System.out.println("Год публикации книги - " + ilnur.getAgeOfPublication());
        System.out.println("Издательство - " + ilnur.getPublisherName());
    }
}