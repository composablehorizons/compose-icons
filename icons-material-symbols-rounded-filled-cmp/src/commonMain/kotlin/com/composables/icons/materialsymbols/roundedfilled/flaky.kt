package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flaky: ImageVector
    get() {
        if (_Flaky != null) return _Flaky!!
        
        _Flaky = ImageVector.Builder(
            name = "flaky",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(350f, 392f)
                lineToRelative(35f, 36f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                quadToRelative(9f, -9f, 9f, -21.5f)
                reflectiveQuadToRelative(-9f, -21.5f)
                lineToRelative(-35f, -35f)
                lineToRelative(36f, -35f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -9f, -21.5f, -9f)
                reflectiveQuadToRelative(-21.5f, 9f)
                lineToRelative(-35f, 35f)
                lineToRelative(-35f, -36f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                quadToRelative(-9f, 9f, -9f, 21.5f)
                reflectiveQuadToRelative(9f, 21.5f)
                lineToRelative(35f, 35f)
                lineToRelative(-36f, 35f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                quadToRelative(9f, 9f, 21.5f, 9f)
                reflectiveQuadToRelative(21.5f, -9f)
                lineToRelative(35f, -35f)
                close()
                moveToRelative(130f, 408f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -66f, -25f, -124f)
                reflectiveQuadToRelative(-69f, -102f)
                lineTo(254f, 706f)
                quadToRelative(44f, 44f, 102f, 69f)
                reflectiveQuadToRelative(124f, 25f)
                close()
                moveToRelative(82f, -181f)
                lineToRelative(79f, -78f)
                quadToRelative(9f, -8f, 21f, -8.5f)
                reflectiveQuadToRelative(21f, 8.5f)
                quadToRelative(9f, 9f, 9f, 21f)
                reflectiveQuadToRelative(-9f, 21f)
                lineToRelative(-93f, 93f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-47f, -47f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(9f, -9f, 21.5f, -9f)
                reflectiveQuadToRelative(21.5f, 9f)
                lineToRelative(32f, 32f)
                close()
            }
        }.build()
        
        return _Flaky!!
    }

private var _Flaky: ImageVector? = null

