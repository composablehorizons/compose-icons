package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Air_purifier: ImageVector
    get() {
        if (_Air_purifier != null) return _Air_purifier!!
        
        _Air_purifier = ImageVector.Builder(
            name = "air_purifier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                horizontalLineToRelative(280f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(120f)
                close()
                moveToRelative(300f, -200f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(420f, 400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(500f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(420f, 560f)
                close()
                moveToRelative(260f, -80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(36f)
                quadToRelative(9f, 0f, 16f, -4.5f)
                reflectiveQuadToRelative(12f, -13.5f)
                quadToRelative(15f, -29f, 41.5f, -45.5f)
                reflectiveQuadTo(844f, 320f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-36f)
                quadToRelative(-9f, 0f, -16f, 4.5f)
                reflectiveQuadTo(816f, 418f)
                quadToRelative(-15f, 29f, -41.5f, 45.5f)
                reflectiveQuadTo(716f, 480f)
                horizontalLineToRelative(-36f)
                close()
                moveToRelative(0f, 160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(36f)
                quadToRelative(9f, 0f, 16f, -4.5f)
                reflectiveQuadToRelative(12f, -13.5f)
                quadToRelative(15f, -29f, 41.5f, -45.5f)
                reflectiveQuadTo(844f, 480f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-36f)
                quadToRelative(-9f, 0f, -16f, 4.5f)
                reflectiveQuadTo(816f, 578f)
                quadToRelative(-15f, 29f, -41.5f, 45.5f)
                reflectiveQuadTo(716f, 640f)
                horizontalLineToRelative(-36f)
                close()
            }
        }.build()
        
        return _Air_purifier!!
    }

private var _Air_purifier: ImageVector? = null

