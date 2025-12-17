package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bottom_app_bar: ImageVector
    get() {
        if (_Bottom_app_bar != null) return _Bottom_app_bar!!
        
        _Bottom_app_bar = ImageVector.Builder(
            name = "bottom_app_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 560f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(-280f, -40f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                close()
            }
        }.build()
        
        return _Bottom_app_bar!!
    }

private var _Bottom_app_bar: ImageVector? = null

