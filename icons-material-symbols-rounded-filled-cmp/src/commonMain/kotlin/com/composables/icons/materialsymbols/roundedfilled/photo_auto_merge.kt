package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Photo_auto_merge: ImageVector
    get() {
        if (_Photo_auto_merge != null) return _Photo_auto_merge!!
        
        _Photo_auto_merge = ImageVector.Builder(
            name = "photo_auto_merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(764f, 216f)
                lineToRelative(-11f, 31f)
                quadToRelative(-2f, 6f, -7f, 9.5f)
                reflectiveQuadToRelative(-11f, 3.5f)
                quadToRelative(-11f, 0f, -17f, -8f)
                reflectiveQuadToRelative(-2f, -18f)
                lineToRelative(57f, -160f)
                quadToRelative(2f, -6f, 7.5f, -10f)
                reflectiveQuadToRelative(12.5f, -4f)
                horizontalLineToRelative(14f)
                quadToRelative(7f, 0f, 12.5f, 4f)
                reflectiveQuadToRelative(7.5f, 10f)
                lineToRelative(57f, 159f)
                quadToRelative(4f, 10f, -1.5f, 18.5f)
                reflectiveQuadTo(866f, 260f)
                quadToRelative(-7f, 0f, -12.5f, -4f)
                reflectiveQuadToRelative(-7.5f, -10f)
                lineToRelative(-10f, -30f)
                horizontalLineToRelative(-72f)
                close()
                moveTo(224f, 879f)
                quadToRelative(-33f, 4f, -59f, -16f)
                reflectiveQuadToRelative(-30f, -53f)
                lineTo(80f, 373f)
                quadToRelative(-5f, -32f, 15.5f, -58f)
                reflectiveQuadToRelative(54.5f, -31f)
                lineToRelative(50f, -6f)
                verticalLineToRelative(362f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(320f, 760f)
                horizontalLineToRelative(410f)
                quadToRelative(0f, 27f, -21f, 44f)
                reflectiveQuadToRelative(-48f, 21f)
                lineTo(224f, 879f)
                close()
                moveToRelative(136f, -199f)
                quadToRelative(-34f, 0f, -57f, -23f)
                reflectiveQuadToRelative(-23f, -57f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                horizontalLineToRelative(193f)
                quadToRelative(16f, 0f, 25.5f, 12.5f)
                reflectiveQuadTo(584f, 121f)
                quadToRelative(-5f, 25f, -4.5f, 50.5f)
                reflectiveQuadTo(588f, 220f)
                horizontalLineToRelative(-8f)
                quadToRelative(-46f, 0f, -78f, 32.5f)
                reflectiveQuadTo(470f, 330f)
                quadToRelative(0f, 46f, 32f, 78f)
                reflectiveQuadToRelative(78f, 32f)
                quadToRelative(40f, 0f, 70f, -25f)
                reflectiveQuadToRelative(38f, -65f)
                quadToRelative(35f, 21f, 75.5f, 28f)
                reflectiveQuadToRelative(80.5f, -2f)
                quadToRelative(14f, -3f, 25f, 4.5f)
                reflectiveQuadToRelative(11f, 21.5f)
                verticalLineToRelative(198f)
                quadToRelative(0f, 34f, -23.5f, 57f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-32f)
                quadToRelative(-45f, -42f, -102f, -65f)
                reflectiveQuadToRelative(-118f, -23f)
                quadToRelative(-62f, 0f, -118.5f, 23f)
                reflectiveQuadTo(360f, 568f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(414f, -414f)
                horizontalLineToRelative(52f)
                lineToRelative(-26f, -82f)
                lineToRelative(-26f, 82f)
                close()
            }
        }.build()
        
        return _Photo_auto_merge!!
    }

private var _Photo_auto_merge: ImageVector? = null

