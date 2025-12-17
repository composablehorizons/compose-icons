package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Sleep: ImageVector
    get() {
        if (_Sleep != null) return _Sleep!!
        
        _Sleep = ImageVector.Builder(
            name = "sleep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(483f, 976f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(143f, 803f, 111f, 729.5f)
                reflectiveQuadTo(79f, 572f)
                quadToRelative(0f, -146f, 93f, -257.5f)
                reflectiveQuadTo(409f, 176f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(520f, 535f)
                quadToRelative(71f, 71f, 165.5f, 100f)
                reflectiveQuadTo(879f, 646f)
                quadToRelative(-26f, 144f, -138f, 237f)
                reflectiveQuadToRelative(-258f, 93f)
                close()
                moveToRelative(237f, -480f)
                lineToRelative(-50f, -110f)
                lineToRelative(-110f, -50f)
                lineToRelative(110f, -50f)
                lineToRelative(50f, -110f)
                lineToRelative(50f, 110f)
                lineToRelative(110f, 50f)
                lineToRelative(-110f, 50f)
                lineToRelative(-50f, 110f)
                close()
            }
        }.build()
        
        return _Sleep!!
    }

private var _Sleep: ImageVector? = null

