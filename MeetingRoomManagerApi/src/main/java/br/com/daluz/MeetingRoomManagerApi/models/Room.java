package br.com.daluz.MeetingRoomManagerApi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // JPA entidade (Entidade do banco de dados).
@Data // Lombok - Equivalente as anotações: @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@Builder // Lombok - Produz APIs de construtores complexos automaticamente para a classe (Builder pattern).
@NoArgsConstructor // Lombok - Cria um construtor vazio.
@AllArgsConstructor // Lombok - Cria um construtor recebendo todos os parâmetros.
@Table(name = "Room") // JPA tabela.
public class Room {

    /**
     * Coluna do Id da sala.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * Coluna do nome da sala.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * Coluna de descrição sobre a reserva da sala.
     */
    @Column(name = "description", nullable = false)
    private String description;

    /**
     * Coluna da data de reserva da sala.
     */
    @Column(name = "date", nullable = false)
    private String date;

    /**
     * Coluna da hora de início da reunião na sala.
     */
    @Column(name = "start_hour", nullable = false)
    private String startHour;

    /**
     * Coluna da hora de término da reunião na sala.
     */
    @Column(name = "end_hour", nullable = false)
    private String endHour;

    /*
     * Coluna do status da sala.

    @Column(name = "active", nullable = false)
    private Boolean active;*/

}
