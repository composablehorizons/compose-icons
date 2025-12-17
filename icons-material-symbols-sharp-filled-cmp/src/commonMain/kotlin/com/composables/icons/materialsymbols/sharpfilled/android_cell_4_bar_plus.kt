package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Android_cell_4_bar_plus: ImageVector
    get() {
        if (_Android_cell_4_bar_plus != null) return _Android_cell_4_bar_plus!!
        
        _Android_cell_4_bar_plus = ImageVector.Builder(
            name = "android_cell_4_bar_plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(60f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                horizontalLineTo(60f)
                close()
                moveToRelative(240f, 0f)
                verticalLineToRelative(-420f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(420f)
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
                verticalLineToRelative(-520f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(257f)
                quadToRelative(-28f, 27f, -44f, 64f)
                reflectiveQuadToRelative(-16f, 79f)
                quadToRelative(0f, 34f, 10.5f, 64.5f)
                reflectiveQuadTo(640f, 800f)
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
            }
        }.build()
        
        return _Android_cell_4_bar_plus!!
    }

private var _Android_cell_4_bar_plus: ImageVector? = null

