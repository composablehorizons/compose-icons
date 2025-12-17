package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shopping_basket: ImageVector
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
                moveTo(161f, 840f)
                lineTo(27f, 360f)
                horizontalLineToRelative(243f)
                lineToRelative(209f, -311f)
                lineToRelative(209f, 311f)
                horizontalLineToRelative(245f)
                lineTo(799f, 840f)
                horizontalLineTo(161f)
                close()
                moveToRelative(59f, -80f)
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

