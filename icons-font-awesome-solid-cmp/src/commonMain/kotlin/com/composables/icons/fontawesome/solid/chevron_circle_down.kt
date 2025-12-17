package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronCircleDown: ImageVector
    get() {
        if (_ChevronCircleDown != null) return _ChevronCircleDown!!
        
        _ChevronCircleDown = ImageVector.Builder(
            name = "chevron-circle-down",
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
                moveTo(273f, 369.9f)
                lineToRelative(135.5f, -135.5f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(-17f, -17f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(256f, 285.1f)
                lineTo(154.4f, 183.5f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineToRelative(-17f, 17f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineTo(239f, 369.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 34f, 0f)
                close()
            }
        }.build()
        
        return _ChevronCircleDown!!
    }

private var _ChevronCircleDown: ImageVector? = null

