package academy.wakanda.wakacop.pauta.domain.application.infra;

import academy.wakanda.wakacop.handler.APIException;
import academy.wakanda.wakacop.pauta.domain.Pauta;
import academy.wakanda.wakacop.pauta.domain.application.service.PautaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
@Log4j2
@RequiredArgsConstructor
public class PautaInfraRepository implements PautaRepository {
    private final PautaSpringDataJPARepository pautaSpringDataJPARepository;

    @Override
    public Pauta salva(Pauta pauta) {
        log.info("[start] PautaInfraRepository - pauta");
        pautaSpringDataJPARepository.save(pauta);
        log.info("[finaliza] PautaInfraRepository - pauta");
        return pauta;
    }

    @Override
    public Pauta buscaPautaPorId(UUID idPauta) {
        log.info("[start] PautaInfraRepository - buscaPautaPorId");
        Pauta pautaPorId = pautaSpringDataJPARepository.findById(idPauta)
                        .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pauta não Encontrada"));
        log.info("[finaliza] PautaInfraRepository - buscaPautaPorId");
        return pautaPorId;
    }
}
