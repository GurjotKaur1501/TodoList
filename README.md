# Todo List Application
## Installation

För Bash:
git clone https://github.com/ditt-konto/TodoApp.git
cd TodoApp
mvn clean install
java -jar target/TodoApp-1.0-SNAPSHOT.jar

.. Hur kan man skapa en trigger i Jenkins så att varje gång någon pushar till ert 
    centrala repo (github), så byggs projektet?
För att skapa en utlösare i Jenkins som automatiskt startar ett bygge varje gång någon trycker på GitHub:

    1.Installera plugin:Se till att 'GitHub Integration Plugin' och 'GitHub Plugin' är 
      installerade i Jenkins.

    2.Konfigurera GitHub-förvaret:.Gå till GitHub → ditt arkiv → Inställningar → Webhooks.
                                  .Klicka på Lägg till webhook.
                                  .I fältet Payload URL anger du:
                                    http://[din jenkins url]/github-webhook/
                                  .Välj applikation/json som innehållstyp.
                                  .Välj att utlösa webhook endast på push-händelser.
                                  .Spara.

    3.Konfigurera Jenkins-projektet:.Gå till ditt Jenkins-jobb → Konfigurera.
                                    .Under Byggutlösare kontrollerar du GitHub-krokens utlösare för GITScm-polling.
                                    .spara.

..Hur kan man konfigurera Jenkins för att få mail när man bygger projektet eller när bygget eller 
    tester misslyckats?
  Så här skickar du ett e-postmeddelande från Jenkins när en konstruktion lyckas eller misslyckas:
     1.Installera plugin: Se till att plugin-programmet E-posttillägg är installerat i Jenkins.
     2.Så här konfigurerar du global e-post:.Gå till Hantera Jenkins → Konfigurera system.
                                            .Hitta avsnittet E-postmeddelanden eller Utökade e-postmeddelanden.
                                            .Fyll i SMTP-inställningarna, till exempel för Gmail:
                                                  -SMTP-server: smtp.gmail.com 
                                                  -Standardanvändarens e-postsuffix: @gmail.com
                                                  -Använd SMTP-autentisering: ✔️
                                                  -SMTP-användarnamn: ditt.email@gmail.com
                                                  -SMTP-lösenord: (applikationslösenord)
                                                  -SMTP-port: 587
                                                  -Markera Använd TLS
                                            .Testa med testkonfiguration genom att skicka ett testmail.
     3.Så här lägger du till e-post i ett projekt:.Gå till ditt Jenkins-jobb → Konfigurera.
                                      .Under Post-build-åtgärder väljer du Redigerbar e-postavisering.
                                      .Fyll i e-postadresserna i fältet Projektmottagarelista.
                                      .Välj när e-postmeddelandet ska skickas (t.ex. Misslyckande - Första gången, Framgång, Instabil).
