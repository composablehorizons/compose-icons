package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_drop: ImageVector
    get() {
        if (_Water_drop != null) return _Water_drop!!
        
        _Water_drop = ImageVector.Builder(
            name = "water_drop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-137f, 0f, -228.5f, -94f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, -62f, 28f, -124f)
                reflectiveQuadToRelative(70f, -119f)
                quadToRelative(42f, -57f, 91f, -107f)
                reflectiveQuadToRelative(91f, -87f)
                quadToRelative(8f, -8f, 18.5f, -11.5f)
                reflectiveQuadTo(480f, 100f)
                quadToRelative(11f, 0f, 21.5f, 3.5f)
                reflectiveQuadTo(520f, 115f)
                quadToRelative(42f, 37f, 91f, 87f)
                reflectiveQuadToRelative(91f, 107f)
                quadToRelative(42f, 57f, 70f, 119f)
                reflectiveQuadToRelative(28f, 124f)
                quadToRelative(0f, 140f, -91.5f, 234f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(11f, -120f)
                quadToRelative(12f, -1f, 20.5f, -9.5f)
                reflectiveQuadTo(520f, 730f)
                quadToRelative(0f, -14f, -9f, -22.5f)
                reflectiveQuadToRelative(-23f, -7.5f)
                quadToRelative(-41f, 3f, -87f, -22.5f)
                reflectiveQuadTo(343f, 585f)
                quadToRelative(-2f, -11f, -10.5f, -18f)
                reflectiveQuadToRelative(-19.5f, -7f)
                quadToRelative(-14f, 0f, -23f, 10.5f)
                reflectiveQuadToRelative(-6f, 24.5f)
                quadToRelative(17f, 91f, 80f, 130f)
                reflectiveQuadToRelative(127f, 35f)
                close()
            }
        }.build()
        
        return _Water_drop!!
    }

private var _Water_drop: ImageVector? = null

