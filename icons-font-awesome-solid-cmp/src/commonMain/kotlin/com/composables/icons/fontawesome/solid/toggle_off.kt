package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ToggleOff: ImageVector
    get() {
        if (_ToggleOff != null) return _ToggleOff!!
        
        _ToggleOff = ImageVector.Builder(
            name = "toggle-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 64f)
                horizontalLineTo(192f)
                curveTo(85.961f, 64f, 0f, 149.961f, 0f, 256f)
                reflectiveCurveToRelative(85.961f, 192f, 192f, 192f)
                horizontalLineToRelative(192f)
                curveToRelative(106.039f, 0f, 192f, -85.961f, 192f, -192f)
                reflectiveCurveTo(490.039f, 64f, 384f, 64f)
                close()
                moveTo(64f, 256f)
                curveToRelative(0f, -70.741f, 57.249f, -128f, 128f, -128f)
                curveToRelative(70.741f, 0f, 128f, 57.249f, 128f, 128f)
                curveToRelative(0f, 70.741f, -57.249f, 128f, -128f, 128f)
                curveToRelative(-70.741f, 0f, -128f, -57.249f, -128f, -128f)
                close()
                moveToRelative(320f, 128f)
                horizontalLineToRelative(-48.905f)
                curveToRelative(65.217f, -72.858f, 65.236f, -183.12f, 0f, -256f)
                horizontalLineTo(384f)
                curveToRelative(70.741f, 0f, 128f, 57.249f, 128f, 128f)
                curveToRelative(0f, 70.74f, -57.249f, 128f, -128f, 128f)
                close()
            }
        }.build()
        
        return _ToggleOff!!
    }

private var _ToggleOff: ImageVector? = null

