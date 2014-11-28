package dev.se.mobileoffice.model.cell;

import java.util.ArrayList;
import java.util.Random;

import dev.se.mobileoffice.model.cell.OfficeCell;

/**
 * Created by makyungjae on 2014. 11. 5..
 */
public class CellManager {

    public static final int MAX_CELL_COUNT = 16;
    private ArrayList<OfficeCell> cells;
    private static CellManager instance;

    static  {
        instance = new CellManager();
    }

    private CellManager() {
        cells = new ArrayList<OfficeCell>();

        for(int i = 0; i < MAX_CELL_COUNT; ++i) {

            OfficeCell cell =
                    new OfficeCell.OfficeCellBuilder(i)
                            .noise(60 + new Random().nextInt(10))
                            .computingPower(2.4)
                            .humidity(30 + new Random().nextInt(8))
                            .networkBandwidth(1000)
                            .computingPower(2400)
                            .temperature(23 + new Random().nextInt(2)).createOfficeCell();

            cells.add(cell);

        }
    }

    public CellManager getInstance() {
        if(instance != null) {
            return instance;
        } else {
            return new CellManager();
        }
    }

    public OfficeCell get(int idx) {

        assert idx > -1 && cells != null;

        return cells.get(idx);
    }

}
