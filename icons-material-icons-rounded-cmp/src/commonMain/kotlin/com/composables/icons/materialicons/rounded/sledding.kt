package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Sledding: ImageVector
    get() {
        if (_Sledding != null) return _Sledding!!
        
        _Sledding = ImageVector.Builder(
            name = "sledding",
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
                moveTo(14f, 4.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveTo(14f, 3.4f, 14f, 4.5f)
                close()
                moveTo(18.92f, 19.24f)
                curveToRelative(-0.13f, 0.39f, -0.55f, 0.61f, -0.95f, 0.48f)
                lineToRelative(-2.61f, -0.85f)
                lineTo(14.9f, 20.3f)
                lineToRelative(3.32f, 1.08f)
                lineToRelative(0f, 0f)
                curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f)
                curveToRelative(0.36f, -1.12f, -0.11f, -2.32f, -1.07f, -2.91f)
                curveToRelative(-0.32f, -0.2f, -0.45f, -0.6f, -0.3f, -0.95f)
                curveToRelative(0.2f, -0.44f, 0.71f, -0.57f, 1.12f, -0.31f)
                curveToRelative(1.52f, 0.95f, 2.25f, 2.85f, 1.68f, 4.62f)
                curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f)
                horizontalLineToRelative(0f)
                lineTo(1.74f, 17.6f)
                curveToRelative(-0.39f, -0.13f, -0.63f, -0.54f, -0.52f, -0.93f)
                curveToRelative(0.12f, -0.41f, 0.55f, -0.63f, 0.95f, -0.5f)
                lineToRelative(3.22f, 1.05f)
                lineToRelative(0.46f, -1.43f)
                lineToRelative(-3.19f, -1.04f)
                curveToRelative(-0.39f, -0.13f, -0.63f, -0.54f, -0.52f, -0.93f)
                curveToRelative(0.12f, -0.41f, 0.55f, -0.63f, 0.95f, -0.5f)
                lineTo(4f, 13.6f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0f, -0.8f, 0.48f, -1.52f, 1.21f, -1.84f)
                curveToRelative(0.75f, -0.32f, 4.11f, -1.76f, 4.26f, -1.83f)
                curveToRelative(0.41f, -0.18f, 0.89f, -0.21f, 1.35f, -0.04f)
                curveToRelative(0.91f, 0.34f, 1.37f, 1.36f, 1.07f, 2.28f)
                lineToRelative(-1.04f, 3.2f)
                lineTo(13f, 12.25f)
                curveToRelative(0.89f, -0.15f, 1.76f, 0.32f, 2.14f, 1.14f)
                lineToRelative(2.08f, 4.51f)
                lineToRelative(1.22f, 0.4f)
                curveTo(18.84f, 18.42f, 19.05f, 18.84f, 18.92f, 19.24f)
                close()
                moveTo(6f, 14.25f)
                lineToRelative(1.01f, 0.33f)
                curveToRelative(-0.22f, -0.42f, -0.28f, -0.92f, -0.12f, -1.4f)
                lineTo(7.92f, 10f)
                lineTo(6f, 10.82f)
                verticalLineTo(14.25f)
                close()
                moveTo(13.94f, 18.41f)
                lineToRelative(-6.66f, -2.16f)
                lineToRelative(-0.46f, 1.43f)
                lineToRelative(6.66f, 2.16f)
                lineTo(13.94f, 18.41f)
                close()
                moveTo(14.63f, 17.05f)
                lineToRelative(-1.18f, -2.56f)
                lineToRelative(-3.97f, 0.89f)
                lineTo(14.63f, 17.05f)
                close()
            }
        }.build()
        
        return _Sledding!!
    }

private var _Sledding: ImageVector? = null

