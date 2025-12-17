package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wb_shade: ImageVector
    get() {
        if (_Wb_shade != null) return _Wb_shade!!
        
        _Wb_shade = ImageVector.Builder(
            name = "wb_shade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(780f, 800f)
                lineTo(560f, 580f)
                verticalLineToRelative(-100f)
                lineToRelative(320f, 320f)
                horizontalLineTo(780f)
                close()
                moveToRelative(-220f, 0f)
                verticalLineToRelative(-120f)
                lineToRelative(120f, 120f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-400f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineTo(80f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(400f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -240f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Wb_shade!!
    }

private var _Wb_shade: ImageVector? = null

