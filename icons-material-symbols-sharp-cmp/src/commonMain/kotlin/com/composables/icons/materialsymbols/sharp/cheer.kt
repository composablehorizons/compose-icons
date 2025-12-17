package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Cheer: ImageVector
    get() {
        if (_Cheer != null) return _Cheer!!
        
        _Cheer = ImageVector.Builder(
            name = "cheer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(312f, 209f)
                lineToRelative(-40f, -120f)
                lineToRelative(56f, -18f)
                lineToRelative(40f, 119f)
                lineToRelative(-56f, 19f)
                close()
                moveToRelative(138f, -49f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(198f, 49f)
                lineToRelative(-56f, -19f)
                lineToRelative(40f, -119f)
                lineToRelative(56f, 19f)
                lineToRelative(-40f, 119f)
                close()
                moveTo(874f, 920f)
                lineToRelative(12f, -79f)
                lineToRelative(-236f, -36f)
                lineToRelative(-41f, -131f)
                lineToRelative(19f, -42f)
                lineToRelative(32f, 100f)
                lineToRelative(76f, -24f)
                lineToRelative(-99f, -310f)
                lineToRelative(7f, -3f)
                lineToRelative(171f, 325f)
                horizontalLineToRelative(105f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-56f)
                lineTo(676f, 285f)
                lineToRelative(-135f, 75f)
                lineToRelative(51f, 160f)
                lineToRelative(-69f, 148f)
                lineToRelative(66f, 209f)
                lineToRelative(285f, 43f)
                close()
                moveTo(660f, 732f)
                lineToRelative(-68f, -212f)
                lineToRelative(68f, 212f)
                close()
                moveToRelative(76f, -24f)
                close()
                moveTo(86f, 920f)
                lineToRelative(-12f, -79f)
                lineToRelative(235f, -36f)
                lineToRelative(42f, -131f)
                lineToRelative(-20f, -42f)
                lineToRelative(-31f, 100f)
                lineToRelative(-76f, -24f)
                lineToRelative(98f, -310f)
                lineToRelative(-6f, -3f)
                lineToRelative(-172f, 325f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(56f)
                lineToRelative(188f, -355f)
                lineToRelative(135f, 75f)
                lineToRelative(-51f, 160f)
                lineToRelative(69f, 148f)
                lineToRelative(-67f, 209f)
                lineTo(86f, 920f)
                close()
                moveToRelative(214f, -188f)
                lineToRelative(68f, -212f)
                lineToRelative(-68f, 212f)
                close()
                moveToRelative(-76f, -24f)
                close()
            }
        }.build()
        
        return _Cheer!!
    }

private var _Cheer: ImageVector? = null

