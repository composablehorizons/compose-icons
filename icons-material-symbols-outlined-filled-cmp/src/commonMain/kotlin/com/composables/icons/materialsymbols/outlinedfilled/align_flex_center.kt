package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Align_flex_center: ImageVector
    get() {
        if (_Align_flex_center != null) return _Align_flex_center!!
        
        _Align_flex_center = ImageVector.Builder(
            name = "align_flex_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 880f)
                verticalLineToRelative(-340f)
                horizontalLineTo(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-340f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(340f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(120f)
                horizontalLineTo(520f)
                verticalLineToRelative(340f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Align_flex_center!!
    }

private var _Align_flex_center: ImageVector? = null

