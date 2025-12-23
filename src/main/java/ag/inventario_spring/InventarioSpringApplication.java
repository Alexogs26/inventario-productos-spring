package ag.inventario_spring;

import ag.inventario_spring.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class InventarioSpringApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    private static final Logger logger =
            LoggerFactory.getLogger(InventarioSpringApplication.class);

	public static void main(String[] args) {
        logger.info("Iniciando la app");
		SpringApplication.run(InventarioSpringApplication.class, args);
        logger.info("Finalizando app");
	}

    @Override
    public void run(String... args) throws Exception {
        logger.info("*** Inventario de Productos ***");
    }
}
