package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Image_search: ImageVector
    get() {
        if (_Image_search != null) return _Image_search!!
        
        _Image_search = ImageVector.Builder(
            name = "image_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(360f, 200f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-134f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 586f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 626f)
                verticalLineToRelative(134f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(250f, -200f)
                lineToRelative(104f, -139f)
                quadToRelative(6f, -8f, 16f, -8f)
                reflectiveQuadToRelative(16f, 8f)
                lineToRelative(110f, 147f)
                quadToRelative(8f, 10f, 2f, 21f)
                reflectiveQuadToRelative(-18f, 11f)
                horizontalLineTo(280f)
                quadToRelative(-12f, 0f, -18f, -11f)
                reflectiveQuadToRelative(2f, -21f)
                lineToRelative(80f, -107f)
                quadToRelative(6f, -8f, 16f, -8f)
                reflectiveQuadToRelative(16f, 8f)
                lineToRelative(74f, 99f)
                close()
                moveToRelative(192f, -200f)
                quadToRelative(-74f, 0f, -126f, -52.5f)
                reflectiveQuadTo(464f, 260f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(644f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(824f, 260f)
                quadToRelative(0f, 27f, -8f, 52f)
                reflectiveQuadToRelative(-20f, 46f)
                lineToRelative(94f, 94f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-96f, -96f)
                quadToRelative(-21f, 14f, -45f, 21f)
                reflectiveQuadToRelative(-51f, 7f)
                close()
                moveToRelative(2f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
            }
        }.build()
        
        return _Image_search!!
    }

private var _Image_search: ImageVector? = null

