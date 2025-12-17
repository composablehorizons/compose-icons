package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Swap_horizontal_circle: ImageVector
    get() {
        if (_Swap_horizontal_circle != null) return _Swap_horizontal_circle!!
        
        _Swap_horizontal_circle = ImageVector.Builder(
            name = "swap_horizontal_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                lineToRelative(56f, -56f)
                lineToRelative(-62f, -64f)
                horizontalLineToRelative(166f)
                verticalLineToRelative(-80f)
                horizontalLineTo(354f)
                lineToRelative(62f, -64f)
                lineToRelative(-56f, -56f)
                lineToRelative(-160f, 160f)
                lineToRelative(160f, 160f)
                close()
                moveToRelative(240f, -160f)
                lineToRelative(160f, -160f)
                lineToRelative(-160f, -160f)
                lineToRelative(-56f, 56f)
                lineToRelative(62f, 64f)
                horizontalLineTo(440f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(166f)
                lineToRelative(-62f, 64f)
                lineToRelative(56f, 56f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Swap_horizontal_circle!!
    }

private var _Swap_horizontal_circle: ImageVector? = null

