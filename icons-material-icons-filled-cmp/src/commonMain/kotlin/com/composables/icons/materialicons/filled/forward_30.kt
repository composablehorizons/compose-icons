package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Forward_30: ImageVector
    get() {
        if (_Forward_30 != null) return _Forward_30!!
        
        _Forward_30 = ImageVector.Builder(
            name = "forward_30",
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
                        moveTo(18f, 13f)
                        curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                        reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                        reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                        verticalLineToRelative(4f)
                        lineToRelative(5f, -5f)
                        lineToRelative(-5f, -5f)
                        verticalLineToRelative(4f)
                        curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                        curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                        reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                        horizontalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.06f, 15.38f)
                        curveToRelative(-0.29f, 0f, -0.62f, -0.17f, -0.62f, -0.54f)
                        horizontalLineTo(8.59f)
                        curveToRelative(0f, 0.97f, 0.9f, 1.23f, 1.45f, 1.23f)
                        curveToRelative(0.87f, 0f, 1.51f, -0.46f, 1.51f, -1.25f)
                        curveToRelative(0f, -0.66f, -0.45f, -0.9f, -0.71f, -1f)
                        curveToRelative(0.11f, -0.05f, 0.65f, -0.32f, 0.65f, -0.92f)
                        curveToRelative(0f, -0.21f, -0.05f, -1.22f, -1.44f, -1.22f)
                        curveToRelative(-0.62f, 0f, -1.4f, 0.35f, -1.4f, 1.16f)
                        horizontalLineToRelative(0.85f)
                        curveToRelative(0f, -0.34f, 0.31f, -0.48f, 0.57f, -0.48f)
                        curveToRelative(0.59f, 0f, 0.58f, 0.5f, 0.58f, 0.54f)
                        curveToRelative(0f, 0.52f, -0.41f, 0.59f, -0.63f, 0.59f)
                        horizontalLineTo(9.56f)
                        verticalLineToRelative(0.66f)
                        horizontalLineToRelative(0.45f)
                        curveToRelative(0.65f, 0f, 0.7f, 0.42f, 0.7f, 0.64f)
                        curveTo(10.71f, 15.11f, 10.5f, 15.38f, 10.06f, 15.38f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.85f, 11.68f)
                        curveToRelative(-0.14f, 0f, -1.44f, -0.08f, -1.44f, 1.82f)
                        verticalLineToRelative(0.74f)
                        curveToRelative(0f, 1.9f, 1.31f, 1.82f, 1.44f, 1.82f)
                        curveToRelative(0.14f, 0f, 1.44f, 0.09f, 1.44f, -1.82f)
                        verticalLineTo(13.5f)
                        curveTo(15.3f, 11.59f, 13.99f, 11.68f, 13.85f, 11.68f)
                        close()
                        moveTo(14.45f, 14.35f)
                        curveToRelative(0f, 0.77f, -0.21f, 1.03f, -0.59f, 1.03f)
                        curveToRelative(-0.38f, 0f, -0.6f, -0.26f, -0.6f, -1.03f)
                        verticalLineToRelative(-0.97f)
                        curveToRelative(0f, -0.75f, 0.22f, -1.01f, 0.59f, -1.01f)
                        curveToRelative(0.38f, 0f, 0.6f, 0.26f, 0.6f, 1.01f)
                        verticalLineTo(14.35f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Forward_30!!
    }

private var _Forward_30: ImageVector? = null

