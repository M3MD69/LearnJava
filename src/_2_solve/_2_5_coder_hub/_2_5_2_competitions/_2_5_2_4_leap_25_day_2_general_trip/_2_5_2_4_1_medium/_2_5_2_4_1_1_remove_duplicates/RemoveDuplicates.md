# <div dir="rtl">تصفية البيانات</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
في أحد أهم فعاليات مؤتمر بلاك هات، يتم تقديم تحدٍ جديد يتعامل مع هجوم سيبراني معقد. أثناء تحليل البيانات المُعترضة من أحد الأنظمة، تواجه مجموعة من القيم المكررة. المشكلة؟ هذا التكرار المفرط يُعيق فهم البيانات، ويحتاج إلى تصفية ذكية مع الحفاظ على ترتيبها.

مهمتك، كخبير في الأمن السيبراني، هي "تصفية البيانات" بحيث يتم تقليل النسخ الزائدة من العناصر إلى مرتين على الأكثر، مع ضمان عدم المساس بالتسلسل الأصلي. لا يمكنك استخدام أي مساحة إضافية لأن النظام يعمل في وضع حرج، مما يتطلب منك تعديل البيانات في مكانها.

لديك مصفوفة تحتوي على بيانات مرتبة تصاعديًا.

بعض العناصر تظهر أكثر من مرتين، مما يجعل تحليل البيانات بطيئًا.

المطلوب:

قم بإزالة التكرارات الزائدة بحيث يظهر كل عنصر مرتين على الأكثر.

حافظ على الترتيب الأصلي للعناصر.

عدّل المصفوفة في مكانها دون استخدام مساحة إضافية.

المخرجات:

عدد العناصر النهائية في المصفوفة بعد التصحيح.

الجزء الأول من المصفوفة يحتوي على العناصر المصححة فقط.

مثال:

إدخال:

\[1, 1, 1, 2, 2, 3]

الاخراج:
\[1, 1, 2, 2, 3]

في المثال الذي تم ذكره، لدينا مصفوفة تحتوي على أرقام مرتبة تصاعديًا بها بعض التكرار:

\[1, 1, 1, 2, 2, 3]

الهدف:
يجب عليك تقليل التكرارات بحيث لا يظهر أي عنصر أكثر من مرتين في المصفوفة، مع الحفاظ على ترتيب العناصر كما هو.

الخطوات:
استخدم مؤشرين:

المؤشر الأول (i): يتحرك عبر المصفوفة الأصلية.

المؤشر الثاني (j): يحدد المكان الذي ستضع فيه العنصر الجديد بعد معالجته (التصفية).

المؤشر الأول يتحرك عبر المصفوفة الأصلية ويقارن كل عنصر بالعنصر الذي قبله:

إذا كان العنصر الحالي هو نفسه العنصر السابق، يتم التحقق من عدد مرات ظهوره.

إذا كان العنصر قد ظهر أكثر من مرتين، يتم تخطيه.

إذا كان العنصر ظهر مرتين فقط أو أقل، يتم نقله إلى المكان الجديد الذي يتم تحديده بواسطة المؤشر الثاني.

في هذا المثال:

العنصر 1 ظهر ثلاث مرات، لذا يتم تخطي النسخة الثالثة منه.

العنصر 2 ظهر مرتين، لذا يبقى في المصفوفة.

العنصر 3 ظهر مرة واحدة، لذا يبقى أيضًا.

النتيجة النهائية:
\[1, 1, 2, 2, 3]

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [1, 1, 1, 2, 2, 3]
```

#### <div dir="rtl">المُخرجات</div>

```text
5
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [0, 0, 0, 1, 1, 1, 2, 3, 3]
```

#### <div dir="rtl">المُخرجات</div>

```text
7
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [1, 1, 1, 1, 1]
```

#### <div dir="rtl">المُخرجات</div>

```text
2
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
nums = [1, 2, 3, 4, 5]
```

#### <div dir="rtl">المُخرجات</div>

```text
5
```