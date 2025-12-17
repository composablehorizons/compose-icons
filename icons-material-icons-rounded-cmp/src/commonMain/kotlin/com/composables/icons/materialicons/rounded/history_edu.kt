package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.History_edu: ImageVector
    get() {
        if (_History_edu != null) return _History_edu!!
        
        _History_edu = ImageVector.Builder(
            name = "history_edu",
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
                        moveTo(9f, 5f)
                        verticalLineToRelative(0.38f)
                        curveToRelative(-0.83f, -0.33f, -1.72f, -0.5f, -2.61f, -0.5f)
                        curveToRelative(-1.42f, 0f, -2.84f, 0.43f, -4.05f, 1.29f)
                        curveTo(1.83f, 6.53f, 1.77f, 7.26f, 2.21f, 7.7f)
                        lineToRelative(2.57f, 2.57f)
                        horizontalLineToRelative(1.11f)
                        verticalLineToRelative(1.11f)
                        curveToRelative(0.86f, 0.86f, 1.98f, 1.31f, 3.11f, 1.36f)
                        verticalLineTo(15f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(2f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(10f)
                        curveTo(9.45f, 4f, 9f, 4.45f, 9f, 5f)
                        close()
                        moveTo(7.89f, 10.41f)
                        verticalLineTo(8.26f)
                        horizontalLineTo(5.61f)
                        lineTo(4.57f, 7.22f)
                        curveTo(5.14f, 7f, 5.76f, 6.88f, 6.39f, 6.88f)
                        curveToRelative(1.34f, 0f, 2.59f, 0.52f, 3.54f, 1.46f)
                        lineToRelative(1.41f, 1.41f)
                        lineToRelative(-0.2f, 0.2f)
                        curveToRelative(-0.51f, 0.51f, -1.19f, 0.8f, -1.92f, 0.8f)
                        curveTo(8.75f, 10.75f, 8.29f, 10.63f, 7.89f, 10.41f)
                        close()
                        moveTo(19f, 17f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(-2.59f)
                        curveToRelative(0.57f, -0.23f, 1.1f, -0.57f, 1.56f, -1.03f)
                        lineToRelative(0.2f, -0.2f)
                        lineTo(15.59f, 14f)
                        horizontalLineTo(17f)
                        verticalLineToRelative(-1.41f)
                        lineToRelative(-6f, -5.97f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _History_edu!!
    }

private var _History_edu: ImageVector? = null

