package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Add_column_right: ImageVector
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
                moveTo(160f, 200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-560f)
                horizontalLineTo(160f)
                close()
                moveTo(80f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -360f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(320f, 120f)
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

