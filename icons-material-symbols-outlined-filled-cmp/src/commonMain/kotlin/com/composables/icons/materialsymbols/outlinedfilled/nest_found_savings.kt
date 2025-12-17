package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_found_savings: ImageVector
    get() {
        if (_Nest_found_savings != null) return _Nest_found_savings!!
        
        _Nest_found_savings = ImageVector.Builder(
            name = "nest_found_savings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 920f)
                lineTo(360f, 800f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 720f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(600f)
                lineTo(480f, 920f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(86f, 0f, 143f, -60f)
                reflectiveQuadToRelative(57f, -140f)
                verticalLineToRelative(-200f)
                horizontalLineTo(480f)
                quadToRelative(-81f, 0f, -140.5f, 57f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(0f, 30f, 8.5f, 57f)
                reflectiveQuadToRelative(23.5f, 50f)
                lineToRelative(-16f, 16f)
                quadToRelative(-12f, 12f, -12f, 28f)
                reflectiveQuadToRelative(12f, 28f)
                quadToRelative(12f, 12f, 27.5f, 11.5f)
                reflectiveQuadTo(352f, 619f)
                lineToRelative(15f, -14f)
                quadToRelative(24f, 17f, 52.5f, 26f)
                reflectiveQuadToRelative(60.5f, 9f)
                close()
                moveToRelative(50f, -255f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(530f, 442f)
                lineToRelative(-75f, 75f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(398f, 517f)
                quadToRelative(-11f, -12f, -11f, -28.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                lineToRelative(76f, -76f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                close()
            }
        }.build()
        
        return _Nest_found_savings!!
    }

private var _Nest_found_savings: ImageVector? = null

