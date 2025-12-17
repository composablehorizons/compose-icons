package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Line_start_circle: ImageVector
    get() {
        if (_Line_start_circle != null) return _Line_start_circle!!
        
        _Line_start_circle = ImageVector.Builder(
            name = "line_start_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 640f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(90f, 0f, 156.5f, 57f)
                reflectiveQuadTo(557f, 440f)
                horizontalLineToRelative(323f)
                verticalLineToRelative(80f)
                horizontalLineTo(557f)
                quadToRelative(-14f, 86f, -80.5f, 143f)
                reflectiveQuadTo(320f, 720f)
                close()
                moveToRelative(0f, -240f)
                close()
            }
        }.build()
        
        return _Line_start_circle!!
    }

private var _Line_start_circle: ImageVector? = null

