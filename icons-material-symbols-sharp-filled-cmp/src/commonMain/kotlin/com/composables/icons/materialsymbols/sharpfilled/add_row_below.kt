package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Add_row_below: ImageVector
    get() {
        if (_Add_row_below != null) return _Add_row_below!!
        
        _Add_row_below = ImageVector.Builder(
            name = "add_row_below",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(676f)
                quadToRelative(2f, -10f, 3f, -19.5f)
                reflectiveQuadToRelative(1f, -20.5f)
                quadToRelative(0f, -83f, -58f, -141.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-84f, 0f, -142f, 58.5f)
                reflectiveQuadTo(280f, 760f)
                quadToRelative(0f, 11f, 1f, 20.5f)
                reflectiveQuadToRelative(3f, 19.5f)
                horizontalLineTo(120f)
                close()
                moveToRelative(320f, 80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Add_row_below!!
    }

private var _Add_row_below: ImageVector? = null

