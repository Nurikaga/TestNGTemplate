package data;

public class DataProviders {
    @org.testng.annotations.DataProvider(name = "websites")
    public Object[] data() {
        String[] websites = new String[]{"PHP Travels", "Mercury tours", "Internet", "E-commerce", "Passion Tea Company", "Saucedemo", "Shopping Cart"};

        return websites;
    }
}