package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowAltCircleRight: ImageVector
    get() {
        if (_ArrowAltCircleRight != null) return _ArrowAltCircleRight!!
        
        _ArrowAltCircleRight = ImageVector.Builder(
            name = "arrow-alt-circle-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveToRelative(137f, 0f, 248f, 111f, 248f, 248f)
                reflectiveCurveTo(393f, 504f, 256f, 504f)
                reflectiveCurveTo(8f, 393f, 8f, 256f)
                reflectiveCurveTo(119f, 8f, 256f, 8f)
                close()
                moveTo(140f, 300f)
                horizontalLineToRelative(116f)
                verticalLineToRelative(70.9f)
                curveToRelative(0f, 10.7f, 13f, 16.1f, 20.5f, 8.5f)
                lineToRelative(114.3f, -114.9f)
                curveToRelative(4.7f, -4.7f, 4.7f, -12.2f, 0f, -16.9f)
                lineToRelative(-114.3f, -115f)
                curveToRelative(-7.6f, -7.6f, -20.5f, -2.2f, -20.5f, 8.5f)
                verticalLineTo(212f)
                horizontalLineTo(140f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                close()
            }
        }.build()
        
        return _ArrowAltCircleRight!!
    }

private var _ArrowAltCircleRight: ImageVector? = null

