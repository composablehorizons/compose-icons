package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Check: ImageVector
    get() {
        if (_Check != null) return _Check!!
        
        _Check = ImageVector.Builder(
            name = "check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.6572f, 3.13573f)
                curveTo(13.8583f, 2.9465f, 14.175f, 2.95614f, 14.3643f, 3.15722f)
                curveTo(14.5535f, 3.35831f, 14.5438f, 3.675f, 14.3428f, 3.86425f)
                lineTo(5.84277f, 11.8642f)
                curveTo(5.64597f, 12.0494f, 5.33756f, 12.0446f, 5.14648f, 11.8535f)
                lineTo(1.64648f, 8.35351f)
                curveTo(1.45121f, 8.15824f, 1.45121f, 7.84174f, 1.64648f, 7.64647f)
                curveTo(1.84174f, 7.45121f, 2.15825f, 7.45121f, 2.35351f, 7.64647f)
                lineTo(5.50976f, 10.8027f)
                lineTo(13.6572f, 3.13573f)
                close()
            }
        }.build()
        
        return _Check!!
    }

private var _Check: ImageVector? = null

