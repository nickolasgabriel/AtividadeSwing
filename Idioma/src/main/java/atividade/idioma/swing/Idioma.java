package atividade.idioma.swing;

import java.util.Locale;

public class Idioma extends javax.swing.JFrame {

    public Idioma() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        img = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblMostrar = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img.setIcon(new javax.swing.ImageIcon("D:\\Usuaro\\Desktop\\globo.png")); // NOI18N

        lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl.setText("Idioma atual do sistema");

        lblMostrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMostrar.setForeground(new java.awt.Color(153, 153, 153));
        lblMostrar.setText("Clique no botão!");

        btnClick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClick.setText("Clique aqui");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(img)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl)
                    .addComponent(lblMostrar)
                    .addComponent(btnClick))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClick)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        Locale idioma = Locale.getDefault();
        lblMostrar.setText(idioma.getDisplayLanguage());
    }//GEN-LAST:event_btnClickActionPerformed

    public static void main(String args[]) throws Exception{

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Idioma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel img;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblMostrar;
    // End of variables declaration//GEN-END:variables
}
