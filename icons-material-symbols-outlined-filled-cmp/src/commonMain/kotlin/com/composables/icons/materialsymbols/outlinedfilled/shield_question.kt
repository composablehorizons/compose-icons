package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Shield_question: ImageVector
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
                moveToRelative(0f, -200f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(522f, 638f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(480f, 596f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(438f, 638f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-29f, -128f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -11f, 5f, -21f)
                quadToRelative(6f, -14f, 16f, -23.5f)
                reflectiveQuadToRelative(21f, -19.5f)
                quadToRelative(17f, -17f, 29.5f, -38f)
                reflectiveQuadToRelative(12.5f, -46f)
                quadToRelative(0f, -45f, -34.5f, -73.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-40f, 0f, -71.5f, 23f)
                reflectiveQuadTo(366f, 364f)
                lineToRelative(54f, 22f)
                quadToRelative(6f, -20f, 22.5f, -34f)
                reflectiveQuadToRelative(37.5f, -14f)
                quadToRelative(22f, 0f, 38.5f, 13f)
                reflectiveQuadToRelative(16.5f, 33f)
                quadToRelative(0f, 17f, -10.5f, 31.5f)
                reflectiveQuadTo(501f, 442f)
                quadToRelative(-12f, 11f, -24f, 22.5f)
                reflectiveQuadTo(458f, 491f)
                quadToRelative(-7f, 14f, -7f, 29.5f)
                verticalLineToRelative(31.5f)
                close()
            }
        }.build()
        
        return _Shield_question!!
    }

private var _Shield_question: ImageVector? = null

