package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 720f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(520f, 720f)
                close()
                moveToRelative(-40f, 120f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, -77f, 25.5f, -155f)
                reflectiveQuadToRelative(66f, -141.5f)
                quadTo(332f, 200f, 382f, 160f)
                reflectiveQuadToRelative(98f, -40f)
                quadToRelative(49f, 0f, 98.5f, 40f)
                reflectiveQuadToRelative(90f, 103.5f)
                quadTo(709f, 327f, 734.5f, 405f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

