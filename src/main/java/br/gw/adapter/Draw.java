package br.gw.adapter;

import java.util.List;

public class Draw {

    public void draw(List<VectorObject> vectorObjects) {
        for(VectorObject vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(this::drawPoint);
            }
        }
    }

    public void drawPoint(Point point) {
        System.out.println(".");
    }

}
