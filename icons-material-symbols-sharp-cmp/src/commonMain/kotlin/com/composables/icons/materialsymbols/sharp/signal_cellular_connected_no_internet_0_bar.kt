package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Signal_cellular_connected_no_internet_0_bar: ImageVector
    get() {
        if (_Signal_cellular_connected_no_internet_0_bar != null) return _Signal_cellular_connected_no_internet_0_bar!!
        
        _Signal_cellular_connected_no_internet_0_bar = ImageVector.Builder(
            name = "signal_cellular_connected_no_internet_0_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                lineToRelative(800f, -800f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-47f)
                lineTo(273f, 800f)
                horizontalLineToRelative(447f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(720f, -160f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(80f, 80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Signal_cellular_connected_no_internet_0_bar!!
    }

private var _Signal_cellular_connected_no_internet_0_bar: ImageVector? = null

