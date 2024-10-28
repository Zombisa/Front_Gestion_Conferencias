package views;

import models.Conference;
import models.ListConferencesDTO;
import utilities.Utilities;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import services.ServiceArticle;
import services.ServiceConference;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Isabela Sánchez Saavedra <isanchez@unicauca.edu.co>
 */
public class VConferences extends javax.swing.JFrame{
    private ServiceConference service;
    private ServiceArticle serviceArticle;
    private List<Conference> conferenceList;
    private Runnable refreshCallback; 
    private String idAuthor;

    /**
     * Creates new form VLogin
     */
    public VConferences(ServiceConference service, ServiceArticle serviceArticle, String idAuthor, Runnable refreshCallback) {
        this.service = service;
        this.serviceArticle=serviceArticle;
        this.idAuthor=idAuthor;
        this.refreshCallback = refreshCallback;
        initComponents();
        ListConferencesDTO conferences = service.listConferences();
        
        loadConferences(conferences);
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
        jPanelAvailableC = new javax.swing.JPanel();
        jLabelAvailableC = new javax.swing.JLabel();
        jPanelViewC = new javax.swing.JPanel();
        jScrollPaneConferences = new javax.swing.JScrollPane();
        jTableConferences = new javax.swing.JTable();
        jTextFieldSearch = new javax.swing.JTextField();
        jLabelLupa = new javax.swing.JLabel();
        jPanelNoConferences = new javax.swing.JPanel();
        jLabelNoConference1 = new javax.swing.JLabel();
        jLabelNoConference2 = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanelBackground.setBackground(new java.awt.Color(155, 179, 232));
        jPanelBackground.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanelBackground.setPreferredSize(new java.awt.Dimension(800, 500));
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

        jPanelHeader.add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 0, -1, -1));

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
        jPanelHeader.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 0, -1, 60));

        jLabelProfile.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelProfile.setText("Mi perfil");
        jLabelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelProfile.setMaximumSize(new java.awt.Dimension(60, 18));
        jLabelProfile.setMinimumSize(new java.awt.Dimension(60, 18));
        jLabelProfile.setName(""); // NOI18N
        jLabelProfile.setPreferredSize(new java.awt.Dimension(60, 18));
        jPanelHeader.add(jLabelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 60));

        jLabelConferences.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabelConferences.setText("Conferencias");
        jLabelConferences.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHeader.add(jLabelConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 60));

        jPanelBackground.add(jPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanelAvailableC.setBackground(new java.awt.Color(94, 23, 235));

        jLabelAvailableC.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        jLabelAvailableC.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAvailableC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAvailableC.setText("CONFERENCIAS DISPONIBLES");

        javax.swing.GroupLayout jPanelAvailableCLayout = new javax.swing.GroupLayout(jPanelAvailableC);
        jPanelAvailableC.setLayout(jPanelAvailableCLayout);
        jPanelAvailableCLayout.setHorizontalGroup(
            jPanelAvailableCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvailableCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAvailableC, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAvailableCLayout.setVerticalGroup(
            jPanelAvailableCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAvailableCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelAvailableC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBackground.add(jPanelAvailableC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 420, 50));

        jPanelViewC.setBackground(new java.awt.Color(255, 255, 255));
        jPanelViewC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPaneConferences.setBackground(new java.awt.Color(255, 255, 255));

        jTableConferences.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jTableConferences.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPaneConferences.setViewportView(jTableConferences);

        jPanelViewC.add(jScrollPaneConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 50, 600, 200));

        jTextFieldSearch.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldSearch.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jPanelViewC.add(jTextFieldSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 17, 568, 25));

        jLabelLupa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelViewC.add(jLabelLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 6, -1, 47));

        jPanelBackground.add(jPanelViewC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 640, 270));

        jPanelNoConferences.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNoConferences.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNoConference1.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabelNoConference1.setForeground(new java.awt.Color(233, 233, 233));
        jLabelNoConference1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoConference1.setText("No hay conferencias ");
        jLabelNoConference1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanelNoConferences.add(jLabelNoConference1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 140));

        jLabelNoConference2.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        jLabelNoConference2.setForeground(new java.awt.Color(233, 233, 233));
        jLabelNoConference2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNoConference2.setText("disponibles");
        jLabelNoConference2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanelNoConferences.add(jLabelNoConference2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 640, 130));

        jPanelBackground.add(jPanelNoConferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 640, 270));

        jButtonRefresh.setBackground(new java.awt.Color(24, 17, 67));
        jButtonRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRefreshMouseClicked(evt);
            }
        });
        jPanelBackground.add(jButtonRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 103, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButtonRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRefreshMouseClicked
        refreshConferences();
    }//GEN-LAST:event_jButtonRefreshMouseClicked

    public void loadConferences(ListConferencesDTO conferencesDTO) {
        List<Conference> conferences = conferencesDTO.getConferences();
        if (conferences.isEmpty()) {
            jPanelNoConferences.setVisible(true);
            jScrollPaneConferences.setVisible(false);
        } else {
            jPanelNoConferences.setVisible(false);
            jScrollPaneConferences.setVisible(true);

            // Crear un modelo de tabla personalizado
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column == 2;  // Solo la columna del botón es editable
                }
            };

            model.addColumn("Nombre");
            model.addColumn("Fecha de Inicio");
            model.addColumn("");  // Columna vacía para el botón
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            for (Conference conf : conferences) {
                model.addRow(new Object[]{conf.getName(), formatter.format(conf.getStartDate()), "Ver más..."});
            }

            jTableConferences.setModel(model);

            jTableConferences.getColumnModel().getColumn(2).setCellRenderer(new ButtonRenderer());
            jTableConferences.getColumnModel().getColumn(2).setCellEditor(new ButtonEditor(new JCheckBox(), conferences, service, this::refreshConferences));

            jTableConferences.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableConferences.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableConferences.getColumnModel().getColumn(2).setPreferredWidth(100);
            
            jTableConferences.setRowHeight(40);
        }
    }

    private void refreshConferences() {
        ListConferencesDTO updatedConferences = service.listConferences();
        loadConferences(updatedConferences);
    }


    public void update(Object o) {
        service = (ServiceConference)o;
        loadConferences(service.listConferences());
    }
    
    
