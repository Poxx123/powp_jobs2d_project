package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;

public class FigureJaneAdapter extends AbstractDriver {

    public FigureJaneAdapter() {
        super(0, 0);
    }

    @Override
    public void operateTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(0, 0);
        line.setEndCoordinates(x, y);

        DrawPanelController drawPanelController = DrawerFeature.getDrawerController();
        drawPanelController.drawLine(line);
        setPosition(x, y);
    }
}
