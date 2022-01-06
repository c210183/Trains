package jp.ac.ccmc.transportation;

import jp.ac.ccmc.transportation.components.Boiler;

// 蒸気機関車
public class SteamTrain extends Train {
    Boiler boiler;  // ボイラー

    public SteamTrain(int capacity, int sheets) {
        super(capacity, sheets);
        this.boiler = new Boiler();
    }

    @Override
    public double run() {
        System.out.println("Steam Engine");
        return 50.0;
    }
}
