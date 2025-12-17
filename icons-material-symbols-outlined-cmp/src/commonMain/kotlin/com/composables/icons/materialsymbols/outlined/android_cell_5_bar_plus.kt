package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Android_cell_5_bar_plus: ImageVector
    get() {
        if (_Android_cell_5_bar_plus != null) return _Android_cell_5_bar_plus!!
        
        _Android_cell_5_bar_plus = ImageVector.Builder(
            name = "android_cell_5_bar_plus",
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
                moveToRelative(500f, -280f)
                quadToRelative(-25f, -19f, -55.5f, -29.5f)
                reflectiveQuadTo(800f, 480f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(360f)
                close()
                moveTo(610f, 280f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(213f)
                quadToRelative(-43f, 16f, -74.5f, 48f)
                reflectiveQuadTo(610f, 617f)
                verticalLineToRelative(-337f)
                close()
                moveToRelative(150f, 520f)
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
        
        return _Android_cell_5_bar_plus!!
    }

private var _Android_cell_5_bar_plus: ImageVector? = null

