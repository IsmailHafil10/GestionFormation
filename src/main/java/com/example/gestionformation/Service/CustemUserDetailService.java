package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Role;
import com.example.gestionformation.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustemUserDetailService implements UserDetailsService {
    @Autowired
    IUtilisateurService iUtilisateurService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Utilisateur user=iUtilisateurService.findUtilisateurByUsername(username);

        if(user==null)
        {
            throw new UsernameNotFoundException(username);
        }

        List<GrantedAuthority> authorities=getGrantedAuthority(user);

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),authorities);



    }

    private List<GrantedAuthority> getGrantedAuthority(Utilisateur u)
    {
        List<GrantedAuthority> liste= new ArrayList<>();
        List<Role> roles= (List<Role>) u.getRoles();
        for(Role r:roles)
        {
            liste.add(new SimpleGrantedAuthority(r.getNomRole()));
        }

        return liste;

    }

}
