package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Check: ImageVector
    get() {
        if (_Check != null) return _Check!!
        
        _Check = ImageVector.Builder(
            name = "check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.6015f, 3.90815f)
                curveTo(10.7903f, 3.61941f, 11.1779f, 3.53792f, 11.4667f, 3.72651f)
                curveTo(11.7555f, 3.91533f, 11.837f, 4.30288f, 11.6484f, 4.59175f)
                lineTo(7.39837f, 11.0917f)
                curveTo(7.29822f, 11.2449f, 7.13558f, 11.3469f, 6.95404f, 11.3701f)
                curveTo(6.77251f, 11.3932f, 6.58945f, 11.3359f, 6.45404f, 11.2128f)
                lineTo(3.70404f, 8.71284f)
                lineTo(3.62005f, 8.61811f)
                curveTo(3.44857f, 8.38342f, 3.4589f, 8.05252f, 3.66205f, 7.82905f)
                curveTo(3.86511f, 7.60576f, 4.19344f, 7.56371f, 4.4433f, 7.71186f)
                lineTo(4.54584f, 7.78706f)
                lineTo(6.75287f, 9.79292f)
                lineTo(10.6015f, 3.90815f)
                close()
            }
        }.build()
        
        return _Check!!
    }

private var _Check: ImageVector? = null

