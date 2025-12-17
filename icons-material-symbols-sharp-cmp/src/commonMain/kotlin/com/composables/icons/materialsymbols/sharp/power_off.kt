package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Power_off: ImageVector
    get() {
        if (_Power_off != null) return _Power_off!!
        
        _Power_off = ImageVector.Builder(
            name = "power_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 840f)
                verticalLineToRelative(-120f)
                lineTo(240f, 580f)
                verticalLineToRelative(-297f)
                horizontalLineToRelative(43f)
                lineToRelative(77f, 77f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(186f)
                lineToRelative(140f, 140f)
                verticalLineToRelative(74f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-74f)
                lineToRelative(37f, -37f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                lineToRelative(-198f, -198f)
                lineToRelative(-14f, 14f)
                verticalLineToRelative(120f)
                horizontalLineTo(380f)
                close()
                moveToRelative(306f, -268f)
                lineToRelative(-46f, -46f)
                verticalLineToRelative(-166f)
                horizontalLineTo(474f)
                lineTo(320f, 206f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(258f)
                lineToRelative(-34f, 34f)
                close()
                moveTo(558f, 444f)
                close()
                moveToRelative(-130f, 97f)
                close()
            }
        }.build()
        
        return _Power_off!!
    }

private var _Power_off: ImageVector? = null

