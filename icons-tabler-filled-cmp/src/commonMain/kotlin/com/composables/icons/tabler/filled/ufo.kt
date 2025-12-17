package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Ufo: ImageVector
    get() {
        if (_Ufo != null) return _Ufo!!
        
        _Ufo = ImageVector.Builder(
            name = "ufo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveToRelative(3.067f, 0f, 5.6f, 2.29f, 5.957f, 5.246f)
                curveToRelative(3.067f, 0.903f, 5.043f, 2.476f, 5.043f, 4.478f)
                curveToRelative(0f, 2.3f, -2.653f, 4.053f, -6.427f, 4.833f)
                lineToRelative(1.26f, 1.888f)
                arcToRelative(1f, 1f, 0f, true, true, -1.665f, 1.11f)
                lineToRelative(-1.78f, -2.67f)
                curveToRelative(-0.77f, 0.076f, -1.57f, 0.115f, -2.388f, 0.115f)
                curveToRelative(-0.966f, 0f, -1.905f, -0.055f, -2.801f, -0.16f)
                lineToRelative(-1.305f, 2.607f)
                arcToRelative(1f, 1f, 0f, false, true, -1.788f, -0.894f)
                lineToRelative(1.028f, -2.06f)
                curveToRelative(-3.618f, -0.807f, -6.134f, -2.529f, -6.134f, -4.768f)
                curveToRelative(0f, -1.999f, 1.981f, -3.58f, 5.044f, -4.483f)
                curveToRelative(0.36f, -2.955f, 2.89f, -5.242f, 5.956f, -5.242f)
                moveToRelative(0.01f, 10f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                moveToRelative(-5f, -1f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                moveToRelative(10f, 0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, -1.993f)
                moveToRelative(-5.01f, -7f)
                curveToRelative(-2.11f, 0f, -3.835f, 1.618f, -3.989f, 3.667f)
                arcToRelative(1f, 1f, 0f, false, true, 0.057f, 0.4f)
                curveToRelative(0.104f, 0.087f, 0.348f, 0.251f, 0.768f, 0.419f)
                curveToRelative(0.806f, 0.322f, 1.94f, 0.514f, 3.164f, 0.514f)
                reflectiveCurveToRelative(2.358f, -0.192f, 3.164f, -0.514f)
                curveToRelative(0.445f, -0.178f, 0.693f, -0.352f, 0.789f, -0.435f)
                lineToRelative(-0.003f, -0.051f)
                quadToRelative(0f, -0.113f, 0.029f, -0.229f)
                lineToRelative(0.014f, -0.046f)
                curveToRelative(-0.125f, -2.076f, -1.864f, -3.725f, -3.993f, -3.725f)
            }
        }.build()
        
        return _Ufo!!
    }

private var _Ufo: ImageVector? = null

