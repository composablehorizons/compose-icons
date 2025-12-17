package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_ink_highlighter: ImageVector
    get() {
        if (_Format_ink_highlighter != null) return _Format_ink_highlighter!!
        
        _Format_ink_highlighter = ImageVector.Builder(
            name = "format_ink_highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 960f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(800f)
                verticalLineTo(960f)
                horizontalLineTo(80f)
                close()
                moveToRelative(60f, -240f)
                lineToRelative(126f, -126f)
                lineToRelative(-30f, -29f)
                verticalLineToRelative(-57f)
                lineToRelative(188f, -188f)
                lineToRelative(216f, 217f)
                lineToRelative(-188f, 187f)
                horizontalLineToRelative(-56f)
                lineToRelative(-30f, -30f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(140f)
                close()
                moveToRelative(340f, -457f)
                lineToRelative(217f, -216f)
                lineToRelative(216f, 217f)
                lineToRelative(-216f, 216f)
                lineToRelative(-217f, -217f)
                close()
            }
        }.build()
        
        return _Format_ink_highlighter!!
    }

private var _Format_ink_highlighter: ImageVector? = null

