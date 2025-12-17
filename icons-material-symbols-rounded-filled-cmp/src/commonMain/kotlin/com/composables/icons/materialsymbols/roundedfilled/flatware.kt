package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flatware: ImageVector
    get() {
        if (_Flatware != null) return _Flatware!!
        
        _Flatware = ImageVector.Builder(
            name = "flatware",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 360f)
                verticalLineToRelative(-212f)
                quadToRelative(0f, -12f, 8f, -20f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(12f, 0f, 20f, 8f)
                reflectiveQuadToRelative(8f, 20f)
                verticalLineToRelative(132f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -12f, 8f, -20f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(12f, 0f, 20f, 8f)
                reflectiveQuadToRelative(8f, 20f)
                verticalLineToRelative(132f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -12f, 8f, -20f)
                reflectiveQuadToRelative(20f, -8f)
                quadToRelative(12f, 0f, 20f, 8f)
                reflectiveQuadToRelative(8f, 20f)
                verticalLineToRelative(212f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 440f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 840f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 800f)
                verticalLineToRelative(-364f)
                quadToRelative(-42f, -20f, -61f, -62.5f)
                reflectiveQuadTo(400f, 284f)
                quadToRelative(0f, -63f, 31.5f, -113.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(57f, 0f, 88.5f, 50.5f)
                reflectiveQuadTo(640f, 284f)
                quadToRelative(0f, 47f, -19f, 89.5f)
                reflectiveQuadTo(560f, 436f)
                verticalLineToRelative(364f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 840f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 800f)
                verticalLineToRelative(-633f)
                quadToRelative(0f, -17f, 11f, -28.5f)
                reflectiveQuadToRelative(28f, -11.5f)
                quadToRelative(45f, 0f, 83f, 48f)
                reflectiveQuadToRelative(38f, 105f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                close()
            }
        }.build()
        
        return _Flatware!!
    }

private var _Flatware: ImageVector? = null

