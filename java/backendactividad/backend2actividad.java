/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FabianaUsuario
 */
public class backendactividad extends javax.swing.JFrame {

    /**
     * Creates new form backendactividad
     */
    public backendactividad() {
        initComponents();
        this.setSize(400,300);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usu = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setOpacity(getOpacity());
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenidos al Sistema");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 20, 230, 50);
        label.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(58, 131, 237));
        jLabel2.setText("Los datos ingresados son:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 70, 170, 30);
        setOpaque(true)

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.red);
        jLabel3.setText("Tu Usuario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("Tu Clave");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 70, 15);

        usu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuActionPerformed(evt);
            }
        });
        getContentPane().add(usu);
        usu.setBounds(140, 110, 130, 20);
        getContentPane().add(pass);
        pass.setBounds(140, 140, 130, 20);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 190, 75, 23);

        pack();
    }// </editor-fold>                        

    private void usuActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    @SuppressWarnings("StringEquality")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String usuario= "User2020";
       String password= "12345";
       
       if (usu.getText().equals(usuario)){
       System.out.println ("Bienvenido");}
       else if(pass.getText().equals(password)){
       System.out.println ("Bienvenido");}
       else if(usu.getText()!= usuario){System.out.println ("Error");}
        else if(pass.getText()!= password){System.out.println ("Error");}
       
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(backendactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(backendactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(backendactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(backendactividad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new backendactividad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField usu;
    // End of variables declaration                   
}
