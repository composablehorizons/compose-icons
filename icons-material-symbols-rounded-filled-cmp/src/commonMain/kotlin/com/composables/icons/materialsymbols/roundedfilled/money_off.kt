package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Money_off: ImageVector
    get() {
        if (_Money_off != null) return _Money_off!!
        
        _Money_off = ImageVector.Builder(
            name = "money_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 204f)
                verticalLineToRelative(-44f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(42f)
                quadToRelative(30f, 6f, 56.5f, 21.5f)
                reflectiveQuadTo(623f, 262f)
                quadToRelative(11f, 14f, 9.5f, 30.5f)
                reflectiveQuadTo(617f, 320f)
                quadToRelative(-14f, 11f, -30.5f, 9.5f)
                reflectiveQuadTo(559f, 314f)
                quadToRelative(-14f, -17f, -34f, -26.5f)
                reflectiveQuadToRelative(-43f, -9.5f)
                quadToRelative(-11f, 0f, -21.5f, 3f)
                reflectiveQuadToRelative(-20.5f, 8f)
                quadToRelative(-16f, 7f, -31.5f, 1f)
                reflectiveQuadTo(386f, 268f)
                quadToRelative(-7f, -16f, -1f, -31.5f)
                reflectiveQuadToRelative(22f, -22.5f)
                quadToRelative(8f, -4f, 16.5f, -6f)
                reflectiveQuadToRelative(16.5f, -4f)
                close()
                moveTo(764f, 876f)
                lineTo(608f, 720f)
                quadToRelative(-15f, 15f, -41f, 24.5f)
                reflectiveQuadTo(520f, 756f)
                verticalLineToRelative(44f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-46f)
                quadToRelative(-44f, -11f, -77f, -36.5f)
                reflectiveQuadTo(310f, 654f)
                quadToRelative(-8f, -16f, -3f, -33f)
                reflectiveQuadToRelative(21f, -25f)
                quadToRelative(17f, -8f, 33.5f, -2f)
                reflectiveQuadToRelative(25.5f, 22f)
                quadToRelative(15f, 28f, 40.5f, 46f)
                reflectiveQuadToRelative(60.5f, 18f)
                quadToRelative(18f, 0f, 33f, -4.5f)
                reflectiveQuadToRelative(29f, -13.5f)
                lineTo(84f, 196f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Money_off!!
    }

private var _Money_off: ImageVector? = null

