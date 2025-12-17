package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Coronavirus: ImageVector
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
                moveTo(21.25f, 10.5f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                horizontalLineToRelative(-1.54f)
                curveToRelative(-0.15f, -1.37f, -0.69f, -2.63f, -1.52f, -3.65f)
                lineToRelative(1.09f, -1.09f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                reflectiveCurveToRelative(0.29f, -0.77f, 0f, -1.06f)
                lineTo(18.54f, 4.4f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.76f, -0.01f, 1.05f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(-1.02f, -0.82f, -2.27f, -1.36f, -3.64f, -1.51f)
                verticalLineTo(3.5f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                curveTo(13.5f, 2.34f, 13.16f, 2f, 12.75f, 2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                curveToRelative(0f, 0.41f, 0.33f, 0.74f, 0.74f, 0.75f)
                verticalLineToRelative(1.55f)
                curveTo(9.87f, 5.19f, 8.62f, 5.74f, 7.6f, 6.56f)
                lineTo(6.51f, 5.47f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                lineTo(4.4f, 5.46f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.05f, 0.01f)
                lineToRelative(1.09f, 1.09f)
                curveToRelative(-0.82f, 1.02f, -1.36f, 2.26f, -1.5f, 3.63f)
                horizontalLineTo(3.5f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                curveTo(2.34f, 10.5f, 2f, 10.84f, 2f, 11.25f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.15f, 1.37f, 0.69f, 2.61f, 1.5f, 3.63f)
                lineToRelative(-1.09f, 1.09f)
                curveToRelative(-0.29f, -0.29f, -0.76f, -0.28f, -1.05f, 0.01f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(1.09f, -1.09f)
                curveToRelative(1.02f, 0.82f, 2.26f, 1.36f, 3.63f, 1.51f)
                verticalLineToRelative(1.55f)
                curveToRelative(-0.41f, 0.01f, -0.74f, 0.34f, -0.74f, 0.75f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(-1.54f)
                curveToRelative(1.37f, -0.14f, 2.62f, -0.69f, 3.64f, -1.51f)
                lineToRelative(1.09f, 1.09f)
                curveToRelative(-0.29f, 0.29f, -0.28f, 0.76f, 0.01f, 1.05f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0f)
                lineToRelative(1.06f, -1.06f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0f)
                lineToRelative(-0.01f, 0.01f)
                lineToRelative(-1.09f, -1.09f)
                curveToRelative(0.82f, -1.02f, 1.37f, -2.27f, 1.52f, -3.65f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                verticalLineToRelative(-1.5f)
                curveTo(22f, 10.84f, 21.66f, 10.5f, 21.25f, 10.5f)
                close()
                moveTo(13.75f, 8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveTo(13.2f, 8f, 13.75f, 8f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(13f, 12.55f, 12.55f, 13f, 12f, 13f)
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
                moveTo(13.75f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(14.75f, 15.55f, 14.3f, 16f, 13.75f, 16f)
                close()
                moveTo(14.5f, 12f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveTo(14.5f, 12.55f, 14.5f, 12f)
                close()
            }
        }.build()
        
        return _Coronavirus!!
    }

private var _Coronavirus: ImageVector? = null

