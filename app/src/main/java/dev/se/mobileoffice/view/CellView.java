package dev.se.mobileoffice.view;

import android.graphics.Color;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import dev.se.mobileoffice.MobileOfficeApp;
import dev.se.mobileoffice.model.cell.CellManager;
import dev.se.mobileoffice.IDrawService;

/**
 * Created by Dev on 2014-11-29.
 */
public class CellView {

    public CellView() {

    }

    public List<LinearLayout> getAllCellsView() {

        List<LinearLayout> layouts = new ArrayList<LinearLayout>();

        for(int i = 0; i < CellManager.getInstance().size(); ++i) {
            IDrawService officeCell = CellManager.getInstance().get(i);
            LinearLayout ll = new LinearLayout(MobileOfficeApp.getContext());
            ll.setBackgroundColor(Color.GRAY);
            ll.addView(officeCell.drawView());

            layouts.add(ll);
        }

        return layouts;
    }

}
