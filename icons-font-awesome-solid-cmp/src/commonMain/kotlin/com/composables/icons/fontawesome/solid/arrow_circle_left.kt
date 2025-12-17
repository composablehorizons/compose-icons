package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowCircleLeft: ImageVector
    get() {
        if (_ArrowCircleLeft != null) return _ArrowCircleLeft!!
        
        _ArrowCircleLeft = ImageVector.Builder(
            name = "arrow-circle-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 504f)
                curveTo(119f, 504f, 8f, 393f, 8f, 256f)
                reflectiveCurveTo(119f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111f, 248f, 248f)
                reflectiveCurveToRelative(-111f, 248f, -248f, 248f)
                close()
                moveToRelative(28.9f, -143.6f)
                lineTo(209.4f, 288f)
                horizontalLineTo(392f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(209.4f)
                lineToRelative(75.5f, -72.4f)
                curveToRelative(9.7f, -9.3f, 9.9f, -24.8f, 0.4f, -34.3f)
                lineToRelative(-11f, -10.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(107.7f, 239f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(132.7f, 132.7f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(11f, -10.9f)
                curveToRelative(9.5f, -9.5f, 9.3f, -25f, -0.4f, -34.3f)
                close()
            }
        }.build()
        
        return _ArrowCircleLeft!!
    }

private var _ArrowCircleLeft: ImageVector? = null

