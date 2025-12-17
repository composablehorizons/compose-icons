package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Android_cell_dual_5_bar: ImageVector
    get() {
        if (_Android_cell_dual_5_bar != null) return _Android_cell_dual_5_bar!!
        
        _Android_cell_dual_5_bar = ImageVector.Builder(
            name = "android_cell_dual_5_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 560f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(180f)
                horizontalLineTo(40f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(230f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(280f)
                horizontalLineTo(420f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                horizontalLineTo(610f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(800f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(40f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(230f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(420f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(610f)
                close()
                moveToRelative(190f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(800f)
                close()
            }
        }.build()
        
        return _Android_cell_dual_5_bar!!
    }

private var _Android_cell_dual_5_bar: ImageVector? = null

