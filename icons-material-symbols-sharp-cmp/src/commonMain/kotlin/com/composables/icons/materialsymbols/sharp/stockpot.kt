package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Stockpot: ImageVector
    get() {
        if (_Stockpot != null) return _Stockpot!!
        
        _Stockpot = ImageVector.Builder(
            name = "stockpot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 800f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(480f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(-80f, -440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(360f, 280f)
                close()
            }
        }.build()
        
        return _Stockpot!!
    }

private var _Stockpot: ImageVector? = null

