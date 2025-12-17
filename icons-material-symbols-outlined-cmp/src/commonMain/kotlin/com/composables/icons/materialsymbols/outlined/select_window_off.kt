package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Select_window_off: ImageVector
    get() {
        if (_Select_window_off != null) return _Select_window_off!!
        
        _Select_window_off = ImageVector.Builder(
            name = "select_window_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(819f, 932f)
                lineTo(407f, 520f)
                horizontalLineTo(160f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-161f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(81f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-7f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-99f, -327f)
                lineToRelative(-80f, -80f)
                lineToRelative(-165f, -165f)
                horizontalLineToRelative(165f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-280f)
                horizontalLineTo(355f)
                lineTo(246f, 131f)
                quadToRelative(8f, -23f, 28.5f, -37f)
                reflectiveQuadToRelative(45.5f, -14f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Select_window_off!!
    }

private var _Select_window_off: ImageVector? = null

