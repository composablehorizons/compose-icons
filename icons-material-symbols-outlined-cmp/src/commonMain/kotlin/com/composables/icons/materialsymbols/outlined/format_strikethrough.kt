package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Format_strikethrough: ImageVector
    get() {
        if (_Format_strikethrough != null) return _Format_strikethrough!!
        
        _Format_strikethrough = ImageVector.Builder(
            name = "format_strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(340f, -160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(120f)
                horizontalLineTo(540f)
                verticalLineToRelative(120f)
                horizontalLineTo(420f)
                close()
                moveToRelative(0f, 400f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(420f)
                close()
            }
        }.build()
        
        return _Format_strikethrough!!
    }

private var _Format_strikethrough: ImageVector? = null

