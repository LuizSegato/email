package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    @Column(nullable = false, length = 100)
    private String ownerRef;
    @Column(nullable = false, length = 100)
    private String emailFrom;
    @Column(nullable = false, length = 100)
    private String emailTo;
    @Column(nullable = false, length = 50)
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String body;
    @Column(nullable = false)
    private LocalDateTime sendDataEmail;
    @Column(nullable = false)
    private StatusEmail statusEmail;

}
