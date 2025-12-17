package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Tv_off: ImageVector
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
                horizontalLineToRelative(566f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 18f, -6.5f, 32.5f)
                reflectiveQuadTo(853f, 739f)
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
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -37f, 23.5f, -55f)
                lineToRelative(23.5f, -18f)
                close()
            }
        }.build()
        
        return _Tv_off!!
    }

private var _Tv_off: ImageVector? = null

