package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Rainy_heavy: ImageVector
    get() {
        if (_Rainy_heavy != null) return _Rainy_heavy!!
        
        _Rainy_heavy = ImageVector.Builder(
            name = "rainy_heavy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(302f, 774f)
                lineTo(26f, 222f)
                lineToRelative(72f, -35f)
                lineToRelative(276f, 550f)
                lineToRelative(-72f, 37f)
                close()
                moveToRelative(187f, 0f)
                lineTo(213f, 222f)
                lineToRelative(72f, -36f)
                lineToRelative(275f, 551f)
                lineToRelative(-71f, 37f)
                close()
                moveToRelative(187f, 0f)
                lineTo(400f, 222f)
                lineToRelative(71f, -36f)
                lineToRelative(276f, 551f)
                lineToRelative(-71f, 37f)
                close()
                moveToRelative(186f, -1f)
                lineTo(587f, 222f)
                lineToRelative(71f, -36f)
                lineToRelative(276f, 552f)
                lineToRelative(-72f, 35f)
                close()
            }
        }.build()
        
        return _Rainy_heavy!!
    }

private var _Rainy_heavy: ImageVector? = null

