package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Airline_stops: ImageVector
    get() {
        if (_Airline_stops != null) return _Airline_stops!!
        
        _Airline_stops = ImageVector.Builder(
            name = "airline_stops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(-15f, -138f, -118f, -229f)
                reflectiveQuadTo(80f, 360f)
                verticalLineToRelative(-80f)
                quadToRelative(129f, 0f, 237f, 68f)
                reflectiveQuadToRelative(163f, 184f)
                quadToRelative(38f, -81f, 100f, -143.5f)
                reflectiveQuadTo(719f, 280f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-132f)
                quadToRelative(-93f, 57f, -160f, 141f)
                reflectiveQuadToRelative(-80f, 191f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
            }
        }.build()
        
        return _Airline_stops!!
    }

private var _Airline_stops: ImageVector? = null

