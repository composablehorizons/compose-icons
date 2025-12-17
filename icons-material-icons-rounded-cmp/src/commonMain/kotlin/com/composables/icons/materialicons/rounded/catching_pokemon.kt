package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Catching_pokemon: ImageVector
    get() {
        if (_Catching_pokemon != null) return _Catching_pokemon!!
        
        _Catching_pokemon = ImageVector.Builder(
            name = "catching_pokemon",
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
                moveTo(14.5f, 12f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveTo(13.38f, 9.5f, 14.5f, 10.62f, 14.5f, 12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                curveTo(6.48f, 22f, 2f, 17.52f, 2f, 12f)
                reflectiveCurveTo(6.48f, 2f, 12f, 2f)
                curveTo(17.52f, 2f, 22f, 6.48f, 22f, 12f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                horizontalLineTo(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveTo(16.41f, 20f, 20f, 16.41f, 20f, 12f)
                close()
            }
        }.build()
        
        return _Catching_pokemon!!
    }

private var _Catching_pokemon: ImageVector? = null

