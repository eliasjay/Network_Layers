package dev;

import java.util.ArrayList;

public class CharLayer extends BaseLayer implements Layer {
    private ArrayList<Character> receivedArray;

    CharLayer() {
        this.receivedArray = new ArrayList<>();
    }

    public void sendMessage(char any){
        System.out.println("char layer " + any);
        if (any != '\0'){
            this.receivedArray.add(any);
        } else {
            String str = receivedArray.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
            this.getTop().sendMessage(str);
            this.receivedArray.clear();
        }
    }

    @Override
    public void sendMessage(String any) {
        System.out.println("char layer " + any);

        if (this.getTop() == null){
            for (char c: any.toCharArray()) {
                this.getDown().sendMessage(c);
            }
            this.getDown().sendMessage('\0');
        }
    }
}
