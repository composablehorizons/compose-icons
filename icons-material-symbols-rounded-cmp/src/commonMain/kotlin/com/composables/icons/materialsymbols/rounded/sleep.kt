package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sleep: ImageVector
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
                quadToRelative(0f, -124f, 68.5f, -225f)
                reflectiveQuadTo(331f, 199f)
                quadToRelative(14f, -5f, 29f, -3.5f)
                reflectiveQuadToRelative(25f, 9.5f)
                quadToRelative(8f, 7f, 12.5f, 19.5f)
                reflectiveQuadTo(402f, 257f)
                quadToRelative(2f, 79f, 32f, 150.5f)
                reflectiveQuadTo(520f, 535f)
                quadToRelative(56f, 56f, 128f, 86f)
                reflectiveQuadToRelative(151f, 32f)
                quadToRelative(21f, 0f, 32f, 3.5f)
                reflectiveQuadToRelative(18f, 11.5f)
                quadToRelative(8f, 10f, 10.5f, 26f)
                reflectiveQuadToRelative(-2.5f, 29f)
                quadToRelative(-46f, 115f, -148f, 184f)
                reflectiveQuadToRelative(-226f, 69f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 163f, -44f)
                reflectiveQuadToRelative(118f, -121f)
                quadToRelative(-86f, -8f, -163f, -43.5f)
                reflectiveQuadTo(463f, 591f)
                quadToRelative(-61f, -61f, -97f, -138f)
                reflectiveQuadToRelative(-43f, -163f)
                quadToRelative(-77f, 43f, -120.5f, 118.5f)
                reflectiveQuadTo(159f, 572f)
                quadToRelative(0f, 135f, 94.5f, 229.5f)
                reflectiveQuadTo(483f, 896f)
                close()
                moveToRelative(-20f, -305f)
                close()
                moveToRelative(207f, -205f)
                lineToRelative(-70f, -32f)
                quadToRelative(-12f, -5f, -12f, -18f)
                reflectiveQuadToRelative(12f, -18f)
                lineToRelative(70f, -32f)
                lineToRelative(32f, -70f)
                quadToRelative(5f, -12f, 18f, -12f)
                reflectiveQuadToRelative(18f, 12f)
                lineToRelative(32f, 70f)
                lineToRelative(70f, 32f)
                quadToRelative(12f, 5f, 12f, 18f)
                reflectiveQuadToRelative(-12f, 18f)
                lineToRelative(-70f, 32f)
                lineToRelative(-32f, 70f)
                quadToRelative(-5f, 12f, -18f, 12f)
                reflectiveQuadToRelative(-18f, -12f)
                lineToRelative(-32f, -70f)
                close()
            }
        }.build()
        
        return _Sleep!!
    }

private var _Sleep: ImageVector? = null

