package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Feature_search: ImageVector
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
                moveTo(720f, 530f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(190f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(220f)
                quadToRelative(-8f, 18f, -12f, 38.5f)
                reflectiveQuadToRelative(-6f, 41.5f)
                horizontalLineTo(160f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-270f)
                close()
                moveToRelative(52f, -174f)
                lineToRelative(128f, 128f)
                lineToRelative(-56f, 56f)
                lineToRelative(-128f, -128f)
                quadToRelative(-21f, 12f, -45f, 20f)
                reflectiveQuadToRelative(-51f, 8f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(440f, 260f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(620f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(800f, 260f)
                quadToRelative(0f, 27f, -8f, 51f)
                reflectiveQuadToRelative(-20f, 45f)
                close()
                moveToRelative(-152f, 4f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(160f, 530f)
                verticalLineToRelative(270f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(280f)
                verticalLineToRelative(-12f)
                verticalLineToRelative(22f)
                close()
            }
        }.build()
        
        return _Feature_search!!
    }

private var _Feature_search: ImageVector? = null

