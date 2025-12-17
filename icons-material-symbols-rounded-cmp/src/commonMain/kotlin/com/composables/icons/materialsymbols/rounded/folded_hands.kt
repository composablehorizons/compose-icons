package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Folded_hands: ImageVector
    get() {
        if (_Folded_hands != null) return _Folded_hands!!
        
        _Folded_hands = ImageVector.Builder(
            name = "folded_hands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 510f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(660f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(620f, 600f)
                verticalLineToRelative(-69f)
                lineToRelative(-45f, -81f)
                quadToRelative(-7f, 5f, -11f, 13f)
                reflectiveQuadToRelative(-4f, 17f)
                verticalLineToRelative(229f)
                lineToRelative(67f, 111f)
                quadToRelative(12f, 20f, 0f, 40f)
                reflectiveQuadToRelative(-35f, 20f)
                quadToRelative(-11f, 0f, -20f, -5f)
                reflectiveQuadToRelative(-14f, -14f)
                lineToRelative(-78f, -129f)
                verticalLineToRelative(-252f)
                quadToRelative(0f, -31f, 15f, -57f)
                reflectiveQuadToRelative(41f, -43f)
                lineToRelative(-56f, -99f)
                quadToRelative(-20f, -38f, -17.5f, -80.5f)
                reflectiveQuadTo(495f, 128f)
                lineToRelative(38f, -37f)
                quadToRelative(13f, -13f, 30f, -12.5f)
                reflectiveQuadToRelative(28f, 14.5f)
                lineToRelative(231f, 271f)
                quadToRelative(8f, 10f, 13f, 21.5f)
                reflectiveQuadToRelative(6f, 24.5f)
                lineToRelative(35f, 427f)
                quadToRelative(2f, 17f, -10f, 30f)
                reflectiveQuadToRelative(-29f, 13f)
                quadToRelative(-16f, 0f, -27f, -10.5f)
                reflectiveQuadTo(797f, 843f)
                lineToRelative(-36f, -427f)
                lineToRelative(-203f, -238f)
                lineToRelative(-6f, 6f)
                quadToRelative(-10f, 10f, -11.5f, 23f)
                reflectiveQuadToRelative(4.5f, 25f)
                lineToRelative(155f, 278f)
                close()
                moveToRelative(-440f, 0f)
                lineToRelative(155f, -278f)
                quadToRelative(6f, -12f, 4.5f, -25f)
                reflectiveQuadTo(408f, 184f)
                lineToRelative(-6f, -6f)
                lineToRelative(-203f, 238f)
                lineToRelative(-36f, 428f)
                quadToRelative(-2f, 16f, -13f, 26f)
                reflectiveQuadToRelative(-27f, 10f)
                quadToRelative(-17f, 0f, -29f, -13f)
                reflectiveQuadToRelative(-10f, -30f)
                lineToRelative(35f, -427f)
                quadToRelative(1f, -13f, 6f, -24.5f)
                reflectiveQuadToRelative(13f, -21.5f)
                lineToRelative(231f, -271f)
                quadToRelative(11f, -14f, 28.5f, -14.5f)
                reflectiveQuadTo(428f, 91f)
                lineToRelative(37f, 37f)
                quadToRelative(30f, 30f, 32.5f, 72.5f)
                reflectiveQuadTo(480f, 281f)
                lineToRelative(-56f, 99f)
                quadToRelative(26f, 17f, 41f, 43f)
                reflectiveQuadToRelative(15f, 57f)
                verticalLineToRelative(252f)
                lineTo(402f, 861f)
                quadToRelative(-5f, 9f, -14.5f, 14f)
                reflectiveQuadTo(367f, 880f)
                quadToRelative(-23f, 0f, -34.5f, -20f)
                reflectiveQuadToRelative(0.5f, -40f)
                lineToRelative(67f, -111f)
                verticalLineToRelative(-229f)
                quadToRelative(0f, -9f, -4f, -17f)
                reflectiveQuadToRelative(-11f, -13f)
                lineToRelative(-45f, 81f)
                verticalLineToRelative(69f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(300f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(260f, 600f)
                verticalLineToRelative(-90f)
                close()
            }
        }.build()
        
        return _Folded_hands!!
    }

private var _Folded_hands: ImageVector? = null

