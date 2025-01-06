package academy.wakanda.wakacop.pauta.domain.application.api;

import academy.wakanda.wakacop.sessaovotacao.domain.OpcaoVoto;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class VotoRequest {
    private String cpfAssociado;
    private OpcaoVoto opcaoVoto;
}
