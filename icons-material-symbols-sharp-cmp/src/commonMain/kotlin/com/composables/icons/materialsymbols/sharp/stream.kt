package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stream: ImageVector
    get() {
        if (_Stream != null) return _Stream!!
        
        _Stream = ImageVector.Builder(
            name = "stream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 560f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(160f, 560f)
                close()
                moveToRelative(66f, 228f)
                lineToRelative(-56f, -56f)
                lineToRelative(174f, -174f)
                lineToRelative(56f, 56f)
                lineToRelative(-174f, 174f)
                close()
                moveToRelative(120f, -388f)
                lineTo(172f, 226f)
                lineToRelative(56f, -56f)
                lineToRelative(174f, 174f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 800f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(134f, 162f)
                lineToRelative(-56f, -58f)
                lineToRelative(176f, -174f)
                lineToRelative(56f, 56f)
                lineToRelative(-176f, 176f)
                close()
                moveToRelative(120f, 386f)
                lineTo(560f, 614f)
                lineToRelative(56f, -56f)
                lineToRelative(174f, 174f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(66f, -228f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 560f)
                close()
            }
        }.build()
        
        return _Stream!!
    }

private var _Stream: ImageVector? = null

