package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Kayaking: ImageVector
    get() {
        if (_Kayaking != null) return _Kayaking!!
        
        _Kayaking = ImageVector.Builder(
            name = "kayaking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(40f)
                quadToRelative(32f, 0f, 62f, -10f)
                reflectiveQuadToRelative(58f, -30f)
                quadToRelative(28f, 20f, 58f, 30f)
                reflectiveQuadToRelative(62f, 10f)
                quadToRelative(32f, 0f, 62.5f, -10f)
                reflectiveQuadToRelative(57.5f, -30f)
                quadToRelative(28f, 20f, 58f, 30f)
                reflectiveQuadToRelative(62f, 10f)
                quadToRelative(32f, 0f, 62.5f, -10f)
                reflectiveQuadToRelative(57.5f, -30f)
                quadToRelative(27f, 20f, 57.5f, 30f)
                reflectiveQuadToRelative(62.5f, 10f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(720f, 890f)
                quadToRelative(-29f, 15f, -59f, 22.5f)
                reflectiveQuadTo(600f, 920f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(480f, 890f)
                quadToRelative(-29f, 15f, -59f, 22.5f)
                reflectiveQuadTo(360f, 920f)
                quadToRelative(-31f, 0f, -61f, -7.5f)
                reflectiveQuadTo(240f, 890f)
                quadToRelative(-29f, 15f, -59f, 22.5f)
                reflectiveQuadTo(120f, 920f)
                horizontalLineTo(80f)
                close()
                moveToRelative(280f, -160f)
                quadToRelative(-36f, 0f, -67f, -17f)
                reflectiveQuadToRelative(-53f, -43f)
                quadToRelative(-17f, 18f, -37.5f, 32.5f)
                reflectiveQuadTo(157f, 755f)
                quadToRelative(-41f, -11f, -83f, -26f)
                reflectiveQuadTo(0f, 700f)
                quadToRelative(54f, -23f, 132f, -47f)
                reflectiveQuadToRelative(153f, -36f)
                lineToRelative(54f, -167f)
                quadToRelative(11f, -34f, 41.5f, -45f)
                reflectiveQuadToRelative(57.5f, 3f)
                lineToRelative(102f, 52f)
                lineToRelative(113f, -60f)
                lineToRelative(66f, -148f)
                lineToRelative(-20f, -53f)
                lineToRelative(53f, -119f)
                lineToRelative(128f, 57f)
                lineToRelative(-53f, 119f)
                lineToRelative(-53f, 20f)
                lineToRelative(-148f, 334f)
                quadToRelative(93f, 11f, 186.5f, 38f)
                reflectiveQuadTo(960f, 700f)
                quadToRelative(-29f, 13f, -73.5f, 28.5f)
                reflectiveQuadTo(803f, 755f)
                quadToRelative(-25f, -7f, -45.5f, -21.5f)
                reflectiveQuadTo(720f, 700f)
                quadToRelative(-22f, 26f, -53f, 43f)
                reflectiveQuadToRelative(-67f, 17f)
                quadToRelative(-36f, 0f, -67f, -17f)
                reflectiveQuadToRelative(-53f, -43f)
                quadToRelative(-22f, 26f, -53f, 43f)
                reflectiveQuadToRelative(-67f, 17f)
                close()
                moveToRelative(203f, -157f)
                lineToRelative(38f, -85f)
                lineToRelative(-61f, 32f)
                lineToRelative(-70f, -36f)
                lineToRelative(-28f, 86f)
                horizontalLineToRelative(38f)
                quadToRelative(21f, 0f, 42f, 0.5f)
                reflectiveQuadToRelative(41f, 2.5f)
                close()
                moveToRelative(-83f, -223f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 300f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 220f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 300f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 380f)
                close()
            }
        }.build()
        
        return _Kayaking!!
    }

private var _Kayaking: ImageVector? = null

