package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Tablet: ImageVector
    get() {
        if (_Tablet != null) return _Tablet!!
        
        _Tablet = ImageVector.Builder(
            name = "tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(640f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -560f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                close()
                moveToRelative(80f, 480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(560f, -480f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-640f, 0f)
                horizontalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Tablet!!
    }

private var _Tablet: ImageVector? = null

