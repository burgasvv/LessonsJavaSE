package DataStructures;

public class Struct {
    private int anInt;
    private String string;
    public Struct(){}
    public Struct(int anInt, String string){
        this.anInt = anInt;
        this.string = string;
    }
    public Struct(Struct struct) {
        this.string = struct.string;
        this.anInt = struct.anInt;
    }
    public int getInt() {
        return anInt;
    }
    public void setInt(int anInt) {
        this.anInt = anInt;
    }
    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
    public String toString(){
        return getString() + " " + getInt();
    }
}