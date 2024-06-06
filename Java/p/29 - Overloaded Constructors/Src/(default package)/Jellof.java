public class Jellof {

    String rice;
    String meat;
    int maggi;
    String pepper;
    String extra;

    Jellof(String rice, String meat, int maggi, String pepper, String extra) {
        this.rice = rice;
        this.meat = meat;
        this.maggi = maggi;
        this.pepper = pepper;
        this.extra = extra;
    }

    Jellof(String rice, String meat, int maggi, String pepper) {
        this.rice = rice;
        this.meat = meat;
        this.maggi = maggi;
        this.pepper = pepper;
    }

    Jellof(String rice, String meat, int maggi) {
        this.rice = rice;
        this.meat = meat;
        this.maggi = maggi;
    }

    Jellof(String rice, int maggi) {
        this.rice = rice;
        this.meat = meat;
        this.maggi = maggi;
    }
}