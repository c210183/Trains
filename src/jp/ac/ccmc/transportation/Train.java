package jp.ac.ccmc.transportation;

import jp.ac.ccmc.transportation.components.Sheet;

// 列車
public abstract class Train {
    private int capacity;   // 定員
    private Sheet[] sheets; // 座席

    // コンストラクタ
    public Train(int capasity, int sheets) {
        this.capacity = capasity;
        this.sheets = new Sheet[sheets];
    }

    // 動力の種類を表示して、速度を返すメソッド
    public abstract double run();

    // 文字列化するときのメソッド（Objectクラスから継承）
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " <Capacity:" + this.capacity + ", Sheets:" + this.sheets.length + ">";
    }
}
