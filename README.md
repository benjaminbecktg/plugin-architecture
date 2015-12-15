# Plugin-Architecture
---

The plugin architecture is a project that is use as proof of concept in having multiple plugins being instantiated for consumption based on different use case. One of the use case would be attempting to have a payment being route to a preferred payment provider such as _Stripe_ or _Paypal_ depending on the consumer preference.

> The project is primarily built on Java, Maven, Spring Framework (Spring Core, Spring Boot, and Sprint Integration).

There are total of 5 sub-projects within the solution

| Project | Description |
|---------|-------------|
| plugin-api | The API project that accepts request and return response to the caller. |
| plugin-base | The base project required by individual plugin. |
| plugin-easternBank | A plugin that inherits the plugin-base. A fictional bank called Eastern Bank. |
| plugin-southernBank | A plugin that inherits the plugin-base. A fictional bank called Southern Bank. |
| plugin-service | The library that contains the gateway and routing service which intelligently route the relevant payment to the responsible plugin. |

