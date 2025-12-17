package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Password: ImageVector
    get() {
        if (_Password != null) return _Password!!
        
        _Password = ImageVector.Builder(
            name = "password",
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
                        moveTo(3f, 17f)
                        horizontalLineToRelative(18f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(3f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(0f)
                        curveTo(2f, 17.45f, 2.45f, 17f, 3f, 17f)
                        close()
                        moveTo(2.5f, 12.57f)
                        curveToRelative(0.36f, 0.21f, 0.82f, 0.08f, 1.03f, -0.28f)
                        lineTo(4f, 11.47f)
                        lineToRelative(0.48f, 0.83f)
                        curveToRelative(0.21f, 0.36f, 0.67f, 0.48f, 1.03f, 0.28f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, -0.21f, 0.48f, -0.66f, 0.28f, -1.02f)
                        lineTo(5.3f, 10.72f)
                        horizontalLineToRelative(0.95f)
                        curveTo(6.66f, 10.72f, 7f, 10.38f, 7f, 9.97f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineTo(5.3f)
                        lineTo(5.77f, 8.4f)
                        curveTo(5.98f, 8.04f, 5.86f, 7.58f, 5.5f, 7.37f)
                        lineToRelative(0f, 0f)
                        curveTo(5.14f, 7.17f, 4.68f, 7.29f, 4.47f, 7.65f)
                        lineTo(4f, 8.47f)
                        lineTo(3.53f, 7.65f)
                        curveTo(3.32f, 7.29f, 2.86f, 7.17f, 2.5f, 7.37f)
                        lineToRelative(0f, 0f)
                        curveTo(2.14f, 7.58f, 2.02f, 8.04f, 2.23f, 8.4f)
                        lineTo(2.7f, 9.22f)
                        horizontalLineTo(1.75f)
                        curveTo(1.34f, 9.22f, 1f, 9.56f, 1f, 9.97f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                        horizontalLineTo(2.7f)
                        lineToRelative(-0.48f, 0.83f)
                        curveTo(2.02f, 11.91f, 2.14f, 12.37f, 2.5f, 12.57f)
                        lineTo(2.5f, 12.57f)
                        close()
                        moveTo(10.5f, 12.57f)
                        lineTo(10.5f, 12.57f)
                        curveToRelative(0.36f, 0.21f, 0.82f, 0.08f, 1.03f, -0.28f)
                        lineTo(12f, 11.47f)
                        lineToRelative(0.48f, 0.83f)
                        curveToRelative(0.21f, 0.36f, 0.67f, 0.48f, 1.03f, 0.28f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, -0.21f, 0.48f, -0.66f, 0.28f, -1.02f)
                        lineToRelative(-0.48f, -0.83f)
                        horizontalLineToRelative(0.95f)
                        curveToRelative(0.41f, 0f, 0.75f, -0.34f, 0.75f, -0.75f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineTo(13.3f)
                        lineToRelative(0.47f, -0.82f)
                        curveToRelative(0.21f, -0.36f, 0.08f, -0.82f, -0.27f, -1.03f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.36f, -0.21f, -0.82f, -0.08f, -1.02f, 0.27f)
                        lineTo(12f, 8.47f)
                        lineToRelative(-0.47f, -0.82f)
                        curveToRelative(-0.21f, -0.36f, -0.67f, -0.48f, -1.02f, -0.27f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.36f, 0.21f, -0.48f, 0.67f, -0.27f, 1.03f)
                        lineToRelative(0.47f, 0.82f)
                        horizontalLineTo(9.75f)
                        curveTo(9.34f, 9.22f, 9f, 9.56f, 9f, 9.97f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                        horizontalLineToRelative(0.95f)
                        lineToRelative(-0.48f, 0.83f)
                        curveTo(10.02f, 11.91f, 10.14f, 12.37f, 10.5f, 12.57f)
                        close()
                        moveTo(23f, 9.97f)
                        curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                        horizontalLineTo(21.3f)
                        lineToRelative(0.47f, -0.82f)
                        curveToRelative(0.21f, -0.36f, 0.08f, -0.82f, -0.27f, -1.03f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.36f, -0.21f, -0.82f, -0.08f, -1.02f, 0.27f)
                        lineTo(20f, 8.47f)
                        lineToRelative(-0.47f, -0.82f)
                        curveToRelative(-0.21f, -0.36f, -0.67f, -0.48f, -1.02f, -0.27f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.36f, 0.21f, -0.48f, 0.67f, -0.27f, 1.03f)
                        lineToRelative(0.47f, 0.82f)
                        horizontalLineToRelative(-0.95f)
                        curveTo(17.34f, 9.22f, 17f, 9.56f, 17f, 9.97f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                        horizontalLineToRelative(0.95f)
                        lineToRelative(-0.48f, 0.83f)
                        curveToRelative(-0.21f, 0.36f, -0.08f, 0.82f, 0.28f, 1.02f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, 0.21f, 0.82f, 0.08f, 1.03f, -0.28f)
                        lineTo(20f, 11.47f)
                        lineToRelative(0.48f, 0.83f)
                        curveToRelative(0.21f, 0.36f, 0.67f, 0.48f, 1.03f, 0.28f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, -0.21f, 0.48f, -0.66f, 0.28f, -1.02f)
                        lineToRelative(-0.48f, -0.83f)
                        horizontalLineToRelative(0.95f)
                        curveTo(22.66f, 10.72f, 23f, 10.38f, 23f, 9.97f)
                        lineTo(23f, 9.97f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Password!!
    }

private var _Password: ImageVector? = null

