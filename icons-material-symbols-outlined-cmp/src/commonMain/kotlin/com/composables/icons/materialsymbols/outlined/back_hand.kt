package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Back_hand: ImageVector
    get() {
        if (_Back_hand != null) return _Back_hand!!
        
        _Back_hand = ImageVector.Builder(
            name = "back_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(512f, 920f)
                quadToRelative(-82f, 0f, -154f, -37.5f)
                reflectiveQuadTo(240f, 778f)
                lineTo(48f, 496f)
                lineToRelative(19f, -19f)
                quadToRelative(20f, -21f, 49.5f, -24f)
                reflectiveQuadToRelative(53.5f, 14f)
                lineToRelative(110f, 76f)
                verticalLineToRelative(-383f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 160f)
                verticalLineToRelative(537f)
                lineTo(212f, 594f)
                lineToRelative(95f, 138f)
                quadToRelative(35f, 51f, 89f, 79.5f)
                reflectiveQuadTo(512f, 840f)
                quadToRelative(103f, 0f, 175.5f, -72.5f)
                reflectiveQuadTo(760f, 592f)
                verticalLineToRelative(-392f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(392f)
                quadToRelative(0f, 137f, -95.5f, 232.5f)
                reflectiveQuadTo(512f, 920f)
                close()
                moveToRelative(-72f, -440f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 120f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(486f, 660f)
                close()
            }
        }.build()
        
        return _Back_hand!!
    }

private var _Back_hand: ImageVector? = null

