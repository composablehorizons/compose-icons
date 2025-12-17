package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Hdr_off_select: ImageVector
    get() {
        if (_Hdr_off_select != null) return _Hdr_off_select!!
        
        _Hdr_off_select = ImageVector.Builder(
            name = "hdr_off_select",
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
                        moveTo(18f, 20f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1.1f)
                        lineToRelative(0.9f, 2f)
                        horizontalLineTo(18f)
                        lineToRelative(-0.86f, -2f)
                        lineTo(18f, 20f)
                        close()
                        moveTo(16.5f, 18.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(18.5f)
                        close()
                        moveTo(3.5f, 18f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(0f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-2.5f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(22f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(3.5f)
                        verticalLineTo(18f)
                        close()
                        moveTo(10f, 16f)
                        horizontalLineTo(6.5f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(10f)
                        curveToRelative(0.8f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
                        verticalLineToRelative(-3f)
                        curveTo(11.5f, 16.7f, 10.8f, 16f, 10f, 16f)
                        close()
                        moveTo(10f, 20.5f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(20.5f)
                        close()
                        moveTo(24f, 20f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-1.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(22f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(20f)
                        close()
                        moveTo(10.98f, 4.15f)
                        lineTo(9.42f, 2.59f)
                        curveToRelative(5.1f, -2.42f, 10.41f, 2.89f, 7.99f, 7.99f)
                        lineToRelative(-1.56f, -1.56f)
                        curveTo(16.66f, 6.06f, 13.94f, 3.34f, 10.98f, 4.15f)
                        close()
                        moveTo(6.34f, 2.34f)
                        lineTo(4.93f, 3.76f)
                        lineToRelative(1.66f, 1.66f)
                        curveToRelative(-2.42f, 5.1f, 2.89f, 10.41f, 7.99f, 7.99f)
                        lineToRelative(1.66f, 1.66f)
                        lineToRelative(1.41f, -1.41f)
                        lineTo(6.34f, 2.34f)
                        close()
                        moveTo(8.15f, 6.98f)
                        lineToRelative(4.87f, 4.87f)
                        curveTo(10.06f, 12.66f, 7.34f, 9.94f, 8.15f, 6.98f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Hdr_off_select!!
    }

private var _Hdr_off_select: ImageVector? = null

