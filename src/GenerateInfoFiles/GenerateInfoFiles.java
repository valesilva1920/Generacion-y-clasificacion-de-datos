package GenerateInfoFiles;


	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Random;

	public class GenerateInfoFiles {

	    public static void main(String[] args) {
	        int randomSalesCount = 100; // Cantidad de ventas aleatorias a generar
	        int productsCount = 50; // Cantidad de productos aleatorios a generar
	        int salesmanCount = 10; // Cantidad de vendedores aleatorios a generar

	        try {
	            createSalesMenFile(randomSalesCount, "John Doe", 123456789);
	            createProductsFile(productsCount);
	            createSalesManInfoFile(salesmanCount);
	            System.out.println("Archivos generados exitosamente.");
	        } catch (IOException e) {
	            System.err.println("Error al generar archivos: " + e.getMessage());
	        }
	    }

	    public static void createSalesMenFile(int randomSalesCount, String name, long id) throws IOException {
	        try (FileWriter writer = new FileWriter("sales_" + name + "_" + id + ".txt")) {
	            Random random = new Random();
	            for (int i = 0; i < randomSalesCount; i++) {
	                String saleLine = generateRandomSale();
	                writer.write(saleLine);
	                writer.write("\n");
	            }
	        }
	    }

	    public static void createProductsFile(int productsCount) throws IOException {
	        try (FileWriter writer = new FileWriter("products.txt")) {
	            Random random = new Random();
	            for (int i = 0; i < productsCount; i++) {
	                String productLine = generateRandomProduct();
	                writer.write(productLine);
	                writer.write("\n");
	            }
	        }
	    }

	    public static void createSalesManInfoFile(int salesmanCount) throws IOException {
	        try (FileWriter writer = new FileWriter("salesmen.txt")) {
	            Random random = new Random();
	            for (int i = 0; i < salesmanCount; i++) {
	                String salesmanLine = generateRandomSalesman();
	                writer.write(salesmanLine);
	                writer.write("\n");
	            }
	        }
	    }

	    // Método para generar una línea de venta aleatoria
	    private static String generateRandomSale() {
	        Random random = new Random();
	        int productId = random.nextInt(1000) + 1; // ID de producto aleatorio entre 1 y 1000
	        int quantity = random.nextInt(10) + 1; // Cantidad aleatoria entre 1 y 10
	        return productId + ";" + quantity;
	    }

	    // Método para generar una línea de producto aleatoria
	    private static String generateRandomProduct() {
	        Random random = new Random();
	        int productId = random.nextInt(1000) + 1; // ID de producto aleatorio entre 1 y 1000
	        String productName = "Product" + productId; // Nombre de producto genérico
	        double price = random.nextDouble() * 100; // Precio aleatorio entre 0 y 100
	        return productId + ";" + productName + ";" + price;
	    }

	    // Método para generar una línea de información de vendedor aleatoria
	    private static String generateRandomSalesman() {
	        Random random = new Random();
	        String[] types = {"CC", "TI", "CE"}; // Tipos de documentos de identidad
	        String type = types[random.nextInt(types.length)]; // Seleccionar tipo aleatorio
	        long id = random.nextInt(1000000000) + 1; // ID de documento aleatorio entre 1 y 1000000000
	        String[] names = {"John", "Jane", "Michael", "Emily", "David", "Sarah"}; // Nombres de vendedores
	        String[] lastNames = {"Doe", "Smith", "Johnson", "Brown", "Jones"}; // Apellidos de vendedores
	        String name = names[random.nextInt(names.length)]; // Nombre aleatorio
	        String lastName = lastNames[random.nextInt(lastNames.length)]; // Apellido aleatorio
	        return type + ";" + id + ";" + name + ";" + lastName;
	    }
	}
