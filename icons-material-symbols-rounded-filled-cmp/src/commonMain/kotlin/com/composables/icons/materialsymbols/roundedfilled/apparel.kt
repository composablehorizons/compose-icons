package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Apparel: ImageVector
    get() {
        if (_Apparel != null) return _Apparel!!
        
        _Apparel = ImageVector.Builder(
            name = "apparel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 438f)
                lineToRelative(-40f, 22f)
                quadToRelative(-14f, 8f, -30f, 4f)
                reflectiveQuadToRelative(-24f, -18f)
                lineTo(66f, 306f)
                quadToRelative(-8f, -14f, -4f, -30f)
                reflectiveQuadToRelative(18f, -24f)
                lineToRelative(230f, -132f)
                horizontalLineToRelative(70f)
                quadToRelative(9f, 0f, 14.5f, 5.5f)
                reflectiveQuadTo(400f, 140f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 160f)
                verticalLineToRelative(-20f)
                quadToRelative(0f, -9f, 5.5f, -14.5f)
                reflectiveQuadTo(580f, 120f)
                horizontalLineToRelative(70f)
                lineToRelative(230f, 132f)
                quadToRelative(14f, 8f, 18f, 24f)
                reflectiveQuadToRelative(-4f, 30f)
                lineToRelative(-80f, 140f)
                quadToRelative(-8f, 14f, -23.5f, 17.5f)
                reflectiveQuadTo(760f, 459f)
                lineToRelative(-40f, -20f)
                verticalLineToRelative(361f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                verticalLineToRelative(-362f)
                close()
            }
        }.build()
        
        return _Apparel!!
    }

private var _Apparel: ImageVector? = null

