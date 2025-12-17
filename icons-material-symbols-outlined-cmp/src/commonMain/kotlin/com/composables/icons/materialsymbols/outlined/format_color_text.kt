package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Format_color_text: ImageVector
    get() {
        if (_Format_color_text != null) return _Format_color_text!!
        
        _Format_color_text = ImageVector.Builder(
            name = "format_color_text",
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
                moveToRelative(140f, -280f)
                lineToRelative(210f, -560f)
                horizontalLineToRelative(100f)
                lineToRelative(210f, 560f)
                horizontalLineToRelative(-96f)
                lineToRelative(-50f, -144f)
                horizontalLineTo(368f)
                lineToRelative(-52f, 144f)
                horizontalLineToRelative(-96f)
                close()
                moveToRelative(176f, -224f)
                horizontalLineToRelative(168f)
                lineToRelative(-82f, -232f)
                horizontalLineToRelative(-4f)
                lineToRelative(-82f, 232f)
                close()
            }
        }.build()
        
        return _Format_color_text!!
    }

private var _Format_color_text: ImageVector? = null

