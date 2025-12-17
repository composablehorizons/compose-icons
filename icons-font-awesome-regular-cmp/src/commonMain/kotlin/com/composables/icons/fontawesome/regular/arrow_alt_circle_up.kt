package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.ArrowAltCircleUp: ImageVector
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
                moveTo(256f, 504f)
                curveToRelative(137f, 0f, 248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                close()
                moveToRelative(0f, -448f)
                curveToRelative(110.5f, 0f, 200f, 89.5f, 200f, 200f)
                reflectiveCurveToRelative(-89.5f, 200f, -200f, 200f)
                reflectiveCurveTo(56f, 366.5f, 56f, 256f)
                reflectiveCurveTo(145.5f, 56f, 256f, 56f)
                close()
                moveToRelative(20f, 328f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineTo(256f)
                horizontalLineToRelative(-67f)
                curveToRelative(-10.7f, 0f, -16f, -12.9f, -8.5f, -20.5f)
                lineToRelative(99f, -99f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17f, 0f)
                lineToRelative(99f, 99f)
                curveToRelative(7.6f, 7.6f, 2.2f, 20.5f, -8.5f, 20.5f)
                horizontalLineToRelative(-67f)
                verticalLineToRelative(116f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                close()
            }
        }.build()
        
        return _ArrowAltCircleUp!!
    }

private var _ArrowAltCircleUp: ImageVector? = null

