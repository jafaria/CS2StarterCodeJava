/*
* The {@code Painter} class represents painter information.
*/

public class Painter implements Artist {

    private String name;
    private int year;

    public Painter(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
