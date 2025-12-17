package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Align_justify_center: ImageVector
    get() {
        if (_Align_justify_center != null) return _Align_justify_center!!
        
        _Align_justify_center = ImageVector.Builder(
            name = "align_justify_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -200f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(600f)
                close()
                moveToRelative(-360f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Align_justify_center!!
    }

private var _Align_justify_center: ImageVector? = null

