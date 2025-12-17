package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Sports: ImageVector
    get() {
        if (_Sports != null) return _Sports!!
        
        _Sports = ImageVector.Builder(
            name = "sports",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -11f, 1f, -22f)
                reflectiveQuadToRelative(3f, -22f)
                quadToRelative(-5f, 2f, -12f, 3f)
                reflectiveQuadToRelative(-12f, 1f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 27.5f, -71f)
                reflectiveQuadToRelative(69.5f, -29f)
                quadToRelative(33f, 0f, 59.5f, 18.5f)
                reflectiveQuadTo(274f, 346f)
                quadToRelative(33f, -30f, 75.5f, -48f)
                reflectiveQuadToRelative(90.5f, -18f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 320f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(680f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveTo(180f, 420f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(220f, 380f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(180f, 340f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(140f, 380f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(180f, 420f)
                close()
                moveToRelative(260f, 180f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 600f)
                close()
            }
        }.build()
        
        return _Sports!!
    }

private var _Sports: ImageVector? = null

