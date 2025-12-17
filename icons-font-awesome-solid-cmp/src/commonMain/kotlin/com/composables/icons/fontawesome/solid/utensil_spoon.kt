package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UtensilSpoon: ImageVector
    get() {
        if (_UtensilSpoon != null) return _UtensilSpoon!!
        
        _UtensilSpoon = ImageVector.Builder(
            name = "utensil-spoon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480.1f, 31.9f)
                curveToRelative(-55f, -55.1f, -164.9f, -34.5f, -227.8f, 28.5f)
                curveToRelative(-49.3f, 49.3f, -55.1f, 110f, -28.8f, 160.4f)
                lineTo(9f, 413.2f)
                curveToRelative(-11.6f, 10.5f, -12.1f, 28.5f, -1f, 39.5f)
                lineTo(59.3f, 504f)
                curveToRelative(11f, 11f, 29.1f, 10.5f, 39.5f, -1.1f)
                lineToRelative(192.4f, -214.4f)
                curveToRelative(50.4f, 26.3f, 111.1f, 20.5f, 160.4f, -28.8f)
                curveToRelative(63f, -62.9f, 83.6f, -172.8f, 28.5f, -227.8f)
                close()
            }
        }.build()
        
        return _UtensilSpoon!!
    }

private var _UtensilSpoon: ImageVector? = null

