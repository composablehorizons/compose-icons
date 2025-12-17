package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Feature_search: ImageVector
    get() {
        if (_Feature_search != null) return _Feature_search!!
        
        _Feature_search = ImageVector.Builder(
            name = "feature_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 440f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(440f, 260f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(620f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(800f, 260f)
                quadToRelative(0f, 27f, -8f, 51f)
                reflectiveQuadToRelative(-20f, 45f)
                lineToRelative(100f, 100f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(716f, 412f)
                quadToRelative(-21f, 12f, -45f, 20f)
                reflectiveQuadToRelative(-51f, 8f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(172f)
                quadToRelative(17f, 0f, 28f, 14.5f)
                reflectiveQuadToRelative(6f, 31.5f)
                quadToRelative(-3f, 14f, -4f, 29f)
                reflectiveQuadToRelative(-1f, 29f)
                quadToRelative(0f, 109f, 77f, 182f)
                reflectiveQuadToRelative(183f, 73f)
                quadToRelative(19f, 0f, 38f, -2.5f)
                reflectiveQuadToRelative(39f, -8.5f)
                lineToRelative(79f, 79f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(157f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Feature_search!!
    }

private var _Feature_search: ImageVector? = null

