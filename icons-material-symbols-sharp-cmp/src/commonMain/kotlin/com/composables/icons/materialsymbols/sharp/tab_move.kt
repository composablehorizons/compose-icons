package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tab_move: ImageVector
    get() {
        if (_Tab_move != null) return _Tab_move!!
        
        _Tab_move = ImageVector.Builder(
            name = "tab_move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-480f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(340f, -140f)
                lineToRelative(-56f, -56f)
                lineToRelative(83f, -84f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(367f)
                lineToRelative(-83f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(180f, 180f)
                lineToRelative(-180f, 180f)
                close()
            }
        }.build()
        
        return _Tab_move!!
    }

private var _Tab_move: ImageVector? = null

