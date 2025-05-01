package fairyWorld;

// Prototypeを継承し、具体的なStampオブジェクトのクローンを作成する機能を持つ
interface Stamp extends Prototype<Stamp> {
    abstract String getTitle();
    abstract String getRender();
    abstract String getColor();
    @Override
    abstract Stamp clone();
}