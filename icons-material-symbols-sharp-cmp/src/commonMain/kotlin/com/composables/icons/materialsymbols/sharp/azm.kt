package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Azm: ImageVector
    get() {
        if (_Azm != null) return _Azm!!
        
        _Azm = ImageVector.Builder(
            name = "azm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 920f)
                verticalLineToRelative(-360f)
                horizontalLineTo(40f)
                lineToRelative(400f, -400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(360f)
                lineTo(400f, 920f)
                close()
                moveToRelative(240f, -353f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-247f)
                horizontalLineTo(473f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(247f)
                verticalLineToRelative(247f)
                close()
                moveTo(480f, 727f)
                lineToRelative(80f, -80f)
                verticalLineToRelative(-247f)
                horizontalLineTo(313f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(247f)
                verticalLineToRelative(247f)
                close()
            }
        }.build()
        
        return _Azm!!
    }

private var _Azm: ImageVector? = null

