package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Ramp_right: ImageVector
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
                moveTo(440f, 840f)
                verticalLineToRelative(-252f)
                quadToRelative(-33f, 45f, -79f, 85.5f)
                reflectiveQuadTo(258f, 749f)
                lineToRelative(-58f, -58f)
                quadToRelative(30f, -17f, 71f, -47f)
                reflectiveQuadToRelative(78.5f, -71.5f)
                quadToRelative(37.5f, -41.5f, 64f, -95f)
                reflectiveQuadTo(440f, 360f)
                verticalLineToRelative(-87f)
                lineToRelative(-64f, 63f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -63f)
                verticalLineToRelative(567f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Ramp_right!!
    }

private var _Ramp_right: ImageVector? = null

