package com.women.online.shop.entities;

import java.util.UUID;
import java.time.LocalDateTime;

public abstract class AbstractEntity {
    private String id;
    private LocalDateTime createdAt;

    public AbstractEntity() {
        this.setId(UUID.randomUUID( ).toString( ));
        this.setCreatedAt(LocalDateTime.now( ));

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}