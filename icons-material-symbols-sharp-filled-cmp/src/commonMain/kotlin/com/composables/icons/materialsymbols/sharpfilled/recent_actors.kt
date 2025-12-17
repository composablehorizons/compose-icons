package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Recent_actors: ImageVector
    get() {
        if (_Recent_actors != null) return _Recent_actors!!
        
        _Recent_actors = ImageVector.Builder(
            name = "recent_actors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -146f)
                quadToRelative(44f, -26f, 94f, -40f)
                reflectiveQuadToRelative(106f, -14f)
                quadToRelative(56f, 0f, 106f, 14f)
                reflectiveQuadToRelative(94f, 40f)
                verticalLineToRelative(-334f)
                horizontalLineTo(120f)
                verticalLineToRelative(334f)
                close()
                moveToRelative(200f, -84f)
                quadToRelative(-46f, 0f, -78f, -32f)
                reflectiveQuadToRelative(-32f, -78f)
                quadToRelative(0f, -46f, 32f, -78f)
                reflectiveQuadToRelative(78f, -32f)
                quadToRelative(46f, 0f, 78f, 32f)
                reflectiveQuadToRelative(32f, 78f)
                quadToRelative(0f, 46f, -32f, 78f)
                reflectiveQuadToRelative(-78f, 32f)
                close()
                moveToRelative(360f, 230f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Recent_actors!!
    }

private var _Recent_actors: ImageVector? = null

