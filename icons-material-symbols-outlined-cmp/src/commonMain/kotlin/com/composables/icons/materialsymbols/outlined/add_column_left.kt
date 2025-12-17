package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Add_column_left: ImageVector
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
                moveTo(800f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineTo(560f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(-640f, 80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-560f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -360f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(160f, 600f)
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

