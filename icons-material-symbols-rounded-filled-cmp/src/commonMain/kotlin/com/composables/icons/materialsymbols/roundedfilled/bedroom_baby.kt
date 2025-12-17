package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Bedroom_baby: ImageVector
    get() {
        if (_Bedroom_baby != null) return _Bedroom_baby!!
        
        _Bedroom_baby = ImageVector.Builder(
            name = "bedroom_baby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(70f, 0f, 135.5f, -24f)
                reflectiveQuadTo(735f, 627f)
                quadToRelative(11f, -9f, 12f, -22f)
                reflectiveQuadToRelative(-8f, -22f)
                quadToRelative(-9f, -9f, -21.5f, -8.5f)
                reflectiveQuadTo(695f, 583f)
                quadToRelative(-5f, 5f, -10.5f, 8f)
                reflectiveQuadToRelative(-10.5f, 7f)
                lineToRelative(-34f, -58f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(20f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineTo(456f)
                lineToRelative(-58f, -100f)
                quadToRelative(-5f, -9f, -14.5f, -14.5f)
                reflectiveQuadTo(363f, 280f)
                horizontalLineToRelative(-93f)
                quadToRelative(-8f, 0f, -10f, 6.5f)
                reflectiveQuadToRelative(4f, 11.5f)
                lineToRelative(16f, 12f)
                lineToRelative(-44f, 51f)
                quadToRelative(-7f, 8f, -7f, 18.5f)
                reflectiveQuadToRelative(8f, 18.5f)
                lineToRelative(6f, 6f)
                quadToRelative(7f, 7f, 16.5f, 8f)
                reflectiveQuadToRelative(17.5f, -4f)
                lineToRelative(43f, -28f)
                verticalLineToRelative(160f)
                lineToRelative(-34f, 58f)
                lineToRelative(-12f, -8f)
                quadToRelative(-6f, -4f, -11f, -9f)
                quadToRelative(-9f, -8f, -21.5f, -7f)
                reflectiveQuadToRelative(-20.5f, 9f)
                quadToRelative(-9f, 9f, -8.5f, 21.5f)
                reflectiveQuadTo(223f, 625f)
                quadToRelative(54f, 46f, 120f, 70.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(-38f, 0f, -73.5f, -7.5f)
                reflectiveQuadTo(338f, 628f)
                lineToRelative(34f, -58f)
                quadToRelative(26f, 10f, 53.5f, 14.5f)
                reflectiveQuadTo(480f, 589f)
                quadToRelative(28f, 0f, 55f, -4.5f)
                reflectiveQuadToRelative(53f, -14.5f)
                lineToRelative(34f, 58f)
                quadToRelative(-33f, 15f, -68.5f, 23.5f)
                reflectiveQuadTo(480f, 660f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Bedroom_baby!!
    }

private var _Bedroom_baby: ImageVector? = null

