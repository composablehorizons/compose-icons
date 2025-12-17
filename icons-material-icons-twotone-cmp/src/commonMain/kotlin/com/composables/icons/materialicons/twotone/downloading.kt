package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Downloading: ImageVector
    get() {
        if (_Downloading != null) return _Downloading!!
        
        _Downloading = ImageVector.Builder(
            name = "downloading",
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
                        moveTo(18.32f, 4.26f)
                        curveTo(16.84f, 3.05f, 15.01f, 2.25f, 13f, 2.05f)
                        verticalLineToRelative(2.02f)
                        curveToRelative(1.46f, 0.18f, 2.79f, 0.76f, 3.9f, 1.62f)
                        lineTo(18.32f, 4.26f)
                        close()
                        moveTo(19.93f, 11f)
                        horizontalLineToRelative(2.02f)
                        curveToRelative(-0.2f, -2.01f, -1f, -3.84f, -2.21f, -5.32f)
                        lineTo(18.31f, 7.1f)
                        curveTo(19.17f, 8.21f, 19.75f, 9.54f, 19.93f, 11f)
                        close()
                        moveTo(18.31f, 16.9f)
                        lineToRelative(1.43f, 1.43f)
                        curveToRelative(1.21f, -1.48f, 2.01f, -3.32f, 2.21f, -5.32f)
                        horizontalLineToRelative(-2.02f)
                        curveTo(19.75f, 14.46f, 19.17f, 15.79f, 18.31f, 16.9f)
                        close()
                        moveTo(13f, 19.93f)
                        verticalLineToRelative(2.02f)
                        curveToRelative(2.01f, -0.2f, 3.84f, -1f, 5.32f, -2.21f)
                        lineToRelative(-1.43f, -1.43f)
                        curveTo(15.79f, 19.17f, 14.46f, 19.75f, 13f, 19.93f)
                        close()
                        moveTo(13f, 12f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(7f)
                        lineToRelative(5f, 5f)
                        lineToRelative(5f, -5f)
                        horizontalLineTo(13f)
                        close()
                        moveTo(11f, 19.93f)
                        verticalLineToRelative(2.02f)
                        curveToRelative(-5.05f, -0.5f, -9f, -4.76f, -9f, -9.95f)
                        reflectiveCurveToRelative(3.95f, -9.45f, 9f, -9.95f)
                        verticalLineToRelative(2.02f)
                        curveTo(7.05f, 4.56f, 4f, 7.92f, 4f, 12f)
                        reflectiveCurveTo(7.05f, 19.44f, 11f, 19.93f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Downloading!!
    }

private var _Downloading: ImageVector? = null

