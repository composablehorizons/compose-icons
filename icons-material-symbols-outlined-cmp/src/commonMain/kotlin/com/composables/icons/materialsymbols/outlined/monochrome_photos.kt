package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Monochrome_photos: ImageVector
    get() {
        if (_Monochrome_photos != null) return _Monochrome_photos!!
        
        _Monochrome_photos = ImageVector.Builder(
            name = "monochrome_photos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 700f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(660f, 520f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(480f, 700f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(126f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(240f)
                lineToRelative(74f, 80f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-480f)
                horizontalLineTo(638f)
                lineToRelative(-73f, -80f)
                horizontalLineToRelative(-85f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Monochrome_photos!!
    }

private var _Monochrome_photos: ImageVector? = null

