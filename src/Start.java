/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahesh V
 */
public class Start {
    public static void main(String[] args) {

        splash Splash = new splash();
        Splash.setVisible(true);
        login login = new login();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                Splash.loadingnum.setText(Integer.toString(i) + "%");
                Splash.loadingbar.setValue(i);
                if (i == 100) {
                    Splash.setVisible(false);
                    login.setVisible(true);
                }
            }

        } catch (Exception e) {

        }
    }
}
