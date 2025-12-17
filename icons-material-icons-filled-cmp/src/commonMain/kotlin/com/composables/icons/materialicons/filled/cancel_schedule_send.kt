package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Cancel_schedule_send: ImageVector
    get() {
        if (_Cancel_schedule_send != null) return _Cancel_schedule_send!!
        
        _Cancel_schedule_send = ImageVector.Builder(
            name = "cancel_schedule_send",
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
                        moveTo(16.5f, 9f)
                        curveToRelative(-0.42f, 0f, -0.83f, 0.04f, -1.24f, 0.11f)
                        lineTo(1.01f, 3f)
                        lineTo(1f, 10f)
                        lineToRelative(9f, 2f)
                        lineToRelative(-9f, 2f)
                        lineToRelative(0.01f, 7f)
                        lineToRelative(8.07f, -3.46f)
                        curveTo(9.59f, 21.19f, 12.71f, 24f, 16.5f, 24f)
                        curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                        reflectiveCurveTo(20.64f, 9f, 16.5f, 9f)
                        close()
                        moveTo(16.5f, 22f)
                        curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                        reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                        reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                        reflectiveCurveTo(19.53f, 22f, 16.5f, 22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.27f, 14.03f)
                        lineTo(16.5f, 15.79f)
                        lineTo(14.73f, 14.03f)
                        lineTo(14.03f, 14.73f)
                        lineTo(15.79f, 16.5f)
                        lineTo(14.03f, 18.27f)
                        lineTo(14.73f, 18.97f)
                        lineTo(16.5f, 17.21f)
                        lineTo(18.27f, 18.97f)
                        lineTo(18.97f, 18.27f)
                        lineTo(17.21f, 16.5f)
                        lineTo(18.97f, 14.73f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cancel_schedule_send!!
    }

private var _Cancel_schedule_send: ImageVector? = null

