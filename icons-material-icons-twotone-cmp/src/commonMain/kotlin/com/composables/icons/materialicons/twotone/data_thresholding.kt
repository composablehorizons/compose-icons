package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Data_thresholding: ImageVector
    get() {
        if (_Data_thresholding != null) return _Data_thresholding!!
        
        _Data_thresholding = ImageVector.Builder(
            name = "data_thresholding",
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
                        moveTo(19f, 19f)
                        lineTo(19f, 17.27f)
                        lineTo(17.27f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 17.72f)
                        lineTo(6.72f, 16f)
                        horizontalLineToRelative(2.12f)
                        lineToRelative(-3f, 3f)
                        horizontalLineToRelative(1.83f)
                        lineToRelative(3f, -3f)
                        horizontalLineToRelative(2.12f)
                        lineToRelative(-3f, 3f)
                        horizontalLineToRelative(1.62f)
                        lineToRelative(3f, -3f)
                        horizontalLineToRelative(2.12f)
                        lineToRelative(-3f, 3f)
                        horizontalLineToRelative(1.62f)
                        lineToRelative(3f, -3f)
                        horizontalLineTo(19f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        verticalLineTo(17.72f)
                        close()
                        moveTo(10.67f, 8.17f)
                        lineToRelative(2f, 2f)
                        lineToRelative(3.67f, -3.67f)
                        lineToRelative(1.41f, 1.41f)
                        lineTo(12.67f, 13f)
                        lineToRelative(-2f, -2f)
                        lineToRelative(-3f, 3f)
                        lineToRelative(-1.41f, -1.41f)
                        lineTo(10.67f, 8.17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 3f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                        close()
                        moveTo(19f, 19f)
                        horizontalLineToRelative(-1.73f)
                        lineTo(19f, 17.27f)
                        verticalLineTo(19f)
                        close()
                        moveTo(19f, 16f)
                        horizontalLineToRelative(-0.85f)
                        lineToRelative(-3f, 3f)
                        horizontalLineToRelative(-1.62f)
                        lineToRelative(3f, -3f)
                        horizontalLineToRelative(-2.12f)
                        lineToRelative(-3f, 3f)
                        horizontalLineTo(9.8f)
                        lineToRelative(3f, -3f)
                        horizontalLineToRelative(-2.12f)
                        lineToRelative(-3f, 3f)
                        horizontalLineTo(5.84f)
                        lineToRelative(3f, -3f)
                        horizontalLineTo(6.72f)
                        lineTo(5f, 17.72f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.67f, 11f)
                        lineTo(12.67f, 13f)
                        lineTo(17.75f, 7.91f)
                        lineTo(16.34f, 6.5f)
                        lineTo(12.67f, 10.17f)
                        lineTo(10.67f, 8.17f)
                        lineTo(6.25f, 12.59f)
                        lineTo(7.66f, 14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Data_thresholding!!
    }

private var _Data_thresholding: ImageVector? = null

