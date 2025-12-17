package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowAltCircleUp: ImageVector
    get() {
        if (_ArrowAltCircleUp != null) return _ArrowAltCircleUp!!
        
        _ArrowAltCircleUp = ImageVector.Builder(
            name = "arrow-alt-circle-up",
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
                moveToRelative(292f, 116f)
                verticalLineTo(256f)
                horizontalLineToRelative(70.9f)
                curveToRelative(10.7f, 0f, 16.1f, -13f, 8.5f, -20.5f)
                lineTo(264.5f, 121.2f)
                curveToRelative(-4.7f, -4.7f, -12.2f, -4.7f, -16.9f, 0f)
                lineToRelative(-115f, 114.3f)
                curveToRelative(-7.6f, 7.6f, -2.2f, 20.5f, 8.5f, 20.5f)
                horizontalLineTo(212f)
                verticalLineToRelative(116f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(64f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                close()
            }
        }.build()
        
        return _ArrowAltCircleUp!!
    }

private var _ArrowAltCircleUp: ImageVector? = null

