package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Motion_photos_off: ImageVector
    get() {
        if (_Motion_photos_off != null) return _Motion_photos_off!!
        
        _Motion_photos_off = ImageVector.Builder(
            name = "motion_photos_off",
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
                        moveTo(12f, 6f)
                        curveToRelative(-0.92f, 0f, -1.8f, 0.22f, -2.58f, 0.59f)
                        lineToRelative(7.99f, 7.99f)
                        curveTo(17.78f, 13.8f, 18f, 12.92f, 18f, 12f)
                        curveTo(18f, 8.69f, 15.31f, 6f, 12f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.1f, 3.51f)
                        lineTo(2.1f, 3.51f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                        lineToRelative(1.56f, 1.56f)
                        curveToRelative(-1.25f, 1.88f, -1.88f, 4.21f, -1.59f, 6.7f)
                        curveToRelative(0.52f, 4.54f, 4.21f, 8.23f, 8.75f, 8.75f)
                        curveToRelative(2.49f, 0.28f, 4.81f, -0.34f, 6.69f, -1.59f)
                        lineToRelative(1.56f, 1.56f)
                        curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        curveTo(3.13f, 3.13f, 2.49f, 3.12f, 2.1f, 3.51f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                        lineToRelative(1.47f, 1.47f)
                        curveTo(6.22f, 10.2f, 6f, 11.08f, 6f, 12f)
                        curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                        curveToRelative(0.92f, 0f, 1.8f, -0.22f, 2.58f, -0.59f)
                        lineToRelative(1.47f, 1.47f)
                        curveTo(14.86f, 19.59f, 13.48f, 20f, 12f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 4f)
                        curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                        curveToRelative(0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.05f)
                        lineToRelative(1.45f, 1.45f)
                        curveTo(21.39f, 15.93f, 22f, 14.04f, 22f, 12f)
                        curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                        curveTo(9.96f, 2f, 8.07f, 2.61f, 6.49f, 3.66f)
                        lineToRelative(1.45f, 1.45f)
                        curveTo(9.14f, 4.41f, 10.52f, 4f, 12f, 4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Motion_photos_off!!
    }

private var _Motion_photos_off: ImageVector? = null

