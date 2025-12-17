package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.My_location: ImageVector
    get() {
        if (_My_location != null) return _My_location!!
        
        _My_location = ImageVector.Builder(
            name = "my_location",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 918f)
                verticalLineToRelative(-80f)
                quadToRelative(-125f, -14f, -214.5f, -103.5f)
                reflectiveQuadTo(122f, 520f)
                horizontalLineTo(42f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(14f, -125f, 103.5f, -214.5f)
                reflectiveQuadTo(440f, 122f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                quadToRelative(125f, 14f, 214.5f, 103.5f)
                reflectiveQuadTo(838f, 440f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-14f, 125f, -103.5f, 214.5f)
                reflectiveQuadTo(520f, 838f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, -158f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _My_location!!
    }

private var _My_location: ImageVector? = null

