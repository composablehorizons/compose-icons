package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Database_off: ImageVector
    get() {
        if (_Database_off != null) return _Database_off!!
        
        _Database_off = ImageVector.Builder(
            name = "database_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-41f, 0f, -102.5f, -8.5f)
                reflectiveQuadTo(259f, 804f)
                quadToRelative(-57f, -19f, -98f, -49.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 44f, 41f, 74.5f)
                reflectiveQuadToRelative(98f, 49.5f)
                quadToRelative(57f, 19f, 118.5f, 27.5f)
                reflectiveQuadTo(480f, 740f)
                quadToRelative(42f, 0f, 103.5f, -8.5f)
                reflectiveQuadTo(703f, 703f)
                lineToRelative(70f, 70f)
                quadToRelative(-62f, 36f, -150f, 51.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(351f, -122f)
                lineToRelative(-50f, -50f)
                quadToRelative(27f, -17f, 43f, -39f)
                reflectiveQuadToRelative(16f, -49f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 11f, -2f, 20f)
                reflectiveQuadToRelative(-7f, 18f)
                close()
                moveToRelative(-351f, -78f)
                quadToRelative(-41f, 0f, -102.5f, -8.5f)
                reflectiveQuadTo(259f, 604f)
                quadToRelative(-57f, -19f, -98f, -49.5f)
                reflectiveQuadTo(120f, 480f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 44f, 41f, 74.5f)
                reflectiveQuadToRelative(98f, 49.5f)
                quadToRelative(57f, 19f, 118.5f, 27.5f)
                reflectiveQuadTo(480f, 540f)
                quadToRelative(12f, 0f, 26.5f, -0.5f)
                reflectiveQuadTo(537f, 537f)
                lineToRelative(87f, 87f)
                quadToRelative(-41f, 8f, -78.5f, 12f)
                reflectiveQuadToRelative(-65.5f, 4f)
                close()
                moveToRelative(233f, -40f)
                lineToRelative(-78f, -78f)
                quadToRelative(77f, -17f, 141f, -51f)
                reflectiveQuadToRelative(64f, -91f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 42f, -36.5f, 71.5f)
                reflectiveQuadTo(713f, 600f)
                close()
                moveTo(439f, 439f)
                quadToRelative(-136f, -7f, -227.5f, -52f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -26f, 17.5f, -49.5f)
                reflectiveQuadTo(187f, 187f)
                lineToRelative(252f, 252f)
                close()
                moveToRelative(111f, -2f)
                lineTo(265f, 152f)
                quadToRelative(45f, -15f, 99.5f, -23.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(150f, 0f, 255f, 47f)
                reflectiveQuadToRelative(105f, 113f)
                quadToRelative(0f, 58f, -82.5f, 102f)
                reflectiveQuadTo(550f, 437f)
                close()
                moveTo(791f, 904f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Database_off!!
    }

private var _Database_off: ImageVector? = null

