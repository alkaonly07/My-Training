package com.learning.springboot.mapper;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.learning.springboot.dto.UserDto;
import com.learning.springboot.entity.User;



@Mapper
public interface AutoUserMapper {
	AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);

}
