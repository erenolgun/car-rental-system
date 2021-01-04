/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Customers;

import GUI.Cars.DisplayCar;
import GUI.RentingCar.RentingInformation;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author ereno
 */
public class DisplayCustomer extends javax.swing.JFrame {

    /**
     * Creates new form DisplayCustomer
     */
    public DisplayCustomer() {
        initComponents();
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
        jButtonRentCar = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonCustomers = new javax.swing.JButton();
        jButtonCars = new javax.swing.JButton();
        jPanelImportant = new javax.swing.JPanel();
        jLabelImportant = new javax.swing.JLabel();
        jLabelCustomers = new javax.swing.JLabel();
        jButtonAddNewCustomer = new javax.swing.JButton();
        jPanelCustomers = new javax.swing.JPanel();
        jLabelSearchByID = new javax.swing.JLabel();
        jComboBoxID = new javax.swing.JComboBox<>();
        jLabelSearchByName = new javax.swing.JLabel();
        jComboBoxName = new javax.swing.JComboBox<>();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelNationality = new javax.swing.JLabel();
        jTextFieldNationality = new javax.swing.JTextField();
        jLabelIDNumber = new javax.swing.JLabel();
        jTextFieldIDNumber = new javax.swing.JTextField();
        jLabelBirthdayDate = new javax.swing.JLabel();
        jTextFieldBirthdayDate = new javax.swing.JTextField();
        jLabelDriversLicenceDate = new javax.swing.JLabel();
        jTextFieldDriversLicenceDate = new javax.swing.JTextField();
        jLabelPhone = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRentCar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRentCar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonRentCar.setText("Rent a Car");
        jButtonRentCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jButtonRentCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRentCarActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCancel.setText("Cancel the Reservation");
        jButtonCancel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonCustomers.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCustomers.setText("Customers");
        jButtonCustomers.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonCars.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCars.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCars.setText("Cars");
        jButtonCars.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarsActionPerformed(evt);
            }
        });

        jPanelImportant.setBackground(new java.awt.Color(0, 0, 0));

        jLabelImportant.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jLabelImportant.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImportant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImportant.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/alert.png"))); // NOI18N
        jLabelImportant.setText("IMPORTANT NOTE: During the COVID-19 pandemic, our all cars have been sterilized for your health.");

        javax.swing.GroupLayout jPanelImportantLayout = new javax.swing.GroupLayout(jPanelImportant);
        jPanelImportant.setLayout(jPanelImportantLayout);
        jPanelImportantLayout.setHorizontalGroup(
            jPanelImportantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImportant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelImportantLayout.setVerticalGroup(
            jPanelImportantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelImportant, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jLabelCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabelCustomers.setText("Customers");

        jButtonAddNewCustomer.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAddNewCustomer.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonAddNewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddNewCustomer.setText("Add New Customer");
        jButtonAddNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewCustomerActionPerformed(evt);
            }
        });

        jPanelCustomers.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCustomers.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelSearchByID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jLabelSearchByID.setText("Search by ID:");

        jComboBoxID.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jComboBoxID.setBorder(null);

        jLabelSearchByName.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jLabelSearchByName.setText("Search by Name and Surname:");

        jComboBoxName.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jComboBoxName.setBorder(null);

        jLabelName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabelName.setText("Name");

        jTextFieldName.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        jTextFieldName.setBorder(BorderFactory.createCompoundBorder(border,
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelSurname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelSurname.setText("Surname");

    jTextFieldSurname.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jTextFieldSurname.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelNationality.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelNationality.setText("Nationality");

jTextFieldNationality.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
jTextFieldNationality.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelIDNumber.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelIDNumber.setText("ID Number*");

    jTextFieldIDNumber.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jTextFieldIDNumber.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelBirthdayDate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelBirthdayDate.setText("Birthday Date");

jTextFieldBirthdayDate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
jTextFieldBirthdayDate.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelDriversLicenceDate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelDriversLicenceDate.setText("Driver's Licence Date");

    jTextFieldDriversLicenceDate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jTextFieldDriversLicenceDate.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelPhone.setText("Phone");

jTextFieldPhone.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
jTextFieldPhone.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelEmail.setText("Email Address");

    jTextFieldEmail.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jTextFieldEmail.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));
jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldEmailActionPerformed(evt);
    }
    });

    jButtonEdit.setBackground(new java.awt.Color(0, 0, 0));
    jButtonEdit.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
    jButtonEdit.setForeground(new java.awt.Color(255, 255, 255));
    jButtonEdit.setText("EDIT CUSTOMER");

    jButtonSave.setBackground(new java.awt.Color(0, 0, 0));
    jButtonSave.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
    jButtonSave.setForeground(new java.awt.Color(255, 255, 255));
    jButtonSave.setText("SAVE CUSTOMER");

    javax.swing.GroupLayout jPanelCustomersLayout = new javax.swing.GroupLayout(jPanelCustomers);
    jPanelCustomers.setLayout(jPanelCustomersLayout);
    jPanelCustomersLayout.setHorizontalGroup(
        jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelCustomersLayout.createSequentialGroup()
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelBirthdayDate)
                                .addComponent(jTextFieldBirthdayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(110, 110, 110)
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDriversLicenceDate)
                                .addComponent(jTextFieldDriversLicenceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelPhone)
                                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(110, 110, 110)
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEmail)))
                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCustomersLayout.createSequentialGroup()
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNationality)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelName))
                            .addGap(110, 110, 110)
                            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCustomersLayout.createSequentialGroup()
                                    .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelIDNumber)
                                        .addComponent(jLabelSurname))
                                    .addGap(119, 119, 119))
                                .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanelCustomersLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabelSearchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jComboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addComponent(jLabelSearchByName)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jComboBoxName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(56, Short.MAX_VALUE))
    );
    jPanelCustomersLayout.setVerticalGroup(
        jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelCustomersLayout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabelSearchByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSearchByID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jComboBoxName))
            .addGap(18, 18, 18)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelName)
                .addComponent(jLabelSurname))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelNationality)
                .addComponent(jLabelIDNumber))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelBirthdayDate)
                .addComponent(jLabelDriversLicenceDate))
            .addGap(5, 5, 5)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldBirthdayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldDriversLicenceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelPhone)
                .addComponent(jLabelEmail))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(27, 27, 27)
            .addGroup(jPanelCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
            .addGap(27, 27, 27))
    );

    jTextFieldName.setEnabled(false);
    jTextFieldSurname.setEnabled(false);
    jTextFieldNationality.setEnabled(false);
    jTextFieldIDNumber.setEnabled(false);
    jTextFieldBirthdayDate.setEnabled(false);
    jTextFieldDriversLicenceDate.setEnabled(false);
    jTextFieldPhone.setEnabled(false);
    jTextFieldEmail.setEnabled(false);
    jButtonSave.setEnabled(false);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanelImportant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jButtonRentCar)
            .addGap(29, 29, 29)
            .addComponent(jButtonCancel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonCustomers)
            .addGap(30, 30, 30)
            .addComponent(jButtonCars)
            .addGap(33, 33, 33))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(173, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabelCustomers)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(102, 102, 102))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanelImportant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonCars)
                .addComponent(jButtonCustomers)
                .addComponent(jButtonCancel)
                .addComponent(jButtonRentCar))
            .addGap(31, 31, 31)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabelCustomers)
                .addComponent(jButtonAddNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanelCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(27, Short.MAX_VALUE))
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
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonAddNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewCustomerActionPerformed
        AddCustomer addCustomer = new AddCustomer();
        addCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAddNewCustomerActionPerformed

    private void jButtonCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarsActionPerformed
        DisplayCar displayCar = new DisplayCar();
        displayCar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCarsActionPerformed

    private void jButtonRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentCarActionPerformed
        RentingInformation RentingInformation = new RentingInformation();
        RentingInformation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRentCarActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddNewCustomer;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCars;
    private javax.swing.JButton jButtonCustomers;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRentCar;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxID;
    private javax.swing.JComboBox<String> jComboBoxName;
    private javax.swing.JLabel jLabelBirthdayDate;
    private javax.swing.JLabel jLabelCustomers;
    private javax.swing.JLabel jLabelDriversLicenceDate;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIDNumber;
    private javax.swing.JLabel jLabelImportant;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelSearchByID;
    private javax.swing.JLabel jLabelSearchByName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCustomers;
    private javax.swing.JPanel jPanelImportant;
    private javax.swing.JTextField jTextFieldBirthdayDate;
    private javax.swing.JTextField jTextFieldDriversLicenceDate;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNationality;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}
