package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Android_cell_dual_4_bar: ImageVector
    get() {
        if (_Android_cell_dual_4_bar != null) return _Android_cell_dual_4_bar!!
        
        _Android_cell_dual_4_bar = ImageVector.Builder(
            name = "android_cell_dual_4_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(60f, 560f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(180f)
                horizontalLineTo(60f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(240f)
                horizontalLineTo(300f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                horizontalLineTo(540f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(400f)
                horizontalLineTo(780f)
                close()
                moveTo(60f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(60f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(300f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(540f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(160f)
                horizontalLineTo(780f)
                close()
            }
        }.build()
        
        return _Android_cell_dual_4_bar!!
    }

private var _Android_cell_dual_4_bar: ImageVector? = null

