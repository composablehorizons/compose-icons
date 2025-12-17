package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChevronCircleRight: ImageVector
    get() {
        if (_ChevronCircleRight != null) return _ChevronCircleRight!!
        
        _ChevronCircleRight = ImageVector.Builder(
            name = "chevron-circle-right",
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
                moveToRelative(113.9f, 231f)
                lineTo(234.4f, 103.5f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineToRelative(-17f, 17f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineTo(285.1f, 256f)
                lineTo(183.5f, 357.6f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(17f, 17f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineTo(369.9f, 273f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -34f)
                close()
            }
        }.build()
        
        return _ChevronCircleRight!!
    }

private var _ChevronCircleRight: ImageVector? = null

