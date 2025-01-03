package exo7;

public class TestStack {
	 public static void main(String[] args) {

	        Stack stack = new Stack(5);

	        // Test de l'état initial de la pile
	        System.out.println("La pile est vide ? " + stack.empty());

	        // Ajout d'éléments dans la pile
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);

	        // Affichage du contenu de la pile
	        System.out.println("Contenu de la pile : " + stack);

	        // Ajout d'un élément supplémentaire pour tester l'agrandissement
	        stack.push(60);
	        System.out.println("Après agrandissement : " + stack);

	        // Retrait d'éléments
	        System.out.println("Élément retiré : " + stack.pop());
	        System.out.println("Élément retiré : " + stack.pop());

	        // Affichage du contenu après quelques retraits
	        System.out.println("Contenu de la pile après retraits : " + stack);

	        // Test de l'exception lorsqu'on retire d'une pile vide
	        while (!stack.empty()) {
	            stack.pop();
	        }

	        try {
	            stack.pop();
	        } catch (IllegalStateException e) {
	            System.out.println("Exception capturée : " + e.getMessage());
	        }
	    }
}
