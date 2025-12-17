package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Select_window_off: ImageVector
    get() {
        if (_Select_window_off != null) return _Select_window_off!!
        
        _Select_window_off = ImageVector.Builder(
            name = "select_window_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(407f, 520f)
                horizontalLineTo(160f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-161f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(161f)
                horizontalLineTo(80f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-7f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-99f, -327f)
                lineToRelative(-85f, -85f)
                lineToRelative(-160f, -160f)
                horizontalLineToRelative(245f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(355f)
                lineTo(246f, 131f)
                verticalLineToRelative(-51f)
                horizontalLineToRelative(634f)
                verticalLineToRelative(520f)
                horizontalLineTo(720f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Select_window_off!!
    }

private var _Select_window_off: ImageVector? = null

