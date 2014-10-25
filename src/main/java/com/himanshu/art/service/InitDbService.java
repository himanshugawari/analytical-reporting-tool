package com.himanshu.art.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.art.entity.Blog;
import com.himanshu.art.entity.Item;
import com.himanshu.art.entity.Role;
import com.himanshu.art.entity.User;
import com.himanshu.art.repository.BlogRepository;
import com.himanshu.art.repository.ItemRepository;
import com.himanshu.art.repository.RoleRepository;
import com.himanshu.art.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostConstruct
	public void init(){
		Role roleUser=new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin=new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin=new User();
		userAdmin.setName("admin");
		List<Role> roles=new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		Blog blogHimanshu=new Blog();
		blogHimanshu.setName("HIMANSHU");
		blogHimanshu.setUrl("http://feeds.feedburner.com/himanshu?format=xml");
		blogHimanshu.setUser(userAdmin);
		blogRepository.save(blogHimanshu);
		
		Item item1=new Item();
		item1.setBlog(blogHimanshu);
		item1.setTitle("first");
		item1.setLink("http://www.himanshu.com");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);
		
		Item item2=new Item();
		item2.setBlog(blogHimanshu);
		item2.setTitle("second");
		item2.setLink("http://www.hardik.com");
		item2.setPublishedDate(new Date());
		itemRepository.save(item2);
		
	}
}
