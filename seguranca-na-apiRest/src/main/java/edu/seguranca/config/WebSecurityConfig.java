package edu.seguranca.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.DefaultSecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    private SecurityDatabaseService securityService;
    @Autowired
    public void globalUserDetails
    (AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(securityService);
    }


    @Bean
    public DefaultSecurityFilterChain webSecurityCustomizer(HttpSecurity http) throws Exception{
         return  http
                .csrf(csrf -> csrf.disable())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/").permitAll()
                        .requestMatchers(HttpMethod.POST, "/login").permitAll()
                        .requestMatchers( "/managers").hasAuthority("MANEGERS")
                        .requestMatchers( "/users").hasAnyRole("USER, MANEGERS")
                        .anyRequest().authenticated()
                )
                .build();
    }

    // @Bean
    //  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    //      http.authorizeRequests().requestMatchers("/**").hasRole("USER").and().formLogin();
    //      return http.build();
    //  }

    // DESABILITAMOS PORQUE O CADASTRO VAI SER FEITO PELO SECURITYDATABASESERVICE.JAVA EM UM BANCO DE DADOS:

    //  @Bean
    //  public UserDetailsService userDetailsService() {
    //      UserDetails user = User.withDefaultPasswordEncoder()
    //          .username("user")
    //          .password("password")
    //          .roles("USER")
    //          .build();
    //      UserDetails admin = User.withDefaultPasswordEncoder()
    //          .username("admin")
    //          .password("master123")
    //          .roles("MANAGERS", "USER")
    //          .build();
    //      return new InMemoryUserDetailsManager(user, admin);
    //  }
}