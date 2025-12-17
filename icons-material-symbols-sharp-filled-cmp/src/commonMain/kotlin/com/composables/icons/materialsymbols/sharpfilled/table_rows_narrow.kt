package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_rows_narrow: ImageVector
    get() {
        if (_Table_rows_narrow != null) return _Table_rows_narrow!!
        
        _Table_rows_narrow = ImageVector.Builder(
            name = "table_rows_narrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 620f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-100f)
                horizontalLineTo(120f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(0f, -180f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-100f)
                horizontalLineTo(120f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(0f, -180f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-100f)
                horizontalLineTo(120f)
                verticalLineToRelative(100f)
                close()
                moveToRelative(720f, 580f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(720f)
                close()
                moveToRelative(-720f, -40f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-100f)
                horizontalLineTo(120f)
                verticalLineToRelative(100f)
                close()
            }
        }.build()
        
        return _Table_rows_narrow!!
    }

private var _Table_rows_narrow: ImageVector? = null

