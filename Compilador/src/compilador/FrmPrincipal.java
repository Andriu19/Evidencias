/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.awt.Color;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author Andriuu
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Limpiar();
    }
    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                resultadoLexico.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Int:
                    resultado += "  <Reservada int>\t" + lexer.lexeme + "\n";
                    break;
                case Asbstract:
                    resultado += "  <Reservada asbstract>\t" + lexer.lexeme + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexer.lexeme + "\n";
                    break;
                case Assert:
                    resultado += "  <Reservada assert>\t" + lexer.lexeme + "\n";
                    break;
                case Boolean:
                    resultado += "  <Reservada boolean>\t" + lexer.lexeme + "\n";
                    break;
                     case Byte:
                    resultado += "  <Reservada byte>\t" + lexer.lexeme + "\n";
                    break;

                case Case:
                    resultado += "  <Reservada case>\t" + lexer.lexeme + "\n";
                    break;

                case Catch:
                    resultado += "  <Reservada catch>\t" + lexer.lexeme + "\n";
                    break;

                 case Char:
                    resultado += "  <Reservada char>\t" + lexer.lexeme + "\n";
                    break;

                 case Class:
                    resultado += "  <Reservada class>\t" + lexer.lexeme + "\n";
                    break;

                case Const:
                    resultado += "  <Reservada const>\t" + lexer.lexeme + "\n";
                    break;

                case Continue:
                    resultado += "  <Reservada continue>\t" + lexer.lexeme + "\n";
                    break;

                case Default:
                    resultado += "  <Reservada default>\t" + lexer.lexeme + "\n";
                    break;

                case Double:
                    resultado += "  <Reservada double>\t" + lexer.lexeme + "\n";
                    break;

                case Enum:
                    resultado += "  <Reservada enum>\t" + lexer.lexeme + "\n";
                    break;

                case Extends:
                    resultado += "  <Reservada extends>\t" + lexer.lexeme + "\n";
                    break;

                case Final:
                    resultado += "  <Reservada final>\t" + lexer.lexeme + "\n";
                    break;

                 case Finally:
                    resultado += "  <Reservada finally>\t" + lexer.lexeme + "\n";
                    break;

                case Float:
                    resultado += "  <Reservada float>\t" + lexer.lexeme + "\n";
                    break;

                case Goto:
                    resultado += "  <Reservada goto>\t" + lexer.lexeme + "\n";
                    break;

                case Implementes:
                    resultado += "  <Reservada implementes>\t" + lexer.lexeme + "\n";
                    break;
                case Import:
                    resultado += "  <Reservada import>\t" + lexer.lexeme + "\n";
                    break;

                case Instanceof:
                    resultado += "  <Reservada instanceof>\t" + lexer.lexeme + "\n";
                    break;
                case Interface:
                    resultado += "  <Reservada interface>\t" + lexer.lexeme + "\n";
                    break;
                case Long:
                    resultado += "  <Reservada long>\t" + lexer.lexeme + "\n";
                    break;
                case Native:
                    resultado += "  <Reservada native>\t" + lexer.lexeme + "\n";
                    break;
                case New:
                    resultado += "  <Reservada new>\t" + lexer.lexeme + "\n";
                    break;
                case Package:
                    resultado += "  <Reservada package>\t" + lexer.lexeme + "\n";
                    break;
                case Private:
                    resultado += "  <Reservada private>\t" + lexer.lexeme + "\n";
                    break;
                case Protected:
                    resultado += "  <Reservada protected>\t" + lexer.lexeme + "\n";
                    break;
                case Public:
                    resultado += "  <Reservada public>\t" + lexer.lexeme + "\n";
                    break;
                case Return:
                    resultado += "  <Reservada return>\t" + lexer.lexeme + "\n";
                    break;
                case Short:
                    resultado += "  <Reservada short>\t" + lexer.lexeme + "\n";
                    break;
                case Static:
                    resultado += "  <Reservada static>\t" + lexer.lexeme + "\n";
                    break;
                case Strictfp:
                    resultado += "  <Reservada strictfp>\t" + lexer.lexeme + "\n";
                    break;
                case Super:
                    resultado += "  <Reservada super>\t" + lexer.lexeme + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada switch>\t" + lexer.lexeme + "\n";
                    break;
                case Synchronized:
                    resultado += "  <Reservada synchronized>\t" + lexer.lexeme + "\n";
                    break;
                case This:
                    resultado += "  <Reservada this>\t" + lexer.lexeme + "\n";
                    break;
                case Throw:
                    resultado += "  <Reservada throw>\t" + lexer.lexeme + "\n";
                    break;
                case Transient:
                    resultado += "  <Reservada transient>\t" + lexer.lexeme + "\n";
                    break;
                case Try:
                    resultado += "  <Reservada try>\t" + lexer.lexeme + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada void>\t" + lexer.lexeme + "\n";
                    break;
                case Volatile:
                    resultado += "  <Reservada volatile>\t" + lexer.lexeme + "\n";
                    break;
                case ValorNumerico:
                    resultado += "  <valornumerico>\t\t" + lexer.lexeme + "\n";
                    break;
                case Break:
                    resultado += "  <Reservada break>\t" + lexer.lexeme + "\n";
                    break;

                case Igual:
                    resultado += "  <Operador igual>\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <Parentesis de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <Parentesis de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
                
                    
            }
        }
    }
    private void analizadorlexico1 () throws IOException {
              int cont = 1;
        
        String expr = (String) txtEntrada.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = " "; 
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                resultadoSemantico.setText(resultado);
                return;
                    
    }
            switch (token) {
                case Int:
                    resultado += "  <Se declara variable de tipo entero>"  + "\n";
                    break;
                case If:
                    resultado += "  <Se delcara condicion>"  + "\n";
                    break;
                case Else:
                    resultado += "  <De lo contrario>"   + "\n";
                    break;
                case Boolean:
                    resultado += "  <Se delcara variable de tipo Booleano>"  + "\n";
                    break;
                case Char:
                    resultado += "  <Se declara variable de tipo Char>"    + "\n";
                    break;
                 case Class:
                    resultado += "  <Declaracion de Class>"   + "\n";
                    break;
                case Public:
                    resultado += "  <Declaracion de tipo publico>"  + "\n";
                    break;
              case P_coma:
                    resultado += "  <Finaliza instruccion>"  + "\n";
                    break;
                case Identificador:
                    resultado += "  <Nombre del objeto>" + "\n";
                    break;
                 case Llave_a:
                    resultado += "  <Inicia declaracion>" + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Cierra declaracion>"  + "\n";
                    break;
                case Numero:
                    resultado += "  <Valor>"  + "\n";
                    break;
                case Static:
                    resultado += "  <Funcion>" + "\n";
                    break;
                case Igual:
                    resultado += "  <Igualacion>" + "\n";
                    break;
                 case Void:
                    resultado += "  <Principal>"  + "\n";
                    break;
                    }
            
        } }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lexico = new javax.swing.JButton();
        Sintactico = new javax.swing.JButton();
        Semantico = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEntrada = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        resultadoSintactico = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        resultadoLexico = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        resultadoSemantico = new javax.swing.JTextArea();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setText("ANALIZADOR LEXICO-SINTATICO-SEMANTICO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("AGREGAR TEXTO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        Lexico.setText("LEXICO");
        Lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LexicoActionPerformed(evt);
            }
        });
        getContentPane().add(Lexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 148, 48));

        Sintactico.setText("SINTACTICO");
        Sintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SintacticoActionPerformed(evt);
            }
        });
        getContentPane().add(Sintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 150, 50));

        Semantico.setText("SEMANTICO");
        Semantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemanticoActionPerformed(evt);
            }
        });
        getContentPane().add(Semantico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 146, 51));

        Limpiar.setBackground(new java.awt.Color(0, 0, 0));
        Limpiar.setForeground(new java.awt.Color(204, 204, 204));
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagina-web (2).png"))); // NOI18N
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 77, 67));

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida (4).png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 77, -1));

        txtEntrada.setColumns(20);
        txtEntrada.setRows(5);
        txtEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEntradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEntradaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtEntrada);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 630, 240));

        resultadoSintactico.setEditable(false);
        resultadoSintactico.setColumns(20);
        resultadoSintactico.setRows(5);
        resultadoSintactico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resultadoSintactico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultadoSintacticoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resultadoSintacticoKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(resultadoSintactico);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel3);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 640, 90));

        resultadoLexico.setEditable(false);
        resultadoLexico.setColumns(20);
        resultadoLexico.setRows(5);
        resultadoLexico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resultadoLexico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultadoLexicoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resultadoLexicoKeyReleased(evt);
            }
        });
        jScrollPane8.setViewportView(resultadoLexico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel4);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 640, 90));

        resultadoSemantico.setEditable(false);
        resultadoSemantico.setColumns(20);
        resultadoSemantico.setRows(5);
        resultadoSemantico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resultadoSemantico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resultadoSemanticoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resultadoSemanticoKeyReleased(evt);
            }
        });
        jScrollPane10.setViewportView(resultadoSemantico);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel5);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 640, 90));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/blurred-large-panoramic-summer-background-multicolored-gradient-vector.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
          System.exit (WIDTH);
    }//GEN-LAST:event_SalirActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
         Limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void LexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LexicoActionPerformed
        // TODO add your handling code here
         try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_LexicoActionPerformed

    private void SemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemanticoActionPerformed
        // TODO add your handling code here:
        try {
            analizadorlexico1();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SemanticoActionPerformed

    private void SintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SintacticoActionPerformed
        // TODO add your handling code here:
        String ST = txtEntrada.getText();
        Sintaax s = new Sintaax (new compilador.LexerCup(new StringReader (ST)));
        try {
            s.parse ();
        resultadoSintactico.setText("BUILD SUCCESSFUL");
        Semantico.setEnabled(true);
         resultadoSintactico.setForeground(Color.GREEN);
        }catch (Exception ex){
            Symbol sym =  s.getS();
            resultadoSintactico.setText(("ERROR DE LA SINTAXIS, Line; ") + (sym.right + 1)  + ", Ubicacion: \"" + sym.value + "\"");
            Semantico.setEnabled(false);
             resultadoSintactico.setForeground(Color.RED);
        }
    }//GEN-LAST:event_SintacticoActionPerformed

    private void txtEntradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyPressed
        if (!this.getTitle().contains("*")) {
            this.setTitle(this.getTitle() + "*");
        }
    }//GEN-LAST:event_txtEntradaKeyPressed

    private void txtEntradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntradaKeyReleased

    }//GEN-LAST:event_txtEntradaKeyReleased

    private void resultadoSintacticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoSintacticoKeyPressed
        if (!this.getTitle().contains("*")) {
            this.setTitle(this.getTitle() + "*");
        }
    }//GEN-LAST:event_resultadoSintacticoKeyPressed

    private void resultadoSintacticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoSintacticoKeyReleased
        if (evt.isControlDown() || evt.getKeyCode() == 10 || evt.getKeyCode() == 8 || evt.getKeyCode() == 127) {
            contarFilas();
        }
    }//GEN-LAST:event_resultadoSintacticoKeyReleased

    private void resultadoLexicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoLexicoKeyPressed
        if (!this.getTitle().contains("*")) {
            this.setTitle(this.getTitle() + "*");
        }
    }//GEN-LAST:event_resultadoLexicoKeyPressed

    private void resultadoLexicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoLexicoKeyReleased
        if (evt.isControlDown() || evt.getKeyCode() == 10 || evt.getKeyCode() == 8 || evt.getKeyCode() == 127) {
            contarFilas();
        }
    }//GEN-LAST:event_resultadoLexicoKeyReleased

    private void resultadoSemanticoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoSemanticoKeyPressed
        if (!this.getTitle().contains("*")) {
            this.setTitle(this.getTitle() + "*");
        }
    }//GEN-LAST:event_resultadoSemanticoKeyPressed

    private void resultadoSemanticoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resultadoSemanticoKeyReleased
        if (evt.isControlDown() || evt.getKeyCode() == 10 || evt.getKeyCode() == 8 || evt.getKeyCode() == 127) {
            contarFilas();
        }
    }//GEN-LAST:event_resultadoSemanticoKeyReleased

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Lexico;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Semantico;
    private javax.swing.JButton Sintactico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea resultadoLexico;
    private javax.swing.JTextArea resultadoSemantico;
    private javax.swing.JTextArea resultadoSintactico;
    private javax.swing.JTextArea txtEntrada;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
         resultadoSintactico.setText("");
        resultadoLexico.setText("");
        resultadoSemantico.setText("");
        txtEntrada.setText("");
                
                
                
    }

    private void contarFilas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

