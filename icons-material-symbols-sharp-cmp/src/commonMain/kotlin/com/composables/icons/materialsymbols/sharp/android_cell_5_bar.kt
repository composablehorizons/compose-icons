package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Android_cell_5_bar: ImageVector
    get() {
        if (_Android_cell_5_bar != null) return _Android_cell_5_bar!!
        
        _Android_cell_5_bar = ImageVector.Builder(
            name = "android_cell_5_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(40f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                horizontalLineTo(230f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(440f)
                horizontalLineTo(420f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(520f)
                horizontalLineTo(610f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(640f)
                horizontalLineTo(800f)
                close()
            }
        }.build()
        
        return _Android_cell_5_bar!!
    }

private var _Android_cell_5_bar: ImageVector? = null

