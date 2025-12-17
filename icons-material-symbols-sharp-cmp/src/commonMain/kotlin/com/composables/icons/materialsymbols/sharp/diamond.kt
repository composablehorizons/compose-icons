package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Diamond: ImageVector
    get() {
        if (_Diamond != null) return _Diamond!!
        
        _Diamond = ImageVector.Builder(
            name = "diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(80f, 360f)
                lineToRelative(120f, -240f)
                horizontalLineToRelative(560f)
                lineToRelative(120f, 240f)
                lineToRelative(-400f, 480f)
                close()
                moveToRelative(-95f, -520f)
                horizontalLineToRelative(190f)
                lineToRelative(-60f, -120f)
                horizontalLineToRelative(-70f)
                lineToRelative(-60f, 120f)
                close()
                moveToRelative(55f, 347f)
                verticalLineToRelative(-267f)
                horizontalLineTo(218f)
                lineToRelative(222f, 267f)
                close()
                moveToRelative(80f, 0f)
                lineToRelative(222f, -267f)
                horizontalLineTo(520f)
                verticalLineToRelative(267f)
                close()
                moveToRelative(144f, -347f)
                horizontalLineToRelative(106f)
                lineToRelative(-60f, -120f)
                horizontalLineTo(604f)
                lineToRelative(60f, 120f)
                close()
                moveToRelative(-474f, 0f)
                horizontalLineToRelative(106f)
                lineToRelative(60f, -120f)
                horizontalLineTo(250f)
                lineToRelative(-60f, 120f)
                close()
            }
        }.build()
        
        return _Diamond!!
    }

private var _Diamond: ImageVector? = null

