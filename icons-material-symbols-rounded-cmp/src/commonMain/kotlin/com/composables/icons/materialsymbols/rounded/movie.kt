package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Movie: ImageVector
    get() {
        if (_Movie != null) return _Movie!!
        
        _Movie = ImageVector.Builder(
            name = "movie",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 160f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(80f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(80f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                close()
                moveToRelative(0f, 240f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-320f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(320f)
                verticalLineToRelative(-320f)
                close()
            }
        }.build()
        
        return _Movie!!
    }

private var _Movie: ImageVector? = null

