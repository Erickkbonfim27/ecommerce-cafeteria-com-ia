package br.com.cafeteria.inteligente.user;

import br.com.cafeteria.inteligente.exception_personalizadas.AuthenticationException;
import br.com.cafeteria.inteligente.exception_personalizadas.InvalidDataException;
import br.com.cafeteria.inteligente.jwt.JwtUtil;
import br.com.cafeteria.inteligente.jwt.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final JwtUtil jwtUtil = new JwtUtil();
    private final PasswordService passwordService = new PasswordService();

    @Autowired
    private  UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public AuthResponseDto authenticateLogin(LoginUserDto loginDto) throws InvalidDataException {
        User user = userRepository.findUserByEmail(loginDto.getEmail());
        if (user == null || user.getNome() == null || user.getUserId() == null) {
            throw new InvalidDataException("Nenhum usuário encontrado");
        }
        if (!passwordService.matchPassword(loginDto.getPassword(), user.getPassword())) {
            throw new AuthenticationException("Senha incorreta");
        }

        String tokenLogado = jwtUtil.GenerateToken(user.getNome());
        return new AuthResponseDto(user, tokenLogado);
    }

    public AuthResponseDto createAndAuthenticateUser(CreateUserDto createUserDto){
        User usuarioNovo = new User();

        usuarioNovo.setEmail(createUserDto.getEmail());
        usuarioNovo.setNome(createUserDto.getNome());
        usuarioNovo.setCpf(createUserDto.getCpf());
        usuarioNovo.setSobreNome(createUserDto.getSobreNome());
        usuarioNovo.setPassword(passwordService.encryptPassword(createUserDto.getPassword()));
        User UsuarioLogado = userRepository.save(usuarioNovo);
        String token = jwtUtil.GenerateToken(UsuarioLogado.getNome());

        return new AuthResponseDto(UsuarioLogado, token);
    }
}
