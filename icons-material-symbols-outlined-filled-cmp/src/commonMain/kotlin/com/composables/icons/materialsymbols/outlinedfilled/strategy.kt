package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Strategy: ImageVector
    get() {
        if (_Strategy != null) return _Strategy!!
        
        _Strategy = ImageVector.Builder(
            name = "strategy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 880f)
                lineTo(320f, 740f)
                verticalLineToRelative(-280f)
                lineToRelative(140f, -82f)
                verticalLineToRelative(242f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-242f)
                lineToRelative(140f, 82f)
                verticalLineToRelative(280f)
                lineTo(560f, 880f)
                close()
                moveTo(220f, 440f)
                lineTo(80f, 360f)
                verticalLineToRelative(-160f)
                lineToRelative(140f, -80f)
                lineToRelative(140f, 80f)
                verticalLineToRelative(160f)
                lineToRelative(-140f, 80f)
                close()
                moveToRelative(300f, 120f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(360f)
                lineToRelative(-80f, 120f)
                lineToRelative(80f, 120f)
                horizontalLineTo(600f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Strategy!!
    }

private var _Strategy: ImageVector? = null

