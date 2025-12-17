package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Nest_wifi_router: ImageVector
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
                quadToRelative(-77f, 0f, -138.5f, -44f)
                reflectiveQuadTo(134f, 680f)
                horizontalLineToRelative(692f)
                quadToRelative(-26f, 72f, -87.5f, 116f)
                reflectiveQuadTo(600f, 840f)
                horizontalLineTo(360f)
                close()
                moveTo(120f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(240f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Nest_wifi_router!!
    }

private var _Nest_wifi_router: ImageVector? = null

