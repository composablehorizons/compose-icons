package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Celebration: ImageVector
    get() {
        if (_Celebration != null) return _Celebration!!
        
        _Celebration = ImageVector.Builder(
            name = "celebration",
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
                        moveTo(12.35f, 16.18f)
                        lineTo(7.82f, 11.65f)
                        lineTo(5.3f, 18.7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 22f)
                        lineToRelative(14f, -5f)
                        lineTo(7f, 8f)
                        lineTo(2f, 22f)
                        close()
                        moveTo(12.35f, 16.18f)
                        lineTo(5.3f, 18.7f)
                        lineToRelative(2.52f, -7.05f)
                        lineTo(12.35f, 16.18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.53f, 12.53f)
                        lineToRelative(5.59f, -5.59f)
                        curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                        lineToRelative(0.59f, 0.59f)
                        lineToRelative(1.06f, -1.06f)
                        lineToRelative(-0.59f, -0.59f)
                        curveToRelative(-1.07f, -1.07f, -2.82f, -1.07f, -3.89f, 0f)
                        lineToRelative(-5.59f, 5.59f)
                        lineTo(14.53f, 12.53f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.47f, 7.47f)
                        lineToRelative(1.06f, 1.06f)
                        lineToRelative(0.59f, -0.59f)
                        curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0f, -3.89f)
                        lineToRelative(-0.59f, -0.59f)
                        lineTo(9.47f, 4.53f)
                        lineToRelative(0.59f, 0.59f)
                        curveToRelative(0.48f, 0.48f, 0.48f, 1.28f, 0f, 1.76f)
                        lineTo(9.47f, 7.47f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.06f, 11.88f)
                        lineToRelative(-1.59f, 1.59f)
                        lineToRelative(1.06f, 1.06f)
                        lineToRelative(1.59f, -1.59f)
                        curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0f)
                        lineToRelative(1.61f, 1.61f)
                        lineToRelative(1.06f, -1.06f)
                        lineToRelative(-1.61f, -1.61f)
                        curveTo(19.87f, 10.81f, 18.13f, 10.81f, 17.06f, 11.88f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.06f, 5.88f)
                        lineToRelative(-3.59f, 3.59f)
                        lineToRelative(1.06f, 1.06f)
                        lineToRelative(3.59f, -3.59f)
                        curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0f, -3.89f)
                        lineToRelative(-1.59f, -1.59f)
                        lineToRelative(-1.06f, 1.06f)
                        lineToRelative(1.59f, 1.59f)
                        curveTo(15.54f, 4.6f, 15.54f, 5.4f, 15.06f, 5.88f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Celebration!!
    }

private var _Celebration: ImageVector? = null

