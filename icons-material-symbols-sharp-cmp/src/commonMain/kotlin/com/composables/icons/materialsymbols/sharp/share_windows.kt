package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Share_windows: ImageVector
    get() {
        if (_Share_windows != null) return _Share_windows!!
        
        _Share_windows = ImageVector.Builder(
            name = "share_windows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 600f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(406f)
                lineTo(583f, 177f)
                lineToRelative(57f, -57f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, 200f)
                lineToRelative(-57f, -56f)
                lineToRelative(103f, -104f)
                horizontalLineTo(360f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(600f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Share_windows!!
    }

private var _Share_windows: ImageVector? = null

