package com.techacademy;

import java.util.List;
import java.util.Optional; // 追加

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // 追加

@Service //ここでServiceクラスと識別
public class CountryService {
    private final CountryRepository repository;

    public CountryService(CountryRepository repository) {
        this.repository = repository;
    }

    // 全件を検索して返す
    public List<test_t> getCountryList() {
        // リポジトリのfindAllメソッドを呼び出す
        return repository.findAll();
    }
}