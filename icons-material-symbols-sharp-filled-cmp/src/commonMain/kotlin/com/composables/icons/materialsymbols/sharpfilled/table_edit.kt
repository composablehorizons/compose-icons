package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_edit: ImageVector
    get() {
        if (_Table_edit != null) return _Table_edit!!
        
        _Table_edit = ImageVector.Builder(
            name = "table_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -280f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 560f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(200f)
                horizontalLineTo(120f)
                close()
                moveToRelative(400f, -280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(286f)
                lineTo(605f, 560f)
                horizontalLineToRelative(-85f)
                close()
                moveToRelative(0f, 320f)
                verticalLineToRelative(-123f)
                lineToRelative(263f, -262f)
                lineToRelative(123f, 122f)
                lineTo(643f, 880f)
                horizontalLineTo(520f)
                close()
                moveToRelative(263f, -224f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
            }
        }.build()
        
        return _Table_edit!!
    }

private var _Table_edit: ImageVector? = null

