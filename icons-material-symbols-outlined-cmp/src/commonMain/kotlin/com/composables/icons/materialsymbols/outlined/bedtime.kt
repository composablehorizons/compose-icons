package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Bedtime: ImageVector
    get() {
        if (_Bedtime != null) return _Bedtime!!
        
        _Bedtime = ImageVector.Builder(
            name = "bedtime",
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
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 163f, -44f)
                reflectiveQuadToRelative(118f, -121f)
                quadToRelative(-86f, -8f, -163f, -43.5f)
                reflectiveQuadTo(504f, 535f)
                quadToRelative(-61f, -61f, -97f, -138f)
                reflectiveQuadToRelative(-43f, -163f)
                quadToRelative(-77f, 43f, -120.5f, 118.5f)
                reflectiveQuadTo(200f, 516f)
                quadToRelative(0f, 135f, 94.5f, 229.5f)
                reflectiveQuadTo(524f, 840f)
                close()
                moveToRelative(-20f, -305f)
                close()
            }
        }.build()
        
        return _Bedtime!!
    }

private var _Bedtime: ImageVector? = null

