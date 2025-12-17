package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Cannabis: ImageVector
    get() {
        if (_Cannabis != null) return _Cannabis!!
        
        _Cannabis = ImageVector.Builder(
            name = "cannabis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 713f)
                quadToRelative(-42f, 27f, -86.5f, 47f)
                reflectiveQuadTo(260f, 780f)
                quadToRelative(-53f, 0f, -100.5f, -20.5f)
                reflectiveQuadTo(70f, 706f)
                quadToRelative(-13f, -10f, -13f, -26f)
                reflectiveQuadToRelative(13f, -26f)
                quadToRelative(31f, -25f, 66.5f, -43f)
                reflectiveQuadToRelative(74.5f, -26f)
                quadToRelative(-60f, -48f, -91f, -116f)
                reflectiveQuadTo(81f, 325f)
                quadToRelative(-2f, -18f, 11f, -31f)
                reflectiveQuadToRelative(32f, -11f)
                quadToRelative(60f, 6f, 115f, 27.5f)
                reflectiveQuadTo(340f, 368f)
                verticalLineToRelative(-8f)
                quadToRelative(0f, -79f, 31.5f, -150f)
                reflectiveQuadTo(451f, 76f)
                quadToRelative(11f, -14f, 29f, -14f)
                reflectiveQuadToRelative(29f, 14f)
                quadToRelative(48f, 63f, 79.5f, 134f)
                reflectiveQuadTo(620f, 360f)
                quadToRelative(0f, 2f, -0.5f, 4f)
                reflectiveQuadToRelative(-0.5f, 4f)
                quadToRelative(47f, -36f, 102f, -57f)
                reflectiveQuadToRelative(115f, -28f)
                quadToRelative(18f, -2f, 31.5f, 10.5f)
                reflectiveQuadTo(879f, 325f)
                quadToRelative(-7f, 76f, -39f, 144f)
                reflectiveQuadToRelative(-92f, 116f)
                quadToRelative(39f, 8f, 74f, 26f)
                reflectiveQuadToRelative(67f, 43f)
                quadToRelative(13f, 10f, 13f, 26f)
                reflectiveQuadToRelative(-13f, 26f)
                quadToRelative(-42f, 33f, -89f, 53.5f)
                reflectiveQuadTo(700f, 780f)
                quadToRelative(-50f, 0f, -94.5f, -20f)
                reflectiveQuadTo(520f, 713f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-127f)
                close()
            }
        }.build()
        
        return _Cannabis!!
    }

private var _Cannabis: ImageVector? = null

