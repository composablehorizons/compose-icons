package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Power_off: ImageVector
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
                verticalLineToRelative(-220f)
                quadToRelative(0f, -24f, 11f, -45f)
                reflectiveQuadToRelative(32f, -32f)
                verticalLineToRelative(112f)
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
                lineTo(320f, 206f)
                verticalLineToRelative(-86f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                lineToRelative(-40f, -40f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 360f)
                verticalLineToRelative(178f)
                lineToRelative(-34f, 34f)
                close()
            }
        }.build()
        
        return _Power_off!!
    }

private var _Power_off: ImageVector? = null

