package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Media_bluetooth_on: ImageVector
    get() {
        if (_Media_bluetooth_on != null) return _Media_bluetooth_on!!
        
        _Media_bluetooth_on = ImageVector.Builder(
            name = "media_bluetooth_on",
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
                        moveTo(9f, 5f)
                        lineToRelative(0.01f, 8.55f)
                        curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2f, -0.55f)
                        curveTo(4.79f, 13f, 3f, 14.79f, 3f, 17f)
                        reflectiveCurveToRelative(1.79f, 4f, 4.01f, 4f)
                        reflectiveCurveTo(11f, 19.21f, 11f, 17f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(2f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-2f)
                        curveTo(9.9f, 3f, 9f, 3.9f, 9f, 5f)
                        close()
                        moveTo(20.29f, 11.72f)
                        lineToRelative(-2.47f, -2.47f)
                        curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                        verticalLineToRelative(3.94f)
                        lineToRelative(-2.33f, -2.33f)
                        curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.23f, 0.23f, -0.23f, 0.62f, 0f, 0.85f)
                        lineTo(16.73f, 15f)
                        lineToRelative(-2.93f, 2.93f)
                        curveToRelative(-0.23f, 0.23f, -0.23f, 0.61f, 0f, 0.85f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.23f, 0.23f, 0.61f, 0.23f, 0.85f, 0f)
                        lineToRelative(2.33f, -2.33f)
                        verticalLineToRelative(3.94f)
                        curveToRelative(0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                        lineToRelative(2.46f, -2.46f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(18.42f, 15f)
                        lineToRelative(1.87f, -1.86f)
                        curveTo(20.68f, 12.75f, 20.68f, 12.11f, 20.29f, 11.72f)
                        close()
                        moveTo(18.17f, 11.3f)
                        lineToRelative(1.13f, 1.13f)
                        lineToRelative(-1.13f, 1.13f)
                        verticalLineTo(11.3f)
                        close()
                        moveTo(19.3f, 17.57f)
                        lineToRelative(-1.13f, 1.13f)
                        verticalLineToRelative(-2.26f)
                        lineTo(19.3f, 17.57f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Media_bluetooth_on!!
    }

private var _Media_bluetooth_on: ImageVector? = null

