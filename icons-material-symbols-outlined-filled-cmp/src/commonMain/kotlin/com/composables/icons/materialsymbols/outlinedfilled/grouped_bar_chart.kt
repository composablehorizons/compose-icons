package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Grouped_bar_chart: ImageVector
    get() {
        if (_Grouped_bar_chart != null) return _Grouped_bar_chart!!
        
        _Grouped_bar_chart = ImageVector.Builder(
            name = "grouped_bar_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(280f)
                horizontalLineTo(360f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(640f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Grouped_bar_chart!!
    }

private var _Grouped_bar_chart: ImageVector? = null

