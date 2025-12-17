package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Quiz: ImageVector
    get() {
        if (_Quiz != null) return _Quiz!!
        
        _Quiz = ImageVector.Builder(
            name = "quiz",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(17f, 20f)
                        horizontalLineTo(4f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveTo(2f, 6.45f, 2f, 7f)
                        verticalLineToRelative(13f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(13f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveTo(17.55f, 20f, 17f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 2f)
                        horizontalLineTo(8f)
                        curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        close()
                        moveTo(14.01f, 15f)
                        curveToRelative(-0.59f, 0f, -1.05f, -0.47f, -1.05f, -1.05f)
                        curveToRelative(0f, -0.59f, 0.47f, -1.04f, 1.05f, -1.04f)
                        curveToRelative(0.59f, 0f, 1.04f, 0.45f, 1.04f, 1.04f)
                        curveTo(15.04f, 14.53f, 14.6f, 15f, 14.01f, 15f)
                        close()
                        moveTo(16.51f, 8.83f)
                        curveToRelative(-0.63f, 0.93f, -1.23f, 1.21f, -1.56f, 1.81f)
                        curveToRelative(-0.08f, 0.14f, -0.13f, 0.26f, -0.16f, 0.49f)
                        curveToRelative(-0.05f, 0.39f, -0.36f, 0.68f, -0.75f, 0.68f)
                        horizontalLineToRelative(-0.03f)
                        curveToRelative(-0.44f, 0f, -0.79f, -0.38f, -0.75f, -0.82f)
                        curveToRelative(0.03f, -0.28f, 0.09f, -0.57f, 0.25f, -0.84f)
                        curveToRelative(0.41f, -0.73f, 1.18f, -1.16f, 1.63f, -1.8f)
                        curveToRelative(0.48f, -0.68f, 0.21f, -1.94f, -1.14f, -1.94f)
                        curveToRelative(-0.61f, 0f, -1.01f, 0.32f, -1.26f, 0.7f)
                        curveToRelative(-0.19f, 0.29f, -0.57f, 0.39f, -0.89f, 0.25f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.42f, -0.18f, -0.6f, -0.7f, -0.34f, -1.07f)
                        curveTo(12.02f, 5.55f, 12.87f, 5f, 13.99f, 5f)
                        curveToRelative(1.23f, 0f, 2.08f, 0.56f, 2.51f, 1.26f)
                        curveTo(16.87f, 6.87f, 17.08f, 7.99f, 16.51f, 8.83f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Quiz!!
    }

private var _Quiz: ImageVector? = null

