package com.company;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.awt.*;

public class CreateChart extends JFrame {

    //konstruktor

    public CreateChart(){
        JFrame frame = new JFrame();
        GridBagLayout layout= new GridBagLayout();
        GridBagConstraints gc = new GridBagConstraints();
        frame.setLayout(layout);

        //creating panels

        JPanel panel = createChartPanel();
        JPanel panel2 = new JPanel();

        //creating a field to submit a review

        JTextField field = new JTextField("write a review");
        field.setSize(300,50);

        //adding components to panel 2

        panel2.add(field);

        //adding panels to frame

        gc.gridy = 0;
        gc.gridx = 0;
        gc.weighty=1;
        gc.weighty=0;
        frame.add(panel,gc);

        gc.gridy=0;
        gc.gridy=1;
        gc.weighty=1;
        gc.weighty=0;
        frame.add(panel2,gc);

        frame.setVisible(true);
    }
    private static PieDataset createDataset(){
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Cat 1", 210);
        data.setValue("Cat 2", 22);
        data.setValue("Cat 3", 333);
        data.setValue("Cat 4",39484);
        return data;
    }
    public JFreeChart createChart(){
        JFreeChart chart = ChartFactory.createPieChart(
                "Chart demo",
                createDataset(),
                true,
                true,
                false);
        return chart;
    }
    public ChartPanel createChartPanel(){
        ChartPanel panel = new ChartPanel(createChart());
        return panel;
    }

}
