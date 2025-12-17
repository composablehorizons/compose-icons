package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Voice_over_off: ImageVector
    get() {
        if (_Voice_over_off != null) return _Voice_over_off!!
        
        _Voice_over_off = ImageVector.Builder(
            name = "voice_over_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(514f, 404f)
                lineTo(320f, 208f)
                quadToRelative(9f, -3f, 19f, -5.5f)
                reflectiveQuadToRelative(21f, -2.5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 11f, -1.5f, 22f)
                reflectiveQuadToRelative(-4.5f, 22f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(26f, 0f, 49.5f, 2.5f)
                reflectiveQuadTo(456f, 568f)
                lineToRelative(-56f, -54f)
                quadToRelative(-9f, 3f, -19f, 4.5f)
                reflectiveQuadToRelative(-21f, 1.5f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -11f, 1.5f, -21f)
                reflectiveQuadToRelative(4.5f, -19f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(730f, 740f)
                lineToRelative(-54f, 58f)
                lineToRelative(-108f, -110f)
                verticalLineToRelative(40f)
                horizontalLineTo(40f)
                close()
                moveToRelative(758f, -202f)
                lineToRelative(-62f, -62f)
                quadToRelative(44f, -41f, 69f, -97f)
                reflectiveQuadToRelative(25f, -119f)
                quadToRelative(0f, -63f, -25f, -118f)
                reflectiveQuadToRelative(-69f, -96f)
                lineToRelative(62f, -64f)
                quadToRelative(56f, 53f, 89f, 125f)
                reflectiveQuadToRelative(33f, 153f)
                quadToRelative(0f, 81f, -33f, 153f)
                reflectiveQuadToRelative(-89f, 125f)
                close()
                moveTo(670f, 510f)
                lineToRelative(-64f, -64f)
                quadToRelative(18f, -17f, 29f, -38.5f)
                reflectiveQuadToRelative(11f, -47.5f)
                quadToRelative(0f, -26f, -11f, -47.5f)
                reflectiveQuadTo(606f, 274f)
                lineToRelative(64f, -64f)
                quadToRelative(32f, 29f, 50f, 67.5f)
                reflectiveQuadToRelative(18f, 82.5f)
                quadToRelative(0f, 44f, -18f, 82.5f)
                reflectiveQuadTo(670f, 510f)
                close()
            }
        }.build()
        
        return _Voice_over_off!!
    }

private var _Voice_over_off: ImageVector? = null

