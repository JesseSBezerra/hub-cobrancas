package br.com.jdsb.hub.service;

import br.com.jdsb.hub.entity.LancamentoEntity;
import br.com.jdsb.hub.mapper.LancamentoMapper;
import br.com.jdsb.hub.repository.LancamentoRepository;
import br.com.jdsb.hublancamentos.avro.LancamentoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    public void salvarLancamento(LancamentoEvent dto) {
        LancamentoEntity entity = LancamentoMapper.toEntity(dto);
        repository.save(entity);
    }
}
