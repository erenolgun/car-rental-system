/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Customers;

import GUI.Cancel.Cancel;
import GUI.Cars.DisplayCar;
import GUI.Login;
import GUI.RentingCar.RentingInformation;
import classes.Person;
import classes.SystemClass;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import GUI.Customers.DisplayCustomer;
import javax.swing.JOptionPane;

/**
 *
 * @author ereno
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
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
        jLabelNewCustomer = new javax.swing.JLabel();
        jPanelNewCustomer = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelSurname = new javax.swing.JLabel();
        jTextFieldSurname = new javax.swing.JTextField();
        jLabelNationality = new javax.swing.JLabel();
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
        jButtonAddCustomer = new javax.swing.JButton();
        jLabelPassport = new javax.swing.JLabel();
        jRadioButtonTC = new javax.swing.JRadioButton();
        jRadioButtonOther = new javax.swing.JRadioButton();

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
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonCustomers.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCustomers.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButtonCustomers.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCustomers.setText("Customers");
        jButtonCustomers.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButtonCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomersActionPerformed(evt);
            }
        });

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

        jLabelNewCustomer.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabelNewCustomer.setText("New Customer");

        jPanelNewCustomer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNewCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabelName.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabelName.setText("Name");

        Border border = BorderFactory.createLineBorder(Color.BLACK, 1, true);
        jTextFieldName.setBorder(BorderFactory.createCompoundBorder(border,
            BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelSurname.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelSurname.setText("Surname");

    jTextFieldSurname.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelNationality.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelNationality.setText("Nationality");

jLabelIDNumber.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelIDNumber.setText("ID Number*");

jTextFieldIDNumber.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelBirthdayDate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelBirthdayDate.setText("Birthday Date (DD/MM/YYYY)");

    jTextFieldBirthdayDate.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelDriversLicenceDate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelDriversLicenceDate.setText("Licence Date (DD/MM/YYYY)");

jTextFieldDriversLicenceDate.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jLabelPhone.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
    jLabelPhone.setText("Phone");

    jTextFieldPhone.setBorder(BorderFactory.createCompoundBorder(border,
        BorderFactory.createEmptyBorder(0, 10, 0, 0)));

jLabelEmail.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
jLabelEmail.setText("Email Address");

jTextFieldEmail.setBorder(BorderFactory.createCompoundBorder(border,
    BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    jButtonAddCustomer.setBackground(new java.awt.Color(0, 0, 0));
    jButtonAddCustomer.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
    jButtonAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
    jButtonAddCustomer.setText("ADD CUSTOMER");
    jButtonAddCustomer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddCustomerActionPerformed(evt);
        }
    });

    jLabelPassport.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
    jLabelPassport.setText("*If the customer is not a citizen of the Republic of Turkey, enter customer's passport number.");

    jRadioButtonTC.setBackground(new java.awt.Color(255, 255, 255));
    jRadioButtonTC.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jRadioButtonTC.setText("T.C");
    jRadioButtonTC.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonTCActionPerformed(evt);
        }
    });

    jRadioButtonOther.setBackground(new java.awt.Color(255, 255, 255));
    jRadioButtonOther.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
    jRadioButtonOther.setText("Other");
    jRadioButtonOther.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButtonOtherActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanelNewCustomerLayout = new javax.swing.GroupLayout(jPanelNewCustomer);
    jPanelNewCustomer.setLayout(jPanelNewCustomerLayout);
    jPanelNewCustomerLayout.setHorizontalGroup(
        jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewCustomerLayout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                    .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                                    .addComponent(jLabelPhone)
                                    .addGap(170, 170, 170))
                                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                                    .addComponent(jTextFieldPhone)
                                    .addGap(19, 19, 19)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelEmail)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewCustomerLayout.createSequentialGroup()
                            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelBirthdayDate)
                                .addComponent(jTextFieldBirthdayDate, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(jTextFieldName)
                                .addComponent(jLabelNationality)
                                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                                    .addComponent(jRadioButtonTC)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButtonOther, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelIDNumber)
                                .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldIDNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jLabelDriversLicenceDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDriversLicenceDate))
                                .addComponent(jLabelSurname))))
                    .addGap(44, 44, 44))
                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                    .addComponent(jLabelName)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
            .addGap(177, 177, 177)
            .addComponent(jButtonAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNewCustomerLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelPassport)
            .addContainerGap())
    );
    jPanelNewCustomerLayout.setVerticalGroup(
        jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelName)
                .addComponent(jLabelSurname))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextFieldSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelNationality)
                .addComponent(jLabelIDNumber))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButtonTC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButtonOther, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                    .addComponent(jLabelDriversLicenceDate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldDriversLicenceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                    .addComponent(jLabelBirthdayDate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldBirthdayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanelNewCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                    .addComponent(jLabelEmail)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelNewCustomerLayout.createSequentialGroup()
                    .addComponent(jLabelPhone)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jButtonAddCustomer)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabelPassport.getAccessibleContext().setAccessibleDescription("deneme");

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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
            .addComponent(jButtonCustomers)
            .addGap(30, 30, 30)
            .addComponent(jButtonCars)
            .addGap(28, 28, 28))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanelNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(195, 195, 195))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabelNewCustomer)
                    .addGap(384, 384, 384))))
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addComponent(jLabelNewCustomer)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanelNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(21, 21, 21))
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

    private void jButtonAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCustomerActionPerformed
        String name = jTextFieldName.getText();
        String surname = jTextFieldSurname.getText();
        String nationality = "";
        if(jRadioButtonTC.isSelected()){
            nationality = "T.C.";
        }
        if(jRadioButtonOther.isSelected()){
            nationality = "Other";
        }
        String idNumber = jTextFieldIDNumber.getText();
        String phone = jTextFieldPhone.getText();
        String email = jTextFieldEmail.getText();
        String birthdayDateConst = jTextFieldBirthdayDate.getText();
        String licenceDateConst = jTextFieldDriversLicenceDate.getText();
        
        GregorianCalendar currentDate = new GregorianCalendar();
        
        Person person = new Person(name, surname, email, idNumber, birthdayDateConst, licenceDateConst, phone, email);
        
        String[] birthdayDate = jTextFieldBirthdayDate.getText().split("/");
        String[] licenceDate = jTextFieldDriversLicenceDate.getText().split("/");
        
        if(birthdayDate.length != 3){
            JOptionPane.showMessageDialog(this, "Please enter the correct birthday date format. (DD/MM/YYYY)", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else if(licenceDate.length != 3){
            JOptionPane.showMessageDialog(this, "Please enter the correct licence date format. (DD/MM/YYYY)", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            int birthdayDay = Integer.parseInt(birthdayDate[0]);
            int birthdayMonth = Integer.parseInt(birthdayDate[1]);
            int birthdayYear = Integer.parseInt(birthdayDate[2]);
            
            int licenceDay = Integer.parseInt(licenceDate[0]);
            int licenceMonth = Integer.parseInt(licenceDate[1]);
            int licenceYear = Integer.parseInt(licenceDate[2]);
            
            if(birthdayYear < 1000){
                JOptionPane.showMessageDialog(this, "Please check the customer's birthday year.", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else if (licenceYear < 1000){
                JOptionPane.showMessageDialog(this, "Please check the customer's licence year.", "WARNING", JOptionPane.WARNING_MESSAGE);
            } else {
                if(!SystemClass.isNumeric(jTextFieldIDNumber.getText())){
                    JOptionPane.showMessageDialog(this, "Please enter a numeric value for ID number field.", "WARNING", JOptionPane.WARNING_MESSAGE); 
                } else if(!SystemClass.isNumeric(jTextFieldPhone.getText())){
                    JOptionPane.showMessageDialog(this, "Please enter a numeric value for phone field.", "WARNING", JOptionPane.WARNING_MESSAGE); 
                }else if(!name.equals("") && !surname.equals("") && !nationality.equals("") && !idNumber.equals("") && !phone.equals("") && !email.equals("")){
                    if((currentDate.get(Calendar.YEAR) - licenceYear < 2) && (currentDate.get(Calendar.YEAR) - birthdayYear < 21)){
                        JOptionPane.showMessageDialog(this, "The age of the customer can not be less than 21 and the driver's license age can not be less than 2.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    } else if(currentDate.get(Calendar.YEAR) - birthdayYear < 21){
                        JOptionPane.showMessageDialog(this, "The age of the customer can not be less than 21.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    } else if((currentDate.get(Calendar.YEAR) - licenceYear < 2)){
                        JOptionPane.showMessageDialog(this, "The driver's license age of the customer can not be less than 2.", "WARNING", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if(SystemClass.addPerson(person, licenceYear, licenceMonth, licenceDay, birthdayYear, birthdayMonth, birthdayDay)){
                            JOptionPane.showMessageDialog(this, "Customer is successfully added.", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                            DisplayCustomer displayCustomer = new DisplayCustomer();
                            displayCustomer.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "The customer could not be added.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please fill in all fields.", "WARNING", JOptionPane.WARNING_MESSAGE);
                }
            }
            
            
        }
    }//GEN-LAST:event_jButtonAddCustomerActionPerformed

    private void jButtonCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarsActionPerformed
        DisplayCar displayCar = new DisplayCar();
        displayCar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCarsActionPerformed

    private void jButtonCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomersActionPerformed
        DisplayCustomer displayCustomer = new DisplayCustomer();
        displayCustomer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCustomersActionPerformed

    private void jButtonRentCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRentCarActionPerformed
        RentingInformation RentingInformation = new RentingInformation();
        RentingInformation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRentCarActionPerformed

    private void jRadioButtonTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTCActionPerformed
        if(jRadioButtonTC.isSelected()){
            jRadioButtonOther.setEnabled(false);
        } else {
            jRadioButtonOther.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonTCActionPerformed

    private void jRadioButtonOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOtherActionPerformed
        if(jRadioButtonOther.isSelected()){
            jRadioButtonTC.setEnabled(false);
        } else {
            jRadioButtonTC.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonOtherActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Cancel cancel = new Cancel();
        cancel.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCustomer;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCars;
    private javax.swing.JButton jButtonCustomers;
    private javax.swing.JButton jButtonRentCar;
    private javax.swing.JLabel jLabelBirthdayDate;
    private javax.swing.JLabel jLabelDriversLicenceDate;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIDNumber;
    private javax.swing.JLabel jLabelImportant;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelNewCustomer;
    private javax.swing.JLabel jLabelPassport;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelImportant;
    private javax.swing.JPanel jPanelNewCustomer;
    private javax.swing.JRadioButton jRadioButtonOther;
    private javax.swing.JRadioButton jRadioButtonTC;
    private javax.swing.JTextField jTextFieldBirthdayDate;
    private javax.swing.JTextField jTextFieldDriversLicenceDate;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSurname;
    // End of variables declaration//GEN-END:variables
}
