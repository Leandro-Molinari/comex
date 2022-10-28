docker run --network comex-network -d -v oracle-volume:/opt/oracle/oradata --name oracle -p 1522:1521 -e ORACLE_PASSWORD=admin gvenzl/oracle-xe
