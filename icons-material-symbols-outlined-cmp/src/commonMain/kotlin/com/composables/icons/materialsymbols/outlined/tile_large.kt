package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tile_large: ImageVector
    get() {
        if (_Tile_large != null) return _Tile_large!!
        
        _Tile_large = ImageVector.Builder(
            name = "tile_large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(240f)
                horizontalLineTo(520f)
                close()
                moveToRelative(-320f, -80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(80f)
                close()
                moveTo(120f, 520f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(400f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, 200f)
                close()
                moveToRelative(400f, 0f)
                close()
            }
        }.build()
        
        return _Tile_large!!
    }

private var _Tile_large: ImageVector? = null

