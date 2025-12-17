package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ring_volume: ImageVector
    get() {
        if (_Ring_volume != null) return _Ring_volume!!
        
        _Ring_volume = ImageVector.Builder(
            name = "ring_volume",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 280f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(264f, 114f)
                lineToRelative(-56f, -58f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 58f)
                lineToRelative(-142f, 142f)
                close()
                moveToRelative(-448f, 0f)
                lineTo(114f, 252f)
                lineToRelative(56f, -58f)
                lineToRelative(142f, 142f)
                lineToRelative(-56f, 58f)
                close()
                moveToRelative(-95f, 446f)
                lineTo(16f, 699f)
                lineToRelative(40f, -41f)
                quadToRelative(85f, -91f, 197.5f, -134.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(114f, 0f, 225.5f, 44f)
                reflectiveQuadTo(904f, 658f)
                lineToRelative(40f, 41f)
                lineToRelative(-145f, 141f)
                lineToRelative(-159f, -120f)
                verticalLineToRelative(-134f)
                quadToRelative(-38f, -12f, -78f, -19f)
                reflectiveQuadToRelative(-82f, -7f)
                quadToRelative(-42f, 0f, -82f, 7f)
                reflectiveQuadToRelative(-78f, 19f)
                verticalLineToRelative(134f)
                lineTo(161f, 840f)
                close()
                moveToRelative(79f, -222f)
                quadToRelative(-29f, 15f, -56f, 34.5f)
                reflectiveQuadTo(128f, 696f)
                lineToRelative(40f, 40f)
                lineToRelative(72f, -56f)
                verticalLineToRelative(-62f)
                close()
                moveToRelative(480f, 2f)
                verticalLineToRelative(60f)
                lineToRelative(72f, 56f)
                lineToRelative(40f, -38f)
                quadToRelative(-29f, -26f, -56f, -45f)
                reflectiveQuadToRelative(-56f, -33f)
                close()
                moveToRelative(-480f, -2f)
                close()
                moveToRelative(480f, 2f)
                close()
            }
        }.build()
        
        return _Ring_volume!!
    }

private var _Ring_volume: ImageVector? = null

