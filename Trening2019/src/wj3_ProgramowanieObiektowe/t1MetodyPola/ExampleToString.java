package wj3_ProgramowanieObiektowe.t1MetodyPola;

public class ExampleToString {

    private String hairColor;
    private int height;
    private int width;


    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }



    @Override
    public String toString() {
        return "ExampleToString{" +
                "hairColor='" + hairColor + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", isMale=" + isMale +
                '}';
    }

    private boolean isMale;
}
