package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Image_search: ImageVector
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
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-214f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(214f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -160f)
                lineToRelative(120f, -160f)
                lineToRelative(90f, 120f)
                lineToRelative(120f, -160f)
                lineToRelative(150f, 200f)
                horizontalLineTo(240f)
                close()
                moveToRelative(622f, -144f)
                lineTo(738f, 412f)
                quadToRelative(-21f, 14f, -45f, 21f)
                reflectiveQuadToRelative(-51f, 7f)
                quadToRelative(-74f, 0f, -126f, -52.5f)
                reflectiveQuadTo(464f, 260f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(644f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(824f, 260f)
                quadToRelative(0f, 27f, -8f, 52f)
                reflectiveQuadToRelative(-20f, 46f)
                lineToRelative(122f, 122f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(644f, 360f)
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

