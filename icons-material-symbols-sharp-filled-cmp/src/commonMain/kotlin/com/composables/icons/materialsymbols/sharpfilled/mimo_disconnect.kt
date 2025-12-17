package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mimo_disconnect: ImageVector
    get() {
        if (_Mimo_disconnect != null) return _Mimo_disconnect!!
        
        _Mimo_disconnect = ImageVector.Builder(
            name = "mimo_disconnect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(820f, 932f)
                lineTo(608f, 720f)
                horizontalLineToRelative(72f)
                lineToRelative(40f, 40f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                lineToRelative(40f, -40f)
                horizontalLineTo(80f)
                verticalLineToRelative(-593f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(112f)
                lineToRelative(-99f, -99f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(8f, -218f)
                lineTo(234f, 120f)
                horizontalLineToRelative(646f)
                verticalLineToRelative(594f)
                horizontalLineToRelative(-52f)
                close()
            }
        }.build()
        
        return _Mimo_disconnect!!
    }

private var _Mimo_disconnect: ImageVector? = null

