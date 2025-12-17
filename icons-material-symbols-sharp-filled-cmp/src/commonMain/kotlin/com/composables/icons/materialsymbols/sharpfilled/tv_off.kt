package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tv_off: ImageVector
    get() {
        if (_Tv_off != null) return _Tv_off!!
        
        _Tv_off = ImageVector.Builder(
            name = "tv_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(853f, 739f)
                lineTo(234f, 120f)
                horizontalLineToRelative(646f)
                verticalLineToRelative(619f)
                horizontalLineToRelative(-27f)
                close()
                moveTo(127f, 127f)
                verticalLineToRelative(112f)
                lineToRelative(-99f, -99f)
                lineToRelative(56f, -56f)
                lineTo(876f, 876f)
                lineToRelative(-56f, 56f)
                lineToRelative(-172f, -172f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(80f)
                verticalLineToRelative(-633f)
                horizontalLineToRelative(47f)
                close()
            }
        }.build()
        
        return _Tv_off!!
    }

private var _Tv_off: ImageVector? = null

