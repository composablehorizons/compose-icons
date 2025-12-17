package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Videogame_asset: ImageVector
    get() {
        if (_Videogame_asset != null) return _Videogame_asset!!
        
        _Videogame_asset = ImageVector.Builder(
            name = "videogame_asset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 16f)
                horizontalLineToRelative(18f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(15.5f, -7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveToRelative(-4f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 6f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(8f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 20f, 10.5f)
                close()
            }
        }.build()
        
        return _Videogame_asset!!
    }

private var _Videogame_asset: ImageVector? = null

