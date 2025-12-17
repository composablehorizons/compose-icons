package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ring_volume: ImageVector
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
                moveTo(136f, 816f)
                lineToRelative(-92f, -90f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                quadToRelative(88f, -95f, 203f, -142.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(118f, 0f, 232.5f, 47.5f)
                reflectiveQuadTo(916f, 670f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-92f, 90f)
                quadToRelative(-11f, 11f, -25.5f, 12f)
                reflectiveQuadToRelative(-26.5f, -8f)
                lineToRelative(-116f, -88f)
                quadToRelative(-8f, -6f, -12f, -14f)
                reflectiveQuadToRelative(-4f, -18f)
                verticalLineToRelative(-114f)
                quadToRelative(-38f, -12f, -78f, -19f)
                reflectiveQuadToRelative(-82f, -7f)
                quadToRelative(-42f, 0f, -82f, 7f)
                reflectiveQuadToRelative(-78f, 19f)
                verticalLineToRelative(114f)
                quadToRelative(0f, 10f, -4f, 18f)
                reflectiveQuadToRelative(-12f, 14f)
                lineToRelative(-116f, 88f)
                quadToRelative(-12f, 9f, -26.5f, 8f)
                reflectiveQuadTo(136f, 816f)
                close()
                moveToRelative(104f, -202f)
                quadToRelative(-29f, 15f, -56f, 34.5f)
                reflectiveQuadTo(128f, 692f)
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
            }
        }.build()
        
        return _Ring_volume!!
    }

private var _Ring_volume: ImageVector? = null

