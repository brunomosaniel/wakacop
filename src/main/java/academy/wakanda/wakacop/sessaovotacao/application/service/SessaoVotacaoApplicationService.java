package academy.wakanda.wakacop.sessaovotacao.application.service;

import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaRequest;
import academy.wakanda.wakacop.sessaovotacao.application.api.SessaoAberturaResponse;
import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoVotacaoRepository sessaVotacaoRepository;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[inicia] SessaoVotacaoApplicationService - abreSessao");
        var sessaoVotacao = sessaVotacaoRepository.salva(new SessaoVotacao(sessaoAberturaRequest));
        log.info("[finaliza] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessaoVotacao);
    }
}
