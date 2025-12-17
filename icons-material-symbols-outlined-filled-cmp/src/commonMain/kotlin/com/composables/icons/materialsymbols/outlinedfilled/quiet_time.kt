package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Quiet_time: ImageVector
    get() {
        if (_Quiet_time != null) return _Quiet_time!!
        
        _Quiet_time = ImageVector.Builder(
            name = "quiet_time",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(524f, 920f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(184f, 747f, 152f, 673.5f)
                reflectiveQuadTo(120f, 516f)
                quadToRelative(0f, -146f, 93f, -257.5f)
                reflectiveQuadTo(450f, 120f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(561f, 479f)
                quadToRelative(71f, 71f, 165.5f, 100f)
                reflectiveQuadTo(920f, 590f)
                quadToRelative(-26f, 144f, -138f, 237f)
                reflectiveQuadTo(524f, 920f)
                close()
            }
        }.build()
        
        return _Quiet_time!!
    }

private var _Quiet_time: ImageVector? = null

