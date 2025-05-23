import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class TaskifyApplication {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        SpringApplication.run(TaskifyApplication.class, args);
    }
}
