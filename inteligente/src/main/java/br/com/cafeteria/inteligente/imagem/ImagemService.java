package br.com.cafeteria.inteligente.imagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;

@Service
public class ImagemService {

    @Autowired
    private ImagemRepository imagemRepository;

    @Transactional
    public void salvarImagem(String nome, File file) throws IOException {
        Imagem imagem = new Imagem();
        imagem.setNome(nome);
        imagem.setImagemBase64(ImagemUtils.encodeImageToBase64(file));

        imagemRepository.save(imagem);
    }
}
