package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Ad_group: ImageVector
    get() {
        if (_Ad_group != null) return _Ad_group!!
        
        _Ad_group = ImageVector.Builder(
            name = "ad_group",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-400f)
                horizontalLineTo(320f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -240f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Ad_group!!
    }

private var _Ad_group: ImageVector? = null

