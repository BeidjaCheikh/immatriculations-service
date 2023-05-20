package org.sid.immatriculation.Mapper;;
import org.sid.immatriculation.dto.VehicleResponseDTO;
import org.sid.immatriculation.entities.Owner;
import org.sid.immatriculation.entities.Vehicle;
import org.sid.immatriculation.grpc.stub.Imt;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class VehicleMapper {
    public VehicleResponseDTO fromVehicle(Vehicle vehicle){
        VehicleResponseDTO vehicleResponseDTO =new VehicleResponseDTO();
        BeanUtils.copyProperties(vehicle,vehicleResponseDTO);
        return vehicleResponseDTO;
    }
    public Imt.Vehicle fromVehicles(Vehicle vehicle){
        Imt.Vehicle vehicle1= Imt.Vehicle.newBuilder()
                .setId(vehicle.getId())
                .setMarque(vehicle.getMarque())
                .setMatricule(vehicle.getMatricule())
                .setModel(vehicle.getModel())
                .setPuissanceFiscale(vehicle.getPuissanceFiscale())
                .build();
        return vehicle1;
    }
}
