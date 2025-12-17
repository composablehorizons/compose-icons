package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Video_stable: ImageVector
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
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-480f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(519f, 0f)
                lineToRelative(92f, -346f)
                lineToRelative(-488f, -134f)
                lineToRelative(-92f, 346f)
                lineToRelative(488f, 134f)
                close()
                moveToRelative(-57f, -98f)
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

