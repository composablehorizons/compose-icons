package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Emoji_objects: ImageVector
    get() {
        if (_Emoji_objects != null) return _Emoji_objects!!
        
        _Emoji_objects = ImageVector.Builder(
            name = "emoji_objects",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-26f, 0f, -47f, -12.5f)
                reflectiveQuadTo(400f, 834f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(320f, 754f)
                verticalLineToRelative(-142f)
                quadToRelative(-59f, -39f, -94.5f, -103f)
                reflectiveQuadTo(190f, 370f)
                quadToRelative(0f, -121f, 84.5f, -205.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(121f, 0f, 205.5f, 84.5f)
                reflectiveQuadTo(770f, 370f)
                quadToRelative(0f, 77f, -35.5f, 140f)
                reflectiveQuadTo(640f, 612f)
                verticalLineToRelative(142f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 834f)
                quadToRelative(-12f, 21f, -33f, 33.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-80f, -126f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-36f)
                horizontalLineTo(400f)
                verticalLineToRelative(36f)
                close()
                moveToRelative(0f, -76f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-38f)
                horizontalLineTo(400f)
                verticalLineToRelative(38f)
                close()
                moveToRelative(-8f, -118f)
                horizontalLineToRelative(58f)
                verticalLineToRelative(-108f)
                lineToRelative(-67f, -67f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(9f, -9f, 21f, -9f)
                reflectiveQuadToRelative(21f, 9f)
                lineToRelative(55f, 55f)
                lineToRelative(55f, -55f)
                quadToRelative(9f, -9f, 21f, -9f)
                reflectiveQuadToRelative(21f, 9f)
                quadToRelative(9f, 9f, 9f, 21f)
                reflectiveQuadToRelative(-9f, 21f)
                lineToRelative(-67f, 67f)
                verticalLineToRelative(108f)
                horizontalLineToRelative(58f)
                quadToRelative(54f, -26f, 88f, -76.5f)
                reflectiveQuadTo(690f, 370f)
                quadToRelative(0f, -88f, -61f, -149f)
                reflectiveQuadToRelative(-149f, -61f)
                quadToRelative(-88f, 0f, -149f, 61f)
                reflectiveQuadToRelative(-61f, 149f)
                quadToRelative(0f, 63f, 34f, 113.5f)
                reflectiveQuadToRelative(88f, 76.5f)
                close()
                moveToRelative(88f, -162f)
                close()
                moveToRelative(0f, -38f)
                close()
            }
        }.build()
        
        return _Emoji_objects!!
    }

private var _Emoji_objects: ImageVector? = null

