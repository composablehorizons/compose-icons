package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bedtime_off: ImageVector
    get() {
        if (_Bedtime_off != null) return _Bedtime_off!!
        
        _Bedtime_off = ImageVector.Builder(
            name = "bedtime_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(806f, 725f)
                lineToRelative(-57f, -57f)
                quadToRelative(17f, -16f, 31f, -34.5f)
                reflectiveQuadToRelative(25f, -38.5f)
                quadToRelative(-48f, -5f, -94f, -18f)
                reflectiveQuadToRelative(-88f, -35f)
                lineTo(416f, 335f)
                quadToRelative(-22f, -42f, -35f, -87.5f)
                reflectiveQuadTo(364f, 154f)
                quadToRelative(-20f, 11f, -38.5f, 25f)
                reflectiveQuadTo(291f, 210f)
                lineToRelative(-56f, -56f)
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
                moveTo(524f, 760f)
                quadToRelative(20f, 0f, 40f, -2.5f)
                reflectiveQuadToRelative(39f, -7.5f)
                lineTo(210f, 357f)
                quadToRelative(-5f, 20f, -7.5f, 39.5f)
                reflectiveQuadTo(200f, 436f)
                quadToRelative(0f, 135f, 94.5f, 229.5f)
                reflectiveQuadTo(524f, 760f)
                close()
                moveTo(406f, 553f)
                close()
                moveToRelative(114f, -114f)
                close()
            }
        }.build()
        
        return _Bedtime_off!!
    }

private var _Bedtime_off: ImageVector? = null

