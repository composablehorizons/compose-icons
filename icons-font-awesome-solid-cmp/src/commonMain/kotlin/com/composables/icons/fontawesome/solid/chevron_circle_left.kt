package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronCircleLeft: ImageVector
    get() {
        if (_ChevronCircleLeft != null) return _ChevronCircleLeft!!
        
        _ChevronCircleLeft = ImageVector.Builder(
            name = "chevron-circle-left",
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
                moveTo(142.1f, 273f)
                lineToRelative(135.5f, 135.5f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(17f, -17f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineTo(226.9f, 256f)
                lineToRelative(101.6f, -101.6f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(-17f, -17f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(142.1f, 239f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 34f)
                close()
            }
        }.build()
        
        return _ChevronCircleLeft!!
    }

private var _ChevronCircleLeft: ImageVector? = null

