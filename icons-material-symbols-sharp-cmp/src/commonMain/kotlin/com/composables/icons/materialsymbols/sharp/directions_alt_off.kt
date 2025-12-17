package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Directions_alt_off: ImageVector
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
                moveTo(584f, 696f)
                lineToRelative(-60f, -60f)
                lineToRelative(-44f, 44f)
                lineToRelative(-56f, -56f)
                lineToRelative(43f, -44f)
                lineToRelative(-60f, -60f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(47f)
                lineToRelative(-63f, -64f)
                lineToRelative(-104f, 104f)
                lineToRelative(320f, 320f)
                lineToRelative(104f, -104f)
                close()
                moveToRelative(170f, -58f)
                lineToRelative(-56f, -56f)
                lineToRelative(102f, -102f)
                lineToRelative(-320f, -320f)
                lineToRelative(-102f, 102f)
                lineToRelative(-56f, -56f)
                lineToRelative(158f, -158f)
                lineToRelative(432f, 432f)
                lineToRelative(-158f, 158f)
                close()
                moveTo(638f, 522f)
                lineToRelative(42f, -42f)
                lineToRelative(-200f, -200f)
                lineToRelative(-42f, 42f)
                lineToRelative(200f, 200f)
                close()
                moveTo(538f, 422f)
                close()
                moveTo(424f, 536f)
                close()
            }
        }.build()
        
        return _Directions_alt_off!!
    }

private var _Directions_alt_off: ImageVector? = null

