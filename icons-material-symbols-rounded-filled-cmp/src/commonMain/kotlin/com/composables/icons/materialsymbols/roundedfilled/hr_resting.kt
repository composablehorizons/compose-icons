package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hr_resting: ImageVector
    get() {
        if (_Hr_resting != null) return _Hr_resting!!
        
        _Hr_resting = ImageVector.Builder(
            name = "hr_resting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 760f)
                horizontalLineToRelative(640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(57f, -384f)
                quadToRelative(-29f, -27f, -42.5f, -64f)
                reflectiveQuadTo(161f, 316f)
                quadToRelative(0f, -81f, 55.5f, -138.5f)
                reflectiveQuadTo(352f, 120f)
                quadToRelative(36f, 0f, 69f, 13f)
                reflectiveQuadToRelative(59f, 38f)
                quadToRelative(26f, -25f, 59f, -38f)
                reflectiveQuadToRelative(69f, -13f)
                quadToRelative(81f, 0f, 136.5f, 58f)
                reflectiveQuadTo(800f, 317f)
                quadToRelative(0f, 39f, -14.5f, 74.5f)
                reflectiveQuadTo(744f, 455f)
                lineTo(535f, 658f)
                quadToRelative(-11f, 11f, -25f, 16.5f)
                reflectiveQuadToRelative(-30f, 5.5f)
                quadToRelative(-16f, 0f, -30f, -5.5f)
                reflectiveQuadTo(425f, 658f)
                lineTo(217f, 456f)
                close()
            }
        }.build()
        
        return _Hr_resting!!
    }

private var _Hr_resting: ImageVector? = null

