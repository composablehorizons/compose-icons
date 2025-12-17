package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Step_out: ImageVector
    get() {
        if (_Step_out != null) return _Step_out!!
        
        _Step_out = ImageVector.Builder(
            name = "step_out",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(-40f, -647f)
                lineToRelative(-76f, 75f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(308f, 308f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(144f, -144f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(144f, 144f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(651f, 308f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(595f, 308f)
                lineToRelative(-75f, -75f)
                verticalLineToRelative(287f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 520f)
                verticalLineToRelative(-287f)
                close()
            }
        }.build()
        
        return _Step_out!!
    }

private var _Step_out: ImageVector? = null

