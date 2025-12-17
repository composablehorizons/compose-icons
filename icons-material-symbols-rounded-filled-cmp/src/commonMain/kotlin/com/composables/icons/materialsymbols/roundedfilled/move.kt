package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Move: ImageVector
    get() {
        if (_Move != null) return _Move!!
        
        _Move = ImageVector.Builder(
            name = "move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 680f)
                quadToRelative(-7f, 0f, -12f, -4f)
                reflectiveQuadToRelative(-7f, -10f)
                quadToRelative(-14f, -42f, -34f, -70f)
                reflectiveQuadToRelative(-40f, -54f)
                quadToRelative(-20f, -26f, -33.5f, -54f)
                reflectiveQuadTo(300f, 420f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 40f, -13.5f, 68f)
                reflectiveQuadTo(533f, 542f)
                quadToRelative(-20f, 26f, -40f, 54f)
                reflectiveQuadToRelative(-34f, 70f)
                quadToRelative(-2f, 6f, -7f, 10f)
                reflectiveQuadToRelative(-12f, 4f)
                close()
                moveToRelative(0f, -210f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(490f, 420f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(440f, 370f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(390f, 420f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(440f, 470f)
                close()
                moveToRelative(0f, 370f)
                quadToRelative(-150f, 0f, -255f, -105f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(8f)
                lineToRelative(25f, -25f)
                quadToRelative(11f, -12f, 27.5f, -12f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(881f, 519f)
                lineToRelative(-93f, 93f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-94f, -94f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(12.5f, -28f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(25f, 25f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(1f, 116f, 82.5f, 198f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(47f, 0f, 88.5f, -14f)
                reflectiveQuadToRelative(76.5f, -40f)
                quadToRelative(14f, -10f, 30.5f, -10f)
                reflectiveQuadToRelative(27.5f, 11f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-14f, 28f)
                quadToRelative(-46f, 36f, -102f, 56f)
                reflectiveQuadToRelative(-119f, 20f)
                close()
            }
        }.build()
        
        return _Move!!
    }

private var _Move: ImageVector? = null

