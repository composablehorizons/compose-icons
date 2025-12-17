package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Add_column_left: ImageVector
    get() {
        if (_Add_column_left != null) return _Add_column_left!!
        
        _Add_column_left = ImageVector.Builder(
            name = "add_column_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-164f)
                quadToRelative(10f, 2f, 19.5f, 3f)
                reflectiveQuadToRelative(20.5f, 1f)
                quadToRelative(83f, 0f, 141.5f, -58f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -84f, -58.5f, -142f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(-11f, 0f, -20.5f, 1f)
                reflectiveQuadToRelative(-19.5f, 3f)
                verticalLineToRelative(-164f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
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
        
        return _Add_column_left!!
    }

private var _Add_column_left: ImageVector? = null

