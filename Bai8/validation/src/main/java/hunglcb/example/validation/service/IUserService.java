package hunglcb.example.validation.service;

import hunglcb.example.validation.dto.UserDTO;
import hunglcb.example.validation.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findAll();
    boolean save(UserDTO userDTO);
}
