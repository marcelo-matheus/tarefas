package telas.colaborador;

import javax.swing.*;

import banco.de.dados.DAO.CadastroDAO;
import banco.de.dados.DAO.LoginDAO;
import banco.de.dados.Model.Login;

import java.awt.*;
import java.awt.event.*;

public class TelaMeuPerfil extends JFrame implements ActionListener {

//imagen menu
   ImageIcon mp = new ImageIcon(getClass().getResource("img/bntmp.png"));
	
   JButton bntmeuperfil = new JButton(mp);	

   ImageIcon historico = new ImageIcon(getClass().getResource("img/bnthist.png"));
	
   JButton bnthistorico = new JButton(historico);	



   ImageIcon novasuges = new ImageIcon(getClass().getResource("img/bntns.png"));
	
   JButton bntnovasugestao = new JButton(novasuges);	



   ImageIcon sair = new ImageIcon(getClass().getResource("img/bntsair.png"));
	
   JButton bntsair = new JButton(sair);	

   ImageIcon retorn = new ImageIcon(getClass().getResource("img/bntr.png"));
	
   JButton bntretornar = new JButton(retorn);	




   private JComboBox curso;

   private static final String[] cur = {"","An�lise e desenvolvimento de sistemas","Banco de dados","Gest�o da tecnologia da informa��o ","Redes de computadores","Sistemas de informa��es","Jogos digitais"};


   Login lo = Login.getInstance();
	
		
   private JLabel lblnovasugestao,lbltitulo,lbdata,lbcurso,lbperiodo,lbtelr,lbtelc,lbusuario,lbsenha,email,esp,esp1,esp2,esp3,esp4,esp5;
	
		
   private JTextField txttitulo,txtdt,txtcurso,txtperiodo,txttelefoner,txttelefonec,txtusuario,txtsenha,txtemail;
	
   private JLabel espaco;

   
   
	
   private JButton bntenviar,bntlimpar;

   private JPanel jPanelMenu,jPanelNovaSugestao;
   
   // Mensagem de erro 
   private String ErroMSG;
   
	  private boolean checknome;
	  private boolean checkdata;
	  private boolean checktelr;
	  private boolean checktelc;
	  private boolean checkemail;
	  private boolean checkusuario;
	  private boolean checksenha;
	  private boolean checktelefones;
	  
	
	
