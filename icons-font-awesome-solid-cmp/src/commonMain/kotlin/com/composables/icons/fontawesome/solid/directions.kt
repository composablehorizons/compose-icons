package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Directions: ImageVector
    get() {
        if (_Directions != null) return _Directions!!
        
        _Directions = ImageVector.Builder(
            name = "directions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.61f, 233.32f)
                lineTo(278.68f, 9.39f)
                curveToRelative(-12.52f, -12.52f, -32.83f, -12.52f, -45.36f, 0f)
                lineTo(9.39f, 233.32f)
                curveToRelative(-12.52f, 12.53f, -12.52f, 32.83f, 0f, 45.36f)
                lineToRelative(223.93f, 223.93f)
                curveToRelative(12.52f, 12.53f, 32.83f, 12.53f, 45.36f, 0f)
                lineToRelative(223.93f, -223.93f)
                curveToRelative(12.52f, -12.53f, 12.52f, -32.83f, 0f, -45.36f)
                close()
                moveToRelative(-100.98f, 12.56f)
                lineToRelative(-84.21f, 77.73f)
                curveToRelative(-5.12f, 4.73f, -13.43f, 1.1f, -13.43f, -5.88f)
                verticalLineTo(264f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                horizontalLineToRelative(-32f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -17.67f, 14.33f, -32f, 32f, -32f)
                horizontalLineToRelative(112f)
                verticalLineToRelative(-53.73f)
                curveToRelative(0f, -6.97f, 8.3f, -10.61f, 13.43f, -5.88f)
                lineToRelative(84.21f, 77.73f)
                curveToRelative(3.43f, 3.17f, 3.43f, 8.59f, 0f, 11.76f)
                close()
            }
        }.build()
        
        return _Directions!!
    }

private var _Directions: ImageVector? = null

