package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.GlassWhiskey: ImageVector
    get() {
        if (_GlassWhiskey != null) return _GlassWhiskey!!
        
        _GlassWhiskey = ImageVector.Builder(
            name = "glass-whiskey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 32f)
                horizontalLineTo(32f)
                curveTo(12.5f, 32f, -2.4f, 49.2f, 0.3f, 68.5f)
                lineToRelative(56f, 356.5f)
                curveToRelative(4.5f, 31.5f, 31.5f, 54.9f, 63.4f, 54.9f)
                horizontalLineToRelative(273f)
                curveToRelative(31.8f, 0f, 58.9f, -23.4f, 63.4f, -54.9f)
                lineToRelative(55.6f, -356.5f)
                curveTo(514.4f, 49.2f, 499.5f, 32f, 480f, 32f)
                close()
                moveToRelative(-37.4f, 64f)
                lineToRelative(-30f, 192f)
                horizontalLineToRelative(-313f)
                lineTo(69.4f, 96f)
                horizontalLineToRelative(373.2f)
                close()
            }
        }.build()
        
        return _GlassWhiskey!!
    }

private var _GlassWhiskey: ImageVector? = null

