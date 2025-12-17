package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Times: ImageVector
    get() {
        if (_Times != null) return _Times!!
        
        _Times = ImageVector.Builder(
            name = "times",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 352f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(242.72f, 256f)
                lineToRelative(100.07f, -100.07f)
                curveToRelative(12.28f, -12.28f, 12.28f, -32.19f, 0f, -44.48f)
                lineToRelative(-22.24f, -22.24f)
                curveToRelative(-12.28f, -12.28f, -32.19f, -12.28f, -44.48f, 0f)
                lineTo(176f, 189.28f)
                lineTo(75.93f, 89.21f)
                curveToRelative(-12.28f, -12.28f, -32.19f, -12.28f, -44.48f, 0f)
                lineTo(9.21f, 111.45f)
                curveToRelative(-12.28f, 12.28f, -12.28f, 32.19f, 0f, 44.48f)
                lineTo(109.28f, 256f)
                lineTo(9.21f, 356.07f)
                curveToRelative(-12.28f, 12.28f, -12.28f, 32.19f, 0f, 44.48f)
                lineToRelative(22.24f, 22.24f)
                curveToRelative(12.28f, 12.28f, 32.2f, 12.28f, 44.48f, 0f)
                lineTo(176f, 322.72f)
                lineToRelative(100.07f, 100.07f)
                curveToRelative(12.28f, 12.28f, 32.2f, 12.28f, 44.48f, 0f)
                lineToRelative(22.24f, -22.24f)
                curveToRelative(12.28f, -12.28f, 12.28f, -32.19f, 0f, -44.48f)
                lineTo(242.72f, 256f)
                close()
            }
        }.build()
        
        return _Times!!
    }

private var _Times: ImageVector? = null

