package calculadora;
import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane; 


public class Calculadora {
    public static void main(String[] args) {
    float primeironum = 0;
    float segundonum = 0;
    float resultado = 0;
    String primeirovalor = " ";
    String segundovalor = " ";
    
    while(true){
        //usuario entra com valor
    primeirovalor = JOptionPane.showInputDialog("Digite o Primeiro Valor");
    segundovalor = JOptionPane.showInputDialog("Digite o Segundo Valor");
        //CONVERSÃO
    primeironum = Float.parseFloat(primeirovalor);
    segundonum = Float.parseFloat(segundovalor);
    
        //Qual Operação
    String operacao = JOptionPane.showInputDialog("Selecione a Operação: [+] | [-] | [*] | [/] | [^] ");
    
    if( null != operacao) //Logica
        //mais
        switch (operacao) {
            case "+":
                resultado = primeironum + segundonum;
                JOptionPane.showMessageDialog(null,"Resultado da Operação:"+resultado);
                //zerando a calculadora
                resultado = 0;
                break;
            case "-":
                resultado = primeironum - segundonum;
                JOptionPane.showMessageDialog(null,"Resultado da Operação:"+resultado);
                //zerando a calculadora
                resultado = 0;
                break;
            case "*":
                resultado = primeironum * segundonum;
                JOptionPane.showMessageDialog(null,"Resultado da Operação:"+resultado);
                //zerando a calculadora
                resultado = 0;
                break;
            case "^":
                resultado = (float) Math.pow (primeironum, segundonum);
                JOptionPane.showMessageDialog(null,"Resultado da Operação:"+resultado);
                //zerando a calculadora
                resultado = 0;
                break;
            case "/":
                if(primeironum <= 0){
                    JOptionPane.showMessageDialog(null,"ERRO! VOCE DIGITOU NUMERO MENOR QUE ZERO");
                }else if(segundonum <= 0){
                    JOptionPane.showMessageDialog(null,"ERRO! VOCE DIGITOU NUMERO MENOR QUE ZERO");
                }
                else{
                    resultado = primeironum /segundonum;
                    JOptionPane.showMessageDialog(null, "Resultado da Operação: "+resultado);
                    resultado = 0;
                }       break;
            default:
                break;
        }
    
        //Tratamento de erro na operação
     if (!"+".equals(operacao)){
         if(!"-".equals(operacao)){
             if(!"*".equals(operacao)){
                 if(!"/".equals(operacao)){
                     if(!"^".equals(operacao)){
                     JOptionPane.showMessageDialog(null, "ERRO! OPERAÇÂO NÃO RECONHECIDA");
                     break;
                     }
                 }
             }
         }
     }
        //Continuar?
     operacao = JOptionPane.showInputDialog("DESEJA REALIZAR OUTRA OPERÇÂO? [s] | [n]");
     if("s".equals(operacao)){
         //continua
     } else {
         break;
        }
    }
    
    }
    
    
    }


