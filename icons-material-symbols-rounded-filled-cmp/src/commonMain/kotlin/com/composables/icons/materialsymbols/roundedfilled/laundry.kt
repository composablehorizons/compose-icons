package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Laundry: ImageVector
    get() {
        if (_Laundry != null) return _Laundry!!
        
        _Laundry = ImageVector.Builder(
            name = "laundry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 745f)
                quadToRelative(-11f, -13f, -9.5f, -29.5f)
                reflectiveQuadTo(165f, 688f)
                lineToRelative(56f, -48f)
                quadToRelative(24f, -20f, 53f, -30.5f)
                reflectiveQuadToRelative(61f, -10.5f)
                quadToRelative(31f, 0f, 60f, 10.5f)
                reflectiveQuadToRelative(53f, 30.5f)
                lineToRelative(116f, 99f)
                quadToRelative(13f, 11f, 29f, 16f)
                reflectiveQuadToRelative(33f, 5f)
                quadToRelative(17f, 0f, 32.5f, -5f)
                reflectiveQuadToRelative(28.5f, -16f)
                lineToRelative(56f, -48f)
                quadToRelative(13f, -11f, 29.5f, -10f)
                reflectiveQuadToRelative(27.5f, 14f)
                quadToRelative(11f, 13f, 9.5f, 29.5f)
                reflectiveQuadTo(795f, 752f)
                lineToRelative(-56f, 48f)
                quadToRelative(-24f, 20f, -53f, 30f)
                reflectiveQuadToRelative(-60f, 10f)
                quadToRelative(-32f, 0f, -61.5f, -10f)
                reflectiveQuadTo(512f, 800f)
                lineToRelative(-116f, -99f)
                quadToRelative(-13f, -11f, -28.5f, -16f)
                reflectiveQuadToRelative(-32.5f, -5f)
                quadToRelative(-17f, 0f, -33f, 5f)
                reflectiveQuadToRelative(-29f, 16f)
                lineToRelative(-57f, 48f)
                quadToRelative(-13f, 11f, -29f, 10f)
                reflectiveQuadToRelative(-27f, -14f)
                close()
                moveToRelative(80f, -186f)
                verticalLineToRelative(-120f)
                lineToRelative(-41f, 22f)
                quadToRelative(-14f, 8f, -30f, 3.5f)
                reflectiveQuadTo(145f, 446f)
                lineTo(65f, 307f)
                quadToRelative(-8f, -14f, -3.5f, -30.5f)
                reflectiveQuadTo(80f, 252f)
                lineToRelative(199f, -115f)
                quadToRelative(12f, -7f, 25f, -12f)
                reflectiveQuadToRelative(27f, -5f)
                quadToRelative(14f, 0f, 24f, 8.5f)
                reflectiveQuadToRelative(15f, 21.5f)
                quadToRelative(13f, 38f, 42f, 64f)
                reflectiveQuadToRelative(68f, 26f)
                quadToRelative(39f, 0f, 67.5f, -26f)
                reflectiveQuadToRelative(42.5f, -64f)
                quadToRelative(5f, -13f, 15.5f, -21.5f)
                reflectiveQuadTo(630f, 120f)
                quadToRelative(14f, 0f, 26.5f, 5f)
                reflectiveQuadToRelative(24.5f, 12f)
                lineToRelative(199f, 115f)
                quadToRelative(14f, 8f, 18f, 24f)
                reflectiveQuadToRelative(-4f, 30f)
                lineToRelative(-79f, 140f)
                quadToRelative(-8f, 14f, -24f, 18.5f)
                reflectiveQuadToRelative(-30f, -3.5f)
                lineToRelative(-41f, -22f)
                verticalLineToRelative(192f)
                lineToRelative(-63f, 55f)
                quadToRelative(-8f, 6f, -16.5f, 9.5f)
                reflectiveQuadTo(623f, 699f)
                quadToRelative(-8f, 0f, -15.5f, -4.5f)
                reflectiveQuadTo(593f, 685f)
                lineToRelative(-106f, -91f)
                quadToRelative(-32f, -27f, -71.5f, -41f)
                reflectiveQuadTo(334f, 539f)
                quadToRelative(-24f, 0f, -47.5f, 5f)
                reflectiveQuadTo(240f, 559f)
                close()
            }
        }.build()
        
        return _Laundry!!
    }

private var _Laundry: ImageVector? = null

