package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowCircleUp: ImageVector
    get() {
        if (_ArrowCircleUp != null) return _ArrowCircleUp!!
        
        _ArrowCircleUp = ImageVector.Builder(
            name = "arrow-circle-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 256f)
                curveTo(8f, 119f, 119f, 8f, 256f, 8f)
                reflectiveCurveToRelative(248f, 111f, 248f, 248f)
                reflectiveCurveToRelative(-111f, 248f, -248f, 248f)
                reflectiveCurveTo(8f, 393f, 8f, 256f)
                close()
                moveToRelative(143.6f, 28.9f)
                lineToRelative(72.4f, -75.5f)
                verticalLineTo(392f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(16f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(209.4f)
                lineToRelative(72.4f, 75.5f)
                curveToRelative(9.3f, 9.7f, 24.8f, 9.9f, 34.3f, 0.4f)
                lineToRelative(10.9f, -11f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineTo(273f, 107.7f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(106.3f, 240.4f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(10.9f, 11f)
                curveToRelative(9.6f, 9.5f, 25.1f, 9.3f, 34.4f, -0.4f)
                close()
            }
        }.build()
        
        return _ArrowCircleUp!!
    }

private var _ArrowCircleUp: ImageVector? = null

