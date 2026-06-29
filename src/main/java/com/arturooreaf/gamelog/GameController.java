package com.arturooreaf.gamelog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GameController {
        @GetMapping("/games")
        public String getGame() {
            return "Lista de Juegos";
        }
    }

