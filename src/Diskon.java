import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Diskon extends javax.swing.JFrame {

    /**
     * Creates new form Diskon
     */
    public Diskon() {
        initComponents();
        setupListeners();
    }
    
    private void setupListeners() {
    cbdiskon.addItemListener(evt -> {
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedDiskon = (String) cbdiskon.getSelectedItem();
            // Jika diperlukan aksi tambahan ketika pilihan diskon berubah
            System.out.println("Diskon yang dipilih: " + selectedDiskon);
        }
    });
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblharga = new javax.swing.JLabel();
        lbldiskon = new javax.swing.JLabel();
        lblakhir = new javax.swing.JLabel();
        lblhemat = new javax.swing.JLabel();
        jtfharga = new javax.swing.JTextField();
        cbdiskon = new javax.swing.JComboBox<>();
        jtfhitung = new javax.swing.JButton();
        jtfakhir = new javax.swing.JTextField();
        jtfhemat = new javax.swing.JTextField();
        kupon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        riwayatdiskon = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblharga.setText("Harga Asli : ");

        lbldiskon.setText("Persentase Diskon");

        lblakhir.setText("Harga Akhir");

        lblhemat.setText("Hemat");

        cbdiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%" }));

        jtfhitung.setText("Hitung");
        jtfhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfhitungActionPerformed(evt);
            }
        });

        kupon.setText("Kode Kupon");

        riwayatdiskon.setColumns(20);
        riwayatdiskon.setRows(5);
        jScrollPane1.setViewportView(riwayatdiskon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblharga)
                    .addComponent(lbldiskon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfhitung)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblhemat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfhemat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfakhir, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblakhir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfharga, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblharga)
                .addGap(18, 18, 18)
                .addComponent(jtfharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbldiskon)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jtfhitung)
                        .addGap(18, 18, 18)
                        .addComponent(lblakhir)
                        .addGap(18, 18, 18)
                        .addComponent(jtfakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblhemat)
                        .addGap(18, 18, 18)
                        .addComponent(jtfhemat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfhitungActionPerformed
        try {
            // Ambil input harga asli
            double hargaAsli = Double.parseDouble(jtfharga.getText());

            // Ambil persentase diskon
            String diskonSelected = (String) cbdiskon.getSelectedItem();
            double persentaseDiskon = Double.parseDouble(diskonSelected.replace("%", ""));

            // Ambil kode kupon
            String kodeKupon = kupon.getText();
            double tambahanDiskon = 0.0;
            if ("DISKON5".equalsIgnoreCase(kodeKupon)) {
                tambahanDiskon = 5.0; // Diskon tambahan 5% jika kupon valid
            } else if ("PROMO10".equalsIgnoreCase(kodeKupon)) {
                tambahanDiskon = 10.0; // Tambahan diskon 10%
            } else if (!kodeKupon.isEmpty()) {
                // Jika kode kupon tidak valid, tampilkan pesan error
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Kode kupon tidak valid!",
                        "Error", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Hitung total diskon
            double totalDiskon = persentaseDiskon + tambahanDiskon;
            double penghematan = hargaAsli * totalDiskon / 100;
            double hargaAkhir = hargaAsli - penghematan;

            // Tampilkan hasil
            jtfhemat.setText(String.format("Rp %.2f", penghematan));
            jtfakhir.setText(String.format("Rp %.2f", hargaAkhir));

            // Tambahkan ke riwayat
            String hasilRiwayat = String.format(
                    "Harga Asli: Rp %.2f, Diskon: %.2f%%, Kupon: %s, Harga Akhir: Rp %.2f\n",
                    hargaAsli, totalDiskon, kodeKupon.isEmpty() ? "Tidak Ada" : kodeKupon, hargaAkhir);
            riwayatdiskon.append(hasilRiwayat);
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Input tidak valid! Masukkan angka untuk harga asli.",
                    "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        
    }
    }//GEN-LAST:event_jtfhitungActionPerformed
    
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
            java.util.logging.Logger.getLogger(Diskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diskon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbdiskon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfakhir;
    private javax.swing.JTextField jtfharga;
    private javax.swing.JTextField jtfhemat;
    private javax.swing.JButton jtfhitung;
    private javax.swing.JTextField kupon;
    private javax.swing.JLabel lblakhir;
    private javax.swing.JLabel lbldiskon;
    private javax.swing.JLabel lblharga;
    private javax.swing.JLabel lblhemat;
    private javax.swing.JTextArea riwayatdiskon;
    // End of variables declaration//GEN-END:variables
}
