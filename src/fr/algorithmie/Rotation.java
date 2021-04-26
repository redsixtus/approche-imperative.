package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		      
			    
			        int [] tab ={0, 1, 2, 3};     
			          
			        int n = 1;    
			           
			        
			        System.out.println("tableau d'origin: ");    
			        for (int i = 0; i < tab.length; i++) {     
			            System.out.print(tab[i] + " ");     
			        }      
			            
			        
			        for(int i = 0; i < n; i++){    
			            int l, last;    
			             
			            last = tab[tab.length-1];    
			            
			            for(l = tab.length-1; l > 0; l--){    
			                
			                tab[l] = tab[l-1];    
			            }       
			            tab[0] = last;    
			        }    
			        
			        System.out.println();    
			               
			        System.out.println("tableau apres rotation: ");    
			        for(int i = 0; i< tab.length; i++){    
			            System.out.print(tab[i] + " ");    
			        }    
			    }    
			
	}


