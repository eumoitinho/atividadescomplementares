package br.com.api.appac.atividadescomplementares.certificados;



import br.com.api.appac.atividadescomplementares.aluno.Aluno;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "certificados")
@Getter
@Setter

public class Certificados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String atividade;
    private Integer pontuacao;  
    private String caminhoArquivo;

    @ManyToOne
    @JoinColumn(name = "Alunos_cpf") // Coluna que representa o ID do aluno na tabela de certificados
    private Aluno aluno;
}