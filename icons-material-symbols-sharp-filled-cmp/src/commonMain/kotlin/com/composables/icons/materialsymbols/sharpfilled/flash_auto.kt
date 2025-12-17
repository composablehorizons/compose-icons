package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Flash_auto: ImageVector
    get() {
        if (_Flash_auto != null) return _Flash_auto!!
        
        _Flash_auto = ImageVector.Builder(
            name = "flash_auto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                verticalLineToRelative(-320f)
                horizontalLineTo(80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(400f)
                lineToRelative(-80f, 280f)
                horizontalLineToRelative(160f)
                lineTo(200f, 880f)
                close()
                moveToRelative(385f, -440f)
                lineToRelative(135f, -360f)
                horizontalLineToRelative(64f)
                lineToRelative(137f, 360f)
                horizontalLineToRelative(-62f)
                lineToRelative(-32f, -92f)
                horizontalLineTo(679f)
                lineToRelative(-32f, 92f)
                horizontalLineToRelative(-62f)
                close()
                moveToRelative(112f, -144f)
                horizontalLineToRelative(110f)
                lineToRelative(-53f, -150f)
                horizontalLineToRelative(-2f)
                lineToRelative(-55f, 150f)
                close()
            }
        }.build()
        
        return _Flash_auto!!
    }

private var _Flash_auto: ImageVector? = null

