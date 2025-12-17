package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Altitude: ImageVector
    get() {
        if (_Altitude != null) return _Altitude!!
        
        _Altitude = ImageVector.Builder(
            name = "altitude",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 480f)
                verticalLineToRelative(-168f)
                lineToRelative(-64f, 64f)
                lineToRelative(-56f, -56f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                lineToRelative(-56f, 57f)
                lineToRelative(-64f, -64f)
                verticalLineToRelative(167f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(40f, 880f)
                lineToRelative(240f, -320f)
                lineToRelative(180f, 240f)
                horizontalLineToRelative(300f)
                lineTo(560f, 534f)
                lineTo(460f, 666f)
                lineToRelative(-50f, -66f)
                lineToRelative(150f, -200f)
                lineTo(920f, 880f)
                horizontalLineTo(40f)
                close()
                moveToRelative(420f, -80f)
                close()
            }
        }.build()
        
        return _Altitude!!
    }

private var _Altitude: ImageVector? = null

