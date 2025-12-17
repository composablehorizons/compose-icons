package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Motion_photos_off: ImageVector
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
                        moveTo(2.81f, 2.81f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(2.27f, 2.27f)
                        curveTo(2.61f, 8.07f, 2f, 9.96f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(2.04f, 0f, 3.93f, -0.61f, 5.51f, -1.66f)
                        lineToRelative(2.27f, 2.27f)
                        lineToRelative(1.41f, -1.42f)
                        lineTo(2.81f, 2.81f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                        lineToRelative(10.93f, 10.94f)
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

