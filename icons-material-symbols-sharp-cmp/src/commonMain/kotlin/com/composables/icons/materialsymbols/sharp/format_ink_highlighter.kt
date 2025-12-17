package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Format_ink_highlighter: ImageVector
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
                moveToRelative(504f, -480f)
                lineToRelative(-52f, -52f)
                lineToRelative(-52f, -52f)
                lineToRelative(-160f, 160f)
                lineToRelative(103f, 104f)
                lineToRelative(161f, -160f)
                close()
                moveToRelative(-47f, -160f)
                lineToRelative(52f, 51f)
                lineToRelative(51f, 52f)
                lineToRelative(160f, -159f)
                lineToRelative(-104f, -104f)
                lineToRelative(-159f, 160f)
                close()
                moveTo(140f, 720f)
                lineToRelative(126f, -126f)
                lineToRelative(-30f, -29f)
                verticalLineToRelative(-57f)
                lineToRelative(217f, -217f)
                lineToRelative(216f, 216f)
                lineToRelative(-217f, 217f)
                horizontalLineToRelative(-56f)
                lineToRelative(-30f, -30f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(140f)
                close()
                moveToRelative(313f, -429f)
                lineToRelative(244f, -244f)
                lineToRelative(217f, 217f)
                lineToRelative(-245f, 243f)
                lineToRelative(-216f, -216f)
                close()
            }
        }.build()
        
        return _Format_ink_highlighter!!
    }

private var _Format_ink_highlighter: ImageVector? = null

