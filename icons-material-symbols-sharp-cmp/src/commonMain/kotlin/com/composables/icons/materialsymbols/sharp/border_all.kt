package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Border_all: ImageVector
    get() {
        if (_Border_all != null) return _Border_all!!
        
        _Border_all = ImageVector.Builder(
            name = "border_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -80f)
                verticalLineToRelative(-240f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                close()
                moveToRelative(0f, -560f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                close()
                moveToRelative(-560f, 0f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 560f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-240f)
                horizontalLineTo(200f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Border_all!!
    }

private var _Border_all: ImageVector? = null

