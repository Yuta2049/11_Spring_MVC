package com.epam.rd.onlineStore.dto;

import com.epam.rd.onlineStore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();

        products.add(new Product(0, "Elysium (Pandorum)", 1,300000, "elysium_pandorum.jpg"));
        products.add(new Product(1, "Death star (Star wars)", 1,300000, "death_star.jpg"));
        products.add(new Product(2, "Ещё большой корабль", 1,300000, "elysium_pandorum.jpg"));
        products.add(new Product(3, "Avalon (Passengers)", 1,300000, "axiom_wall_e.jpg"));
        products.add(new Product(4, "Axiom (WALL-E)", 1,300000, "elysium_pandorum.jpg"));
        products.add(new Product(5, "Tet (Oblivion)", 1,300000, "tet_oblivion.jpg"));
        products.add(new Product(6, "Ещё большой корабль", 1,300000, "elysium_pandorum.jpg"));
        products.add(new Product(7, "Ещё большой корабль", 1,300000, "elysium_pandorum.jpg"));
        products.add(new Product(8, "Ещё большой корабль", 1,300000, "elysium_pandorum.jpg"));

        products.add(new Product(9, "Alien ship (Prometheus)", 2,300000, "alien_prometheus.jpg"));
        products.add(new Product(10, "Rocinante (Expanse)", 2,300000, "rocinante_expanse.jpg"));
        products.add(new Product(11, "Alien ship (Prometheus)", 2,300000, "alien_prometheus.jpg"));
        products.add(new Product(12, "Alien ship (Prometheus)", 2,300000, "alien_prometheus.jpg"));

        products.add(new Product(13, "Восток-1 (Юрий Гагарин)", 3,300000, "vostok_1_gagarin.jpg"));
        products.add(new Product(14, "Пепелац (Кин-Дза-Дза)", 3,300000, "pepelaz_kin_dza_dza.jpg"));
        products.add(new Product(15, "BubbleShip (Oblivion)", 3,300000, "bubbleship_oblivion.jpg"));
        products.add(new Product(16, "Пепелац (Кин-Дза-Дза)", 3,300000, "pepelaz_kin_dza_dza.jpg"));

        return products;
}

}
