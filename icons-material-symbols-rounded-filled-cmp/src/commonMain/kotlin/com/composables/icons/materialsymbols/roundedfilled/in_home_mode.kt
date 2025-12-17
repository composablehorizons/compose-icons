package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.In_home_mode: ImageVector
    get() {
        if (_In_home_mode != null) return _In_home_mode!!
        
        _In_home_mode = ImageVector.Builder(
            name = "in_home_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(597f, 766f)
                lineToRelative(198f, -198f)
                quadToRelative(12f, -12f, 28.5f, -11.5f)
                reflectiveQuadTo(852f, 569f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(625f, 851f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(456f, 738f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(85f, 84f)
                close()
                moveToRelative(-357f, 34f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-295f)
                lineToRelative(-40f, 31f)
                quadToRelative(-13f, 10f, -29.5f, 8f)
                reflectiveQuadTo(64f, 448f)
                quadToRelative(-10f, -13f, -7.5f, -29f)
                reflectiveQuadTo(72f, 393f)
                lineToRelative(359f, -276f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(359f, 275f)
                quadToRelative(13f, 10f, 15.5f, 26f)
                reflectiveQuadToRelative(-8.5f, 30f)
                quadToRelative(-10f, 13f, -25.5f, 15.5f)
                reflectiveQuadTo(840f, 456f)
                lineToRelative(-27f, -20f)
                lineToRelative(-216f, 217f)
                lineToRelative(-27f, -27f)
                quadToRelative(-35f, -36f, -86f, -36f)
                reflectiveQuadToRelative(-86f, 36f)
                quadToRelative(-35f, 35f, -34f, 87f)
                reflectiveQuadToRelative(36f, 87f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _In_home_mode!!
    }

private var _In_home_mode: ImageVector? = null

