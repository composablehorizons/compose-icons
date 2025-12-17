package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Slash: ImageVector
    get() {
        if (_Slash != null) return _Slash!!
        
        _Slash = ImageVector.Builder(
            name = "slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(594.53f, 508.63f)
                lineTo(6.18f, 53.9f)
                curveToRelative(-6.97f, -5.42f, -8.23f, -15.47f, -2.81f, -22.45f)
                lineTo(23.01f, 6.18f)
                curveTo(28.43f, -0.8f, 38.49f, -2.06f, 45.47f, 3.37f)
                lineTo(633.82f, 458.1f)
                curveToRelative(6.97f, 5.42f, 8.23f, 15.47f, 2.81f, 22.45f)
                lineToRelative(-19.64f, 25.27f)
                curveToRelative(-5.42f, 6.98f, -15.48f, 8.23f, -22.46f, 2.81f)
                close()
            }
        }.build()
        
        return _Slash!!
    }

private var _Slash: ImageVector? = null

