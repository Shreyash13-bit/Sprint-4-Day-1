# Auto-Configuration Report: Greeter Service

## ✔ Auto-Configurations Loaded

- `GreeterAutoConfig`: Loaded because `@ConditionalOnMissingBean` matched (no `Greeter` defined before).
- `GreeterConfig`: Explicitly registered in the application context.
- `ComponentGreeter`: Detected by component scanning but not used due to conflict.

## 🛡 Conditional Clash Prevention

- Spring Boot resolved the conflict using `@ConditionalOnMissingBean`.
- Since Java Config provided a `Greeter` bean, both Component and AutoConfig were skipped.

## 🔍 Debug Info

Use `--debug` while running. It lists what auto-configurations were applied or skipped and why.
