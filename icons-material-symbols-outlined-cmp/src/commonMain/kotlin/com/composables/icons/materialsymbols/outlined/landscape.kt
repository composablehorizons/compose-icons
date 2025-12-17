package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Landscape: ImageVector
    get() {
        if (_Landscape != null) return _Landscape!!
        
        _Landscape = ImageVector.Builder(
            name = "landscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 720f)
                lineToRelative(240f, -320f)
                lineToRelative(180f, 240f)
                horizontalLineToRelative(300f)
                lineTo(560f, 374f)
                lineTo(460f, 506f)
                lineToRelative(-50f, -66f)
                lineToRelative(150f, -200f)
                lineToRelative(360f, 480f)
                horizontalLineTo(40f)
                close()
                moveToRelative(521f, -80f)
                close()
                moveToRelative(-361f, 0f)
                horizontalLineToRelative(160f)
                lineToRelative(-80f, -107f)
                lineToRelative(-80f, 107f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(160f)
                horizontalLineToRelative(-160f)
                close()
            }
        }.build()
        
        return _Landscape!!
    }

private var _Landscape: ImageVector? = null

