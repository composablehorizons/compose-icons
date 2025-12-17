package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`360`: ImageVector
    get() {
        if (_360 != null) return _360!!
        
        _360 = ImageVector.Builder(
            name = "360",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                lineToRelative(-56f, -56f)
                lineToRelative(70f, -72f)
                quadToRelative(-128f, -17f, -211f, -70f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 115.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(169f, 0f, 284.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 62f, -66.5f, 111f)
                reflectiveQuadTo(640f, 664f)
                verticalLineToRelative(-82f)
                quadToRelative(77f, -20f, 118.5f, -49.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -32f, -85.5f, -76f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-149f, 0f, -234.5f, 44f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 24f, 51f, 57.5f)
                reflectiveQuadTo(356f, 588f)
                lineToRelative(-52f, -52f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
            }
        }.build()
        
        return _360!!
    }

private var _360: ImageVector? = null

