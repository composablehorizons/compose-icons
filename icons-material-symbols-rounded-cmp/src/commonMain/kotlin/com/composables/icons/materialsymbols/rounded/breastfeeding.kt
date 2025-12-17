package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Breastfeeding: ImageVector
    get() {
        if (_Breastfeeding != null) return _Breastfeeding!!
        
        _Breastfeeding = ImageVector.Builder(
            name = "breastfeeding",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(477f, 880f)
                quadToRelative(-42f, 0f, -81.5f, -9f)
                reflectiveQuadTo(324f, 848f)
                quadToRelative(-46f, -20f, -75f, -48.5f)
                reflectiveQuadTo(220f, 736f)
                verticalLineToRelative(-231f)
                quadToRelative(0f, -31f, 23.5f, -57f)
                reflectiveQuadToRelative(60.5f, -46f)
                quadToRelative(38f, -20f, 83.5f, -31f)
                reflectiveQuadToRelative(92.5f, -11f)
                quadToRelative(47f, 0f, 92.5f, 11f)
                reflectiveQuadToRelative(83.5f, 31f)
                quadToRelative(38f, 20f, 61f, 46f)
                reflectiveQuadToRelative(23f, 57f)
                verticalLineToRelative(231f)
                quadToRelative(0f, 17f, -7.5f, 33f)
                reflectiveQuadTo(711f, 799f)
                quadToRelative(-14f, 14f, -32.5f, 26.5f)
                reflectiveQuadTo(637f, 848f)
                quadToRelative(1f, -5f, 3f, -28f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-43f, 0f, -76f, 23f)
                reflectiveQuadToRelative(-50f, 59f)
                quadToRelative(32f, 8f, 58.5f, 11f)
                reflectiveQuadToRelative(46.5f, 3f)
                quadToRelative(17f, 0f, 27.5f, -1f)
                reflectiveQuadToRelative(13.5f, -1f)
                verticalLineToRelative(104f)
                quadToRelative(-11f, 1f, -21.5f, 1.5f)
                reflectiveQuadTo(477f, 880f)
                close()
                moveToRelative(123f, -220f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(680f, 580f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(600f, 500f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(520f, 580f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(600f, 660f)
                close()
                moveTo(480f, 320f)
                quadToRelative(50f, 0f, 85f, -34.5f)
                reflectiveQuadToRelative(35f, -85.5f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-51f, 0f, -85.5f, 35f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(480f, 320f)
                close()
            }
        }.build()
        
        return _Breastfeeding!!
    }

private var _Breastfeeding: ImageVector? = null

