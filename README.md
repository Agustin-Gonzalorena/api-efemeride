# Api REST que recupera una vez al dia la efemeride desde la AI Gemini

## Pasos para correr proyector:

1. Tener instalado docker
2. Se necesita obtener key de la api de gemini

3. Levantar contenedor de la Base de Datos:

        docker compose -f docker-compose-db.yml up -d
4. Correr el programa desde el IDE.

### Eliminar contenedor y volumes

-
docker compose -f docker-compose-db.yml down -v