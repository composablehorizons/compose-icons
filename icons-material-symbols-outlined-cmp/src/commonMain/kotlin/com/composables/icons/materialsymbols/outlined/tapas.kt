package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tapas: ImageVector
    get() {
        if (_Tapas != null) return _Tapas!!
        
        _Tapas = ImageVector.Builder(
            name = "tapas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 920f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(-80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, -440f)
                horizontalLineToRelative(240f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineTo(160f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(0f, -240f)
                horizontalLineToRelative(240f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineTo(160f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveTo(600f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-286f)
                quadToRelative(-53f, -14f, -86.5f, -56.5f)
                reflectiveQuadTo(560f, 400f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 55f, -33.5f, 97.5f)
                reflectiveQuadTo(760f, 554f)
                verticalLineToRelative(286f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
                moveToRelative(120f, -440f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(640f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(720f, 480f)
                close()
                moveToRelative(-80f, -240f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(640f)
                verticalLineToRelative(120f)
                close()
                moveTo(140f, 480f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(580f, 80f)
                close()
            }
        }.build()
        
        return _Tapas!!
    }

private var _Tapas: ImageVector? = null

