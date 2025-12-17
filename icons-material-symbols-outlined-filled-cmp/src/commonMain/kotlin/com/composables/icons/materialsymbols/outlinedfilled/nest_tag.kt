package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_tag: ImageVector
    get() {
        if (_Nest_tag != null) return _Nest_tag!!
        
        _Nest_tag = ImageVector.Builder(
            name = "nest_tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(0f, -94f, 55f, -168f)
                reflectiveQuadToRelative(145f, -100f)
                verticalLineToRelative(-212f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 120f)
                verticalLineToRelative(212f)
                quadToRelative(89f, 26f, 144.5f, 100f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(0f, 117f, -82f, 198.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-84f, 0f, -142f, 58.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(0f, 84f, 58f, 142f)
                reflectiveQuadToRelative(142f, 58f)
                close()
            }
        }.build()
        
        return _Nest_tag!!
    }

private var _Nest_tag: ImageVector? = null

