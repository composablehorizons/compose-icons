package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_cellular_nodata: ImageVector
    get() {
        if (_Signal_cellular_nodata != null) return _Signal_cellular_nodata!!
        
        _Signal_cellular_nodata = ImageVector.Builder(
            name = "signal_cellular_nodata",
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
                        moveTo(22f, 13f)
                        horizontalLineToRelative(-7f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(4.41f)
                        curveToRelative(-0.89f, 0f, -1.34f, -1.08f, -0.71f, -1.71f)
                        lineTo(20.29f, 3.71f)
                        curveTo(20.92f, 3.08f, 22f, 3.52f, 22f, 4.41f)
                        verticalLineTo(13f)
                        close()
                        moveTo(20.3f, 14.71f)
                        lineTo(20.3f, 14.71f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(-1.39f, 1.39f)
                        lineToRelative(-1.39f, -1.39f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(1.39f, 1.39f)
                        lineToRelative(-1.39f, 1.39f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(1.39f, -1.38f)
                        lineToRelative(1.39f, 1.38f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineToRelative(-1.38f, -1.39f)
                        lineToRelative(1.38f, -1.39f)
                        curveTo(20.69f, 15.73f, 20.69f, 15.1f, 20.3f, 14.71f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_cellular_nodata!!
    }

private var _Signal_cellular_nodata: ImageVector? = null

