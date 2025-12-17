package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Videogame_asset_off: ImageVector
    get() {
        if (_Videogame_asset_off != null) return _Videogame_asset_off!!
        
        _Videogame_asset_off = ImageVector.Builder(
            name = "videogame_asset_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(18.33f, 12f, 17.5f, 12f)
                reflectiveCurveTo(16f, 11.33f, 16f, 10.5f)
                reflectiveCurveTo(16.67f, 9f, 17.5f, 9f)
                close()
                moveTo(10.83f, 8f)
                horizontalLineTo(20f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(1.87f, 1.87f)
                curveTo(21.45f, 17.58f, 22f, 16.85f, 22f, 16f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8.83f)
                lineTo(10.83f, 8f)
                close()
                moveTo(19.78f, 22.61f)
                lineTo(15.17f, 18f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.85f, 0.55f, -1.58f, 1.3f, -1.87f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(13.17f, 16f)
                lineToRelative(-3f, -3f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.83f)
                lineTo(5.17f, 8f)
                horizontalLineTo(4f)
                verticalLineToRelative(8f)
                horizontalLineTo(13.17f)
                close()
            }
        }.build()
        
        return _Videogame_asset_off!!
    }

private var _Videogame_asset_off: ImageVector? = null

