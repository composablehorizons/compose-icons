package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cognition_2: ImageVector
    get() {
        if (_Cognition_2 != null) return _Cognition_2!!
        
        _Cognition_2 = ImageVector.Builder(
            name = "cognition_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-172f)
                quadToRelative(-57f, -52f, -88.5f, -121.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, -150f, 105f, -255f)
                reflectiveQuadToRelative(255f, -105f)
                quadToRelative(125f, 0f, 221.5f, 73.5f)
                reflectiveQuadTo(827f, 345f)
                lineToRelative(52f, 205f)
                quadToRelative(5f, 19f, -7f, 34.5f)
                reflectiveQuadTo(840f, 600f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(69f, -309f)
                quadToRelative(29f, 29f, 71f, 29f)
                reflectiveQuadToRelative(71f, -29f)
                lineToRelative(160f, -160f)
                quadToRelative(29f, -29f, 29f, -71f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(-29f, -29f, -71f, -29f)
                reflectiveQuadToRelative(-71f, 29f)
                quadToRelative(-37f, -13f, -73f, -6f)
                reflectiveQuadToRelative(-61f, 32f)
                quadToRelative(-25f, 25f, -32f, 61f)
                reflectiveQuadToRelative(6f, 73f)
                quadToRelative(-29f, 29f, -29f, 71f)
                reflectiveQuadToRelative(29f, 71f)
                close()
            }
        }.build()
        
        return _Cognition_2!!
    }

private var _Cognition_2: ImageVector? = null

