package dev;

public class ReverseLayer extends BaseLayer implements Layer {
    @Override
    public void sendMessage(String any) {
        System.out.println("reverse layer " + any);

        if (this.getTop() == null){
            String reversedMessage = new StringBuilder(any).reverse().toString();
            this.getDown().sendMessage(reversedMessage);
        } else {
            String reversedMessage = new StringBuilder(any).reverse().toString();
            this.getTop().sendMessage(reversedMessage);
        }
    }

    @Override
    public void sendMessage(char any) {

    }
}
