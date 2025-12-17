package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Swords: ImageVector
    get() {
        if (_Swords != null) return _Swords!!
        
        _Swords = ImageVector.Builder(
            name = "swords",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(762f, 864f)
                lineTo(645f, 748f)
                lineToRelative(-60f, 60f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-23f, -23f, -23f, -57f)
                reflectiveQuadToRelative(23f, -57f)
                lineToRelative(169f, -169f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-60f, 60f)
                lineToRelative(116f, 117f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-50f, 50f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(106f, -616f)
                lineTo(426f, 690f)
                lineToRelative(5f, 4f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-60f, -60f)
                lineTo(198f, 864f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-50f, -50f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(116f, -117f)
                lineToRelative(-60f, -60f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(4f, 5f)
                lineToRelative(431f, -431f)
                quadToRelative(11f, -11f, 25.5f, -17f)
                reflectiveQuadToRelative(30.5f, -6f)
                horizontalLineToRelative(87f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 116f)
                verticalLineToRelative(103f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-9f, 13.5f)
                close()
                moveTo(249f, 405f)
                lineTo(103f, 259f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadTo(80f, 203f)
                verticalLineToRelative(-87f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 76f)
                horizontalLineToRelative(87f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(146f, 146f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(409f, 302f)
                lineTo(306f, 405f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(249f, 405f)
                close()
            }
        }.build()
        
        return _Swords!!
    }

private var _Swords: ImageVector? = null

