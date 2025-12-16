package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) return _ChevronRight!!
        
        _ChevronRight = ImageVector.Builder(
            name = "chevron-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.15879f, 11.8651f)
                curveTo(6.36026f, 12.0536f, 6.67706f, 12.043f, 6.86582f, 11.8416f)
                lineTo(10.6158f, 7.84162f)
                curveTo(10.7957f, 7.64939f, 10.7957f, 7.35026f, 10.6158f, 7.15803f)
                lineTo(6.86582f, 3.15803f)
                lineTo(6.78868f, 3.09162f)
                curveTo(6.59895f, 2.95743f, 6.33504f, 2.96965f, 6.15879f, 3.13459f)
                curveTo(5.98254f, 3.29983f, 5.95206f, 3.56345f, 6.07383f, 3.76155f)
                lineTo(6.13535f, 3.84162f)
                lineTo(9.56407f, 7.49983f)
                lineTo(6.13535f, 11.158f)
                curveTo(5.94681f, 11.3595f, 5.95745f, 11.6763f, 6.15879f, 11.8651f)
                close()
            }
        }.build()
        
        return _ChevronRight!!
    }

private var _ChevronRight: ImageVector? = null

