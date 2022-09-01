public static void main(String[] args) {
         
          //"42"  r$900
          //"50" r$905 a 1115,00
          //"75" r$acima de R$1250
          
          int orc;
          orc = 1250;
          
          int opcao1 = orc - 900; 
          int opcao2 = orc - 905;
          int opcao2max = orc - 1115;
          int opcao3 = orc - 1250;
          
          int resto;
          resto = 0;
          if(opcao1>resto){
                    System.out.println("Se eu compra a TV de 42 polegadas terei um troco de: " + opcao1 + " reais");     
          }
          
          if(opcao2>resto){
                System.out.println("Se a escolha for a de 50 polegadas poderei ter um troco de " + opcao2 + " a " + opcao2max + " reais" );
          }
          
          if(opcao3>=resto){
                System.out.println("Se a escolha for a de 75 polegadas poderei ter um troco de " + opcao3 + " reais" );
          }
             
    }

 