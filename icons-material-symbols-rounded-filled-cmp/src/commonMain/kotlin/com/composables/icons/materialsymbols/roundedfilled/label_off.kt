package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Label_off: ImageVector
    get() {
        if (_Label_off != null) return _Label_off!!
        
        _Label_off = ImageVector.Builder(
            name = "label_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(733f, 602f)
                quadToRelative(-8f, 0f, -15.5f, -3f)
                reflectiveQuadToRelative(-13.5f, -9f)
                lineTo(382f, 268f)
                quadToRelative(-10f, -10f, -11.5f, -21f)
                reflectiveQuadToRelative(3.5f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(189f)
                quadToRelative(20f, 0f, 37f, 8.5f)
                reflectiveQuadToRelative(29f, 25.5f)
                lineToRelative(141f, 200f)
                quadToRelative(8f, 11f, 11.5f, 22.5f)
                reflectiveQuadTo(822f, 480f)
                quadToRelative(0f, 12f, -3.5f, 23.5f)
                reflectiveQuadTo(807f, 526f)
                lineToRelative(-42f, 59f)
                quadToRelative(-6f, 8f, -14.5f, 12.5f)
                reflectiveQuadTo(733f, 602f)
                close()
                moveTo(200f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -11f, 2.5f, -20f)
                reflectiveQuadToRelative(7.5f, -18f)
                lineToRelative(-46f, -46f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(638f, 750f)
                quadToRelative(-9f, 5f, -18f, 7.5f)
                reflectiveQuadToRelative(-20f, 2.5f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Label_off!!
    }

private var _Label_off: ImageVector? = null

