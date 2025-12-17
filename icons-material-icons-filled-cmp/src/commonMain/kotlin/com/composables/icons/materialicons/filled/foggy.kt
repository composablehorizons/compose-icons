package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Foggy: ImageVector
    get() {
        if (_Foggy != null) return _Foggy!!
        
        _Foggy = ImageVector.Builder(
            name = "foggy",
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
                moveTo(17.92f, 7.02f)
                curveTo(17.45f, 4.18f, 14.97f, 2f, 12f, 2f)
                curveTo(9.82f, 2f, 7.83f, 3.18f, 6.78f, 5.06f)
                curveTo(4.09f, 5.41f, 2f, 7.74f, 2f, 10.5f)
                curveTo(2f, 13.53f, 4.47f, 16f, 7.5f, 16f)
                horizontalLineToRelative(10f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveTo(22f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f)
                close()
                moveTo(18f, 17.01f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(17.45f, 17.01f, 18f, 17.01f)
                close()
                moveTo(7f, 20.01f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(6.45f, 20.01f, 7f, 20.01f)
                close()
                moveTo(6f, 17.01f)
                horizontalLineToRelative(9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineToRelative(0f, 0f)
                curveTo(5f, 17.46f, 5.45f, 17.01f, 6f, 17.01f)
                close()
                moveTo(10f, 20.01f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineToRelative(0f, 0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineToRelative(0f, 0f)
                curveTo(9f, 20.46f, 9.45f, 20.01f, 10f, 20.01f)
                close()
            }
        }.build()
        
        return _Foggy!!
    }

private var _Foggy: ImageVector? = null

