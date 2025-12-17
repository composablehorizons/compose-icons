package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Water_drop: ImageVector
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
                moveTo(491f, 760f)
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
                moveTo(480f, 880f)
                quadToRelative(-137f, 0f, -228.5f, -94f)
                reflectiveQuadTo(160f, 552f)
                quadToRelative(0f, -100f, 79.5f, -217.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(161f, 137f, 240.5f, 254.5f)
                reflectiveQuadTo(800f, 552f)
                quadToRelative(0f, 140f, -91.5f, 234f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Water_drop!!
    }

private var _Water_drop: ImageVector? = null

