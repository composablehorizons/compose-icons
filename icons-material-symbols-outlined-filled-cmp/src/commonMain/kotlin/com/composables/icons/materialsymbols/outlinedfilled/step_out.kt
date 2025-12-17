package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Step_out: ImageVector
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
                moveToRelative(-40f, -320f)
                verticalLineToRelative(-327f)
                lineTo(336f, 336f)
                lineToRelative(-56f, -56f)
                lineToRelative(200f, -200f)
                lineToRelative(200f, 200f)
                lineToRelative(-57f, 56f)
                lineToRelative(-103f, -103f)
                verticalLineToRelative(327f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Step_out!!
    }

private var _Step_out: ImageVector? = null

