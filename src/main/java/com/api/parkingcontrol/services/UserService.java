package com.api.parkingcontrol.services;

import com.api.parkingcontrol.dtos.input.UserInsertDto;
import com.api.parkingcontrol.models.UserModel;
import com.api.parkingcontrol.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final BCryptPasswordEncoder pb;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder pb) {
        this.userRepository = userRepository;
        this.pb = pb;
    }

    public Page<UserModel> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public UserModel findById(UUID id) {
        return userRepository.findById(id).orElseThrow(
            () -> new UsernameNotFoundException("UserModel id: " + id + ", Tipo: " + UserService.class.getName()));
    }

    public Optional<UserModel> findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Transactional
    public UserModel save(UserModel userModel){
        return userRepository.save(userModel);
    }

    public UserModel newUser(UserInsertDto userInsertDto) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userInsertDto, userModel);
        userModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        userModel.setPassword(pb.encode(userInsertDto.getPassword()));
        return save(userModel);
    }
}
