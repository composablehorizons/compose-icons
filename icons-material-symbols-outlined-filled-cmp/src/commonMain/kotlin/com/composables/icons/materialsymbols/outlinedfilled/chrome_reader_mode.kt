package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chrome_reader_mode: ImageVector
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
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-480f)
                horizontalLineTo(520f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(40f, -120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -100f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-60f)
                horizontalLineTo(560f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(0f, -100f)
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

