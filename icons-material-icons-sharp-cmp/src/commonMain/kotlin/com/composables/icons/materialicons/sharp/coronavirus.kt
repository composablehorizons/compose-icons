package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Coronavirus: ImageVector
    get() {
        if (_Coronavirus != null) return _Coronavirus!!
        
        _Coronavirus = ImageVector.Builder(
            name = "coronavirus",
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
                moveTo(20.5f, 10.5f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.54f)
                curveToRelative(-0.15f, -1.37f, -0.69f, -2.63f, -1.52f, -3.65f)
                lineToRelative(1.09f, -1.09f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.53f, 0.53f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(0.52f, 0.52f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(-1.02f, -0.82f, -2.27f, -1.36f, -3.64f, -1.51f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(0.01f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(0.74f)
                verticalLineToRelative(1.54f)
                curveTo(9.87f, 5.19f, 8.62f, 5.74f, 7.6f, 6.56f)
                lineTo(6.51f, 5.47f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(0.53f, -0.53f)
                lineTo(5.99f, 3.87f)
                lineTo(3.87f, 5.99f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(0.52f, -0.52f)
                lineToRelative(1.09f, 1.09f)
                curveToRelative(-0.82f, 1.02f, -1.36f, 2.26f, -1.5f, 3.63f)
                horizontalLineTo(3.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.15f, 1.37f, 0.69f, 2.61f, 1.5f, 3.63f)
                lineToRelative(-1.09f, 1.09f)
                lineToRelative(-0.52f, -0.52f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-0.53f, -0.53f)
                verticalLineToRelative(0f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(1.09f, -1.09f)
                curveToRelative(1.02f, 0.82f, 2.26f, 1.36f, 3.63f, 1.51f)
                verticalLineToRelative(1.54f)
                horizontalLineTo(10.5f)
                verticalLineTo(22f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-0.75f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(-1.54f)
                curveToRelative(1.37f, -0.14f, 2.62f, -0.69f, 3.64f, -1.51f)
                lineToRelative(1.09f, 1.09f)
                lineToRelative(-0.52f, 0.52f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-0.53f, 0.53f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-1.09f, -1.09f)
                curveToRelative(0.82f, -1.02f, 1.37f, -2.27f, 1.52f, -3.65f)
                horizontalLineToRelative(1.54f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(22f)
                verticalLineToRelative(-3f)
                horizontalLineTo(20.5f)
                close()
                moveTo(13.75f, 8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(13.2f, 8f, 13.75f, 8f)
                close()
                moveTo(10.25f, 8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(9.7f, 8f, 10.25f, 8f)
                close()
                moveTo(8.5f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(9.5f, 12.55f, 9.05f, 13f, 8.5f, 13f)
                close()
                moveTo(10.25f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(11.25f, 15.55f, 10.8f, 16f, 10.25f, 16f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(13f, 12.55f, 12.55f, 13f, 12f, 13f)
                close()
                moveTo(13.75f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(14.75f, 15.55f, 14.3f, 16f, 13.75f, 16f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(16.5f, 12.55f, 16.05f, 13f, 15.5f, 13f)
                close()
            }
        }.build()
        
        return _Coronavirus!!
    }

private var _Coronavirus: ImageVector? = null

