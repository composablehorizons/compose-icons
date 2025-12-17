package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Carambola: ImageVector
    get() {
        if (_Carambola != null) return _Carambola!!
        
        _Carambola = ImageVector.Builder(
            name = "carambola",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.108f, 22.085f)
                curveToRelative(-1.266f, -0.068f, -2.924f, -0.859f, -5.071f, -2.355f)
                lineToRelative(-0.04f, -0.027f)
                lineToRelative(-0.037f, 0.027f)
                curveToRelative(-2.147f, 1.497f, -3.804f, 2.288f, -5.072f, 2.356f)
                lineToRelative(-0.178f, 0.005f)
                curveToRelative(-2.747f, 0f, -3.097f, -2.64f, -1.718f, -7.244f)
                lineToRelative(0.054f, -0.178f)
                lineToRelative(-0.1f, -0.075f)
                curveToRelative(-6.056f, -4.638f, -5.046f, -7.848f, 2.554f, -8.066f)
                lineToRelative(0.202f, -0.005f)
                lineToRelative(0.115f, -0.326f)
                curveToRelative(1.184f, -3.33f, 2.426f, -5.085f, 4.027f, -5.192f)
                lineToRelative(0.156f, -0.005f)
                curveToRelative(1.674f, 0f, 2.957f, 1.76f, 4.182f, 5.197f)
                lineToRelative(0.114f, 0.326f)
                lineToRelative(0.204f, 0.005f)
                curveToRelative(7.6f, 0.218f, 8.61f, 3.428f, 2.553f, 8.065f)
                lineToRelative(-0.102f, 0.075f)
                lineToRelative(0.055f, 0.178f)
                curveToRelative(1.35f, 4.512f, 1.04f, 7.137f, -1.556f, 7.24f)
                lineToRelative(-0.163f, 0.003f)
                close()
            }
        }.build()
        
        return _Carambola!!
    }

private var _Carambola: ImageVector? = null

