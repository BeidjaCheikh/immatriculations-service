package org.sid.immatriculation.service;

import org.sid.immatriculation.dto.OwnerRequestDTO;
import org.sid.immatriculation.dto.OwnerResponseDTO;

public interface OwnerService {
    OwnerResponseDTO addOwner(OwnerRequestDTO ownerRequestDTO);
    OwnerResponseDTO updateOwner(String id,OwnerRequestDTO ownerRequestDTO);

    void deleteOwnere(String id);
}
