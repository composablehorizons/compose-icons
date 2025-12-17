package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Start: ImageVector
    get() {
        if (_Start != null) return _Start!!
        
        _Start = ImageVector.Builder(
            name = "start",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineTo(80f)
                close()
                moveToRelative(560f, 0f)
                lineToRelative(-57f, -56f)
                lineToRelative(144f, -144f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(487f)
                lineTo(584f, 296f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Start!!
    }

private var _Start: ImageVector? = null

