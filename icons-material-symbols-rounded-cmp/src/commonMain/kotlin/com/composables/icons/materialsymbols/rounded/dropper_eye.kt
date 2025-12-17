package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Dropper_eye: ImageVector
    get() {
        if (_Dropper_eye != null) return _Dropper_eye!!
        
        _Dropper_eye = ImageVector.Builder(
            name = "dropper_eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(644f, 347f)
                lineToRelative(100f, -94f)
                lineToRelative(-37f, -37f)
                lineToRelative(-96f, 96f)
                lineToRelative(33f, 35f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(-33f, -35f)
                lineToRelative(33f, 35f)
                close()
                moveToRelative(-44f, 493f)
                quadToRelative(57f, 0f, 107.5f, -26f)
                reflectiveQuadToRelative(82.5f, -74f)
                quadToRelative(-32f, -48f, -82.5f, -74f)
                reflectiveQuadTo(600f, 640f)
                quadToRelative(-57f, 0f, -107.5f, 26f)
                reflectiveQuadTo(410f, 740f)
                quadToRelative(32f, 48f, 82.5f, 74f)
                reflectiveQuadTo(600f, 840f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(540f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(660f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(600f, 800f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(-79f, 0f, -147.5f, -36f)
                reflectiveQuadTo(342f, 782f)
                quadToRelative(-6f, -9f, -9f, -19.5f)
                reflectiveQuadToRelative(-3f, -21.5f)
                quadToRelative(0f, -11f, 3f, -22f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(42f, -66f, 110.5f, -102f)
                reflectiveQuadTo(600f, 560f)
                quadToRelative(79f, 0f, 147.5f, 36f)
                reflectiveQuadTo(858f, 698f)
                quadToRelative(6f, 10f, 9f, 20.5f)
                reflectiveQuadToRelative(3f, 21.5f)
                quadToRelative(0f, 11f, -3f, 21.5f)
                reflectiveQuadToRelative(-9f, 20.5f)
                quadToRelative(-42f, 66f, -110.5f, 102f)
                reflectiveQuadTo(600f, 920f)
                close()
                moveToRelative(-440f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-117f)
                quadToRelative(0f, -16f, 6f, -31f)
                reflectiveQuadToRelative(17f, -26f)
                lineToRelative(334f, -333f)
                lineToRelative(-28f, -29f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(49f, 48f)
                lineToRelative(124f, -124f)
                quadToRelative(5f, -5f, 12.5f, -8f)
                reflectiveQuadToRelative(15.5f, -3f)
                quadToRelative(8f, 0f, 15f, 3f)
                reflectiveQuadToRelative(13f, 8f)
                lineToRelative(94f, 94f)
                quadToRelative(5f, 6f, 8f, 13f)
                reflectiveQuadToRelative(3f, 15f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-8f, 12.5f)
                lineTo(704f, 406f)
                lineToRelative(28f, 29f)
                quadToRelative(11f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(732f, 492f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(675f, 492f)
                lineTo(534f, 350f)
                lineTo(200f, 683f)
                verticalLineToRelative(77f)
                horizontalLineToRelative(48f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(288f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(248f, 840f)
                horizontalLineToRelative(-88f)
                close()
            }
        }.build()
        
        return _Dropper_eye!!
    }

private var _Dropper_eye: ImageVector? = null

