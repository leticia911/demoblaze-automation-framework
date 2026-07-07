package data.repository;

import data.mapper.LoginMapper;
import data.mapper.Mapper;
import data.model.LoginData;

public class LoginRepository
        extends AbstractRepository<LoginData> {

    private final LoginMapper mapper =
            new LoginMapper();

    @Override
    protected String getSheetName() {

        return "Login";

    }

    @Override
    protected Mapper<LoginData> getMapper() {

        return mapper;

    }

    @Override
    protected int getId(LoginData login) {

        return login.getId();

    }

    public LoginData getByUsername(
            String username) {

        return getAll()

                .stream()

                .filter(login ->
                        login.getUsername()
                                .equalsIgnoreCase(username))

                .findFirst()

                .orElseThrow(() ->

                        new RuntimeException(
                                "Usuario no encontrado"));

    }

}