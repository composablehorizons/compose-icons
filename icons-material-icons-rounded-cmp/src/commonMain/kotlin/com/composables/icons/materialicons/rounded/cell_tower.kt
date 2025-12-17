package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Cell_tower: ImageVector
    get() {
        if (_Cell_tower != null) return _Cell_tower!!
        
        _Cell_tower = ImageVector.Builder(
            name = "cell_tower",
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
                        moveTo(7.9f, 14.1f)
                        lineToRelative(0.09f, -0.09f)
                        curveToRelative(0.27f, -0.27f, 0.32f, -0.71f, 0.08f, -1.01f)
                        curveTo(7.36f, 12.09f, 7f, 11.01f, 7f, 10f)
                        curveToRelative(0f, -1.08f, 0.35f, -2.16f, 1.04f, -3.01f)
                        curveToRelative(0.25f, -0.3f, 0.21f, -0.75f, -0.07f, -1.02f)
                        lineTo(7.9f, 5.9f)
                        curveTo(7.56f, 5.56f, 7f, 5.6f, 6.7f, 5.98f)
                        curveTo(5.79f, 7.16f, 5.3f, 8.58f, 5.3f, 10f)
                        curveToRelative(0f, 1.42f, 0.49f, 2.84f, 1.4f, 4.02f)
                        curveTo(7f, 14.4f, 7.56f, 14.44f, 7.9f, 14.1f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.51f, 3.49f)
                        lineToRelative(-0.08f, 0.08f)
                        curveToRelative(-0.3f, 0.3f, -0.29f, 0.76f, -0.03f, 1.08f)
                        curveToRelative(1.26f, 1.53f, 1.9f, 3.48f, 1.9f, 5.35f)
                        curveToRelative(0f, 1.87f, -0.63f, 3.81f, -1.9f, 5.35f)
                        curveToRelative(-0.28f, 0.33f, -0.23f, 0.83f, 0.08f, 1.14f)
                        verticalLineToRelative(0f)
                        curveToRelative(0.35f, 0.35f, 0.93f, 0.31f, 1.24f, -0.07f)
                        curveTo(21.29f, 14.54f, 22f, 12.31f, 22f, 10f)
                        curveToRelative(0f, -2.32f, -0.79f, -4.55f, -2.31f, -6.43f)
                        curveTo(19.39f, 3.2f, 18.84f, 3.16f, 18.51f, 3.49f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5.57f, 3.57f)
                        lineTo(5.49f, 3.49f)
                        curveTo(5.16f, 3.16f, 4.61f, 3.2f, 4.31f, 3.57f)
                        curveTo(2.79f, 5.45f, 2f, 7.68f, 2f, 10f)
                        curveToRelative(0f, 2.32f, 0.79f, 4.55f, 2.31f, 6.43f)
                        curveToRelative(0.3f, 0.37f, 0.85f, 0.42f, 1.18f, 0.08f)
                        lineToRelative(0.08f, -0.08f)
                        curveToRelative(0.3f, -0.3f, 0.29f, -0.76f, 0.03f, -1.08f)
                        curveTo(4.33f, 13.81f, 3.7f, 11.87f, 3.7f, 10f)
                        curveToRelative(0f, -1.87f, 0.63f, -3.81f, 1.9f, -5.35f)
                        curveTo(5.86f, 4.33f, 5.87f, 3.87f, 5.57f, 3.57f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.07f, 14.07f)
                        curveToRelative(0.36f, 0.36f, 0.95f, 0.32f, 1.26f, -0.09f)
                        curveToRelative(0.9f, -1.18f, 1.37f, -2.58f, 1.37f, -3.98f)
                        curveToRelative(-0.08f, -1.41f, -0.51f, -2.83f, -1.4f, -4.01f)
                        curveToRelative(-0.29f, -0.39f, -0.86f, -0.43f, -1.2f, -0.09f)
                        lineToRelative(-0.08f, 0.08f)
                        curveToRelative(-0.27f, 0.27f, -0.32f, 0.71f, -0.08f, 1.01f)
                        curveTo(16.64f, 7.91f, 17f, 8.99f, 17f, 10f)
                        curveToRelative(0f, 1.07f, -0.34f, 2.13f, -1.01f, 2.98f)
                        curveTo(15.73f, 13.3f, 15.77f, 13.77f, 16.07f, 14.07f)
                        lineTo(16.07f, 14.07f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.5f, 10f)
                        curveToRelative(0f, -1.6f, -1.51f, -2.85f, -3.18f, -2.41f)
                        curveToRelative(-0.8f, 0.21f, -1.46f, 0.85f, -1.7f, 1.65f)
                        curveToRelative(-0.32f, 1.06f, 0.06f, 2.04f, 0.76f, 2.64f)
                        lineToRelative(-2.96f, 8.87f)
                        curveTo(7.21f, 21.37f, 7.67f, 22f, 8.32f, 22f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.41f, 0f, 0.77f, -0.26f, 0.9f, -0.65f)
                        lineTo(9.67f, 20f)
                        horizontalLineToRelative(4.67f)
                        lineToRelative(0.45f, 1.35f)
                        curveToRelative(0.13f, 0.39f, 0.49f, 0.65f, 0.9f, 0.65f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.65f, 0f, 1.1f, -0.63f, 0.9f, -1.25f)
                        lineToRelative(-2.96f, -8.87f)
                        curveTo(14.16f, 11.42f, 14.5f, 10.76f, 14.5f, 10f)
                        close()
                        moveTo(10.33f, 18f)
                        lineTo(12f, 13f)
                        lineToRelative(1.67f, 5f)
                        horizontalLineTo(10.33f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cell_tower!!
    }

private var _Cell_tower: ImageVector? = null

