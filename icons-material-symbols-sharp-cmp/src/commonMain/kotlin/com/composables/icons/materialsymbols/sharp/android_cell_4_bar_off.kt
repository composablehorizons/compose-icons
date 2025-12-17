package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Android_cell_4_bar_off: ImageVector
    get() {
        if (_Android_cell_4_bar_off != null) return _Android_cell_4_bar_off!!
        
        _Android_cell_4_bar_off = ImageVector.Builder(
            name = "android_cell_4_bar_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(816f, 837f)
                lineTo(660f, 728f)
                verticalLineToRelative(72f)
                horizontalLineTo(540f)
                verticalLineToRelative(-156f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(240f)
                horizontalLineTo(300f)
                verticalLineToRelative(-324f)
                lineTo(30f, 286f)
                lineToRelative(57f, -81f)
                lineToRelative(786f, 550f)
                lineToRelative(-57f, 82f)
                close()
                moveToRelative(84f, -185f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(-408f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(492f)
                close()
                moveTo(60f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                horizontalLineTo(60f)
                close()
                moveToRelative(600f, -316f)
                lineToRelative(-120f, -84f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(204f)
                close()
            }
        }.build()
        
        return _Android_cell_4_bar_off!!
    }

private var _Android_cell_4_bar_off: ImageVector? = null

