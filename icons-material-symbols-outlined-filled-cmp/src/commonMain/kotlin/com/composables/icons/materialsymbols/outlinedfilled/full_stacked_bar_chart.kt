package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Full_stacked_bar_chart: ImageVector
    get() {
        if (_Full_stacked_bar_chart != null) return _Full_stacked_bar_chart!!
        
        _Full_stacked_bar_chart = ImageVector.Builder(
            name = "full_stacked_bar_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(280f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, 360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(280f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -320f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(120f)
                horizontalLineTo(400f)
                close()
                moveToRelative(240f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -120f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Full_stacked_bar_chart!!
    }

private var _Full_stacked_bar_chart: ImageVector? = null

