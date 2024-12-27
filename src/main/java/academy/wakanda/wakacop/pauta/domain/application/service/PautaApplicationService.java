package academy.wakanda.wakacop.pauta.domain.application.service;

import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.pauta.domain.application.api.NovaPautaRequest;
import academy.wakanda.wakacop.pauta.domain.application.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;
    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
       log.info("[start] PautaApplicationService - cadastraPauta");
       log.info("[novaPauta] {} ", novaPauta);
       var pauta = pautaRepository.salva(new Pauta(novaPauta));
       log.info("[finish] PautaApplicationService - cadastraPauta");
        return new PautaCadastradaResponse(pauta);
    }
}
