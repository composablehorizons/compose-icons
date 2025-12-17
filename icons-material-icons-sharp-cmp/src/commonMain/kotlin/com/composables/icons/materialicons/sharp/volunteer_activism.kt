package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Volunteer_activism: ImageVector
    get() {
        if (_Volunteer_activism != null) return _Volunteer_activism!!
        
        _Volunteer_activism = ImageVector.Builder(
            name = "volunteer_activism",
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
                        moveTo(1f, 11f)
                        horizontalLineTo(5f)
                        verticalLineTo(22f)
                        horizontalLineTo(1f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16f, 3.25f)
                        curveTo(16.65f, 2.49f, 17.66f, 2f, 18.7f, 2f)
                        curveTo(20.55f, 2f, 22f, 3.45f, 22f, 5.3f)
                        curveToRelative(0f, 2.27f, -2.91f, 4.9f, -6f, 7.7f)
                        curveToRelative(-3.09f, -2.81f, -6f, -5.44f, -6f, -7.7f)
                        curveTo(10f, 3.45f, 11.45f, 2f, 13.3f, 2f)
                        curveTo(14.34f, 2f, 15.35f, 2.49f, 16f, 3.25f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 17f)
                        lineTo(13f, 17f)
                        lineTo(10.91f, 16.27f)
                        lineTo(11.24f, 15.32f)
                        lineTo(13f, 16f)
                        lineTo(17f, 16f)
                        lineTo(17f, 14f)
                        lineTo(8.97f, 11f)
                        lineTo(7f, 11f)
                        lineTo(7f, 20.02f)
                        lineTo(14f, 22f)
                        lineTo(22f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Volunteer_activism!!
    }

private var _Volunteer_activism: ImageVector? = null

