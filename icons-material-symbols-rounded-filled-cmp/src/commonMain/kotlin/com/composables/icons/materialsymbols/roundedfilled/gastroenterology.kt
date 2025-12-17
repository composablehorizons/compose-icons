package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Gastroenterology: ImageVector
    get() {
        if (_Gastroenterology != null) return _Gastroenterology!!
        
        _Gastroenterology = ImageVector.Builder(
            name = "gastroenterology",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 280f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 120f)
                verticalLineToRelative(40f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(840f, 440f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(560f, 760f)
                horizontalLineTo(400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 800f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Gastroenterology!!
    }

private var _Gastroenterology: ImageVector? = null

