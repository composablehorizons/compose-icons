package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Video_stable: ImageVector
    get() {
        if (_Video_stable != null) return _Video_stable!!
        
        _Video_stable = ImageVector.Builder(
            name = "video_stable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(529f, -39f)
                lineToRelative(72f, -269f)
                quadToRelative(5f, -16f, -3.5f, -30f)
                reflectiveQuadTo(733f, 363f)
                lineTo(322f, 251f)
                quadToRelative(-16f, -5f, -30f, 3.5f)
                reflectiveQuadTo(273f, 279f)
                lineToRelative(-72f, 269f)
                quadToRelative(-5f, 16f, 3.5f, 30f)
                reflectiveQuadToRelative(24.5f, 19f)
                lineToRelative(411f, 112f)
                quadToRelative(16f, 5f, 30f, -3.5f)
                reflectiveQuadToRelative(19f, -24.5f)
                close()
                moveToRelative(-67f, -59f)
                lineToRelative(-333f, -92f)
                lineToRelative(51f, -192f)
                lineToRelative(333f, 92f)
                lineToRelative(-51f, 192f)
                close()
                moveToRelative(-462f, 98f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Video_stable!!
    }

private var _Video_stable: ImageVector? = null

