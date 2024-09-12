Sujet d’examen : Développement d’APIs Bancaires
Membres du groupe : 
Mohamed Dia 	INE : N000F2120181
Fatou Diarra		INE : N00622E20172

Partie 3 : Comparaison de l'API SOAP et REST

Performance : 
-	REST : REST est généralement plus rapide que SOAP en raison de sa simplicité et de son utilisation du format léger JSON ou XML pour le transfert de données. REST est conçu pour être stateless, ce qui le rend moins gourmand en ressources lors des appels multiples.
  
  - SOAP : SOAP est plus lourd en raison de son format XML structuré et des en-têtes supplémentaires pour la sécurité, l'intégrité et la fiabilité des messages. Cela entraîne des temps de réponse plus longs, surtout avec des données volumineuses. Cependant, SOAP a un avantage dans des scénarios nécessitant des transactions complexes, car il peut garantir l'intégrité des données grâce à ses mécanismes de vérification.

Facilité d'implémentation :
•⁠  ⁠REST : REST est plus simple à mettre en place, surtout avec des frameworks comme Spring Boot, qui offrent des abstractions pour les requêtes HTTP. Il n'est pas nécessaire de manipuler des définitions complexes comme les WSDL (Web Service Description Language) pour REST. Les développeurs peuvent facilement comprendre et utiliser des requêtes HTTP standard (GET, POST, PUT, DELETE).
  
-	SOAP : SOAP nécessite plus de configuration, notamment pour définir le WSDL, et demande une gestion plus rigoureuse des erreurs et de la sécurité. L’utilisation de JAXB pour le marshalling et le unmarshalling des objets ajoute une couche supplémentaire de complexité. Cependant, une fois bien configuré, SOAP est robuste et compatible avec des services d’entreprise complexes.

Interfaçage :
•⁠  ⁠REST : L'interfaçage est simplifié grâce à l'utilisation de formats de données légers comme JSON. REST fonctionne bien avec des clients mobiles et web, et peut facilement être testé avec des outils comme Postman ou cURL. L'intégration avec Swagger/OpenAPI rend la documentation et le test d'API plus intuitifs et interactifs.
  
  -  SOAP : SOAP est plus formel et standardisé. Les clients doivent généralement se baser sur le WSDL pour générer le code nécessaire à l'interaction avec le service. Cela peut rendre l’interfaçage plus rigide, mais aussi plus fiable, surtout pour des systèmes critiques où l'intégrité des données est essentielle.

2. Avantages et inconvénients de chaque approche dans le contexte d’une banque en ligne

REST
•⁠  ⁠Avantages :
  - Simplicité et légèreté : REST est plus facile à comprendre et à implémenter, et son format léger permet des performances élevées.
  - Scalabilité : Il s'intègre bien avec des architectures distribuées et des microservices, ce qui est idéal pour des services bancaires avec une forte demande et des interactions rapides.
  - Flexibilité : Il peut être utilisé avec une large gamme de technologies et de formats de données (JSON, XML, etc.).
  - Large adoption : REST est largement adopté par les développeurs d'API modernes, ce qui facilite l'interopérabilité et l'accès aux services.

•⁠  ⁠Inconvénients :
  - Sécurité : Bien que des mécanismes comme OAuth2 et HTTPS puissent protéger les données, REST n’a pas la sécurité intégrée de SOAP.
  - Fiabilité : REST est stateless, ce qui rend difficile la gestion de transactions complexes nécessitant des états.

SOAP
•⁠  ⁠Avantages :
  - Sécurité : SOAP prend en charge WS-Security, ce qui est essentiel pour des transactions bancaires nécessitant un niveau élevé de sécurité et de confidentialité des données.
  - Transactions complexes : SOAP gère mieux les transactions distribuées et les échanges complexes, comme la garantie de l’intégrité des messages ou le support de l’acquittement.
  - Normalisation : SOAP suit des normes strictes, ce qui peut assurer une interopérabilité entre des systèmes hétérogènes, même dans un environnement bancaire international.

•⁠  ⁠Inconvénients :
  - Complexité : La mise en place de SOAP est plus lourde, notamment avec la gestion du WSDL et des schémas XML. Cela augmente la courbe d'apprentissage et le temps de développement.
  - Performance : SOAP est généralement plus lent que REST en raison de son overhead, ce qui peut poser problème pour des systèmes en temps réel où la rapidité est primordiale, comme la consultation de solde ou la gestion d'opérations en ligne.

Conclusion :
Dans le contexte d’une banque en ligne :
•⁠  ⁠REST serait idéal pour les opérations courantes nécessitant rapidité et simplicité, comme la consultation de soldes ou d’historique de transactions.
•⁠  ⁠SOAP reste pertinent pour les opérations critiques nécessitant une sécurité accrue et une gestion rigoureuse des transactions, comme les transferts de fonds importants ou les intégrations avec des systèmes externes, où la fiabilité et la conformité sont prioritaires. 

Une combinaison des deux pourrait être envisagée pour tirer parti de leurs avantages respectifs.
![image](https://github.com/user-attachments/assets/8432f650-970c-4748-b652-7b3ee55613bb)
