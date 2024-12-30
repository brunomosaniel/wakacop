package academy.wakanda.wakacop.pauta.domain.application.service;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.pauta.domain.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.application.api.PautaCadastradaResponse;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
    Pauta getPautaPorId(UUID idPauta);
}
