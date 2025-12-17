package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stylus_pen: ImageVector
    get() {
        if (_Stylus_pen != null) return _Stylus_pen!!
        
        _Stylus_pen = ImageVector.Builder(
            name = "stylus_pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 640f)
                lineToRelative(100f, -360f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-60f)
                lineToRelative(60f, -140f)
                horizontalLineToRelative(40f)
                lineToRelative(60f, 140f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(60f)
                lineToRelative(100f, 360f)
                horizontalLineTo(240f)
                close()
                moveToRelative(-80f, 200f)
                lineToRelative(40f, -120f)
                horizontalLineToRelative(560f)
                lineToRelative(40f, 120f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Stylus_pen!!
    }

private var _Stylus_pen: ImageVector? = null

