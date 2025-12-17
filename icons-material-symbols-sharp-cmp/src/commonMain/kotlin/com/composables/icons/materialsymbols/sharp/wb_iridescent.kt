package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wb_iridescent: ImageVector
    get() {
        if (_Wb_iridescent != null) return _Wb_iridescent!!
        
        _Wb_iridescent = ImageVector.Builder(
            name = "wb_iridescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 602f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(240f)
                horizontalLineTo(200f)
                close()
                moveToRelative(240f, -402f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(308f, 112f)
                lineToRelative(-56f, -56f)
                lineToRelative(72f, -72f)
                lineToRelative(56f, 56f)
                lineToRelative(-72f, 72f)
                close()
                moveTo(440f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(324f, -100f)
                lineToRelative(-72f, -72f)
                lineToRelative(56f, -56f)
                lineToRelative(72f, 72f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(212f, 312f)
                lineToRelative(-72f, -72f)
                lineToRelative(56f, -56f)
                lineToRelative(72f, 72f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(-16f, 468f)
                lineToRelative(-56f, -56f)
                lineToRelative(72f, -72f)
                lineToRelative(56f, 56f)
                lineToRelative(-72f, 72f)
                close()
                moveToRelative(84f, -258f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-80f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Wb_iridescent!!
    }

private var _Wb_iridescent: ImageVector? = null

