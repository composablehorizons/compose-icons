package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Chess: ImageVector
    get() {
        if (_Chess != null) return _Chess!!
        
        _Chess = ImageVector.Builder(
            name = "chess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 800f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(132f, -160f)
                horizontalLineToRelative(296f)
                lineToRelative(-23f, -160f)
                horizontalLineTo(355f)
                lineToRelative(-23f, 160f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(52f)
                lineToRelative(22f, -160f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(686f)
                lineToRelative(22f, 160f)
                horizontalLineToRelative(52f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(151f, -480f)
                lineToRelative(-71f, -320f)
                quadToRelative(33f, 25f, 68f, 47f)
                reflectiveQuadToRelative(77f, 22f)
                quadToRelative(40f, 0f, 73.5f, -20.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(28f, 28f, 61.5f, 48.5f)
                reflectiveQuadTo(615f, 149f)
                quadToRelative(42f, 0f, 77f, -22f)
                reflectiveQuadToRelative(68f, -47f)
                lineToRelative(-71f, 320f)
                horizontalLineToRelative(-82f)
                lineToRelative(39f, -173f)
                lineToRelative(-7.5f, 1f)
                quadToRelative(-7.5f, 1f, -23.5f, 1f)
                quadToRelative(-36f, 0f, -70.5f, -11f)
                reflectiveQuadTo(480f, 187f)
                quadToRelative(-29f, 20f, -62.5f, 31f)
                reflectiveQuadTo(349f, 229f)
                quadToRelative(-18f, 0f, -26.5f, -1f)
                lineToRelative(-8.5f, -1f)
                lineToRelative(39f, 173f)
                horizontalLineToRelative(-82f)
                close()
                moveToRelative(209f, 80f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 400f)
                close()
            }
        }.build()
        
        return _Chess!!
    }

private var _Chess: ImageVector? = null

