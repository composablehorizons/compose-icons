package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PizzaSlice: ImageVector
    get() {
        if (_PizzaSlice != null) return _PizzaSlice!!
        
        _PizzaSlice = ImageVector.Builder(
            name = "pizza-slice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(158.87f, 0.15f)
                curveToRelative(-16.16f, -1.52f, -31.2f, 8.42f, -35.33f, 24.12f)
                lineToRelative(-14.81f, 56.27f)
                curveToRelative(187.62f, 5.49f, 314.54f, 130.61f, 322.48f, 317f)
                lineToRelative(56.94f, -15.78f)
                curveToRelative(15.72f, -4.36f, 25.49f, -19.68f, 23.62f, -35.9f)
                curveTo(490.89f, 165.08f, 340.78f, 17.32f, 158.87f, 0.15f)
                close()
                moveToRelative(-58.47f, 112f)
                lineTo(0.55f, 491.64f)
                arcToRelative(16.21f, 16.21f, 0f, false, false, 20f, 19.75f)
                lineToRelative(379f, -105.1f)
                curveToRelative(-4.27f, -174.89f, -123.08f, -292.14f, -299.15f, -294.1f)
                close()
                moveTo(128f, 416f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
                moveToRelative(48f, -152f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
                moveToRelative(104f, 104f)
                arcToRelative(32f, 32f, 0f, true, true, 32f, -32f)
                arcToRelative(32f, 32f, 0f, false, true, -32f, 32f)
                close()
            }
        }.build()
        
        return _PizzaSlice!!
    }

private var _PizzaSlice: ImageVector? = null

