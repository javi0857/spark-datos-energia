# Análisis de Datos Energéticos con Spark y Scala

Este proyecto es parte de mi TFG (Trabajo de Fin de Grado) y tiene como objetivo analizar los datos de la demanda energética obtenidos de la API de REData (Red Eléctrica Española) utilizando Apache Spark y Scala. El análisis se realiza en un entorno interactivo de **Jupyter Notebook** con la ayuda de **Ammonite** para facilitar la integración de Scala en los notebooks.

## Tecnologías y Herramientas Utilizadas

- **Scala**: Lenguaje principal de programación.
- **Apache Spark**: Framework para procesamiento distribuido de grandes volúmenes de datos.
- **Docker**: Para la creación de un entorno reproducible y aislado.
- **Almond**: kernel para jupyter notebook que permite ejecutar código en Scala dentro de los cuadernos interactivos.
- **Jupyter Notebook**: Entorno interactivo para ejecutar y visualizar el análisis de datos.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes requisitos en tu sistema:

- [Docker](https://docs.docker.com/get-docker/): Para crear y ejecutar el entorno en un contenedor.

## Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:


## Cómo Ejecutar el Entorno en Local

### 1. Clonar el Repositorio

Primero, clona este repositorio en tu máquina local

Para correr el entorno con Jupyter Notebook y Spark utilizando Scala, ejecuta el siguiente comando desde la raíz del proyecto:

docker run -it --rm -p 8888:8888 -p 4040:4040 -m 4g -v {ruta local}:/home/jovyan/work almondsh/examples:latest

Una vez ejecutado accede a http://localhost:8888 en tu navegador web.