   public TelaMeuPerfil(){
      super("Uni - Meu Perfil");
   	     
      
     
      curso = new JComboBox (cur);
      curso.setMaximumRowCount(7);
	  
      if(lo.getCurso().toString().length() == 37){
    	  curso.setSelectedIndex(1);
      }else{
    	  if(lo.getCurso().toString().length() == 15){
        	  curso.setSelectedIndex(2);
    	  }else{
    		  if(lo.getCurso().toString().length() == 35){
            	  curso.setSelectedIndex(3);
        	  }else{
        		  if(lo.getCurso().toString().length() == 21){
                	  curso.setSelectedIndex(4);
            	  }else{
            		  if(lo.getCurso().toString().length() == 23){
                    	  curso.setSelectedIndex(5);
                	  }else{
                		  if(lo.getCurso().toString().length() == 14){
                        	  curso.setSelectedIndex(6);
                      }else{
                    	  curso.setSelectedIndex(0);
                      }
                    }
                }
             }
         }
      }
   
      
   	
   	//Menu
      espaco  = new JLabel(" ");
   	
      bntsair.setToolTipText("Sair");
      bntretornar.setToolTipText("Voltar");		
   	
      bntenviar = new JButton("Atualizar");
      bntlimpar = new JButton("Cancelar");
   	
      jPanelMenu = new JPanel();
      jPanelNovaSugestao = new JPanel();
   
   					
     
      //labels
      
      esp = new JLabel(" ");
      esp1 = new JLabel(" ");
      esp2 = new JLabel(" ");
      esp3 = new JLabel(" ");
      esp4 = new JLabel(" ");
      esp5 = new JLabel(" ");
   
   
      
      
      lblnovasugestao = new JLabel("               Meu Perfil");
      lblnovasugestao.setFont(new Font("Arial", 1, 34)); 
      lblnovasugestao.setForeground(new Color(0, 102, 204));
   
    
          
    
      lbltitulo = new JLabel(" Nome Completo ");
      lbdata = new JLabel("                                 Data de Nascimento ");
      lbcurso = new JLabel(" Faculdade ");
      lbperiodo = new JLabel("     Curso ");
      email = new JLabel(" E-mail ");
      lbtelr = new JLabel(" Telefone residencial ");
      lbtelc = new JLabel(" Telefone celular ");
      lbusuario = new JLabel(" Usu�rio ");
      lbsenha = new JLabel("                                         Senha ");
   
    //txt 
    
      txttitulo = new JTextField(0);
   
      txtdt = new JTextField(0);
      txtcurso = new JTextField("Universidade Novo Intelecto");
      txtperiodo = new JTextField(0);
      txttelefoner = new JTextField(0);
      txttelefonec = new JTextField(0);
      txtusuario = new JTextField(0);
      txtsenha = new JPasswordField(0);
      txtemail = new JTextField(0);
      txtcurso.setEditable(false);
   
   
   
   
   
   	
      Container caixa = getContentPane();
   	
      caixa.setLayout(new BorderLayout());//leyout nulo para poder posicionar os components
      caixa.add(jPanelMenu, BorderLayout.WEST);
      caixa.add(jPanelNovaSugestao, BorderLayout.CENTER);
   	
   	
   	
   	
   	//Painel do Menu
      jPanelMenu.setBackground(new java.awt.Color(0,102,204));
    
   
   
      jPanelMenu.setPreferredSize(new Dimension(170,200));//tamanha do painel
      
      jPanelMenu.setLayout(new FlowLayout());
      
      jPanelMenu.add(bntmeuperfil);
    
      
      jPanelMenu.add(bnthistorico);
              
      jPanelMenu.add(bntnovasugestao);
      
      jPanelMenu.add(espaco,BorderLayout.CENTER);
      espaco.setPreferredSize(new Dimension(170,50));;
     
      jPanelMenu.add(bntretornar);
      
      jPanelMenu.add(bntsair);
              
      
      
      
      
              
   	
   	
   	//botoes
      bntmeuperfil.addActionListener(this);
      bnthistorico.addActionListener(this);
      bntnovasugestao.addActionListener(this);
      bntretornar.addActionListener(this);
      bntsair.addActionListener(this);
      bntlimpar.addActionListener(this);
      bntenviar.addActionListener(this);
   
    //fundo dos botoes
   
      bntmeuperfil.setContentAreaFilled(false);//tira o fundo
      bnthistorico.setContentAreaFilled(false);
      bntmeuperfil.setBorder(null);//tira as bordas
      bnthistorico.setBorder(null);
      
      bntnovasugestao.setContentAreaFilled(false);
      bntnovasugestao.setBorder(null);//tira as bordas  
      
      bntsair.setContentAreaFilled(false);
      bntsair.setBorder(null);//tira as bordas
      
      bntretornar.setContentAreaFilled(false);
      bntretornar.setBorder(null);//tira as bordas
   
   
   
      //maozinha
   
   
      bntmeuperfil.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
      bnthistorico.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
      bntnovasugestao.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
      bntsair.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
      bntretornar.setCursor(new Cursor(java.awt.Cursor.HAND_CURSOR));
   
   
   
   
   
   	
   	
      bntmeuperfil.setPreferredSize(new Dimension(140,100));//tamanho do bota0
      bnthistorico.setPreferredSize(new Dimension(140,100));//tamanho do bota0
      bntnovasugestao.setPreferredSize(new Dimension(140,100));//tamanho do bota0
      bntsair.setPreferredSize(new Dimension(140,60));//tamanho do bota0
      bntretornar.setPreferredSize(new Dimension(140,80));//tamanho do bota0
     
      
      
      
      
              
      
      
         //painel nova sugestao
         
    
      jPanelNovaSugestao.setPreferredSize(new Dimension(300,800));//tamanha do painel
      jPanelNovaSugestao.setLayout(new FlowLayout());
      jPanelNovaSugestao.setBackground(new java.awt.Color(255,255,255));
   
      
      
      
   
      jPanelNovaSugestao.add(lblnovasugestao); 
      lblnovasugestao.setPreferredSize(new Dimension(460,50));
           
                   
                     
      jPanelNovaSugestao.add(lbltitulo);
      lbltitulo.setPreferredSize(new Dimension(300,30));
          
           
      jPanelNovaSugestao.add(lbdata);
      lbdata.setPreferredSize(new Dimension(230,30));
   
   
      jPanelNovaSugestao.add(txttitulo);
      txttitulo.setPreferredSize(new Dimension(395,30));
      txttitulo.setText(lo.getNome_Completo());
         
          
          
          
                   
          
         
         
                    
         
         
         
         
          //mascara data de nacimento
      try{ 
         javax.swing.text.MaskFormatter dt= new javax.swing.text.MaskFormatter("##/##/####");
         txtdt = new javax.swing.JFormattedTextField(dt);
      }
      catch (Exception e){
      }
   
    
      jPanelNovaSugestao.add(txtdt);
      txtdt.setPreferredSize(new Dimension(130,30));
      txtdt.setText(lo.getData_de_Nascimento());
   
        
         
         
         
        
         
         
         
      jPanelNovaSugestao.add(lbcurso);
      lbcurso.setPreferredSize(new Dimension(250,30));
         
      jPanelNovaSugestao.add(lbperiodo);
      lbperiodo.setPreferredSize(new Dimension(280,30));
   
         
         
         
      jPanelNovaSugestao.add(txtcurso);
      txtcurso.setPreferredSize(new Dimension(260,30));
         
   
   
   
   
          
          
   
          
          
          
         
                  
         
      jPanelNovaSugestao.add(curso);
      curso.setPreferredSize(new Dimension(260,30));
         //txtperiodo.setText(Login.getCurso());
   
      jPanelNovaSugestao.add(email);
      email.setPreferredSize(new Dimension(530,30));
         
       
      jPanelNovaSugestao.add(txtemail);
      txtemail.setPreferredSize(new Dimension(530,30));
      txtemail.setText(lo.getEmail());
   
   
         
         
      jPanelNovaSugestao.add(lbtelr);
      lbtelr.setPreferredSize(new Dimension(140,30));
    
    
      jPanelNovaSugestao.add(lbtelc);
      lbtelc.setPreferredSize(new Dimension(390,30));
   
    
    
    
    //mascara telefone res
      try{ 
         javax.swing.text.MaskFormatter telr= new javax.swing.text.MaskFormatter("(##) ####-####");
         txttelefoner = new javax.swing.JFormattedTextField(telr);
      }
      catch (Exception e){
      }
   			
      jPanelNovaSugestao.add(txttelefoner);
      txttelefoner.setPreferredSize(new Dimension(130,30));
      txttelefoner.setText(lo.getTelefone_Residencial());
   
          
          
          
   			
   			//mascara telefone cel
      try{ 
         javax.swing.text.MaskFormatter telc= new javax.swing.text.MaskFormatter("(##) #####-####");
         txttelefonec = new javax.swing.JFormattedTextField(telc);
      }
      catch (Exception e){
      }
   	
   
      jPanelNovaSugestao.add(txttelefonec);
      txttelefonec.setPreferredSize(new Dimension(130,30));
      txttelefonec.setText(lo.getTelefone_Celular());
   
   
      jPanelNovaSugestao.add(esp3);
      esp3.setPreferredSize(new Dimension(245,30));
   
   
   
         
         
      jPanelNovaSugestao.add(lbusuario);
      lbusuario.setPreferredSize(new Dimension(140,30));
          
      jPanelNovaSugestao.add(lbsenha);
      lbsenha.setPreferredSize(new Dimension(390,30));
   
          
    
      jPanelNovaSugestao.add(txtusuario);
      txtusuario.setPreferredSize(new Dimension(260,30));
      txtusuario.setText(lo.getUsuario());
   
         
   
   
   
   
        
      jPanelNovaSugestao.add(txtsenha);
      txtsenha.setPreferredSize(new Dimension(260,30));
      txtsenha.setText(lo.getSenha());
    
    
   
         
         
         
         
         
         
         
         
         
                   
      jPanelNovaSugestao.add(bntlimpar);
      bntlimpar.setPreferredSize(new Dimension(135,30));
   
         
      jPanelNovaSugestao.add(bntenviar);
      bntenviar.setPreferredSize(new Dimension(135,30));
   
         
         
         
            
      
      
      
      
      
      
      
      //Padroes da tela
      setSize(840,620);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null); // deixa a posi��o da janela no meio
      setResizable(false);//N�o deixa maximizar
      setVisible(true);
   }
	
   public void actionPerformed(ActionEvent e) {
	   CadastroDAO checar = new CadastroDAO();
   	
      if (e.getSource() == bntmeuperfil) {
         JOptionPane.showMessageDialog(null, "Voc� j� est� nesta p�gina!"); 
      }
   	
      if (e.getSource() == bnthistorico) {
         this.dispose();
         new telas.colaborador.TelaHistoricoDeSugestoes().setVisible(true);  
      }
   	
      if (e.getSource() == bntnovasugestao) {
         this.dispose();
         new telas.colaborador.TelaNovaSugestao().setVisible(true);  
      }
   	
      if (e.getSource() == bntretornar) {
      
         this.dispose();
         new telas.colaborador.TelaPrincipal().setVisible(true);  
      
      }
      if (e.getSource() == bntsair) {
         this.dispose();
         new telas.TelaLogin().setVisible(true);  
      }
      if (e.getSource() == bntlimpar) {
         this.dispose();
         new telas.colaborador.TelaPrincipal().setVisible(true);  
      }
      if (e.getSource() == bntenviar){
    	  
         int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar suas informa��es?", null, JOptionPane.YES_NO_OPTION);
      
         if (resposta == JOptionPane.YES_OPTION) {
        
          	 // Nome Completo
             if(txttitulo.getText().equals("")){
                ErroMSG = "Voc� n�o digitou o seu Nome!";
             }
             else{
                checknome = true;
             }
             //Data de Nascimento
             if(txtdt.getText().equals("  /  /    ")){
                ErroMSG = "Voc� n�o digitou a sua Data de Nascimento!";
             }
             else{
            	 checkdata = true;
             }
             //Telefone Residencial
             if(txttelefoner.getText().equals("(  )     -    ")){
                checktelr = false;
             }
             else{
                checktelr = true;
             }						
          			
          //Telefone Celular
             if(txttelefonec.getText().equals("(  )      -    ")){
                checktelc = false;
             }
             else{
                checktelc = true;
             }	
           //Telefones
             if(checktelr == false && checktelc == false){
                checktelefones = false;
                ErroMSG = "Voc� precisa deixar pelo menos um telefone para contato!";
             }
             else{
                checktelefones = true;
             }       
             // Email 
             if(txtemail.getText().equals("")){
                ErroMSG = "Voc� n�o digitou um Email!";					
             }else{
            	if(txtemail.getText().equals(txtemail.getText())) {
            		checkemail = true;
            	}else{
                if(checar.CheckEmail(txtemail.getText())){
                   checkemail = false;
                   ErroMSG = "O E-mail digitado j� est� cadastrado em outra conta, utilize um diferente!";	
                }
                else{
                   checkemail = true;
                }
              }	
            }
             // Usuario 
             if(txtusuario.getText().equals("")){
                ErroMSG = "Voc� n�o digitou um Usu�rio!";					
             }else{
            	 if(txtusuario.getText().equals(txtusuario.getText())) {
            		 checkusuario = true;
             	}else{
                if(checar.CheckUsuario(txtusuario.getText())){
                   checkusuario = false;
                   ErroMSG = "O Usu�rio digitado j� est� cadastrado, utilize um diferente!";	
                } else{
                   checkusuario = true;
                }
             }
             }
             //Senha
             if(txtsenha.getText().length() < 6){
            	 checksenha = false;
            	 ErroMSG = "A sua senha precisa ter no m�nimo 6 caracteres!";
              }
              else{
                    checksenha = true;
              }
             
        	if(checknome == true && checkdata == true && checktelefones == true && checkemail == true && checkusuario == true && checksenha == true){
            Login lo = Login.getInstance();
         	
            lo.setNome_Completo(txttitulo.getText());
            lo.setData_de_Nascimento(txtdt.getText());
            lo.setTelefone_Residencial(txttelefoner.getText());
            lo.setTelefone_Celular(txttelefonec.getText());
            lo.setCurso(curso.getSelectedItem().toString());
            lo.setEmail(txtemail.getText());
            lo.setUsuario(txtusuario.getText());
            lo.setSenha(txtsenha.getText());
         
         	LoginDAO dao = new LoginDAO();
         	
            dao.AlterarInformacoesColaborador(lo.getID());
         	
         	
         	
            JOptionPane.showMessageDialog(null, "Informa��es alteradas com sucesso!"); 
        	}else{
        		 JOptionPane.showMessageDialog(null,"Desculpe, a atualiza��o do seu cadastro n�o foi realizado com sucesso!" + "\nMotivo: " + ErroMSG);
        	}
        }
        	else if (resposta == JOptionPane.NO_OPTION) {
         
         }
      }
   }
}





