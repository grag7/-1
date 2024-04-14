package com.mycompany.laba1;
import com.mycompany.laba1.Human.AbstractHuman;
import com.mycompany.laba1.Human.AbstractHuman.Typee;
import com.mycompany.laba1.Human.Student;
import com.mycompany.laba1.Human.Teacher;
import com.mycompany.laba1.book.Abstraktbook;
import com.mycompany.laba1.book.ForeignArtisticLiterature;
import com.mycompany.laba1.book.ForeignStudy;
import com.mycompany.laba1.book.RussianArtisticLiterature;
import com.mycompany.laba1.book.RussianStudy;
import javax.swing.tree.DefaultMutableTreeNode;


public class GUI extends javax.swing.JFrame {
     private DefaultMutableTreeNode model;
     private final AutoRandomFiller filler;
    
    public GUI(AutoRandomFiller filler) {
        this.filler = filler;
        initComponents();
        JTreeConfiguration();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jPaneProkrut = new javax.swing.JScrollPane();
        mainTree = new javax.swing.JTree();
        redistributeBooksButton = new javax.swing.JButton();
        regenerateAllButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        mainTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jPaneProkrut.setViewportView(mainTree);

        redistributeBooksButton.setBackground(new java.awt.Color(252, 252, 252));
        redistributeBooksButton.setForeground(new java.awt.Color(0, 0, 0));
        redistributeBooksButton.setText("Перераспределить книги");
        redistributeBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redistributeBooksButtonActionPerformed(evt);
            }
        });

        regenerateAllButton.setBackground(new java.awt.Color(252, 252, 253));
        regenerateAllButton.setForeground(new java.awt.Color(0, 0, 0));
        regenerateAllButton.setText("Перегенерировать людей и книги");
        regenerateAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regenerateAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneProkrut, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(redistributeBooksButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(regenerateAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPaneProkrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redistributeBooksButton)
                    .addComponent(regenerateAllButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redistributeBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redistributeBooksButtonActionPerformed
        filler.reassignBooks();
        JTreeConfiguration();
    }//GEN-LAST:event_redistributeBooksButtonActionPerformed

    private void regenerateAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regenerateAllButtonActionPerformed
        filler.generateAll();
        JTreeConfiguration();
    }//GEN-LAST:event_regenerateAllButtonActionPerformed
    private void JTreeConfiguration() {
        
        model = new DefaultMutableTreeNode("Библиотека");
        DefaultMutableTreeNode allTeachersNode =
                new DefaultMutableTreeNode("Преподаватели");
        DefaultMutableTreeNode allStudentsNode =
                new DefaultMutableTreeNode("Студенты");
        
        distributionHuman (allStudentsNode, allTeachersNode);
        model.add(allTeachersNode);
        model.add(allStudentsNode);
        
        mainTree.setModel(new javax.swing.tree.DefaultTreeModel(model));
       
    }
     public void distributionHuman(DefaultMutableTreeNode allStudentsNode,
             DefaultMutableTreeNode allTeachersNode){
     for (AbstractHuman human: filler.getHumanFactory().getListHuman()) {
         String FIO = human.getFIO();
            switch(human.getTypee()){
                case Student:
                    DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode(
                        FIO);
                allStudentsNode.add(studentNode);
                for(Abstraktbook book: human.getReaderTicket().getListOfBooks()){
                    studentNode.add(distributionOfBooks(book));
                }
               
                break;
                case Teacher:
                    DefaultMutableTreeNode teacherNode = new DefaultMutableTreeNode(
                       FIO);
                allTeachersNode.add(teacherNode);
                for(Abstraktbook book: human.getReaderTicket().getListOfBooks()){
                    teacherNode.add(distributionOfBooks(book));
                }
                break;
            }
        }
     }
    
     public DefaultMutableTreeNode distributionOfBooks(Abstraktbook book){
         String text;
         System.out.println(book.getType());
         switch(book.getType()){
                case RussianStudy:
                RussianStudy russianStudy = (RussianStudy) book;
                 text = russianStudy.getNamebook() + ", "
                               + russianStudy.getType() + ", " 
                               + russianStudy.getDiscipline();
                return new DefaultMutableTreeNode(text);
                case RussianArtisticLiterature:
                    RussianArtisticLiterature artisticLiterature = (RussianArtisticLiterature) book;
                    text = artisticLiterature.getNamebook() + ", "
                               + artisticLiterature.getGenre() + ", " 
                               + artisticLiterature.getType();
                    return new DefaultMutableTreeNode(text);
                case ForeignStudy:
                    ForeignStudy foreignStudy = (ForeignStudy) book;
                    text = foreignStudy.getNamebook() + " "
                                + foreignStudy.getLevelEducation() + ", "
                                + foreignStudy.getUniversity() + ", "
                                + foreignStudy.getLanguage();
                    return new DefaultMutableTreeNode(text);
                case ForeignArtisticLiterature:
                    ForeignArtisticLiterature foreignArtisticLiterature = (ForeignArtisticLiterature) book;
                    text = foreignArtisticLiterature.getNamebook() + " " 
                                + foreignArtisticLiterature.getGenre() + " "
                                + foreignArtisticLiterature.getNameAutor() + " " 
                                +  foreignArtisticLiterature.getLanguage();
                    return new DefaultMutableTreeNode(text);
                    }
         
         return null;
     } 
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jPaneProkrut;
    private javax.swing.JPanel jPanel;
    private javax.swing.JTree mainTree;
    private javax.swing.JButton redistributeBooksButton;
    private javax.swing.JButton regenerateAllButton;
    // End of variables declaration//GEN-END:variables
}
