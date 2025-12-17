package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chrome_reader_mode: ImageVector
    get() {
        if (_Chrome_reader_mode != null) return _Chrome_reader_mode!!
        
        _Chrome_reader_mode = ImageVector.Builder(
            name = "chrome_reader_mode",
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
                horizontalLineToRelative(800f)
                verticalLineToRelative(640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(440f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-480f)
                horizontalLineTo(520f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(40f, -320f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, 100f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, 100f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
            }
        }.build()
        
        return _Chrome_reader_mode!!
    }

private var _Chrome_reader_mode: ImageVector? = null

