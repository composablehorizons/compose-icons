package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Front_hand: ImageVector
    get() {
        if (_Front_hand != null) return _Front_hand!!
        
        _Front_hand = ImageVector.Builder(
            name = "front_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 920f)
                quadToRelative(-142f, 0f, -241f, -99f)
                reflectiveQuadToRelative(-99f, -241f)
                verticalLineToRelative(-420f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(270f)
                quadToRelative(-29f, 21f, -44.5f, 53f)
                reflectiveQuadTo(660f, 510f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-50f)
                quadToRelative(-63f, 0f, -106.5f, 43.5f)
                reflectiveQuadTo(460f, 710f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-50f)
                quadToRelative(0f, -38f, 26f, -64f)
                reflectiveQuadToRelative(64f, -26f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(-110f)
                quadToRelative(0f, -38f, 26f, -64f)
                reflectiveQuadToRelative(64f, -26f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 142f, -99f, 241f)
                reflectiveQuadTo(500f, 920f)
                close()
            }
        }.build()
        
        return _Front_hand!!
    }

private var _Front_hand: ImageVector? = null

