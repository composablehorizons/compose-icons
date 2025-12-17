package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tape: ImageVector
    get() {
        if (_Tape != null) return _Tape!!
        
        _Tape = ImageVector.Builder(
            name = "tape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 192f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                reflectiveCurveToRelative(64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                close()
                moveToRelative(400f, 224f)
                horizontalLineTo(380.6f)
                curveToRelative(41.5f, -40.7f, 67.4f, -97.3f, 67.4f, -160f)
                curveToRelative(0f, -123.7f, -100.3f, -224f, -224f, -224f)
                reflectiveCurveTo(0f, 132.3f, 0f, 256f)
                reflectiveCurveToRelative(100.3f, 224f, 224f, 224f)
                horizontalLineToRelative(400f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-400f, -64f)
                curveToRelative(-53f, 0f, -96f, -43f, -96f, -96f)
                reflectiveCurveToRelative(43f, -96f, 96f, -96f)
                reflectiveCurveToRelative(96f, 43f, 96f, 96f)
                reflectiveCurveToRelative(-43f, 96f, -96f, 96f)
                close()
            }
        }.build()
        
        return _Tape!!
    }

private var _Tape: ImageVector? = null

