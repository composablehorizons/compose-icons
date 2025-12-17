package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Pet_supplies: ImageVector
    get() {
        if (_Pet_supplies != null) return _Pet_supplies!!
        
        _Pet_supplies = ImageVector.Builder(
            name = "pet_supplies",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 880f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(240f, 740f)
                quadToRelative(0f, -9f, 2.5f, -14f)
                reflectiveQuadToRelative(-0.5f, -8f)
                quadToRelative(-3f, -3f, -8f, -0.5f)
                reflectiveQuadToRelative(-14f, 2.5f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(80f, 580f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(220f, 440f)
                quadToRelative(23f, 0f, 42f, 6f)
                reflectiveQuadToRelative(36f, 18f)
                lineToRelative(166f, -166f)
                quadToRelative(-12f, -17f, -18f, -36f)
                reflectiveQuadToRelative(-6f, -42f)
                quadToRelative(0f, -59f, 40.5f, -99.5f)
                reflectiveQuadTo(580f, 80f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(720f, 220f)
                quadToRelative(0f, 9f, -2.5f, 14f)
                reflectiveQuadToRelative(0.5f, 8f)
                quadToRelative(3f, 3f, 8f, 0.5f)
                reflectiveQuadToRelative(14f, -2.5f)
                quadToRelative(59f, 0f, 99.5f, 40.5f)
                reflectiveQuadTo(880f, 380f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(740f, 520f)
                quadToRelative(-23f, 0f, -42f, -6f)
                reflectiveQuadToRelative(-36f, -18f)
                lineTo(496f, 662f)
                quadToRelative(12f, 17f, 18f, 36f)
                reflectiveQuadToRelative(6f, 42f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(380f, 880f)
                close()
            }
        }.build()
        
        return _Pet_supplies!!
    }

private var _Pet_supplies: ImageVector? = null

