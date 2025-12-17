package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Lock_clock: ImageVector
    get() {
        if (_Lock_clock != null) return _Lock_clock!!
        
        _Lock_clock = ImageVector.Builder(
            name = "lock_clock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                verticalLineToRelative(80f)
                close()
                moveTo(490f, 880f)
                horizontalLineTo(160f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(132f)
                quadToRelative(-18f, -6f, -37.5f, -9f)
                reflectiveQuadToRelative(-42.5f, -3f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(212f)
                quadToRelative(8f, 24f, 16f, 41.5f)
                reflectiveQuadTo(490f, 880f)
                close()
                moveToRelative(230f, 40f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(66f, -106f)
                lineToRelative(28f, -28f)
                lineToRelative(-74f, -74f)
                verticalLineToRelative(-112f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(128f)
                lineToRelative(86f, 86f)
                close()
                moveTo(240f, 400f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Lock_clock!!
    }

private var _Lock_clock: ImageVector? = null

