package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Skillet: ImageVector
    get() {
        if (_Skillet != null) return _Skillet!!
        
        _Skillet = ImageVector.Builder(
            name = "skillet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-69f)
                lineToRelative(267f, -89f)
                lineToRelative(25f, 76f)
                lineToRelative(-212f, 71f)
                verticalLineToRelative(331f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-160f)
                horizontalLineTo(160f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, -80f)
                close()
                moveTo(177f, 400f)
                quadToRelative(14f, -36f, 4.5f, -64f)
                reflectiveQuadTo(149f, 280f)
                quadToRelative(-33f, -40f, -43.5f, -75.5f)
                reflectiveQuadTo(102f, 120f)
                horizontalLineToRelative(78f)
                quadToRelative(-8f, 38f, -2.5f, 62f)
                reflectiveQuadToRelative(28.5f, 52f)
                quadToRelative(38f, 46f, 48.5f, 81.5f)
                reflectiveQuadToRelative(0.5f, 84.5f)
                horizontalLineToRelative(-78f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(14f, -36f, 5f, -64f)
                reflectiveQuadToRelative(-32f, -56f)
                quadToRelative(-33f, -40f, -44f, -75.5f)
                reflectiveQuadToRelative(-4f, -84.5f)
                horizontalLineToRelative(78f)
                quadToRelative(-8f, 38f, -2.5f, 62f)
                reflectiveQuadToRelative(28.5f, 52f)
                quadToRelative(38f, 46f, 48.5f, 81.5f)
                reflectiveQuadToRelative(0.5f, 84.5f)
                horizontalLineToRelative(-78f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(14f, -36f, 5f, -64f)
                reflectiveQuadToRelative(-32f, -56f)
                quadToRelative(-33f, -40f, -44f, -75.5f)
                reflectiveQuadToRelative(-4f, -84.5f)
                horizontalLineToRelative(78f)
                quadToRelative(-8f, 38f, -2.5f, 62f)
                reflectiveQuadToRelative(28.5f, 52f)
                quadToRelative(38f, 46f, 48.5f, 81.5f)
                reflectiveQuadToRelative(0.5f, 84.5f)
                horizontalLineToRelative(-78f)
                close()
            }
        }.build()
        
        return _Skillet!!
    }

private var _Skillet: ImageVector? = null

