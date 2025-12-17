package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_cellular_connected_no_internet_0_bar: ImageVector
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
                moveTo(148f, 812f)
                lineToRelative(664f, -664f)
                quadToRelative(19f, -19f, 43.5f, -8.5f)
                reflectiveQuadTo(880f, 177f)
                verticalLineToRelative(103f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 280f)
                verticalLineToRelative(-7f)
                lineTo(273f, 800f)
                horizontalLineToRelative(407f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(177f)
                quadToRelative(-27f, 0f, -37.5f, -24.5f)
                reflectiveQuadTo(148f, 812f)
                close()
                moveToRelative(692f, 68f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                close()
                moveToRelative(-40f, -200f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 440f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 680f)
                close()
            }
        }.build()
        
        return _Signal_cellular_connected_no_internet_0_bar!!
    }

private var _Signal_cellular_connected_no_internet_0_bar: ImageVector? = null

