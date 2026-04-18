# Sistema de Controle de Biblioteca (POO)

## Descrição
Sistema para controle de empréstimo de livros em uma biblioteca escolar.

## Tabelas (Entidades)

### Livro
- id
- titulo
- autor
- quantidadeDisponivel

### Aluno
- id
- nome

### Emprestimo
- id
- aluno
- livro
- dataEmprestimo
- dataDevolucao

## Regras de Negócio

- Não permitir livro com título vazio
- Não permitir quantidade negativa
- Não permitir empréstimo sem estoque disponível
- Registrar devolução de livro
- Permitir consulta de livros emprestados
- Permitir consulta de alunos com empréstimos em aberto

## Execução

Executar a classe Main para simulação.
