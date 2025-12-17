package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Contactless: ImageVector
    get() {
        if (_Contactless != null) return _Contactless!!
        
        _Contactless = ImageVector.Builder(
            name = "contactless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                        reflectiveCurveToRelative(3.58f, -8f, 8f, -8f)
                        reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                        reflectiveCurveTo(16.42f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.1f, 10.18f)
                        curveToRelative(0.26f, 0.56f, 0.39f, 1.16f, 0.4f, 1.8f)
                        curveToRelative(0.01f, 0.63f, -0.13f, 1.25f, -0.4f, 1.86f)
                        lineToRelative(1.37f, 0.62f)
                        curveToRelative(0.37f, -0.81f, 0.55f, -1.65f, 0.54f, -2.5f)
                        curveToRelative(-0.01f, -0.84f, -0.19f, -1.65f, -0.54f, -2.4f)
                        lineTo(7.1f, 10.18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.33f, 7.33f)
                        curveToRelative(0.78f, 1.57f, 1.18f, 3.14f, 1.18f, 4.64f)
                        curveToRelative(0f, 1.51f, -0.4f, 3.09f, -1.18f, 4.69f)
                        lineToRelative(1.35f, 0.66f)
                        curveToRelative(0.88f, -1.81f, 1.33f, -3.61f, 1.33f, -5.35f)
                        curveToRelative(0f, -1.74f, -0.45f, -3.53f, -1.33f, -5.31f)
                        lineTo(13.33f, 7.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.2f, 8.72f)
                        curveToRelative(0.53f, 1.07f, 0.8f, 2.21f, 0.8f, 3.4f)
                        curveToRelative(0f, 1.17f, -0.26f, 2.23f, -0.78f, 3.15f)
                        lineToRelative(1.3f, 0.74f)
                        curveToRelative(0.65f, -1.15f, 0.98f, -2.45f, 0.98f, -3.89f)
                        curveToRelative(0f, -1.42f, -0.32f, -2.79f, -0.96f, -4.07f)
                        lineTo(10.2f, 8.72f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Contactless!!
    }

private var _Contactless: ImageVector? = null

