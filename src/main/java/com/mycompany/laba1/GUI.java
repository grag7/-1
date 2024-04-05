package com.mycompany.laba1;
import com.mycompany.laba1.Human.AbstractHuman;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTree = new javax.swing.JTree();
        redistributeBooksButton = new javax.swing.JButton();
        regenerateAllButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        mainTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(mainTree);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(redistributeBooksButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(regenerateAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redistributeBooksButton)
                    .addComponent(regenerateAllButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        
        model.add(allTeachersNode);
        model.add(allStudentsNode);
        
        for (AbstractHuman human: filler.getHumanFactory().getListHuman()) {
            if(human instanceof Student student) {
                DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode(
                        student.getFirstName() + " " + student.getLastName());
                allStudentsNode.add(studentNode);
                for(Abstraktbook book: student.getReaderTicket().getListOfBooks()){
                    if(book instanceof RussianStudy russianStudy) {
                        studentNode.add(
                                new DefaultMutableTreeNode(russianStudy.getNamebook() + ", "
                               + russianStudy.getType() +  ", "
                                + russianStudy.getDiscipline()));
                    }
                    else if(book instanceof ForeignStudy foreignStudy){
                        studentNode.add(
                                new DefaultMutableTreeNode(foreignStudy.getNamebook() + ", "
                                + foreignStudy.getLevelEducation() + ", "
                                + foreignStudy.getUniversity() + ", "
                                + foreignStudy.getLanguage()));
                    }
                    else if(book instanceof RussianArtisticLiterature artisticLiterature){
                        studentNode.add(new DefaultMutableTreeNode(
                                artisticLiterature.getNamebook() + ", " + 
                                artisticLiterature.getGenre() + ", " + 
                                artisticLiterature.getType()));
                    }
                    else if(book instanceof ForeignArtisticLiterature foreignArtisticLiterature) {
                         studentNode.add(new DefaultMutableTreeNode(
                                 foreignArtisticLiterature.getNamebook() + ", " 
                                + foreignArtisticLiterature.getGenre() + ", "
                                + foreignArtisticLiterature.getNameAutor() + ", " 
                                +  foreignArtisticLiterature.getLanguage()));
                    }
                }
            } 
            else if(human instanceof Teacher teacher) {
                DefaultMutableTreeNode teacherNode = new DefaultMutableTreeNode(
                        teacher.getFirstName() + " "
                        + teacher.getLastName() + " "
                        + teacher.getPatronymic() );
                allTeachersNode.add(teacherNode);
                for(Abstraktbook book: teacher.getReaderTicket().getListOfBooks()){
                    if(book instanceof RussianStudy russianStudy) {
                        teacherNode.add(new DefaultMutableTreeNode(
                                russianStudy.getNamebook() + ", "
                               + russianStudy.getType() + ", " 
                               + russianStudy.getDiscipline()));
                    }
                    else if(book instanceof ForeignStudy foreignStudy){
                        teacherNode.add(new DefaultMutableTreeNode(
                                  foreignStudy.getNamebook() + " "
                                + foreignStudy.getLevelEducation() + ", "
                                + foreignStudy.getUniversity() + ", "
                                + foreignStudy.getLanguage()));
                    }
                    else if(book instanceof RussianArtisticLiterature artisticLiterature){
                        teacherNode.add(new DefaultMutableTreeNode(
                                artisticLiterature.getNamebook() + ", " 
                                + artisticLiterature.getGenre() + ", "
                                + artisticLiterature.getType()));
                    }
                    else if(book instanceof ForeignArtisticLiterature foreignArtisticLiterature) {
                         teacherNode.add(new DefaultMutableTreeNode(
                                 foreignArtisticLiterature.getNamebook() + " " 
                                + foreignArtisticLiterature.getGenre() + " "
                                + foreignArtisticLiterature.getNameAutor() + " " 
                                +  foreignArtisticLiterature.getLanguage()));
                    }
                }
            }
            
        }
        mainTree.setModel(new javax.swing.tree.DefaultTreeModel(model));
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree mainTree;
    private javax.swing.JButton redistributeBooksButton;
    private javax.swing.JButton regenerateAllButton;
    // End of variables declaration//GEN-END:variables
}
