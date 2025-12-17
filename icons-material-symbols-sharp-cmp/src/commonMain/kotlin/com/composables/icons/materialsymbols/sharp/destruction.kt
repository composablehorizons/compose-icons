package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Destruction: ImageVector
    get() {
        if (_Destruction != null) return _Destruction!!
        
        _Destruction = ImageVector.Builder(
            name = "destruction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(320f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(61f, -300f)
                lineTo(60f, 386f)
                lineToRelative(240f, -40f)
                lineToRelative(-65f, -235f)
                lineToRelative(199f, 141f)
                lineToRelative(120f, -212f)
                lineToRelative(40f, 240f)
                lineToRelative(235f, -65f)
                lineToRelative(-141f, 199f)
                lineToRelative(152f, 86f)
                horizontalLineTo(678f)
                lineToRelative(-106f, -60f)
                lineToRelative(62f, -88f)
                lineToRelative(-104f, 29f)
                lineToRelative(-18f, -106f)
                lineToRelative(-52f, 93f)
                lineToRelative(-88f, -62f)
                lineToRelative(29f, 104f)
                lineToRelative(-106f, 18f)
                lineToRelative(120f, 72f)
                horizontalLineTo(261f)
                close()
                moveToRelative(219f, 220f)
                close()
                moveToRelative(7f, -220f)
                close()
            }
        }.build()
        
        return _Destruction!!
    }

private var _Destruction: ImageVector? = null

