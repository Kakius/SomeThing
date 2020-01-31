/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import frames.LengthText;
import frames.MainWindow;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author D.Alekseenko
 */
public class MainApp
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainWindow().setVisible(true);
            }
        });
    }

}
