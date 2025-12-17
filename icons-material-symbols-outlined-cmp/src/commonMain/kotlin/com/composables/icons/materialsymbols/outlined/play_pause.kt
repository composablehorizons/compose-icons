package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Play_pause: ImageVector
    get() {
        if (_Play_pause != null) return _Play_pause!!
        
        _Play_pause = ImageVector.Builder(
            name = "play_pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 648f)
                verticalLineToRelative(-336f)
                lineToRelative(240f, 168f)
                lineToRelative(-240f, 168f)
                close()
                moveToRelative(320f, -8f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Play_pause!!
    }

private var _Play_pause: ImageVector? = null

