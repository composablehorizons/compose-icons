package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Temple_hindu: ImageVector
    get() {
        if (_Temple_hindu != null) return _Temple_hindu!!
        
        _Temple_hindu = ImageVector.Builder(
            name = "temple_hindu",
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
                        moveTo(13.51f, 5f)
                        lineTo(10.49f, 5f)
                        lineTo(9.89f, 7f)
                        lineTo(14.11f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14.71f, 9f)
                        lineTo(9.29f, 9f)
                        lineTo(8.69f, 11f)
                        lineTo(15.31f, 11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.91f, 13f)
                        lineTo(8.09f, 13f)
                        lineTo(7.49f, 15f)
                        lineTo(4f, 15f)
                        lineTo(4f, 20f)
                        lineTo(9f, 20f)
                        lineTo(9f, 15f)
                        lineTo(15f, 15f)
                        lineTo(15f, 20f)
                        lineTo(20f, 20f)
                        lineTo(20f, 15f)
                        lineTo(16.51f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 11f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        lineTo(15f, 3f)
                        verticalLineTo(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2.03f)
                        verticalLineTo(1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2.12f)
                        lineTo(6f, 13f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(11f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(9f)
                        verticalLineTo(11f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(10.49f, 5f)
                        horizontalLineToRelative(3.02f)
                        lineToRelative(0.6f, 2f)
                        horizontalLineTo(9.89f)
                        lineTo(10.49f, 5f)
                        close()
                        moveTo(9.29f, 9f)
                        horizontalLineToRelative(5.42f)
                        lineToRelative(0.6f, 2f)
                        horizontalLineTo(8.69f)
                        lineTo(9.29f, 9f)
                        close()
                        moveTo(20f, 20f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(-5f)
                        horizontalLineToRelative(3.49f)
                        lineToRelative(0.6f, -2f)
                        horizontalLineToRelative(7.82f)
                        lineToRelative(0.6f, 2f)
                        horizontalLineTo(20f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Temple_hindu!!
    }

private var _Temple_hindu: ImageVector? = null

