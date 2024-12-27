package academy.wakanda.wakacop.pauta.domain.application.service;

import academy.wakanda.wakacop.pauta.domain.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}
