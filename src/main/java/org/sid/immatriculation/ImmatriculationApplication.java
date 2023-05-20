package org.sid.immatriculation;
import org.sid.immatriculation.entities.Owner;
import org.sid.immatriculation.entities.Vehicle;
import org.sid.immatriculation.repository.OwnerRepository;
import org.sid.immatriculation.repository.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ImmatriculationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationApplication.class, args);
    }

    @Bean
    CommandLineRunner start(OwnerRepository ownerRepository, VehicleRepository vehicleRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.exposeIdsFor(Owner.class);
        repositoryRestConfiguration.exposeIdsFor(Vehicle.class);
        return args -> {
            Stream.of("Cheikh", "Sidi", "Salma", "Fatima", "Khalid").forEach(c -> {
                String email = c.toLowerCase() + "@gmail.com";
                Owner owner = Owner.builder()
                        .id(UUID.randomUUID().toString())
                        .name(c)
                        .birthDate(System.currentTimeMillis())
                        .email(email)
                        .build();
                ownerRepository.save(owner);
            });

            Random random = new Random();

            String[] plaquesImmatriculation = { "AB123CD", "EF456GH", "IJ789KL" };
            String[] marquesVoiture = { "Toyota", "Honda", "Ford","BMW","Mercedes-Benz C-Class","Jeep Wrangler","Nissan Rogue","Volkswagen Golf"};
            int[] puissancesFiscales = { 100, 120, 150 };
            String[] modelesVoiture = { "Camry", "Civic", "Focus" };


            ownerRepository.findAll().forEach(owner -> {
                for (int i = 0; i < 5; i++) {
                    Vehicle vehicle = Vehicle.builder()
                            .matricule(generateRandomValue(plaquesImmatriculation, random))
                            .marque(generateRandomValue(marquesVoiture, random))
                            .puissanceFiscale(generateRandomValue(puissancesFiscales, random))
                            .model(generateRandomValue(modelesVoiture, random))
                            .owner(owner)
                            .build();
                    vehicleRepository.save(vehicle);
                }
            });
        };
    }

    // Méthode pour obtenir une valeur aléatoire à partir d'un tableau
    private static <T> T generateRandomValue(T[] array, Random random) {
        int index = random.nextInt(array.length);
        return array[index];
    }

    // Méthode pour obtenir une valeur aléatoire à partir d'un tableau d'entiers
    private static int generateRandomValue(int[] array, Random random) {
        int index = random.nextInt(array.length);
        return array[index];
    }

}
