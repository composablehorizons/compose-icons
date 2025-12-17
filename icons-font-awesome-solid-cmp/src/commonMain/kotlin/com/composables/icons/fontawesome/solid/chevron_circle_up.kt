package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronCircleUp: ImageVector
    get() {
        if (_ChevronCircleUp != null) return _ChevronCircleUp!!
        
        _ChevronCircleUp = ImageVector.Builder(
            name = "chevron-circle-up",
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
                moveToRelative(231f, -113.9f)
                lineTo(103.5f, 277.6f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(17f, 17f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineTo(256f, 226.9f)
                lineToRelative(101.6f, 101.6f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(17f, -17f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineTo(273f, 142.1f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -34f, 0f)
                close()
            }
        }.build()
        
        return _ChevronCircleUp!!
    }

private var _ChevronCircleUp: ImageVector? = null

