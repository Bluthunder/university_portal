docker run -d \
  --name uni-db \
  -e POSTGRES_USER=dbuser \
  -e POSTGRES_PASSWORD=pass123 \
  -e POSTGRES_DB=student_db \
  -v :/var/lib/postgresql/data \
  postgres