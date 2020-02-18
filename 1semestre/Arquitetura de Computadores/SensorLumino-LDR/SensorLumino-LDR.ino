int sensorPin = A0;
int sensorValue = 0;

void setup(){
  Serial.begin(9600); // inicia a porta serial, configura a taxa de dados para 9600 bps
      // Configura a taxa de transferência em bits por segundo (baud rate).
}

void loop() {
  sensorValue = analogRead(sensorPin); // analog Lê o valor de um pino analógico especificado.
  Serial.println(sensorValue);// Imprime dados na porta serial como texto ASCII
}
