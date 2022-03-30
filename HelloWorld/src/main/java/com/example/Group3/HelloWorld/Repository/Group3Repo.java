package com.example.Group3.HelloWorld.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Group3.HelloWorld.Model.HelloWorld;
@Repository
public interface Group3Repo extends JpaRepository<HelloWorld,Long>{


}
