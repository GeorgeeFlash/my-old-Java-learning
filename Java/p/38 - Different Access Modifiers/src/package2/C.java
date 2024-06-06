// package package2;
// import package1.*;

public class C {

    String defaultMessage = "This is a default"; // Only visible within package2
    public String publicMessage = "This is public"; // Visible to any class in any package
    protected String protectedMessage = "This is protected"; // Visible to a class in another package as long as that class extends it
    private String privateMessage = "This is private"; // Only visible within the same class

}