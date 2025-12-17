package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Strategy: ImageVector
    get() {
        if (_Strategy != null) return _Strategy!!
        
        _Strategy = ImageVector.Builder(
            name = "strategy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 429f)
                lineToRelative(-100f, -57f)
                quadToRelative(-9f, -5f, -14.5f, -14.5f)
                reflectiveQuadTo(80f, 337f)
                verticalLineToRelative(-114f)
                quadToRelative(0f, -11f, 5.5f, -20.5f)
                reflectiveQuadTo(100f, 188f)
                lineToRelative(100f, -57f)
                quadToRelative(9f, -5f, 20f, -5f)
                reflectiveQuadToRelative(20f, 5f)
                lineToRelative(100f, 57f)
                quadToRelative(9f, 5f, 14.5f, 14.5f)
                reflectiveQuadTo(360f, 223f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 11f, -5.5f, 20.5f)
                reflectiveQuadTo(340f, 372f)
                lineToRelative(-100f, 57f)
                quadToRelative(-9f, 5f, -20f, 5f)
                reflectiveQuadToRelative(-20f, -5f)
                close()
                moveToRelative(460f, 91f)
                verticalLineToRelative(-142f)
                lineToRelative(100f, 59f)
                quadToRelative(19f, 11f, 29.5f, 29f)
                reflectiveQuadToRelative(10.5f, 40f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 22f, -10.5f, 40f)
                reflectiveQuadTo(760f, 763f)
                lineToRelative(-160f, 93f)
                quadToRelative(-19f, 11f, -40f, 11f)
                reflectiveQuadToRelative(-40f, -11f)
                lineToRelative(-160f, -93f)
                quadToRelative(-19f, -11f, -29.5f, -29f)
                reflectiveQuadTo(320f, 694f)
                verticalLineToRelative(-188f)
                quadToRelative(0f, -22f, 10.5f, -40f)
                reflectiveQuadToRelative(29.5f, -29f)
                lineToRelative(100f, -59f)
                verticalLineToRelative(142f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                close()
                moveToRelative(-60f, -200f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 520f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 80f)
                horizontalLineToRelative(245f)
                quadToRelative(24f, 0f, 36f, 21f)
                reflectiveQuadToRelative(-2f, 41f)
                lineToRelative(-24f, 36f)
                quadToRelative(-7f, 10f, -7f, 22f)
                reflectiveQuadToRelative(7f, 22f)
                lineToRelative(24f, 36f)
                quadToRelative(14f, 20f, 2f, 41f)
                reflectiveQuadToRelative(-36f, 21f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Strategy!!
    }

private var _Strategy: ImageVector? = null

