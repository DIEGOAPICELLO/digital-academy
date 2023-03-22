package me.dio.academia.digital.entity.form;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preenche corretamente o campo")
  @Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preenche corretamente o campo")
  @CPF(message = "'${ValidatedValue}' é inválido.")
  private String cpf;

  @NotBlank(message = "Preenche corretamente o campo")
  @Size(min = 3, max = 50, message = "'${ValidatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotBlank(message = "Preenche corretamente o campo")
  @Past(message = "Data '${ValidatedValue}' é inválida")
  private LocalDate dataDeNascimento;
}
