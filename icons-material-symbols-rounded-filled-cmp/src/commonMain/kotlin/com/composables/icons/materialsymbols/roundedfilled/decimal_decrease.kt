package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Decimal_decrease: ImageVector
    get() {
        if (_Decimal_decrease != null) return _Decimal_decrease!!
        
        _Decimal_decrease = ImageVector.Builder(
            name = "decimal_decrease",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(621f, 760f)
                lineToRelative(35f, 35f)
                quadToRelative(11f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(656f, 852f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(599f, 852f)
                lineTo(496f, 748f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(103f, -104f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(656f, 645f)
                lineToRelative(-35f, 35f)
                horizontalLineToRelative(206f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(867f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(827f, 760f)
                horizontalLineTo(621f)
                close()
                moveTo(160f, 520f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 400f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(160f, 520f)
                close()
                moveToRelative(220f, 0f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(440f, 380f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(320f, 220f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(380f, 440f)
                close()
            }
        }.build()
        
        return _Decimal_decrease!!
    }

private var _Decimal_decrease: ImageVector? = null

