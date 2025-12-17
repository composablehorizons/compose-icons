package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sword_rose: ImageVector
    get() {
        if (_Sword_rose != null) return _Sword_rose!!
        
        _Sword_rose = ImageVector.Builder(
            name = "sword_rose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(644f, 476f)
                lineTo(484f, 316f)
                lineToRelative(236f, -236f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                lineTo(644f, 476f)
                close()
                moveTo(170f, 896f)
                lineTo(64f, 790f)
                lineToRelative(144f, -145f)
                lineToRelative(-88f, -88f)
                lineToRelative(84f, -84f)
                lineToRelative(62f, 61f)
                lineToRelative(48f, -48f)
                lineToRelative(160f, 160f)
                lineToRelative(-48f, 48f)
                lineToRelative(62f, 61f)
                lineToRelative(-85f, 85f)
                lineToRelative(-88f, -88f)
                lineTo(170f, 896f)
                close()
                moveToRelative(709f, -72f)
                lineToRelative(-56f, 56f)
                lineToRelative(-466f, -464f)
                quadToRelative(-49f, 30f, -107f, 23.5f)
                reflectiveQuadTo(150f, 391f)
                lineToRelative(-25f, -25f)
                lineToRelative(27f, -28f)
                quadToRelative(26f, -27f, 63.5f, -26.5f)
                reflectiveQuadTo(279f, 338f)
                lineToRelative(78f, 78f)
                quadToRelative(9f, -5f, 17f, -11.5f)
                reflectiveQuadToRelative(16f, -14.5f)
                quadToRelative(7f, -7f, 13f, -15f)
                reflectiveQuadToRelative(11f, -16f)
                lineToRelative(-78f, -78f)
                quadToRelative(-51f, -50f, -121f, -50f)
                reflectiveQuadTo(96f, 282f)
                lineToRelative(-27f, 27f)
                lineToRelative(-29f, -29f)
                lineToRelative(240f, -239f)
                lineToRelative(110f, 110f)
                quadToRelative(43f, 43f, 48.5f, 101f)
                reflectiveQuadTo(414f, 359f)
                lineToRelative(289f, 289f)
                quadToRelative(-8f, -26f, -10f, -54f)
                reflectiveQuadToRelative(3f, -56f)
                quadToRelative(6f, -30f, 20.5f, -56f)
                reflectiveQuadToRelative(34f, -48.5f)
                quadToRelative(19.5f, -22.5f, 44.5f, -41f)
                reflectiveQuadToRelative(52f, -32.5f)
                quadToRelative(39f, 48f, 60f, 105f)
                reflectiveQuadToRelative(9f, 117f)
                quadToRelative(-11f, 51f, -42.5f, 91f)
                reflectiveQuadTo(797f, 742f)
                lineToRelative(82f, 82f)
                close()
            }
        }.build()
        
        return _Sword_rose!!
    }

private var _Sword_rose: ImageVector? = null

