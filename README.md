# Taller 2 - Calculadora + CI local


## Requisitos
- Docker Desktop instalado y corriendo
- act instalado (https://github.com/nektos/act)
- Git, Maven (opcional localmente)


## Pasos


1. Clona el repo (o crea la carpeta con los archivos provistos).


2. Construye la imagen Docker para act (desde la raíz del repo donde está el Dockerfile):


```bash
docker build -t java-maven-jdk17:local .