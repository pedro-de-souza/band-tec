#include <dht.h>
dht DHT; //cria um objeto de classe DHT
uint32_t timer = 0; 
void setup()
{
  Serial.begin(9600); 
}
void loop()
{
  // Executa 1 vez a cada 2 segundos
  if(millis() - timer>=2000)
  {
    DHT.read11(A1);// Chama método de leitura da classe DHT
                   //com o pino de transmissão de dados ligados no pino A1

    Serial.print(DHT.humidity);
    Serial.println(" %");


    Serial.print(DHT.temperature);
    Serial.println(" Celsius");

    timer = millis();// Atualiza a referência
  }
}
