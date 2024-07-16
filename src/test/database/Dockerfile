FROM mcr.microsoft.com/mssql/server:2017-latest
ENV ACCEPT_EULA=Y
ENV MSSQL_SA_PASSWORD=kwanele@oo2#
ENV MSSQL_PID=Developer
ENV MSSQL_TCP_PORT=1433
WORKDIR /src
# copy scripts from Scripts folder
COPY /Scripts/create_schema_table_and_fill_in_data.sql ./create_schema_table_and_fill_in_data.sql
RUN (/opt/mssql/bin/sqlservr --accept-eula & ) | grep -q "Service Broker manager has started" &&  /opt/mssql-tools/bin/sqlcmd -S127.0.0.1 -Usa -PabcDEF123# -i create_schema_table_and_fill_in_data.sql