package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sports_handball: ImageVector
    get() {
        if (_Sports_handball != null) return _Sports_handball!!
        
        _Sports_handball = ImageVector.Builder(
            name = "sports_handball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(350f, 668f)
                lineToRelative(-40f, 69f)
                quadToRelative(-8f, 14f, -24.5f, 18.5f)
                reflectiveQuadTo(255f, 752f)
                quadToRelative(-14f, -8f, -18.5f, -24.5f)
                reflectiveQuadTo(240f, 697f)
                lineToRelative(186f, -321f)
                quadToRelative(-38f, -39f, -57f, -89f)
                reflectiveQuadToRelative(-19f, -103f)
                quadToRelative(0f, -26f, 4.5f, -52.5f)
                reflectiveQuadTo(370f, 80f)
                quadToRelative(6f, -15f, 22f, -19.5f)
                reflectiveQuadToRelative(30f, 3.5f)
                quadToRelative(14f, 8f, 18.5f, 24f)
                reflectiveQuadToRelative(-0.5f, 32f)
                quadToRelative(-5f, 15f, -7.5f, 30.5f)
                reflectiveQuadTo(430f, 182f)
                quadToRelative(0f, 53f, 26f, 99.5f)
                reflectiveQuadToRelative(74f, 74.5f)
                lineToRelative(90f, 52f)
                quadToRelative(62f, 36f, 91f, 103.5f)
                reflectiveQuadTo(740f, 638f)
                quadToRelative(0f, 27f, -5f, 53.5f)
                reflectiveQuadTo(720f, 743f)
                quadToRelative(-6f, 16f, -22f, 20.5f)
                reflectiveQuadToRelative(-31f, -3.5f)
                quadToRelative(-14f, -8f, -19f, -24f)
                reflectiveQuadToRelative(0f, -33f)
                quadToRelative(5f, -16f, 7.5f, -31.5f)
                reflectiveQuadTo(658f, 640f)
                quadToRelative(0f, -32f, -9f, -62f)
                reflectiveQuadToRelative(-29f, -56f)
                lineTo(388f, 921f)
                quadToRelative(-8f, 14f, -24.5f, 18.5f)
                reflectiveQuadTo(333f, 936f)
                quadToRelative(-14f, -8f, -18.5f, -24.5f)
                reflectiveQuadTo(318f, 881f)
                lineToRelative(100f, -173f)
                lineToRelative(-68f, -40f)
                close()
                moveToRelative(290f, -308f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(560f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 280f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 360f)
                close()
                moveTo(540f, 160f)
                quadToRelative(-26f, 0f, -43f, -18f)
                reflectiveQuadToRelative(-17f, -42f)
                quadToRelative(0f, -26f, 18f, -43f)
                reflectiveQuadToRelative(42f, -17f)
                quadToRelative(26f, 0f, 43f, 18f)
                reflectiveQuadToRelative(17f, 42f)
                quadToRelative(0f, 26f, -18f, 43f)
                reflectiveQuadToRelative(-42f, 17f)
                close()
            }
        }.build()
        
        return _Sports_handball!!
    }

private var _Sports_handball: ImageVector? = null

