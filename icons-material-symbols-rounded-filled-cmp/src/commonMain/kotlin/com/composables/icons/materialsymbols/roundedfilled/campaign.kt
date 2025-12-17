package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Campaign: ImageVector
    get() {
        if (_Campaign != null) return _Campaign!!
        
        _Campaign = ImageVector.Builder(
            name = "campaign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 520f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 440f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                close()
                moveTo(664f, 672f)
                quadToRelative(10f, -14f, 26f, -16f)
                reflectiveQuadToRelative(30f, 8f)
                lineToRelative(64f, 48f)
                quadToRelative(14f, 10f, 16f, 26f)
                reflectiveQuadToRelative(-8f, 30f)
                quadToRelative(-10f, 14f, -26f, 16f)
                reflectiveQuadToRelative(-30f, -8f)
                lineToRelative(-64f, -48f)
                quadToRelative(-14f, -10f, -16f, -26f)
                reflectiveQuadToRelative(8f, -30f)
                close()
                moveToRelative(120f, -424f)
                lineToRelative(-64f, 48f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(16f, -26f)
                lineToRelative(64f, -48f)
                quadToRelative(14f, -10f, 30f, -8f)
                reflectiveQuadToRelative(26f, 16f)
                quadToRelative(10f, 14f, 8f, 30f)
                reflectiveQuadToRelative(-16f, 26f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 520f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(160f)
                lineToRelative(139f, -84f)
                quadToRelative(20f, -12f, 40.5f, 0f)
                reflectiveQuadToRelative(20.5f, 35f)
                verticalLineToRelative(338f)
                quadToRelative(0f, 23f, -20.5f, 35f)
                reflectiveQuadToRelative(-40.5f, 0f)
                lineToRelative(-139f, -84f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 720f)
                verticalLineToRelative(-120f)
                close()
                moveToRelative(360f, 14f)
                verticalLineToRelative(-268f)
                quadToRelative(27f, 24f, 43.5f, 58.5f)
                reflectiveQuadTo(620f, 480f)
                quadToRelative(0f, 41f, -16.5f, 75.5f)
                reflectiveQuadTo(560f, 614f)
                close()
            }
        }.build()
        
        return _Campaign!!
    }

private var _Campaign: ImageVector? = null

