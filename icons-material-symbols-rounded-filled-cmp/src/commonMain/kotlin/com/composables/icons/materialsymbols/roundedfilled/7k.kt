package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`7k`: ImageVector
    get() {
        if (_7k != null) return _7k!!
        
        _7k = ImageVector.Builder(
            name = "7k",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 510f)
                lineToRelative(62f, 79f)
                quadToRelative(2f, 3f, 22f, 11f)
                quadToRelative(17f, 0f, 25f, -15.5f)
                reflectiveQuadToRelative(-3f, -29.5f)
                lineToRelative(-56f, -75f)
                lineToRelative(57f, -76f)
                quadToRelative(11f, -14f, 3f, -29f)
                reflectiveQuadToRelative(-26f, -15f)
                quadToRelative(-7f, 0f, -12.5f, 3f)
                reflectiveQuadToRelative(-9.5f, 8f)
                lineToRelative(-62f, 79f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(550f, 360f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(520f, 390f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(550f, 600f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(580f, 570f)
                verticalLineToRelative(-60f)
                close()
                moveToRelative(-214f, -90f)
                lineToRelative(-43f, 137f)
                quadToRelative(-5f, 16f, 5f, 29.5f)
                reflectiveQuadToRelative(27f, 13.5f)
                quadToRelative(11f, 0f, 20f, -6.5f)
                reflectiveQuadToRelative(12f, -17.5f)
                lineToRelative(51f, -164f)
                quadToRelative(6f, -20f, -6f, -36f)
                reflectiveQuadToRelative(-32f, -16f)
                horizontalLineTo(290f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(260f, 390f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(290f, 420f)
                horizontalLineToRelative(76f)
                close()
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
            }
        }.build()
        
        return _7k!!
    }

private var _7k: ImageVector? = null

