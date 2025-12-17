package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Quiet_time_active: ImageVector
    get() {
        if (_Quiet_time_active != null) return _Quiet_time_active!!
        
        _Quiet_time_active = ImageVector.Builder(
            name = "quiet_time_active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(806f, 725f)
                lineTo(235f, 154f)
                quadToRelative(43f, -44f, 97.5f, -73f)
                reflectiveQuadTo(450f, 40f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(561f, 399f)
                quadToRelative(71f, 71f, 165.5f, 100f)
                reflectiveQuadTo(920f, 510f)
                quadToRelative(-11f, 63f, -40.5f, 117.5f)
                reflectiveQuadTo(806f, 725f)
                close()
                moveTo(775f, 922f)
                lineTo(667f, 814f)
                quadToRelative(-34f, 13f, -69.5f, 19.5f)
                reflectiveQuadTo(524f, 840f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                quadTo(184f, 667f, 152f, 593.5f)
                reflectiveQuadTo(120f, 436f)
                quadToRelative(0f, -38f, 6.5f, -73.5f)
                reflectiveQuadTo(146f, 293f)
                lineTo(39f, 186f)
                lineToRelative(57f, -57f)
                lineTo(832f, 865f)
                lineToRelative(-57f, 57f)
                close()
            }
        }.build()
        
        return _Quiet_time_active!!
    }

private var _Quiet_time_active: ImageVector? = null

