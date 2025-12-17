package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Gas_meter: ImageVector
    get() {
        if (_Gas_meter != null) return _Gas_meter!!
        
        _Gas_meter = ImageVector.Builder(
            name = "gas_meter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 320f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 800f)
                close()
                moveToRelative(0f, -400f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, 320f)
                quadToRelative(42f, 0f, 71f, -28.5f)
                reflectiveQuadToRelative(29f, -69.5f)
                quadToRelative(0f, -33f, -19f, -56.5f)
                reflectiveQuadTo(480f, 470f)
                quadToRelative(-63f, 72f, -81.5f, 96f)
                reflectiveQuadTo(380f, 622f)
                quadToRelative(0f, 41f, 29f, 69.5f)
                reflectiveQuadToRelative(71f, 28.5f)
                close()
                moveTo(240f, 240f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Gas_meter!!
    }

private var _Gas_meter: ImageVector? = null

