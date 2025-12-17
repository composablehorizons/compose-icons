package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ramp_left: ImageVector
    get() {
        if (_Ramp_left != null) return _Ramp_left!!
        
        _Ramp_left = ImageVector.Builder(
            name = "ramp_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 840f)
                verticalLineToRelative(-567f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(87f)
                quadToRelative(0f, 64f, 26.5f, 117.5f)
                reflectiveQuadToRelative(64f, 95f)
                quadTo(648f, 614f, 689f, 644f)
                reflectiveQuadToRelative(71f, 47f)
                lineToRelative(-58f, 58f)
                quadToRelative(-57f, -35f, -103f, -75.5f)
                reflectiveQuadTo(520f, 588f)
                verticalLineToRelative(252f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Ramp_left!!
    }

private var _Ramp_left: ImageVector? = null

