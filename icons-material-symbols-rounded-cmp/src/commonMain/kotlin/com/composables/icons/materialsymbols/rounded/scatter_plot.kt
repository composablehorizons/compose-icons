package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Scatter_plot: ImageVector
    get() {
        if (_Scatter_plot != null) return _Scatter_plot!!
        
        _Scatter_plot = ImageVector.Builder(
            name = "scatter_plot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 680f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 760f)
                close()
                moveToRelative(-400f, -40f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(280f, 640f)
                close()
                moveToRelative(160f, -240f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(520f, 240f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(440f, 320f)
                close()
                moveToRelative(240f, 360f)
                close()
                moveTo(280f, 560f)
                close()
                moveToRelative(160f, -320f)
                close()
            }
        }.build()
        
        return _Scatter_plot!!
    }

private var _Scatter_plot: ImageVector? = null

