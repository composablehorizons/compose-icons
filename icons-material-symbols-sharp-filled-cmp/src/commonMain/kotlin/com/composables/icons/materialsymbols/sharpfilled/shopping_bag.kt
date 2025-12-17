package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Shopping_bag: ImageVector
    get() {
        if (_Shopping_bag != null) return _Shopping_bag!!
        
        _Shopping_bag = ImageVector.Builder(
            name = "shopping_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(640f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, -640f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 240f)
                close()
                moveToRelative(-80f, 200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(240f, 0f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Shopping_bag!!
    }

private var _Shopping_bag: ImageVector? = null

