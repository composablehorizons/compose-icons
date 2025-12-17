package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bar_chart_4_bars: ImageVector
    get() {
        if (_Bar_chart_4_bars != null) return _Bar_chart_4_bars!!
        
        _Bar_chart_4_bars = ImageVector.Builder(
            name = "bar_chart_4_bars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(280f)
                horizontalLineTo(120f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(480f)
                horizontalLineTo(320f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(360f)
                horizontalLineTo(520f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(600f)
                horizontalLineTo(720f)
                close()
            }
        }.build()
        
        return _Bar_chart_4_bars!!
    }

private var _Bar_chart_4_bars: ImageVector? = null

