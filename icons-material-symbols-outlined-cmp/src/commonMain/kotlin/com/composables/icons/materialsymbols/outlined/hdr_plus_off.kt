package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Hdr_plus_off: ImageVector
    get() {
        if (_Hdr_plus_off != null) return _Hdr_plus_off!!
        
        _Hdr_plus_off = ImageVector.Builder(
            name = "hdr_plus_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                quadToRelative(-45f, 0f, -86f, 11f)
                reflectiveQuadToRelative(-77f, 32f)
                lineToRelative(-58f, -58f)
                quadToRelative(47f, -32f, 103f, -48.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 62f, -17f, 118f)
                reflectiveQuadToRelative(-49f, 103f)
                lineToRelative(-58f, -58f)
                quadToRelative(21f, -36f, 32.5f, -77f)
                reflectiveQuadToRelative(11.5f, -86f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                close()
                moveToRelative(0f, 207f)
                lineToRelative(-60f, -60f)
                verticalLineToRelative(-67f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(127f)
                close()
                moveToRelative(220f, -67f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 24f, -18f, 42f)
                reflectiveQuadToRelative(-42f, 18f)
                horizontalLineToRelative(-47f)
                lineToRelative(-73f, -73f)
                verticalLineToRelative(-167f)
                horizontalLineToRelative(120f)
                quadToRelative(24f, 0f, 42f, 18f)
                reflectiveQuadToRelative(18f, 42f)
                close()
                moveTo(580f, 420f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveTo(420f, 620f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(117f, -197f)
                close()
                moveTo(340f, 760f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(480f, 580f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 18f, -10.5f, 32.5f)
                reflectiveQuadTo(444f, 676f)
                lineToRelative(36f, 84f)
                horizontalLineToRelative(-62f)
                lineToRelative(-34f, -80f)
                horizontalLineToRelative(-44f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-60f, -424f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(84f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-144f)
                close()
                moveToRelative(143f, 201f)
                close()
                moveTo(171f, 227f)
                lineToRelative(56f, 57f)
                quadToRelative(-32f, 42f, -49.5f, 90.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(57f, 0f, 106f, -17.5f)
                reflectiveQuadToRelative(91f, -49.5f)
                lineToRelative(56f, 56f)
                quadToRelative(-51f, 44f, -115.5f, 67.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -73f, 24f, -137.5f)
                reflectiveQuadTo(171f, 227f)
                close()
                moveTo(28f, 140f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                lineTo(28f, 140f)
                close()
            }
        }.build()
        
        return _Hdr_plus_off!!
    }

private var _Hdr_plus_off: ImageVector? = null

