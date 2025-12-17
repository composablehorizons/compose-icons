package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Table_rows: ImageVector
    get() {
        if (_Table_rows != null) return _Table_rows!!
        
        _Table_rows = ImageVector.Builder(
            name = "table_rows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-186f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(186f)
                close()
                moveToRelative(0f, -266f)
                horizontalLineTo(120f)
                verticalLineToRelative(-189f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(189f)
                close()
                moveToRelative(0f, -269f)
                horizontalLineTo(120f)
                verticalLineToRelative(-185f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(185f)
                close()
            }
        }.build()
        
        return _Table_rows!!
    }

private var _Table_rows: ImageVector? = null

