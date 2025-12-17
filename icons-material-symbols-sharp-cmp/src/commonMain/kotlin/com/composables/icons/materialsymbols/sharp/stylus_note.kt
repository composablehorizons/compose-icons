package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stylus_note: ImageVector
    get() {
        if (_Stylus_note != null) return _Stylus_note!!
        
        _Stylus_note = ImageVector.Builder(
            name = "stylus_note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(499f, 673f)
                lineToRelative(335f, -335f)
                lineToRelative(-52f, -52f)
                lineToRelative(-335f, 335f)
                lineToRelative(52f, 52f)
                close()
                moveToRelative(-261f, 87f)
                quadToRelative(-100f, -5f, -149f, -42f)
                reflectiveQuadTo(40f, 611f)
                quadToRelative(0f, -65f, 53.5f, -105.5f)
                reflectiveQuadTo(242f, 457f)
                quadToRelative(39f, -3f, 58.5f, -12.5f)
                reflectiveQuadTo(320f, 418f)
                quadToRelative(0f, -26f, -29.5f, -39f)
                reflectiveQuadTo(193f, 360f)
                lineToRelative(7f, -80f)
                quadToRelative(103f, 8f, 151.5f, 41.5f)
                reflectiveQuadTo(400f, 418f)
                quadToRelative(0f, 53f, -38.5f, 83f)
                reflectiveQuadTo(248f, 537f)
                quadToRelative(-64f, 5f, -96f, 23.5f)
                reflectiveQuadTo(120f, 611f)
                quadToRelative(0f, 35f, 28f, 50.5f)
                reflectiveQuadToRelative(94f, 18.5f)
                lineToRelative(-4f, 80f)
                close()
                moveToRelative(280f, 7f)
                lineTo(353f, 602f)
                lineToRelative(429f, -429f)
                lineToRelative(166f, 165f)
                lineToRelative(-430f, 429f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(-208f, 43f)
                lineToRelative(43f, -208f)
                lineToRelative(165f, 165f)
                close()
            }
        }.build()
        
        return _Stylus_note!!
    }

private var _Stylus_note: ImageVector? = null

