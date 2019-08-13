package dev;

public class Main {
    public static void main(String[] args) {
        StringLayer slA = new StringLayer();
        ReverseLayer rlA = new ReverseLayer();
        CharLayer clA = new CharLayer();

        StringLayer slB = new StringLayer();
        ReverseLayer rlB = new ReverseLayer();
        CharLayer clB = new CharLayer();

        slA.setDown(rlA);
        rlA.setDown(clA);

        clA.setDown(clB);

        clB.setTop(rlB);
        rlB.setTop(slB);

        slA.sendMessage("start");
    }
}