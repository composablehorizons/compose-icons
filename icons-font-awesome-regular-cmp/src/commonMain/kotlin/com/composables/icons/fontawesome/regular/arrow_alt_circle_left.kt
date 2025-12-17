package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.ArrowAltCircleLeft: ImageVector
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
                moveTo(8f, 256f)
                curveToRelative(0f, 137f, 111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                reflectiveCurveTo(8f, 119f, 8f, 256f)
                close()
                moveToRelative(448f, 0f)
                curveToRelative(0f, 110.5f, -89.5f, 200f, -200f, 200f)
                reflectiveCurveTo(56f, 366.5f, 56f, 256f)
                reflectiveCurveTo(145.5f, 56f, 256f, 56f)
                reflectiveCurveToRelative(200f, 89.5f, 200f, 200f)
                close()
                moveToRelative(-72f, -20f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineTo(256f)
                verticalLineToRelative(67f)
                curveToRelative(0f, 10.7f, -12.9f, 16f, -20.5f, 8.5f)
                lineToRelative(-99f, -99f)
                curveToRelative(-4.7f, -4.7f, -4.7f, -12.3f, 0f, -17f)
                lineToRelative(99f, -99f)
                curveToRelative(7.6f, -7.6f, 20.5f, -2.2f, 20.5f, 8.5f)
                verticalLineToRelative(67f)
                horizontalLineToRelative(116f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                close()
            }
        }.build()
        
        return _ArrowAltCircleLeft!!
    }

private var _ArrowAltCircleLeft: ImageVector? = null

