package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Ramp_right: ImageVector
    get() {
        if (_Ramp_right != null) return _Ramp_right!!
        
        _Ramp_right = ImageVector.Builder(
            name = "ramp_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 800f)
                verticalLineToRelative(-212f)
                quadToRelative(-28f, 38f, -63.5f, 72f)
                reflectiveQuadTo(296f, 725f)
                quadToRelative(-16f, 11f, -34.5f, 10f)
                reflectiveQuadTo(229f, 720f)
                quadToRelative(-11f, -11f, -7.5f, -27.5f)
                reflectiveQuadTo(240f, 666f)
                quadToRelative(63f, -42f, 131.5f, -119.5f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(-87f)
                lineToRelative(-36f, 35f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(348f, 252f)
                lineToRelative(104f, -104f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(104f, 104f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(556f, 309f)
                lineToRelative(-36f, -36f)
                verticalLineToRelative(527f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Ramp_right!!
    }

private var _Ramp_right: ImageVector? = null

