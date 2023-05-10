package vhc.smartw.eam.security.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ROLE_win")
public class Role {
    @Id
    @SequenceGenerator(name = "role_sequence",
    sequenceName = "role_sequence",
    allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "role_sequence"
    )
    @Column(name = "ID")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE_NAME")
    private ERole name;


}
