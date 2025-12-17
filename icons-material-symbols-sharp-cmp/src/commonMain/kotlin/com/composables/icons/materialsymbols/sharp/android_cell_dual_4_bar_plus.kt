package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Android_cell_dual_4_bar_plus: ImageVector
    get() {
        if (_Android_cell_dual_4_bar_plus != null) return _Android_cell_dual_4_bar_plus!!
        
        _Android_cell_dual_4_bar_plus = ImageVector.Builder(
            name = "android_cell_dual_4_bar_plus",
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
                moveToRelative(480f, -319f)
                verticalLineToRelative(-321f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(347f)
                quadToRelative(-27f, -16f, -57.5f, -22.5f)
                reflectiveQuadTo(780f, 481f)
                close()
                moveTo(540f, 800f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(64f)
                quadToRelative(-8f, 42f, 1f, 83.5f)
                reflectiveQuadToRelative(35f, 76.5f)
                horizontalLineTo(540f)
                close()
                moveToRelative(220f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(540f, 560f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(297f)
                quadToRelative(-5f, 5f, -10f, 11f)
                lineToRelative(-10f, 12f)
                horizontalLineTo(540f)
                close()
            }
        }.build()
        
        return _Android_cell_dual_4_bar_plus!!
    }

private var _Android_cell_dual_4_bar_plus: ImageVector? = null

