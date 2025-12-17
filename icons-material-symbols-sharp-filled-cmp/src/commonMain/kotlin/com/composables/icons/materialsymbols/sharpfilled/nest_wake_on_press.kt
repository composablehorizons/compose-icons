package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Nest_wake_on_press: ImageVector
    get() {
        if (_Nest_wake_on_press != null) return _Nest_wake_on_press!!
        
        _Nest_wake_on_press = ImageVector.Builder(
            name = "nest_wake_on_press",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 520f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(360f)
                horizontalLineTo(760f)
                close()
                moveTo(284f, 840f)
                lineTo(80f, 625f)
                lineToRelative(48f, -49f)
                lineToRelative(152f, 34f)
                verticalLineToRelative(-430f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(340f, 120f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(400f, 180f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(56f)
                lineToRelative(231f, 116f)
                lineToRelative(-43f, 304f)
                horizontalLineTo(284f)
                close()
            }
        }.build()
        
        return _Nest_wake_on_press!!
    }

private var _Nest_wake_on_press: ImageVector? = null

