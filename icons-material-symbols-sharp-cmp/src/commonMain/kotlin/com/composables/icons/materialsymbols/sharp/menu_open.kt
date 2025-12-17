package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Menu_open: ImageVector
    get() {
        if (_Menu_open != null) return _Menu_open!!
        
        _Menu_open = ImageVector.Builder(
            name = "menu_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(664f, -40f)
                lineTo(584f, 480f)
                lineToRelative(200f, -200f)
                lineToRelative(56f, 56f)
                lineToRelative(-144f, 144f)
                lineToRelative(144f, 144f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(120f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Menu_open!!
    }

private var _Menu_open: ImageVector? = null

