package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Catching_pokemon: ImageVector
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
                moveTo(12f, 4f)
                curveToRelative(4.08f, 0f, 7.45f, 3.05f, 7.94f, 7f)
                horizontalLineToRelative(-4.06f)
                curveTo(15.43f, 9.27f, 13.86f, 8f, 12f, 8f)
                reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3f)
                horizontalLineTo(4.06f)
                curveTo(4.55f, 7.05f, 7.92f, 4f, 12f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 4f)
                curveToRelative(4.08f, 0f, 7.45f, 3.05f, 7.94f, 7f)
                horizontalLineToRelative(-4.06f)
                curveTo(15.43f, 9.27f, 13.86f, 8f, 12f, 8f)
                reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3f)
                horizontalLineTo(4.06f)
                curveTo(4.55f, 7.05f, 7.92f, 4f, 12f, 4f)
                close()
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.08f, 0f, -7.45f, -3.05f, -7.94f, -7f)
                horizontalLineToRelative(4.06f)
                curveToRelative(0.44f, 1.73f, 2.01f, 3f, 3.87f, 3f)
                reflectiveCurveToRelative(3.43f, -1.27f, 3.87f, -3f)
                horizontalLineToRelative(4.06f)
                curveTo(19.45f, 16.95f, 16.08f, 20f, 12f, 20f)
                close()
            }
        }.build()
        
        return _Catching_pokemon!!
    }

private var _Catching_pokemon: ImageVector? = null

