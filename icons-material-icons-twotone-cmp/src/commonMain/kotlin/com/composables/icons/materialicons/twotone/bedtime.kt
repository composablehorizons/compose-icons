package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Bedtime: ImageVector
    get() {
        if (_Bedtime != null) return _Bedtime!!
        
        _Bedtime = ImageVector.Builder(
            name = "bedtime",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9.27f, 4.49f)
                            curveTo(6.2f, 5.6f, 4f, 8.55f, 4f, 12f)
                            curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                            curveToRelative(1.81f, 0f, 3.54f, -0.62f, 4.93f, -1.71f)
                            curveTo(13.02f, 16.9f, 7.64f, 12.03f, 9.27f, 4.49f)
                            close()
                        }
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12.34f, 2.02f)
                        curveToRelative(-0.12f, 0f, -0.23f, -0.01f, -0.35f, -0.01f)
                        curveTo(6.4f, 2.01f, 2f, 6.54f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        curveToRelative(3.71f, 0f, 6.93f, -2.02f, 8.66f, -5.02f)
                        curveTo(13.15f, 16.73f, 8.57f, 8.55f, 12.34f, 2.02f)
                        close()
                        moveTo(12f, 20f)
                        curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                        curveToRelative(0f, -3.45f, 2.2f, -6.4f, 5.27f, -7.51f)
                        curveToRelative(-1.63f, 7.54f, 3.75f, 12.41f, 7.66f, 13.8f)
                        curveTo(15.54f, 19.38f, 13.81f, 20f, 12f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Bedtime!!
    }

private var _Bedtime: ImageVector? = null

