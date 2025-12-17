package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shield_question: ImageVector
    get() {
        if (_Shield_question != null) return _Shield_question!!
        
        _Shield_question = ImageVector.Builder(
            name = "shield_question",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -84f)
                quadToRelative(104f, -33f, 172f, -132f)
                reflectiveQuadToRelative(68f, -220f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                close()
                moveToRelative(0f, -316f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(522f, 638f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(480f, 596f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(438f, 638f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(1f, -124f)
                quadToRelative(12f, 0f, 21.5f, -9f)
                reflectiveQuadToRelative(9.5f, -21f)
                quadToRelative(1f, -7f, 3f, -13.5f)
                reflectiveQuadToRelative(6f, -12.5f)
                quadToRelative(7f, -10f, 15.5f, -18f)
                reflectiveQuadToRelative(16.5f, -16f)
                quadToRelative(17f, -17f, 29.5f, -38f)
                reflectiveQuadToRelative(12.5f, -46f)
                quadToRelative(0f, -45f, -34.5f, -73.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-32f, 0f, -59f, 15f)
                reflectiveQuadToRelative(-43f, 42f)
                quadToRelative(-6f, 11f, -1.5f, 22f)
                reflectiveQuadToRelative(16.5f, 16f)
                quadToRelative(11f, 5f, 22f, -0.5f)
                reflectiveQuadToRelative(19f, -14.5f)
                quadToRelative(9f, -11f, 20.5f, -16.5f)
                reflectiveQuadTo(480f, 338f)
                quadToRelative(22f, 0f, 38.5f, 13f)
                reflectiveQuadToRelative(16.5f, 33f)
                quadToRelative(0f, 17f, -10.5f, 31.5f)
                reflectiveQuadTo(501f, 442f)
                quadToRelative(-11f, 11f, -22f, 21.5f)
                reflectiveQuadTo(460f, 487f)
                quadToRelative(-5f, 8f, -7f, 18f)
                reflectiveQuadToRelative(-2f, 20f)
                quadToRelative(0f, 13f, 8.5f, 22f)
                reflectiveQuadToRelative(21.5f, 9f)
                close()
            }
        }.build()
        
        return _Shield_question!!
    }

private var _Shield_question: ImageVector? = null

