package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Destruction: ImageVector
    get() {
        if (_Destruction != null) return _Destruction!!
        
        _Destruction = ImageVector.Builder(
            name = "destruction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 560f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(92f, -380f)
                quadToRelative(-16f, 0f, -30f, -3.5f)
                reflectiveQuadTo(234f, 485f)
                lineToRelative(-101f, -57f)
                quadToRelative(-9f, -5f, -12.5f, -14f)
                reflectiveQuadToRelative(-1.5f, -18f)
                quadToRelative(2f, -9f, 7.5f, -15.5f)
                reflectiveQuadTo(143f, 372f)
                lineToRelative(157f, -26f)
                lineToRelative(-42f, -154f)
                quadToRelative(-3f, -11f, 0f, -19.5f)
                reflectiveQuadToRelative(11f, -13.5f)
                quadToRelative(8f, -5f, 17f, -5f)
                reflectiveQuadToRelative(18f, 6f)
                lineToRelative(130f, 92f)
                lineToRelative(78f, -138f)
                quadToRelative(5f, -9f, 14f, -13f)
                reflectiveQuadToRelative(18f, -2f)
                quadToRelative(9f, 2f, 15.5f, 7.5f)
                reflectiveQuadTo(568f, 123f)
                lineToRelative(26f, 157f)
                lineToRelative(154f, -42f)
                quadToRelative(11f, -3f, 19.5f, 0f)
                reflectiveQuadToRelative(13.5f, 11f)
                quadToRelative(5f, 8f, 5f, 17f)
                reflectiveQuadToRelative(-6f, 18f)
                lineToRelative(-92f, 130f)
                lineToRelative(20f, 11f)
                quadToRelative(27f, 15f, 19f, 45f)
                reflectiveQuadToRelative(-39f, 30f)
                horizontalLineTo(292f)
                close()
            }
        }.build()
        
        return _Destruction!!
    }

private var _Destruction: ImageVector? = null

