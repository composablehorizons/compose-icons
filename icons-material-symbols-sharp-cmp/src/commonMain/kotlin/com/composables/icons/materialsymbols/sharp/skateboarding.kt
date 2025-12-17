package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Skateboarding: ImageVector
    get() {
        if (_Skateboarding != null) return _Skateboarding!!
        
        _Skateboarding = ImageVector.Builder(
            name = "skateboarding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(290f, 960f)
                quadToRelative(-12f, 0f, -21f, -9f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(0f, -12f, 9f, -21f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(12f, 0f, 21f, 9f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(0f, 12f, -9f, 21f)
                reflectiveQuadToRelative(-21f, 9f)
                close()
                moveToRelative(340f, 0f)
                quadToRelative(-12f, 0f, -21f, -9f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(0f, -12f, 9f, -21f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(12f, 0f, 21f, 9f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(0f, 12f, -9f, 21f)
                reflectiveQuadToRelative(-21f, 9f)
                close()
                moveTo(270f, 880f)
                quadToRelative(-45f, 0f, -83f, -19.5f)
                reflectiveQuadTo(124f, 808f)
                quadToRelative(-3f, -5f, -4.5f, -9f)
                reflectiveQuadToRelative(-1.5f, -9f)
                quadToRelative(0f, -12f, 8f, -21f)
                reflectiveQuadToRelative(22f, -9f)
                quadToRelative(8f, 0f, 13.5f, 3f)
                reflectiveQuadToRelative(10.5f, 9f)
                quadToRelative(12f, 17f, 30.5f, 28.5f)
                reflectiveQuadTo(242f, 817f)
                lineToRelative(125f, -151f)
                lineToRelative(-64f, -201f)
                lineToRelative(115f, -185f)
                horizontalLineToRelative(-94f)
                lineToRelative(-76f, 122f)
                lineToRelative(-68f, -42f)
                lineToRelative(100f, -160f)
                horizontalLineToRelative(228f)
                quadToRelative(27f, 0f, 43.5f, 15f)
                reflectiveQuadToRelative(22.5f, 28f)
                lineToRelative(21f, 48f)
                quadToRelative(20f, 48f, 64.5f, 78.5f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(80f)
                quadToRelative(-70f, 0f, -128f, -33.5f)
                reflectiveQuadTo(539f, 358f)
                lineToRelative(-72f, 115f)
                lineToRelative(173f, 107f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(12f)
                quadToRelative(29f, 0f, 54f, -13f)
                reflectiveQuadToRelative(42f, -35f)
                quadToRelative(5f, -6f, 10.5f, -9f)
                reflectiveQuadToRelative(13.5f, -3f)
                quadToRelative(13f, 0f, 21.5f, 9f)
                reflectiveQuadToRelative(8.5f, 21f)
                quadToRelative(0f, 5f, -1.5f, 9f)
                reflectiveQuadToRelative(-4.5f, 9f)
                quadToRelative(-25f, 33f, -62f, 52.5f)
                reflectiveQuadTo(652f, 880f)
                horizontalLineTo(270f)
                close()
                moveToRelative(74f, -60f)
                horizontalLineToRelative(216f)
                verticalLineToRelative(-184f)
                lineToRelative(-140f, -88f)
                lineToRelative(40f, 132f)
                lineToRelative(-116f, 140f)
                close()
                moveToRelative(256f, -620f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 200f)
                close()
            }
        }.build()
        
        return _Skateboarding!!
    }

private var _Skateboarding: ImageVector? = null

