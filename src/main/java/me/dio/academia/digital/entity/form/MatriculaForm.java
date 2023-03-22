package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

  @NotBlank(message = "Preenche corretamente o campo")
  @Positive(message = "O id do aluno precisa ser positivo.")
  private Long alunoId;

}
