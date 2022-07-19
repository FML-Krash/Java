// THIS FILE IS A JFRAME FORM 

package main_calculadora;

import java.awt.Color;

public class Calculadora extends javax.swing.JFrame {
    String operador = "";

    public Calculadora() {
        initComponents();
        getContentPane().setBackground(Color.pink);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
      
      // CODE CREATED BY DESIGN INTERFACE - NETBEANS SWING 

        jTextField1 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        label1.setText("label1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("1");
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setText("=");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton12.setText(".");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton15.setText("*");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton16.setText("/");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton17.setText("Clear");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jButton16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton15))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton13)
                            .addComponent(jButton14)))
                    .addComponent(jButton17)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton13)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton16))
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addGap(76, 76, 76))
        );

        pack();
    }// </editor-fold>  
  
        // END OF THE CODE CREATED BY DESIGN INTERFACE - NETBEANS SWING
  
        // EVENT CODED BY KRASH

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="1";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);        
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="2";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       operador="+";
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String num_1;
        String num_2;
        String resul;
        
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);

        num_1=jLabel1.getText();
        num_2=jLabel2.getText();
        float valor_1=Float.valueOf(num_1);
        float valor_2=Float.valueOf(num_2);
        if (operador.equals("+")){
            resul=String.valueOf(valor_1 + valor_2);
            jLabel3.setText(resul);
        }
        if (operador.equals("-")){
            resul=String.valueOf(valor_1 - valor_2);
            jLabel3.setText(resul);
        }
        if (operador.equals("*")){
            resul=String.valueOf(valor_1 * valor_2);
            jLabel3.setText(resul);
        }
        if (operador.equals("/")){
            resul=String.valueOf(valor_1 / valor_2);
            jLabel3.setText(resul);
        }
    }                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="3";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="4";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="5";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="6";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="7";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="8";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String valor;
        String num_1="9";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String valor;
        String num_1="0";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String valor;
        String num_1=".";
        
        if (operador.equals("")){
        valor=jLabel1.getText();
        jLabel1.setText(valor + num_1);
        }
        if (operador.equals("+")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }       
        if (operador.equals("-")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }        
        if (operador.equals("*")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
        if (operador.equals("/")){
                valor=jLabel2.getText();
                jLabel2.setText(valor + num_1);
        }
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        
        operador="";
        jLabel1.setText("");
        jLabel2.setText("");
        jLabel3.setText("");
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        operador="-";
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        operador="*";
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        operador="/";
    }                                         

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    // End of variables declaration                   
}
