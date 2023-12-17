//これは「エンティティ」。DB上のこのcountryテーブル使用
package com.techacademy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="test_t")
public class test_t {
    @Id
    private String aaa;
    private String bbb;
}