package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Public_off: ImageVector
    get() {
        if (_Public_off != null) return _Public_off!!
        
        _Public_off = ImageVector.Builder(
            name = "public_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(701f, 814f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(440f, 798f)
                verticalLineToRelative(-78f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-120f)
                lineTo(168f, 408f)
                quadToRelative(-3f, 18f, -5.5f, 36f)
                reflectiveQuadToRelative(-2.5f, 36f)
                quadToRelative(0f, 121f, 79.5f, 212f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(374f, -99f)
                lineToRelative(-58f, -58f)
                quadToRelative(21f, -37f, 32.5f, -77.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -98f, -54.5f, -179f)
                reflectiveQuadTo(600f, 184f)
                verticalLineToRelative(96f)
                horizontalLineTo(440f)
                verticalLineToRelative(45f)
                lineTo(261f, 146f)
                quadToRelative(48f, -31f, 103f, -48.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 61f, -17.5f, 116f)
                reflectiveQuadTo(814f, 699f)
                close()
            }
        }.build()
        
        return _Public_off!!
    }

private var _Public_off: ImageVector? = null

