package com.example.allflagsofcountriesworld

fun InicioScreen(modifier:Modifier=Modifier) {
    ConstraintLayout(modifier = modifier .background(color = miblanco).size(width = 700.dp, height = 900.dp)) {
        val (box1, box2, box3) = createRefs()
        Box(modifier = Modifier.background(color = miazul) .constrainAs(box1) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = Dimension.fillToConstraints
            height = Dimension.value(150.dp)

        })
        Box(modifier = Modifier.background(miazul).constrainAs(box2) {
            top.linkTo(box1.bottom, margin = 200.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            width = fillToConstraints
            height = Dimension.value(150.dp)
        }){
            Canvas(Modifier.fillMaxSize()) {
                val h = size.height

                val tri = Path().apply {
                    moveTo(0f, 0f)
                    lineTo(0f, h)
                    lineTo(h * 2f, h / 2f)
                    close()
                }
                drawPath(tri, Color.Red)
                val cx = h * 0.45f
                val cy = h / 2f
                val outerR = h * 0.28f
                val innerR = outerR * 0.5f
                val star = Path()
                for (i in 0..9) {
                    val ang = Math.toRadians((-90 + i * 36).toDouble())
                    val r = if (i % 2 == 0) outerR else innerR
                    val x = cx + (r * kotlin.math.cos(ang)).toFloat()
                    val y = cy + (r * kotlin.math.sin(ang)).toFloat()
                    if (i == 0) star.moveTo(x, y) else star.lineTo(x, y)
                }
                star.close()
                drawPath(star, color = Color.White)
            }
        }

        Box(modifier=Modifier.background(miazul) .constrainAs(box3){
            top.linkTo(box2.bottom, margin = 200.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width= Dimension.percent(1f)
            height= Dimension.percent(0.18f)
        })

    }
}