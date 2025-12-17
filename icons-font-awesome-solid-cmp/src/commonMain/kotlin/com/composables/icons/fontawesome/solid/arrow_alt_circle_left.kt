package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowAltCircleLeft: ImageVector
    get() {
        if (_ArrowAltCircleLeft != null) return _ArrowAltCircleLeft!!
        
        _ArrowAltCircleLeft = ImageVector.Builder(
            name = "arrow-alt-circle-left",
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
                moveToRelative(116f, -292f)
                horizontalLineTo(256f)
                verticalLineToRelative(-70.9f)
                curveToRelative(0f, -10.7f, -13f, -16.1f, -20.5f, -8.5f)
                lineTo(121.2f, 247.5f)
                curveToRelative(-4.7f, 4.7f, -4.7f, 12.2f, 0f, 16.9f)
                lineToRelative(114.3f, 114.9f)
                curveToRelative(7.6f, 7.6f, 20.5f, 2.2f, 20.5f, -8.5f)
                verticalLineTo(300f)
                horizontalLineToRelative(116f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
            }
        }.build()
        
        return _ArrowAltCircleLeft!!
    }

private var _ArrowAltCircleLeft: ImageVector? = null

