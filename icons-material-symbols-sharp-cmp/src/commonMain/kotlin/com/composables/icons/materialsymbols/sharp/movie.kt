package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Movie: ImageVector
    get() {
        if (_Movie != null) return _Movie!!
        
        _Movie = ImageVector.Builder(
            name = "movie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(80f, 160f)
                horizontalLineToRelative(120f)
                lineToRelative(-80f, -160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -400f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(320f)
                verticalLineToRelative(-320f)
                close()
            }
        }.build()
        
        return _Movie!!
    }

private var _Movie: ImageVector? = null

