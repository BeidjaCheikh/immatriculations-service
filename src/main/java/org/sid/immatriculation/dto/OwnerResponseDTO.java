package org.sid.immatriculation.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.immatriculation.entities.Vehicle;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OwnerResponseDTO {
    @Id
    private String id;
    private String name;
    private Long birthDate;
    private String email;
    private List<Vehicle> vehicles;
}
