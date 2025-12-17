package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Celebration: ImageVector
    get() {
        if (_Celebration != null) return _Celebration!!
        
        _Celebration = ImageVector.Builder(
            name = "celebration",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(200f, -560f)
                lineToRelative(360f, 360f)
                lineTo(80f, 880f)
                close()
                moveToRelative(502f, -378f)
                lineToRelative(-42f, -42f)
                lineToRelative(301f, -301f)
                lineToRelative(101f, 101f)
                lineToRelative(-42f, 42f)
                lineToRelative(-59f, -59f)
                lineToRelative(-259f, 259f)
                close()
                moveTo(422f, 342f)
                lineToRelative(-42f, -42f)
                lineToRelative(58f, -58f)
                lineToRelative(-60f, -60f)
                lineToRelative(42f, -42f)
                lineToRelative(102f, 102f)
                lineToRelative(-100f, 100f)
                close()
                moveToRelative(80f, 80f)
                lineToRelative(-42f, -42f)
                lineToRelative(179f, -179f)
                lineToRelative(-99f, -99f)
                lineToRelative(42f, -42f)
                lineToRelative(141f, 141f)
                lineToRelative(-221f, 221f)
                close()
                moveToRelative(160f, 160f)
                lineToRelative(-42f, -42f)
                lineToRelative(141f, -141f)
                lineToRelative(141f, 141f)
                lineToRelative(-42f, 42f)
                lineToRelative(-99f, -99f)
                lineToRelative(-99f, 99f)
                close()
            }
        }.build()
        
        return _Celebration!!
    }

private var _Celebration: ImageVector? = null

