# Sistema de Controle de Biblioteca (POO)

## Descrição
Sistema para controle de empréstimo de livros em uma biblioteca escolar.

## Tabelas

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

## Regras

- Não permitir título vazio
- Não permitir quantidade negativa
- Não permitir empréstimo sem estoque
- Registrar devolução
- Consultar empréstimos em aberto
