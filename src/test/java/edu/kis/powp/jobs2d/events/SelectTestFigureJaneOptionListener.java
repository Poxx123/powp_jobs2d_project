package edu.kis.powp.jobs2d.events;

import edu.kis.powp.jobs2d.drivers.adapter.FigureJaneAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigureJaneOptionListener implements ActionListener {

    private FigureJaneAdapter driverManager;

    public SelectTestFigureJaneOptionListener(FigureJaneAdapter driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FiguresJane.figureScript(driverManager);
    }

}
