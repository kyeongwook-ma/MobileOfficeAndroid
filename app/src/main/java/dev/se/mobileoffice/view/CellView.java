package dev.se.mobileoffice.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import dev.se.mobileoffice.model.cell.CellManager;
import dev.se.mobileoffice.model.cell.OfficeCell;

/**
 * Created by Dev on 2014-11-29.
 */
public class CellView extends LinearLayout {

    public CellView(Context context) {
        super(context);

        for(int i = 0; i < CellManager.getInstance().size(); ++i) {
            IDrawService officeCell = CellManager.getInstance().get(i);
            addView(officeCell.drawView());
        }

    }

}
