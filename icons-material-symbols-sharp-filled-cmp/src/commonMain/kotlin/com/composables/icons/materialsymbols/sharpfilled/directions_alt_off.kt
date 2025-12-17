package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Directions_alt_off: ImageVector
    get() {
        if (_Directions_alt_off != null) return _Directions_alt_off!!
        
        _Directions_alt_off = ImageVector.Builder(
            name = "directions_alt_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(640f, 752f)
                lineTo(480f, 912f)
                lineTo(48f, 480f)
                lineToRelative(160f, -160f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(467f, 580f)
                lineToRelative(-43f, 44f)
                lineToRelative(56f, 56f)
                lineToRelative(44f, -44f)
                lineToRelative(-57f, -56f)
                close()
                moveToRelative(287f, 58f)
                lineTo(638f, 522f)
                lineToRelative(42f, -42f)
                lineToRelative(-200f, -200f)
                lineToRelative(-42f, 42f)
                lineToRelative(-116f, -116f)
                lineToRelative(158f, -158f)
                lineToRelative(432f, 432f)
                lineToRelative(-158f, 158f)
                close()
                moveTo(280f, 440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(127f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(-47f)
                close()
            }
        }.build()
        
        return _Directions_alt_off!!
    }

private var _Directions_alt_off: ImageVector? = null

