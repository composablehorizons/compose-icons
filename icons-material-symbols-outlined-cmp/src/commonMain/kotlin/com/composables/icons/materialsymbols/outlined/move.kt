package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Move: ImageVector
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
                moveToRelative(0f, -112f)
                quadToRelative(9f, -14f, 18f, -26f)
                reflectiveQuadToRelative(17f, -23f)
                quadToRelative(23f, -30f, 34f, -50f)
                reflectiveQuadToRelative(11f, -49f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(440f, 340f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 420f)
                quadToRelative(0f, 29f, 11f, 49f)
                reflectiveQuadToRelative(34f, 50f)
                quadToRelative(8f, 11f, 17f, 23f)
                reflectiveQuadToRelative(18f, 26f)
                close()
                moveToRelative(0f, -98f)
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
                lineToRelative(53f, -54f)
                lineToRelative(57f, 56f)
                lineToRelative(-150f, 150f)
                lineToRelative(-150f, -150f)
                lineToRelative(57f, -56f)
                lineToRelative(53f, 53f)
                verticalLineToRelative(-7f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(1f, 116f, 82.5f, 198f)
                reflectiveQuadTo(440f, 760f)
                quadToRelative(57f, 0f, 107f, -21.5f)
                reflectiveQuadToRelative(88f, -58.5f)
                lineToRelative(57f, 57f)
                quadToRelative(-49f, 48f, -113.5f, 75.5f)
                reflectiveQuadTo(440f, 840f)
                close()
                moveToRelative(0f, -420f)
                close()
            }
        }.build()
        
        return _Move!!
    }

private var _Move: ImageVector? = null

