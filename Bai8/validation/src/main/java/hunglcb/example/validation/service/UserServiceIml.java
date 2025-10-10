package hunglcb.example.validation.service;

import hunglcb.example.validation.dto.UserDTO;
import hunglcb.example.validation.entity.User;
import hunglcb.example.validation.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceIml implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean save(UserDTO user) {
        User entity = new User();
        entity.setId(user.getId());
        entity.setFirstName(user.getFirstName());
        entity.setLastName(user.getLastName());
        entity.setPhoneNumber(user.getPhoneNumber());
        entity.setAge(user.getAge());
        entity.setEmail(user.getEmail());
        return userRepository.save(entity) != null;
    }
}
