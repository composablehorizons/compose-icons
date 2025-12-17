package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Install_desktop: ImageVector
    get() {
        if (_Install_desktop != null) return _Install_desktop!!
        
        _Install_desktop = ImageVector.Builder(
            name = "install_desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(360f, -280f)
                lineTo(480f, 360f)
                lineToRelative(56f, -56f)
                lineToRelative(104f, 103f)
                verticalLineToRelative(-287f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(287f)
                lineToRelative(104f, -103f)
                lineToRelative(56f, 56f)
                lineToRelative(-200f, 200f)
                close()
            }
        }.build()
        
        return _Install_desktop!!
    }

private var _Install_desktop: ImageVector? = null

