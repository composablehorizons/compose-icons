package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signal_cellular_pause: ImageVector
    get() {
        if (_Signal_cellular_pause != null) return _Signal_cellular_pause!!
        
        _Signal_cellular_pause = ImageVector.Builder(
            name = "signal_cellular_pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(800f, -800f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-247f)
                lineTo(273f, 800f)
                horizontalLineToRelative(247f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(520f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(537f, 536f)
                close()
            }
        }.build()
        
        return _Signal_cellular_pause!!
    }

private var _Signal_cellular_pause: ImageVector? = null

