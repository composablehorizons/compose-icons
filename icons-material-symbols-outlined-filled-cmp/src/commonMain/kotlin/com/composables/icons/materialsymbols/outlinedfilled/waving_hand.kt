package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Waving_hand: ImageVector
    get() {
        if (_Waving_hand != null) return _Waving_hand!!
        
        _Waving_hand = ImageVector.Builder(
            name = "waving_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(39f, 280f)
                quadToRelative(0f, -100f, 70.5f, -170.5f)
                reflectiveQuadTo(280f, 39f)
                verticalLineToRelative(81f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                horizontalLineTo(39f)
                close()
                moveToRelative(173f, 469f)
                quadToRelative(-91f, -91f, -91f, -219f)
                reflectiveQuadToRelative(91f, -219f)
                lineToRelative(70f, -71f)
                lineToRelative(12f, 12f)
                quadToRelative(29f, 29f, 29f, 70.5f)
                reflectiveQuadTo(294f, 393f)
                lineToRelative(-14f, 14f)
                quadToRelative(-12f, 12f, -12f, 28.5f)
                reflectiveQuadToRelative(12f, 28.5f)
                lineToRelative(36f, 36f)
                quadToRelative(26f, 26f, 26f, 63f)
                reflectiveQuadToRelative(-26f, 63f)
                lineToRelative(43f, 43f)
                quadToRelative(44f, -44f, 44f, -105.5f)
                reflectiveQuadTo(358f, 457f)
                lineToRelative(-22f, -22f)
                quadToRelative(26f, -26f, 37f, -58.5f)
                reflectiveQuadToRelative(9f, -66.5f)
                lineToRelative(179f, -179f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(618f, 188f)
                lineTo(431f, 375f)
                lineToRelative(42f, 42f)
                lineToRelative(241f, -240f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(530f, 474f)
                lineToRelative(42f, 42f)
                lineToRelative(212f, -212f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(841f, 361f)
                lineTo(629f, 573f)
                lineToRelative(42f, 42f)
                lineToRelative(162f, -162f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(890f, 510f)
                lineTo(650f, 749f)
                quadToRelative(-91f, 91f, -219f, 91f)
                reflectiveQuadToRelative(-219f, -91f)
                close()
                moveTo(680f, 921f)
                verticalLineToRelative(-81f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                horizontalLineToRelative(81f)
                quadToRelative(0f, 100f, -70.5f, 170.5f)
                reflectiveQuadTo(680f, 921f)
                close()
            }
        }.build()
        
        return _Waving_hand!!
    }

private var _Waving_hand: ImageVector? = null

