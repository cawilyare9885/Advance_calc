/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress;

/**
 *
 * @author Awil
 */
public class Progress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        progress_bar ho = new progress_bar();
        ho.setVisible(true);
       
        try {
            for(int x = 0; x <=100; x++)
        {
            Thread.sleep(50);
            
            progress_bar.lbllord.setText(Integer.toString(x)+"%");
            progress_bar.lordbar.setValue(x);
        }
        } catch (Exception e) {
        }
        
                
    }
    
}
