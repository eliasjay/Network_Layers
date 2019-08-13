package dev;

class BaseLayer {
    private Layer top;
    private Layer down;

    Layer getTop() {
        return top;
    }

    void setTop(Layer top) {
        this.top = top;
    }

    Layer getDown() {
        return down;
    }

    void setDown(Layer down) {
        this.down = down;
    }
}
