package org.sid.immatriculation.grpc.service;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.sid.immatriculation.Mapper.OwnerMapper;
import org.sid.immatriculation.Mapper.VehicleMapper;
import org.sid.immatriculation.entities.Owner;
import org.sid.immatriculation.entities.Vehicle;
import org.sid.immatriculation.grpc.stub.ImmatriculationServiceGrpc;
import org.sid.immatriculation.grpc.stub.Imt;
import org.sid.immatriculation.repository.OwnerRepository;
import org.sid.immatriculation.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
@GrpcService
public class ImtGrpcImpl extends ImmatriculationServiceGrpc.ImmatriculationServiceImplBase {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private OwnerMapper ownerMapper;
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private VehicleMapper vehicleMapper;
    @Override
    public void getOwnersList(Imt.OwnersListRequest request, StreamObserver<Imt.OwnersListResponse> responseObserver) {
        List<Owner> owners=ownerRepository.findAll();
        List<Imt.Owner> grpcAOwnerList = owners.stream().map(owner -> ownerMapper.fromOwners(owner)).collect(Collectors.toList());
        Imt.OwnersListResponse ownersListResponse= Imt.OwnersListResponse.newBuilder()
                .addAllOwners(grpcAOwnerList)
                .build();
        responseObserver.onNext(ownersListResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getOwnerById(Imt.OwnerByIdRequest request, StreamObserver<Imt.GetOwnerResponse> responseObserver) {
        String cownerId=request.getId();
        Owner owner=ownerRepository.findById(cownerId).orElseThrow(null);
        if(owner!=null){
            Imt.Owner compte1=ownerMapper.fromOwners(owner);
            Imt.GetOwnerResponse compteResponse=Imt.GetOwnerResponse.newBuilder()
                    .setOwners(compte1)
                    .build();
            responseObserver.onNext(compteResponse);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getVehicleList(Imt.VehiclesListRequest request, StreamObserver<Imt.VehiclesListResponse> responseObserver) {
        List<Vehicle> vehicleList=vehicleRepository.findAll();
        List<Imt.Vehicle> grpcvehicleList = vehicleList.stream().map(account -> vehicleMapper.fromVehicles(account)).collect(Collectors.toList());
        Imt.VehiclesListResponse vehiclesListResponse=   Imt.VehiclesListResponse.newBuilder()
                .addAllVehicle(grpcvehicleList)
                .build();
        responseObserver.onNext(vehiclesListResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getVehicleById(Imt.VehicleByIdRequest request, StreamObserver<Imt.GetVehicleResponse> responseObserver) {
//        long vehicleId=request.getId();
//        Vehicle vehicle=vehicleRepository.findById(vehicleId).orElseThrow(null);
//        if(vehicle!=null){
//            Imt.Vehicle vehicle1=vehicleMapper.fromVehicles(vehicle);
//            Imt.GetVehicleResponse vehicleResponse=Imt.GetVehicleResponse.newBuilder()
//                    .setVehicle(vehicle1)
//                    .build();
//            responseObserver.onNext(vehicleResponse);
//            responseObserver.onCompleted();
//        }
    }

    @Override
    public void deleteOwner(Imt.DeleteOwnerRequest request, StreamObserver<Imt.DeleteOwnerResponse> responseObserver) {
        super.deleteOwner(request, responseObserver);
    }
}
