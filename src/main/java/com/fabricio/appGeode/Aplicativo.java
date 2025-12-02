package com.fabricio.appGeode;

import org.apache.geode.cache.client.ClientRegionShortcut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import com.fabricio.appGeode.modelo.Pessoa;

@SpringBootApplication
@ClientCacheApplication(name = "AccessandoGemFireDataRestApplication")
@EnableEntityDefinedRegions(
  basePackageClasses = Pessoa.class,
  clientRegionShortcut = ClientRegionShortcut.LOCAL
)
@EnableGemfireRepositories
@SuppressWarnings("unused")
public class Aplicativo {

  public static void main(String[] args) {
    SpringApplication.run(Aplicativo.class, args);
  }
}
