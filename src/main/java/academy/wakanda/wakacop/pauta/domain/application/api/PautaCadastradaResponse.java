package academy.wakanda.wakacop.pauta.domain.application.api;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class PautaCadastradaResponse {
    private UUID id;

    public PautaCadastradaResponse(Pauta pauta) {
       this.id = pauta.getId();
    }
}
