package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stacked_bar_chart: ImageVector
    get() {
        if (_Stacked_bar_chart != null) return _Stacked_bar_chart!!
        
        _Stacked_bar_chart = ImageVector.Builder(
            name = "stacked_bar_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -480f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                close()
                moveToRelative(240f, 480f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(320f)
                horizontalLineTo(400f)
                close()
                moveToRelative(0f, -360f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(400f)
                close()
                moveToRelative(240f, 360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Stacked_bar_chart!!
    }

private var _Stacked_bar_chart: ImageVector? = null

