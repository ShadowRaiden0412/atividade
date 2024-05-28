
  

  import com.example.imoveis.Imoveis; // Replace with the correct package name
import java.io.IOException;
// If Imoveis.java is in the same package
import Imoveis;
// Or, if Imoveis.java is in a different package like com.example.imoveis
// import com.example.imoveis.Imoveis;

import java.util.Scanner; // Import the Scanner class

public class Main {

public static void main(String[] args) {
// Sample list of properties
List<Imoveis> listaDeImoveis = Arrays.asList(
// Create some sample properties
 new Imoveis("Sao Paulo", 2, 500000.0),
 new Imoveis("Rio de Janeiro", 3, 750000.0),
 new Imoveis("Belo Horizonte", 1, 300000.0),
 new Imoveis("Curitiba", 2, 450000.0),
 new Imoveis("Salvador", 3, 600000.0)
);

// Create an instance of the BuscaImoveis class
BuscaImoveis buscaImoveis = new BuscaImoveis(listaDeImoveis);

// Get search criteria from the user
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the desired location: ");
String location = scanner.nextLine();
System.out.print("Enter the desired number of bedrooms: ");
Integer numQuartos = scanner.nextInt();
System.out.print("Enter the minimum price: ");
Double precoMin = scanner.nextDouble();
System.out.print("Enter the maximum price: ");
Double precoMax = scanner.nextDouble();

  import com.example.imoveis.BuscaImoveis;
  
 
  List<Imoveis> resultados = buscaImoveis.buscarImoveis(location, numQuartos, precoMin, precoMax);

// Save the search results to a text file
  try {
    buscaImoveis.salvarResultados(resultados, "search_results.txt");
    System.out.println("Search results saved to search_results.txt");
  } catch (IOException e) {
    System.out.println("Error saving search results: " + e.getMessage());
  }
}
}