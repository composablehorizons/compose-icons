package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flash_on: ImageVector
    get() {
        if (_Flash_on != null) return _Flash_on!!
        
        _Flash_on = ImageVector.Builder(
            name = "flash_on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 624f)
                lineToRelative(128f, -184f)
                horizontalLineTo(494f)
                lineToRelative(80f, -280f)
                horizontalLineTo(360f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(144f)
                close()
                moveTo(400f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineTo(280f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(400f)
                lineToRelative(-80f, 280f)
                horizontalLineToRelative(160f)
                lineTo(400f, 880f)
                close()
                moveToRelative(80f, -400f)
                horizontalLineTo(360f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Flash_on!!
    }

private var _Flash_on: ImageVector? = null

