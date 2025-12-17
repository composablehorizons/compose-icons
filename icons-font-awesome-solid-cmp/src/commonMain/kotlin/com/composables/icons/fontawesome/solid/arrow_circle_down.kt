package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowCircleDown: ImageVector
    get() {
        if (_ArrowCircleDown != null) return _ArrowCircleDown!!
        
        _ArrowCircleDown = ImageVector.Builder(
            name = "arrow-circle-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(504f, 256f)
                curveToRelative(0f, 137f, -111f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 393f, 8f, 256f)
                reflectiveCurveTo(119f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111f, 248f, 248f)
                close()
                moveToRelative(-143.6f, -28.9f)
                lineTo(288f, 302.6f)
                verticalLineTo(120f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineToRelative(-16f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(182.6f)
                lineToRelative(-72.4f, -75.5f)
                curveToRelative(-9.3f, -9.7f, -24.8f, -9.9f, -34.3f, -0.4f)
                lineToRelative(-10.9f, 11f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineTo(239f, 404.3f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(132.7f, -132.7f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(-10.9f, -11f)
                curveToRelative(-9.5f, -9.5f, -25f, -9.3f, -34.3f, 0.4f)
                close()
            }
        }.build()
        
        return _ArrowCircleDown!!
    }

private var _ArrowCircleDown: ImageVector? = null

