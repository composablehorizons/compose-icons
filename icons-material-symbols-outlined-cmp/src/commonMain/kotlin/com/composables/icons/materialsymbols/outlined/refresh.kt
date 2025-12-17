package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Refresh: ImageVector
    get() {
        if (_Refresh != null) return _Refresh!!
        
        _Refresh = ImageVector.Builder(
            name = "refresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 800f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(69f, 0f, 132f, 28.5f)
                reflectiveQuadTo(720f, 270f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(168f)
                quadToRelative(-32f, -56f, -87.5f, -88f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(77f, 0f, 139f, -44f)
                reflectiveQuadToRelative(87f, -116f)
                horizontalLineToRelative(84f)
                quadToRelative(-28f, 106f, -114f, 173f)
                reflectiveQuadToRelative(-196f, 67f)
                close()
            }
        }.build()
        
        return _Refresh!!
    }

private var _Refresh: ImageVector? = null

