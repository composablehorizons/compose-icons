package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Flash_off: ImageVector
    get() {
        if (_Flash_off != null) return _Flash_off!!
        
        _Flash_off = ImageVector.Builder(
            name = "flash_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 80f)
                horizontalLineToRelative(400f)
                lineToRelative(-80f, 280f)
                horizontalLineToRelative(160f)
                lineTo(643f, 529f)
                lineToRelative(-57f, -57f)
                lineToRelative(22f, -32f)
                horizontalLineToRelative(-54f)
                lineToRelative(-47f, -47f)
                lineToRelative(67f, -233f)
                horizontalLineTo(360f)
                verticalLineToRelative(86f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-86f)
                close()
                moveTo(400f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineTo(280f)
                verticalLineToRelative(-166f)
                lineTo(55f, 169f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                lineToRelative(-241f, -241f)
                lineTo(400f, 880f)
                close()
                moveToRelative(73f, -521f)
                close()
            }
        }.build()
        
        return _Flash_off!!
    }

private var _Flash_off: ImageVector? = null

