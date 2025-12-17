package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Shadow: ImageVector
    get() {
        if (_Shadow != null) return _Shadow!!
        
        _Shadow = ImageVector.Builder(
            name = "shadow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(720f)
                verticalLineToRelative(160f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -240f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Shadow!!
    }

private var _Shadow: ImageVector? = null

