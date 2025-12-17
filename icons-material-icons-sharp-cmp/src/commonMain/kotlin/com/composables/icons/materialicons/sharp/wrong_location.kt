package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wrong_location: ImageVector
    get() {
        if (_Wrong_location != null) return _Wrong_location!!
        
        _Wrong_location = ImageVector.Builder(
            name = "wrong_location",
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
                        moveTo(14f, 10f)
                        verticalLineTo(3.26f)
                        curveTo(13.35f, 3.09f, 12.68f, 3f, 12f, 3f)
                        curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                        curveToRelative(0f, 3.32f, 2.67f, 7.25f, 8f, 11.8f)
                        curveToRelative(5.33f, -4.55f, 8f, -8.48f, 8f, -11.8f)
                        curveToRelative(0f, -0.41f, -0.04f, -0.81f, -0.09f, -1.2f)
                        horizontalLineTo(14f)
                        close()
                        moveTo(12f, 13f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                        curveTo(14f, 12.1f, 13.1f, 13f, 12f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22.54f, 2.88f)
                        lineTo(21.12f, 1.46f)
                        lineTo(19f, 3.59f)
                        lineTo(16.88f, 1.46f)
                        lineTo(15.46f, 2.88f)
                        lineTo(17.59f, 5f)
                        lineTo(15.46f, 7.12f)
                        lineTo(16.88f, 8.54f)
                        lineTo(19f, 6.41f)
                        lineTo(21.12f, 8.54f)
                        lineTo(22.54f, 7.12f)
                        lineTo(20.41f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wrong_location!!
    }

private var _Wrong_location: ImageVector? = null

