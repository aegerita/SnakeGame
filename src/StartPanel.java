import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @since 2019/1/11
 * @author Jenny Tai
 */
public class StartPanel extends javax.swing.JPanel {
    String user;
    int rank;
    /**
     * Creates new form Start 
     * @param user the log in user account
     * @param rank the world ranking of the account
     */
    public StartPanel(String user,int rank) {
        this.user = user;
        this.rank = rank;
        initComponents();
        // if logged in
        if (rank!=-1)
            rankLabel.setText(""+(rank+1)+"!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        accountLabel = new javax.swing.JLabel();
        accountButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();
        rankLabel2 = new javax.swing.JLabel();
        rankLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setBackground(java.awt.Color.black);
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SNaKe", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("04b_21", 1, 70), new java.awt.Color(0, 255, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));

        startButton.setFont(new java.awt.Font("Algerian", 3, 60)); // NOI18N
        startButton.setForeground(java.awt.Color.green);
        startButton.setText("Start");
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        accountLabel.setBackground(java.awt.Color.black);
        accountLabel.setFont(new java.awt.Font("Papyrus", 2, 33)); // NOI18N
        accountLabel.setForeground(java.awt.Color.white);
        accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountLabel.setText("User:"+user);
        accountLabel.setToolTipText("");
        accountLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        accountButton.setBackground(new java.awt.Color(0, 0, 0));
        accountButton.setFont(new java.awt.Font("Papyrus", 3, 20)); // NOI18N
        accountButton.setForeground(new java.awt.Color(255, 255, 255));
        accountButton.setText("Log in / Sign in");
        accountButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.gray));
        accountButton.setContentAreaFilled(false);
        accountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        accountButton.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        accountButton.setIconTextGap(0);
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.png"))); // NOI18N

        rankLabel2.setBackground(java.awt.Color.black);
        rankLabel2.setFont(new java.awt.Font("Papyrus", 2, 31)); // NOI18N
        rankLabel2.setForeground(java.awt.Color.white);
        rankLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rankLabel2.setText("World Ranking:");
        rankLabel2.setToolTipText("");
        rankLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        rankLabel.setBackground(java.awt.Color.black);
        rankLabel.setFont(new java.awt.Font("Papyrus", 2, 30)); // NOI18N
        rankLabel.setForeground(java.awt.Color.white);
        rankLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rankLabel.setText("N\\A");
        rankLabel.setToolTipText("");
        rankLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rankLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rankLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 131, Short.MAX_VALUE)
                .addComponent(startButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(accountButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(backgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rankLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        String[] options = {"Single Player","Double Player"};
        if (JOptionPane.showOptionDialog(this, "1 Player or 2 Player game?",
                "Choose Game Type",0,JOptionPane.INFORMATION_MESSAGE,
                null,options,null) == 0){
            // 1 player
            SnakeGame.setIsSingle(true);
            // if not logged in
            if ("N/A".equals(user)||"AI".equals(user)){
                options = new String[]{"AI","Without Account"};
                int chosen = JOptionPane.showOptionDialog(this, 
                        "Do you want to watch AI or start the game without an account?"
                                + "\nYour score won't be stored!", 
                        "You didn't log in or sign up",0,JOptionPane.WARNING_MESSAGE,
                    null,options,null);
                if (chosen == 0)
                    SnakeGame.setUser("AI",UserFrameIO.findUser("AI").getBest(),UserFrameIO.findName("AI"));
                if (chosen ==0||chosen ==1){
                    double size = SnakeGame.askSize();
                    if (size != 0)
                        SnakeGame.startGame(size,true);
                }

            // logged in . ask for window size, cancel if user choose cancel
            } else {
                double size = SnakeGame.askSize();
                if (size != 0)
                    SnakeGame.startGame(size,true);
            }

        // 2 player game
        } else {
            SnakeGame.setIsSingle(false);
            options = new String[]{"Friends","AI"};
            int chosen = JOptionPane.showOptionDialog(this, 
                    "Do you actually have friend who is willing to play this game with you?"
                            + "\nMaybe you can play with AI instead", 
                    "Choose game modes",0,JOptionPane.WARNING_MESSAGE,
                null,options,null);
            if (chosen == 1){
                if ("N/A".equals(user)||"AI".equals(user)){
                    options = new String[]{"AI","Without Account"};
                    chosen = JOptionPane.showOptionDialog(this, 
                        "Do you want to watch AI or start the game without an account?"
                                + "\nYour score won't be stored!", 
                        "You didn't log in or sign up",0,JOptionPane.WARNING_MESSAGE,
                        null,options,null);
                    if (chosen == 0){
                        SnakeGame.setUser("AI",UserFrameIO.findUser("AI").getBest(),UserFrameIO.findName("AI"));
                        SnakeGame.account(true);
                    } else {
                        SnakeGame.setUser("AI",UserFrameIO.findUser("AI").getBest(),UserFrameIO.findName("AI"));
                        double size = SnakeGame.askSize();
                            if (size != 0)
                            SnakeGame.startGame(size,false);
                    }
                }
            } else if (chosen ==0){
                // if not logged in
                if ("N/A".equals(user)||"AI".equals(user)){
                    options = new String[]{"2 Accounts","1 Account","Without Account"};
                    chosen = JOptionPane.showOptionDialog(this, 
                            "You havn't login. You would need to sign up if you want "
                                    + "to record your scores. \nHow many account "
                                    + "would you like to login or sign up? \nJust"
                                    + " close the login window if you changed your mind. ", 
                            "Choose User Accounts",0,JOptionPane.INFORMATION_MESSAGE,
                        null,options,null);
                    if (chosen == 0){
                        SnakeGame.account(true);
                        SnakeGame.account(false);
                    } else if (chosen == 1){
                        SnakeGame.account(true);                             
                    } else if (chosen == 2){
                        double size = SnakeGame.askSize();
                        if (size != 0)
                            SnakeGame.startGame(size,false);
                    }

                } else {
                    JOptionPane.showMessageDialog(this,"You would need to "
                            + "login another account to play 2 players game. "
                            + "\nClose the login window if don't want to login. ");
                    SnakeGame.account(true);
                }

            }
            
        } 
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // call for user frame
        SnakeGame.account(false);
    }//GEN-LAST:event_accountButtonActionPerformed

    /**
     * if the user frame called the start panel to change (user logged in)
     * @param user new username
     * @param rank new ranking 
     */
    public void login(String user, int rank){
        accountLabel.setText("User:"+ user);
        rankLabel.setText(""+(rank+1)+"!");
        this.user = user;
        this.rank = rank;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel rankLabel;
    private javax.swing.JLabel rankLabel2;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}