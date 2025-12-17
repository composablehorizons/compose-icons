package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Nest_wifi_router: ImageVector
    get() {
        if (_Nest_wifi_router != null) return _Nest_wifi_router!!
        
        _Nest_wifi_router = ImageVector.Builder(
            name = "nest_wifi_router",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                horizontalLineTo(360f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                horizontalLineTo(360f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(22f, 80f)
                quadToRelative(21f, 36f, 57f, 58f)
                reflectiveQuadToRelative(81f, 22f)
                horizontalLineToRelative(240f)
                quadToRelative(45f, 0f, 81f, -22f)
                reflectiveQuadToRelative(57f, -58f)
                horizontalLineTo(222f)
                close()
                moveToRelative(258f, -80f)
                close()
            }
        }.build()
        
        return _Nest_wifi_router!!
    }

private var _Nest_wifi_router: ImageVector? = null

