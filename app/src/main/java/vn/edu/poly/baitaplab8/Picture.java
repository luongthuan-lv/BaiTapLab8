package vn.edu.poly.baitaplab8;

public class Picture {
    private int image,item1,item2,item3;
    private String text;

    public Picture(int image, int item1, int item2, int item3, String text) {
        this.image = image;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
