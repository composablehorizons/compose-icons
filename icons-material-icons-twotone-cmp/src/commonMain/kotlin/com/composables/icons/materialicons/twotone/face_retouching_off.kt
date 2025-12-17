package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Face_retouching_off: ImageVector
    get() {
        if (_Face_retouching_off != null) return _Face_retouching_off!!
        
        _Face_retouching_off = ImageVector.Builder(
            name = "face_retouching_off",
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
                        moveTo(12f, 4f)
                        curveToRelative(-0.46f, 0f, -0.91f, 0.05f, -1.34f, 0.12f)
                        curveTo(12.06f, 6.44f, 14.6f, 8f, 17.5f, 8f)
                        curveToRelative(0.46f, 0f, 0.91f, -0.05f, 1.34f, -0.12f)
                        curveTo(17.44f, 5.56f, 14.9f, 4f, 12f, 4f)
                        close()
                        moveTo(4.42f, 9.47f)
                        curveTo(5.09f, 9.09f, 5.7f, 8.61f, 6.23f, 8.06f)
                        lineTo(5.51f, 7.34f)
                        curveTo(5.05f, 7.99f, 4.68f, 8.7f, 4.42f, 9.47f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 14.25f)
                        curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
                        reflectiveCurveTo(9.69f, 11.75f, 9f, 11.75f)
                        reflectiveCurveTo(7.75f, 12.31f, 7.75f, 13f)
                        reflectiveCurveTo(8.31f, 14.25f, 9f, 14.25f)
                        close()
                        moveTo(17.5f, 10f)
                        curveToRelative(0.75f, 0f, 1.47f, -0.09f, 2.17f, -0.24f)
                        curveTo(19.88f, 10.47f, 20f, 11.22f, 20f, 12f)
                        curveToRelative(0f, 1.22f, -0.28f, 2.37f, -0.77f, 3.4f)
                        lineToRelative(1.49f, 1.49f)
                        curveTo(21.53f, 15.44f, 22f, 13.78f, 22f, 12f)
                        curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                        curveToRelative(-1.78f, 0f, -3.44f, 0.47f, -4.89f, 1.28f)
                        lineToRelative(5.33f, 5.33f)
                        curveTo(13.93f, 9.49f, 15.65f, 10f, 17.5f, 10f)
                        close()
                        moveTo(10.66f, 4.12f)
                        curveTo(11.09f, 4.05f, 11.54f, 4f, 12f, 4f)
                        curveToRelative(2.9f, 0f, 5.44f, 1.56f, 6.84f, 3.88f)
                        curveTo(18.41f, 7.95f, 17.96f, 8f, 17.5f, 8f)
                        curveTo(14.6f, 8f, 12.06f, 6.44f, 10.66f, 4.12f)
                        close()
                        moveTo(1.89f, 3.72f)
                        lineToRelative(2.19f, 2.19f)
                        curveTo(2.78f, 7.6f, 2f, 9.71f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(2.29f, 0f, 4.4f, -0.78f, 6.09f, -2.08f)
                        lineToRelative(2.19f, 2.19f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(3.31f, 2.31f)
                        lineTo(1.89f, 3.72f)
                        close()
                        moveTo(16.66f, 18.49f)
                        curveTo(15.35f, 19.44f, 13.74f, 20f, 12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -0.05f, 0.01f, -0.1f, 0f, -0.14f)
                        curveToRelative(1.39f, -0.52f, 2.63f, -1.35f, 3.64f, -2.39f)
                        lineTo(16.66f, 18.49f)
                        close()
                        moveTo(5.51f, 7.34f)
                        lineToRelative(0.72f, 0.72f)
                        curveTo(5.7f, 8.61f, 5.09f, 9.09f, 4.42f, 9.47f)
                        curveTo(4.68f, 8.7f, 5.05f, 7.99f, 5.51f, 7.34f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Face_retouching_off!!
    }

private var _Face_retouching_off: ImageVector? = null

