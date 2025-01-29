package atividade.relogio.swing;

import java.util.Date;

public class Relogio extends javax.swing.JFrame {

    public Relogio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClick = new javax.swing.JButton();
        lblMostrar = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClick.setText("Clique aqui");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        lblMostrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMostrar.setForeground(new java.awt.Color(153, 153, 153));
        lblMostrar.setText("Clique no botão!");

        lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl.setText("Data e Hora atual");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Usuaro\\Desktop\\calendario.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMostrar)
                    .addComponent(lbl)
                    .addComponent(btnClick))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClick)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        Date relogio = new Date();
        lblMostrar.setText(relogio.toString());
    }//GEN-LAST:event_btnClickActionPerformed

    public static void main(String args[]) throws Exception{

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relogio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblMostrar;
    // End of variables declaration//GEN-END:variables
}
