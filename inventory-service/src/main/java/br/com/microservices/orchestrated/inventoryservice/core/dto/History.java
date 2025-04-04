package br.com.microservices.orchestrated.inventoryservice.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class History {

    private String source;
    private String status;
    private String message;
    private LocalDateTime createdAt;
}
