package Generics;

public class Robot<Type extends Head> {
    private Body body;
    private Type head;
    public Robot(Body body, Type head) {
        setBody(body);
        setHead(head);
    }
    public Body getBody() {
        return body;
    }
    public void setBody(Body body) {
        this.body = body;
    }
    public Type getHead() {
        return head;
    }
    public void setHead(Type head) {
        this.head = head;
    }
    @Override
    public String toString() {
        return "Robot{" +
                "body=" + body +
                ", head=" + head +
                '}';
    }
}