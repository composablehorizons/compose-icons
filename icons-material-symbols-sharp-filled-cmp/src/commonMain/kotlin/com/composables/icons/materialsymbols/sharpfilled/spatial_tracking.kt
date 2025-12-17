package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Spatial_tracking: ImageVector
    get() {
        if (_Spatial_tracking != null) return _Spatial_tracking!!
        
        _Spatial_tracking = ImageVector.Builder(
            name = "spatial_tracking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 520f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(160f, 840f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 17f, -62f)
                reflectiveQuadToRelative(47f, -44f)
                quadToRelative(51f, -26f, 115f, -44f)
                reflectiveQuadToRelative(141f, -18f)
                quadToRelative(77f, 0f, 141f, 18f)
                reflectiveQuadToRelative(115f, 44f)
                quadToRelative(30f, 15f, 47f, 44f)
                reflectiveQuadToRelative(17f, 62f)
                verticalLineToRelative(112f)
                horizontalLineTo(160f)
                close()
                moveTo(39f, 200f)
                verticalLineToRelative(-80f)
                quadToRelative(17f, 0f, 31f, -6.5f)
                reflectiveQuadTo(95f, 96f)
                quadToRelative(11f, -11f, 17f, -25f)
                reflectiveQuadToRelative(6f, -31f)
                horizontalLineToRelative(81f)
                quadToRelative(0f, 33f, -12.5f, 62f)
                reflectiveQuadTo(152f, 153f)
                quadToRelative(-22f, 22f, -51f, 34.5f)
                reflectiveQuadTo(39f, 200f)
                close()
                moveToRelative(0f, 161f)
                verticalLineToRelative(-80f)
                quadToRelative(51f, 0f, 94.5f, -19f)
                reflectiveQuadToRelative(75.5f, -52f)
                quadToRelative(32f, -33f, 51f, -76.5f)
                reflectiveQuadToRelative(19f, -93.5f)
                horizontalLineToRelative(81f)
                quadToRelative(0f, 66f, -25f, 124.5f)
                reflectiveQuadTo(266f, 267f)
                quadToRelative(-44f, 44f, -102f, 69f)
                reflectiveQuadTo(39f, 361f)
                close()
                moveToRelative(881f, 0f)
                quadToRelative(-66f, 0f, -124.5f, -25f)
                reflectiveQuadTo(693f, 267f)
                quadToRelative(-44f, -44f, -69f, -102.5f)
                reflectiveQuadTo(599f, 40f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 50f, 19f, 93.5f)
                reflectiveQuadToRelative(52f, 76.5f)
                quadToRelative(33f, 33f, 76.5f, 52f)
                reflectiveQuadToRelative(93.5f, 19f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -161f)
                quadToRelative(-33f, 0f, -62f, -12.5f)
                reflectiveQuadTo(807f, 153f)
                quadToRelative(-22f, -22f, -34.5f, -51f)
                reflectiveQuadTo(760f, 40f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 17f, 6.5f, 31f)
                reflectiveQuadToRelative(17.5f, 25f)
                quadToRelative(11f, 11f, 25f, 17.5f)
                reflectiveQuadToRelative(31f, 6.5f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Spatial_tracking!!
    }

private var _Spatial_tracking: ImageVector? = null

