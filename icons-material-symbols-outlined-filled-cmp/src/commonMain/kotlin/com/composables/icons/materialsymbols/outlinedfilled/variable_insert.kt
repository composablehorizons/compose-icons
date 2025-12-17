package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Variable_insert: ImageVector
    get() {
        if (_Variable_insert != null) return _Variable_insert!!
        
        _Variable_insert = ImageVector.Builder(
            name = "variable_insert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 680f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(160f)
                horizontalLineTo(560f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
                moveToRelative(744f, 120f)
                lineTo(720f, 657f)
                verticalLineToRelative(123f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-260f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(80f)
                horizontalLineTo(776f)
                lineToRelative(144f, 144f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Variable_insert!!
    }

private var _Variable_insert: ImageVector? = null