// Clase para renderizar un botón en la celda
    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

// Clase para manejar la edición de la celda con el botón
    class ButtonEditor extends DefaultCellEditor {

        private JButton button;
        private String label;
        private boolean isPushed;
        private List<Conference> conferences;
        private ServiceConference service;  // Añadir el servicio como atributo
        private Runnable refreshCallback; 

        public ButtonEditor(JCheckBox checkBox, List<Conference> conferences, ServiceConference service, Runnable refreshCallback) {
            super(checkBox);
            this.conferences = conferences;
            this.service = service;  // Inicializar el servicio
            this.refreshCallback = refreshCallback;  // Guardar el callback
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                // Obtener la conferencia seleccionada
                Conference selectedConference = conferences.get(jTableConferences.getSelectedRow());

                // Obtener el id de la conferencia seleccionada
                String idConference = selectedConference.getIdConference();

                // Abrir la ventana VConferenceInfo con el service y el idConference
                VConferenceInfo infoWindow = new VConferenceInfo(service,serviceArticle, idConference, idAuthor);
                infoWindow.setVisible(true);  // Mostrar la ventana con la información de la conferencia
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JLabel jLabelAvailableC;
    private javax.swing.JLabel jLabelConferences;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelLupa;
    private javax.swing.JLabel jLabelMinimize;
    private javax.swing.JLabel jLabelNoConference1;
    private javax.swing.JLabel jLabelNoConference2;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JPanel jPanelAvailableC;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelMinimize;
    private javax.swing.JPanel jPanelNoConferences;
    private javax.swing.JPanel jPanelViewC;
    private javax.swing.JScrollPane jScrollPaneConferences;
    private javax.swing.JTable jTableConferences;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
