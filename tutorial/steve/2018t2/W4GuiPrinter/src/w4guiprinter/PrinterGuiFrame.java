/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4guiprinter;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Steven Gordon <s.d.gordon@cqu.edu.au>
 */
public class PrinterGuiFrame extends JFrame {

    private JLabel lblPrinterName;
    private JPanel pnlMainCenter;
    private JPanel pnlMainEast;
    private JButton btnOk;
    private JButton btnCancel;
    private JButton btnSetup;
    private JButton btnHelp;
    private JPanel pnlMainCenterNorth;
    private JPanel pnlMainCenterCenter;
    private JPanel pnlMainCenterSouth;
    private JTextArea taList1;
    private JTextArea taList2;
    private JTextArea taList3;
    private JLabel lblMyPrinter;
    private JLabel lblPrintQuality;
    private JPanel pnlCenter1;
    private JPanel pnlCenter2;
    private JPanel pnlCenter3;
    private JPanel pnlCenter4;
    private JPanel pnlCenter5;
    private JPanel pnlCenter6;

    PrinterGuiFrame() {

        this.setLayout(new BorderLayout());

        // Center panel on frame
        pnlMainCenter = new JPanel();
        pnlMainCenter.setLayout(new BorderLayout());
        pnlMainCenterNorth = new JPanel();
        pnlMainCenterNorth.setLayout(new FlowLayout());
        lblMyPrinter = new JLabel("My Printer");
        pnlMainCenterNorth.add(lblMyPrinter);

        pnlMainCenterCenter = new JPanel();
        pnlMainCenterCenter.setLayout(new GridLayout(1, 6));
        pnlCenter1 = new JPanel();
        pnlCenter2 = new JPanel();
        pnlCenter3 = new JPanel();
        pnlCenter4 = new JPanel();
        pnlCenter5 = new JPanel();
        pnlCenter6 = new JPanel();

        taList1 = new JTextArea(5, 10);
        taList2 = new JTextArea(5, 10);
        taList3 = new JTextArea(5, 10);
        pnlCenter1.add(taList1);
        pnlCenter3.add(taList2);
        pnlCenter5.add(taList3);

        pnlMainCenterCenter.add(pnlCenter1);
        pnlMainCenterCenter.add(pnlCenter2);
        pnlMainCenterCenter.add(pnlCenter3);
        pnlMainCenterCenter.add(pnlCenter4);
        pnlMainCenterCenter.add(pnlCenter5);
        pnlMainCenterCenter.add(pnlCenter6);

        pnlMainCenterSouth = new JPanel();
        pnlMainCenterSouth.setLayout(new FlowLayout());
        lblPrintQuality = new JLabel("Print Quality");
        pnlMainCenterSouth.add(lblPrintQuality);

        pnlMainCenter.add(pnlMainCenterNorth, BorderLayout.NORTH);
        pnlMainCenter.add(pnlMainCenterCenter, BorderLayout.CENTER);
        pnlMainCenter.add(pnlMainCenterSouth, BorderLayout.SOUTH);

        // Right/east panel on frame
        pnlMainEast = new JPanel();
        pnlMainEast.setLayout(new GridLayout(4, 1));
        btnOk = new JButton("Ok");
        btnCancel = new JButton("Cancel");
        btnSetup = new JButton("Setup...");
        btnHelp = new JButton("Help");
        pnlMainEast.add(btnOk);
        pnlMainEast.add(btnCancel);
        pnlMainEast.add(btnSetup);
        pnlMainEast.add(btnHelp);

        // Add panels to frame
        this.add(pnlMainCenter, BorderLayout.CENTER);
        this.add(pnlMainEast, BorderLayout.EAST);
    }

}
