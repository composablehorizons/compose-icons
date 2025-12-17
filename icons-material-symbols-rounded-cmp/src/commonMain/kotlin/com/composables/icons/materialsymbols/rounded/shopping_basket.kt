package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Shopping_basket: ImageVector
    get() {
        if (_Shopping_basket != null) return _Shopping_basket!!
        
        _Shopping_basket = ImageVector.Builder(
            name = "shopping_basket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(221f, 840f)
                quadToRelative(-27f, 0f, -48f, -16.5f)
                reflectiveQuadTo(144f, 781f)
                lineTo(42f, 411f)
                quadToRelative(-5f, -19f, 6.5f, -35f)
                reflectiveQuadTo(80f, 360f)
                horizontalLineToRelative(190f)
                lineToRelative(176f, -262f)
                quadToRelative(5f, -8f, 14f, -13f)
                reflectiveQuadToRelative(19f, -5f)
                quadToRelative(10f, 0f, 19f, 5f)
                reflectiveQuadToRelative(14f, 13f)
                lineToRelative(176f, 262f)
                horizontalLineToRelative(192f)
                quadToRelative(20f, 0f, 31.5f, 16f)
                reflectiveQuadToRelative(6.5f, 35f)
                lineTo(816f, 781f)
                quadToRelative(-8f, 26f, -29f, 42.5f)
                reflectiveQuadTo(739f, 840f)
                horizontalLineTo(221f)
                close()
                moveToRelative(-1f, -80f)
                horizontalLineToRelative(520f)
                lineToRelative(88f, -320f)
                horizontalLineTo(132f)
                lineToRelative(88f, 320f)
                close()
                moveToRelative(260f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveTo(367f, 360f)
                horizontalLineToRelative(225f)
                lineTo(479f, 192f)
                lineTo(367f, 360f)
                close()
                moveToRelative(113f, 240f)
                close()
            }
        }.build()
        
        return _Shopping_basket!!
    }

private var _Shopping_basket: ImageVector? = null

