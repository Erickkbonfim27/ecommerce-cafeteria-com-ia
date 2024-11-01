package br.com.cafeteria.inteligente.userpreferences;

import br.com.cafeteria.inteligente.exception_personalizadas.InvalidDataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService {

    @Autowired
    private PreferenceRepository preferenceRepository;

    private List<UserPreferences> getAllUserPreferences(Integer idUser) throws InvalidDataException {
        if(idUser == null){
            throw new InvalidDataException("Id do usuario inválido");
        }
        List<UserPreferences> listagem = preferenceRepository.findAllUserPreferencesByidSmartCoffeUsers(idUser);
        if(listagem == null || listagem.isEmpty()){
            throw new InvalidDataException("Nenhum dado encontrado");
        }
        return listagem;
    }

}
