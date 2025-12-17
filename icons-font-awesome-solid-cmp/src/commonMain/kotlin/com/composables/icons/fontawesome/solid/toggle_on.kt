package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ToggleOn: ImageVector
    get() {
        if (_ToggleOn != null) return _ToggleOn!!
        
        _ToggleOn = ImageVector.Builder(
            name = "toggle-on",
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
                curveTo(86f, 64f, 0f, 150f, 0f, 256f)
                reflectiveCurveToRelative(86f, 192f, 192f, 192f)
                horizontalLineToRelative(192f)
                curveToRelative(106f, 0f, 192f, -86f, 192f, -192f)
                reflectiveCurveTo(490f, 64f, 384f, 64f)
                close()
                moveToRelative(0f, 320f)
                curveToRelative(-70.8f, 0f, -128f, -57.3f, -128f, -128f)
                curveToRelative(0f, -70.8f, 57.3f, -128f, 128f, -128f)
                curveToRelative(70.8f, 0f, 128f, 57.3f, 128f, 128f)
                curveToRelative(0f, 70.8f, -57.3f, 128f, -128f, 128f)
                close()
            }
        }.build()
        
        return _ToggleOn!!
    }

private var _ToggleOn: ImageVector? = null

