package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Heartbreak: ImageVector
    get() {
        if (_Heartbreak != null) return _Heartbreak!!
        
        _Heartbreak = ImageVector.Builder(
            name = "heartbreak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.931f, 0.586f)
                lineTo(7f, 3f)
                lineToRelative(1.5f, 4f)
                lineToRelative(-2f, 3f)
                lineTo(8f, 15f)
                curveTo(22.534f, 5.396f, 13.757f, -2.21f, 8.931f, 0.586f)
                moveTo(7.358f, 0.77f)
                lineTo(5.5f, 3f)
                lineTo(7f, 7f)
                lineToRelative(-1.5f, 3f)
                lineToRelative(1.815f, 4.537f)
                curveTo(-6.533f, 4.96f, 2.685f, -2.467f, 7.358f, 0.77f)
            }
        }.build()
        
        return _Heartbreak!!
    }

private var _Heartbreak: ImageVector? = null

