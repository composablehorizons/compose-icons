package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Document_search: ImageVector
    get() {
        if (_Document_search != null) return _Document_search!!
        
        _Document_search = ImageVector.Builder(
            name = "document_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 160f)
                verticalLineToRelative(241f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(400f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                close()
                moveToRelative(0f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(287f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(194f, 194f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(28f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(720f, 420f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 380f)
                verticalLineToRelative(-20f)
                horizontalLineTo(520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(480f, 320f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(220f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(420f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(460f, -120f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(892f, 892f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-80f, -80f)
                quadToRelative(-21f, 14f, -45.5f, 21f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 26f, -7f, 50.5f)
                reflectiveQuadTo(812f, 756f)
                lineToRelative(80f, 80f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
            }
        }.build()
        
        return _Document_search!!
    }

private var _Document_search: ImageVector? = null

