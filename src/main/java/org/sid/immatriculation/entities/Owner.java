package org.sid.immatriculation.entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

    public class Owner {
        @Id
        private String id;
        private String name;
        private Long birthDate;
        private String email;

        @OneToMany(mappedBy = "owner")
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private List<Vehicle> vehicles;
    }

