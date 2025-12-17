package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shelf_position: ImageVector
    get() {
        if (_Shelf_position != null) return _Shelf_position!!
        
        _Shelf_position = ImageVector.Builder(
            name = "shelf_position",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(460f, -200f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-360f)
                horizontalLineTo(660f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(-460f, 0f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-360f)
                horizontalLineTo(380f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Shelf_position!!
    }

private var _Shelf_position: ImageVector? = null

