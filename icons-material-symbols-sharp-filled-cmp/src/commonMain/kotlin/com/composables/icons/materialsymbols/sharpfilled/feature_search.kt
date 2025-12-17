package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Feature_search: ImageVector
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
                moveTo(772f, 356f)
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
                moveTo(80f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(300f)
                quadToRelative(-11f, 25f, -15f, 51.5f)
                reflectiveQuadToRelative(-4f, 52.5f)
                quadToRelative(0f, 109f, 77f, 182f)
                reflectiveQuadToRelative(183f, 73f)
                quadToRelative(19f, 0f, 38f, -2.5f)
                reflectiveQuadToRelative(39f, -8.5f)
                lineToRelative(102f, 102f)
                verticalLineToRelative(270f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Feature_search!!
    }

private var _Feature_search: ImageVector? = null

