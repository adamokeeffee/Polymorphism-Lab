package ie.atu.productv4;

public class TV extends Product{

    private String screensize;

    private String manufacture;

    public TV() {
        super();
        screensize = "";
        manufacture = "";
        count++;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return super.toString() +"TV{" +
                "screensize='" + screensize + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
