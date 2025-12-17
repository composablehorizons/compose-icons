package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Explore_nearby: ImageVector
    get() {
        if (_Explore_nearby != null) return _Explore_nearby!!
        
        _Explore_nearby = ImageVector.Builder(
            name = "explore_nearby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -180f)
                quadToRelative(45f, -45f, 80f, -93f)
                quadToRelative(30f, -41f, 55f, -90f)
                reflectiveQuadToRelative(25f, -97f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 48f, 25f, 97f)
                reflectiveQuadToRelative(55f, 90f)
                quadToRelative(35f, 48f, 80f, 93f)
                close()
                moveToRelative(0f, -220f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 420f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 420f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Explore_nearby!!
    }

private var _Explore_nearby: ImageVector? = null

