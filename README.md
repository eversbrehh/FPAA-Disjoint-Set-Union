# FPAA-Disjoint-Set-Union

Analisar como as otimizações propostas por Robert Tarjan, como a união por ranking e a compressão de caminhos, impactam a eficiência de algoritmos de conectividade dinâmica

## Docker Setup

### Como rodar com Docker Compose (recomendado)

```bash
docker-compose up --build
```

Isso vai:

1. Construir a imagem
2. Compilar o projeto com Gradle
3. Executar a aplicação
4. Gerar gráficos na pasta `output/`

### Visualizando os gráficos

Após rodar o comando acima, os gráficos estarão disponíveis em:

```
output/
  └── (arquivos PNG com os gráficos gerados)
```

Os gráficos são gerados automaticamente dentro do container e salvos na raiz do projeto.

### Como rodar com Docker direto

```bash
docker build -t dsu .
docker run dsu
```

### Requisitos

- Docker instalado ([Download](https://www.docker.com/products/docker-desktop))
- Docker Compose (incluído no Docker Desktop)

### Notas

- A imagem usa Java 17 e Alpine Linux (imagem otimizada e pequena)
- Build multi-stage: compila com JDK 17, executa com JRE 17 (mais leve)
