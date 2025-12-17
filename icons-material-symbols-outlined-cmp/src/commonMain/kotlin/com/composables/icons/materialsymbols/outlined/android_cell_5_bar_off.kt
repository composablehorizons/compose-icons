package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Android_cell_5_bar_off: ImageVector
    get() {
        if (_Android_cell_5_bar_off != null) return _Android_cell_5_bar_off!!
        
        _Android_cell_5_bar_off = ImageVector.Builder(
            name = "android_cell_5_bar_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 800f)
                verticalLineToRelative(-240f)
                lineTo(30f, 286f)
                lineToRelative(57f, -81f)
                lineToRelative(786f, 550f)
                lineToRelative(-57f, 82f)
                lineToRelative(-86f, -60f)
                verticalLineToRelative(23f)
                horizontalLineTo(610f)
                verticalLineToRelative(-107f)
                lineToRelative(-70f, -49f)
                verticalLineToRelative(156f)
                horizontalLineTo(420f)
                close()
                moveToRelative(-380f, 0f)
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
                moveToRelative(500f, -267f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(-169f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(253f)
                close()
                moveToRelative(190f, 133f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(-422f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(506f)
                close()
            }
        }.build()
        
        return _Android_cell_5_bar_off!!
    }

private var _Android_cell_5_bar_off: ImageVector? = null

