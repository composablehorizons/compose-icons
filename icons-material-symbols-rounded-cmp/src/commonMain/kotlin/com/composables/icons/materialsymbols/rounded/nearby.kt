package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nearby: ImageVector
    get() {
        if (_Nearby != null) return _Nearby!!
        
        _Nearby = ImageVector.Builder(
            name = "nearby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(452f, 628f)
                lineTo(332f, 508f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(120f, -120f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(120f, 120f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(508f, 628f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(84f, 227f)
                quadToRelative(-11f, 11f, -26f, 17f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-26f, -17f)
                lineTo(105f, 536f)
                quadToRelative(-11f, -11f, -17f, -26f)
                reflectiveQuadToRelative(-6f, -30f)
                quadToRelative(0f, -15f, 6f, -30f)
                reflectiveQuadToRelative(17f, -26f)
                lineToRelative(318f, -318f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(30.5f, -6f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(26.5f, 18f)
                lineToRelative(318f, 318f)
                quadToRelative(11f, 11f, 17f, 26f)
                reflectiveQuadToRelative(6f, 30f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-17f, 26f)
                lineTo(536f, 855f)
                close()
                moveToRelative(-56f, -87f)
                lineToRelative(288f, -288f)
                lineToRelative(-288f, -288f)
                lineToRelative(-288f, 288f)
                lineToRelative(288f, 288f)
                close()
            }
        }.build()
        
        return _Nearby!!
    }

private var _Nearby: ImageVector? = null

