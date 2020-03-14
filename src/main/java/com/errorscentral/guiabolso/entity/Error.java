package com.errorscentral.guiabolso.entity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="errors")
public class Error implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    @NotNull
    @Size(min = 1, max = 20)
    private String level;

    @Column
    @NotNull
    @Size(min = 1, max = 50)
    private String event;

    @Column
    @NotNull
    @Size(min = 1, max = 20)
    private String environment;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "details_log")
    @NotNull
    @Size(min = 1, max = 500)
    private String detailsLog;

    @Column
    @NotNull
    private Boolean filed;

    @Column(name = "update_date")
    private LocalDate updateDate;


    //Gets and Sets
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
    
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getDetailsLog() {
        return detailsLog;
    }

    public void setDetailsLog(String detailsLog) {
        this.detailsLog = detailsLog;
    }

    public Boolean getFiled() {
        return filed;
    }

    public void setFiled(Boolean filed) {
        this.filed = filed;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
