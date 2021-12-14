package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //função geração de chave primaria * IDENTITY = incrementar os ids
    private Long id;

    @Column(nullable = false) // dados obrigatório
    private String firstName;

    @Column(nullable = false) // dados obrigatório
    private String lastName;

    @Column(nullable = false, unique = true) // dados obrigatório * valor unico
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE}) //Relacionamento*
    //mapeamento * fetch obter dados * LAZY performace* cascade salva op de uma vez só *
    private List<Phone> phones;
}
