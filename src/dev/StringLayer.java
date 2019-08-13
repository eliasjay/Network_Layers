package dev;

public class StringLayer extends BaseLayer implements Layer {
    @Override
    public void sendMessage(String any) {
        System.out.println("string layer " + any);

        if (this.getDown() == null) {
            System.out.println("string layer received " + any);
        } else {
            this.getDown().sendMessage(any);
        }
    }

    @Override
    public void sendMessage(char any) {

    }
}