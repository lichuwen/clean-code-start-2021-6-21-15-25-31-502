## Code Smell
**1. Naming**

> - LineItem：p -> price
> - OrderReceipt: o -> order

**2. Magic Number**

> - OrderReceipt: extra constant .10 -> TEX_RATE

**3. Long Method**

> - OrderReceipt: printReceipt()

**4. Primitive obsession**

> - Introduce parameter object
> - Introduce field
> - Make field final
> - Inline field

**5. Feature Envy**

> - OrderReceipt: lineitme -> LineItem

**6. Dead Code**

> - LineItem：remove super()
> - OrderReceipt: remove todo / annotation
