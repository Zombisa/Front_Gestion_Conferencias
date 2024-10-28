package views;

import java.awt.Color;
import models.User;
import serviceFactory.ServiceFactory;
import services.ServiceArticle;
import services.ServiceConference;
import services.ServiceUser;
import utilities.Utilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Isabela Sánchez Saavedra <isanchez@unicauca.edu.co>
 */
public class VProfile extends javax.swing.JFrame {
    User user;
    ServiceUser serviceUser;
    ServiceConference serviceConference;
    ServiceArticle serviceArticle;
    Runnable refreshCallback;
    /**
     * Creates new form VLogin
     */
    public VProfile(User user, ServiceUser serviceUser) {
        initComponents();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        this.user = user;
        this.serviceArticle = serviceFactory.getServiceArticle();
        this.serviceConference = serviceFactory.getServiceConference();
        this.serviceUser = serviceFactory.getServiceUser();
        displayUserInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelExit = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jPanelMinimize = new javax.swing.JPanel();
        jLabelMinimize = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelProfile = new javax.swing.JLabel();
        jLabelConferences = new javax.swing.JLabel();
        jComboBoxProfile = new javax.swing.JComboBox<>();
        jLabelName = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelShownCode = new javax.swing.JLabel();
        jPanelPhoto = new javax.swing.JPanel();
        jLabelPhoto = new javax.swing.JLabel();
        jPanelYourConferences = new javax.swing.JPanel();
        jLabelYourConferences = new javax.swing.JLabel();
        jPanelConferences = new javax.swing.JPanel();
        jLabelLupa = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabelThemes = new javax.swing.JLabel();
        jLabelShownTheme = new javax.swing.JLabel();
        jButtonEditTheme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(155, 179, 232));
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHeader.setBackground(new java.awt.Color(1, 143, 166));
        jPanelHeader.setPreferredSize(new java.awt.Dimension(800, 40));
        jPanelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelHeaderMouseDragged(evt);
            }
        });
        jPanelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelHeaderMousePressed(evt);
            }
        });
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelExit.setBackground(new java.awt.Color(1, 143, 166));

        jLabelExit.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(0, 0, 0));
        jLabelExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExit.setText("X");
        jLabelExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExit.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelExitLayout = new javax.swing.GroupLayout(jPanelExit);
        jPanelExit.setLayout(jPanelExitLayout);
        jPanelExitLayout.setHorizontalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelExitLayout.setVerticalGroup(
            jPanelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExitLayout.createSequentialGroup()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelHeader.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jPanelMinimize.setBackground(new java.awt.Color(1, 143, 166));

        jLabelMinimize.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabelMinimize.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimize.setText("-");
        jLabelMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimize.setPreferredSize(new java.awt.Dimension(40, 40));
        jLabelMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMinimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelMinimizeLayout = new javax.swing.GroupLayout(jPanelMinimize);
        jPanelMinimize.setLayout(jPanelMinimizeLayout);
        jPanelMinimizeLayout.setHorizontalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMinimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelMinimizeLayout.setVerticalGroup(
            jPanelMinimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinimizeLayout.createSequentialGroup()
                .addComponent(jLabelMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelHeader.add(jPanelMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelLogo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(193, 255, 114));
        jLabelLogo.setText("meeting");
        jPanelHeader.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, 60));

        jLabelProfile.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelProfile.setText("Mi perfil");
        jLabelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHeader.add(jLabelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        jLabelConferences.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelConferences.setText("Conferencias");
        jLabelConferences.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelConferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelConferencesMouseClicked(evt);
            }
        });
        jPanelHeader.add(jLabelConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, 60));

        jComboBoxProfile.setBackground(new java.awt.Color(1, 143, 166));
        jComboBoxProfile.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jComboBoxProfile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "author", "organizer" }));
        jComboBoxProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProfileActionPerformed(evt);
            }
        });
        jPanelHeader.add(jComboBoxProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 40));

        jPanelBackground.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jLabelName.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(193, 255, 114));
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelName.setText("Nombre:");
        jPanelBackground.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        jLabelCode.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabelCode.setForeground(new java.awt.Color(193, 255, 114));
        jLabelCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCode.setText("Codigo:");
        jPanelBackground.add(jLabelCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        jLabelFullName.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabelFullName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFullName.setText("jLabel1");
        jPanelBackground.add(jLabelFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 240, -1));

        jLabelShownCode.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabelShownCode.setForeground(new java.awt.Color(255, 255, 255));
        jLabelShownCode.setText("jLabel2");
        jPanelBackground.add(jLabelShownCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        jPanelPhoto.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPhoto.setMaximumSize(new java.awt.Dimension(200, 200));
        jPanelPhoto.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanelPhoto.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabelPhoto.setText("FOTO");
        jLabelPhoto.setMaximumSize(new java.awt.Dimension(160, 140));
        jLabelPhoto.setMinimumSize(new java.awt.Dimension(160, 140));
        jLabelPhoto.setPreferredSize(new java.awt.Dimension(160, 140));

        javax.swing.GroupLayout jPanelPhotoLayout = new javax.swing.GroupLayout(jPanelPhoto);
        jPanelPhoto.setLayout(jPanelPhotoLayout);
        jPanelPhotoLayout.setHorizontalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPhotoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelPhotoLayout.setVerticalGroup(
            jPanelPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPhotoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanelBackground.add(jPanelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 200, 200));

        jPanelYourConferences.setBackground(new java.awt.Color(94, 23, 235));

        jLabelYourConferences.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelYourConferences.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelYourConferences.setText("TUS CONFERENCIAS");

        javax.swing.GroupLayout jPanelYourConferencesLayout = new javax.swing.GroupLayout(jPanelYourConferences);
        jPanelYourConferences.setLayout(jPanelYourConferencesLayout);
        jPanelYourConferencesLayout.setHorizontalGroup(
            jPanelYourConferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelYourConferencesLayout.createSequentialGroup()
                .addComponent(jLabelYourConferences, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelYourConferencesLayout.setVerticalGroup(
            jPanelYourConferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelYourConferences, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanelBackground.add(jPanelYourConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 220, 40));

        jPanelConferences.setBackground(new java.awt.Color(255, 255, 255));
        jPanelConferences.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelConferences.add(jLabelLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, 50));

        jTextFieldSearch.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSearch.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelConferences.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 30));

        jPanelBackground.add(jPanelConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 460, 180));

        jLabelThemes.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabelThemes.setForeground(new java.awt.Color(193, 255, 114));
        jLabelThemes.setText("Temas de interés");
        jPanelBackground.add(jLabelThemes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 190, 30));

        jLabelShownTheme.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabelShownTheme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelShownTheme.setText("jLabel1");
        jPanelBackground.add(jLabelShownTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 120, -1));

        jButtonEditTheme.setBackground(new java.awt.Color(94, 23, 235));
        jButtonEditTheme.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jButtonEditTheme.setText("EDITAR");
        jPanelBackground.add(jButtonEditTheme, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 310, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMousePressed
        Utilities.headerMousePressed(evt);
    }//GEN-LAST:event_jPanelHeaderMousePressed

    private void jPanelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHeaderMouseDragged
        Utilities.headerMouseDragged(evt, this);
    }//GEN-LAST:event_jPanelHeaderMouseDragged

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        Utilities.exitApp();
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseEntered
        Utilities.changeColorOnMouseEnter(jPanelExit, jLabelExit, Color.red, Color.white);
    }//GEN-LAST:event_jLabelExitMouseEntered

    private void jLabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseExited
        Utilities.changeColorOnMouseExit(jPanelExit, jLabelExit, Utilities.AZUL_ACENTOS, Color.black);
    }//GEN-LAST:event_jLabelExitMouseExited

    private void jLabelMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseExited
        Utilities.changeColorOnMouseExit(jPanelMinimize, jLabelMinimize, Utilities.AZUL_ACENTOS, Color.black);
    }//GEN-LAST:event_jLabelMinimizeMouseExited

    private void jLabelMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseEntered
        Utilities.changeColorOnMouseEnter(jPanelMinimize, jLabelMinimize, Color.red, Color.white);
    }//GEN-LAST:event_jLabelMinimizeMouseEntered

    private void jLabelMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeMouseClicked
        Utilities.minimizeWindow(this);
    }//GEN-LAST:event_jLabelMinimizeMouseClicked

    private void jComboBoxProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProfileActionPerformed
        boolean primerCondicion = jComboBoxProfile.isVisible();
        Object selectedItem= jComboBoxProfile.getSelectedItem();
        boolean segundaCondicion = "organizer".equals(selectedItem); 
        if (primerCondicion&& segundaCondicion ) {
                String idOrganizer = user.getId();
                VProfileOrganizer profileOrganizer = new VProfileOrganizer(serviceConference, idOrganizer);
                profileOrganizer.setVisible(true);
            }
    }//GEN-LAST:event_jComboBoxProfileActionPerformed

    private void jLabelConferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelConferencesMouseClicked
        String idAuthor =  user.getId();

        // Crear una Runnable para la callback de refresco (puedes personalizarlo según tus necesidades)
        Runnable refreshCallback = () -> {
            // Aquí puedes definir lo que quieres que haga al refrescar
            System.out.println("Refrescar la lista de conferencias");
        };

        // Crear la instancia de VConferences
        VConferences vConferences = new VConferences(serviceConference, serviceArticle, idAuthor, refreshCallback);

        // Mostrar la vista de VConferences
        vConferences.setVisible(true);
    }//GEN-LAST:event_jLabelConferencesMouseClicked

    private boolean isUserOrganizer(User user) {
        String role = serviceUser.getUserRole(user);
        return role.equals("organizer");
    }
    
    private void displayUserInfo() {
        jLabelFullName.setText(user.getName());
        jLabelShownCode.setText(String.valueOf(user.getId())); 
        jLabelShownTheme.setText("Tema genérico"); 
        
        if (isUserOrganizer(user)) {
            this.jComboBoxProfile.setVisible(true); // Mostrar el ComboBox
        } else {
            this.jComboBoxProfile.setVisible(false);
        }
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditTheme;
    private javax.swing.JComboBox<String> jComboBoxProfile;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelConferences;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLupa;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JLabel jLabelShownCode;
    private javax.swing.JLabel jLabelShownTheme;
    private javax.swing.JLabel jLabelThemes;
    private javax.swing.JLabel jLabelYourConferences;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelConferences;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JPanel jPanelPhoto;
    private javax.swing.JPanel jPanelYourConferences;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
