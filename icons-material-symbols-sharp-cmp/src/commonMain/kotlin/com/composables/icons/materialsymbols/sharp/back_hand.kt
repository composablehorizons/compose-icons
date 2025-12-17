package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Back_hand: ImageVector
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
                lineToRelative(67f, -67f)
                lineToRelative(165f, 114f)
                verticalLineToRelative(-423f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(577f)
                lineTo(212f, 594f)
                lineToRelative(95f, 138f)
                quadToRelative(35f, 51f, 89f, 79.5f)
                reflectiveQuadTo(512f, 840f)
                quadToRelative(103f, 0f, 175.5f, -72.5f)
                reflectiveQuadTo(760f, 592f)
                verticalLineToRelative(-432f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(432f)
                quadToRelative(0f, 137f, -95.5f, 232.5f)
                reflectiveQuadTo(512f, 920f)
                close()
                moveToRelative(-72f, -440f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(486f, 660f)
                close()
            }
        }.build()
        
        return _Back_hand!!
    }

private var _Back_hand: ImageVector? = null

