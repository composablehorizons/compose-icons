package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sports_football: ImageVector
    get() {
        if (_Sports_football != null) return _Sports_football!!
        
        _Sports_football = ImageVector.Builder(
            name = "sports_football",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 480f)
                close()
                moveTo(362f, 758f)
                lineTo(202f, 598f)
                quadToRelative(-3f, 38f, -1.5f, 79f)
                reflectiveQuadToRelative(7.5f, 73f)
                quadToRelative(23f, 7f, 69.5f, 9f)
                reflectiveQuadToRelative(84.5f, -1f)
                close()
                moveToRelative(96f, -16f)
                quadToRelative(59f, -13f, 106f, -37f)
                reflectiveQuadToRelative(82f, -59f)
                quadToRelative(34f, -34f, 58f, -80.5f)
                reflectiveQuadTo(742f, 460f)
                lineTo(500f, 218f)
                quadToRelative(-57f, 14f, -103f, 38.5f)
                reflectiveQuadTo(316f, 316f)
                quadToRelative(-35f, 35f, -59.5f, 81.5f)
                reflectiveQuadTo(218f, 502f)
                lineToRelative(240f, 240f)
                close()
                moveToRelative(-62f, -122f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                lineToRelative(56f, 56f)
                lineToRelative(-224f, 224f)
                close()
                moveToRelative(362f, -256f)
                quadToRelative(4f, -39f, 2.5f, -81f)
                reflectiveQuadToRelative(-8.5f, -73f)
                quadToRelative(-23f, -8f, -69.5f, -10f)
                reflectiveQuadToRelative(-84.5f, 2f)
                lineToRelative(160f, 162f)
                close()
                moveTo(310f, 840f)
                quadToRelative(-57f, 0f, -104f, -8.5f)
                reflectiveQuadTo(148f, 812f)
                quadToRelative(-11f, -12f, -19.5f, -60f)
                reflectiveQuadTo(120f, 646f)
                quadToRelative(0f, -119f, 36f, -220.5f)
                reflectiveQuadTo(258f, 258f)
                quadToRelative(66f, -66f, 169f, -102f)
                reflectiveQuadToRelative(223f, -36f)
                quadToRelative(58f, 0f, 104.5f, 8.5f)
                reflectiveQuadTo(812f, 148f)
                quadToRelative(11f, 12f, 19.5f, 60f)
                reflectiveQuadToRelative(8.5f, 108f)
                quadToRelative(0f, 117f, -36f, 218.5f)
                reflectiveQuadTo(702f, 702f)
                quadToRelative(-65f, 65f, -168f, 101.5f)
                reflectiveQuadTo(310f, 840f)
                close()
            }
        }.build()
        
        return _Sports_football!!
    }

private var _Sports_football: ImageVector? = null

