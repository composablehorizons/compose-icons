package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Magic_button: ImageVector
    get() {
        if (_Magic_button != null) return _Magic_button!!
        
        _Magic_button = ImageVector.Builder(
            name = "magic_button",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 19f)
                lineToRelative(-2.5f, -5.5f)
                lineTo(2f, 11f)
                lineToRelative(5.5f, -2.5f)
                lineTo(10f, 3f)
                lineToRelative(2.5f, 5.5f)
                lineTo(18f, 11f)
                lineToRelative(-5.5f, 2.5f)
                close()
                moveToRelative(8f, 2f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(14f, 17f)
                lineToRelative(2.75f, -1.25f)
                lineTo(18f, 13f)
                lineToRelative(1.25f, 2.75f)
                lineTo(22f, 17f)
                lineToRelative(-2.75f, 1.25f)
                close()
            }
        }.build()
        
        return _Magic_button!!
    }

private var _Magic_button: ImageVector? = null

