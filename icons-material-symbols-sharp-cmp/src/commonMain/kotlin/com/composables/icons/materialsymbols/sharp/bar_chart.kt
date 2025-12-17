package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bar_chart: ImageVector
    get() {
        if (_Bar_chart != null) return _Bar_chart!!
        
        _Bar_chart = ImageVector.Builder(
            name = "bar_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 800f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(280f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(640f)
                horizontalLineTo(400f)
                close()
                moveToRelative(-240f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(440f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Bar_chart!!
    }

private var _Bar_chart: ImageVector? = null

