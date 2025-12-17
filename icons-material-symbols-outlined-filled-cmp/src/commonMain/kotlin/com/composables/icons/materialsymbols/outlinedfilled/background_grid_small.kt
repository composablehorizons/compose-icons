package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Background_grid_small: ImageVector
    get() {
        if (_Background_grid_small != null) return _Background_grid_small!!
        
        _Background_grid_small = ImageVector.Builder(
            name = "background_grid_small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(200f, 840f)
                close()
                moveToRelative(120f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, 0f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(840f, 760f)
                verticalLineToRelative(-40f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                close()
                moveTo(120f, 240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(120f, 200f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, -400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, -400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(200f, -400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 200f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(720f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Background_grid_small!!
    }

private var _Background_grid_small: ImageVector? = null

