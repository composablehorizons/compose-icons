package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Add_column_right: ImageVector
    get() {
        if (_Add_column_right != null) return _Add_column_right!!
        
        _Add_column_right = ImageVector.Builder(
            name = "add_column_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(720f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, 0f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(164f)
                quadToRelative(-10f, -2f, -19.5f, -3f)
                reflectiveQuadToRelative(-20.5f, -1f)
                quadToRelative(-83f, 0f, -141.5f, 58f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 84f, 58.5f, 142f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(11f, 0f, 20.5f, -1f)
                reflectiveQuadToRelative(19.5f, -3f)
                verticalLineToRelative(164f)
                horizontalLineTo(480f)
                close()
                moveToRelative(240f, -240f)
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
        
        return _Add_column_right!!
    }

private var _Add_column_right: ImageVector? = null

