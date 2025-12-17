package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.No_photography: ImageVector
    get() {
        if (_No_photography != null) return _No_photography!!
        
        _No_photography = ImageVector.Builder(
            name = "no_photography",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.9f, 6.07f)
                        lineTo(7.48f, 4.66f)
                        lineTo(9f, 3f)
                        horizontalLineToRelative(6f)
                        lineToRelative(1.83f, 2f)
                        horizontalLineTo(20f)
                        curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f)
                        lineTo(20f, 17.17f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(-4.05f)
                        lineToRelative(-1.83f, -2f)
                        horizontalLineTo(9.88f)
                        lineTo(8.9f, 6.07f)
                        close()
                        moveTo(20.49f, 23.31f)
                        lineTo(18.17f, 21f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(7f)
                        curveToRelative(0f, -0.59f, 0.27f, -1.12f, 0.68f, -1.49f)
                        lineToRelative(-2f, -2f)
                        lineTo(2.1f, 2.1f)
                        lineToRelative(19.8f, 19.8f)
                        lineTo(20.49f, 23.31f)
                        close()
                        moveTo(9.19f, 12.02f)
                        curveTo(9.08f, 12.33f, 9f, 12.65f, 9f, 13f)
                        curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                        curveToRelative(0.35f, 0f, 0.67f, -0.08f, 0.98f, -0.19f)
                        lineTo(9.19f, 12.02f)
                        close()
                        moveTo(16.17f, 19f)
                        lineToRelative(-1.68f, -1.68f)
                        curveTo(13.76f, 17.75f, 12.91f, 18f, 12f, 18f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        curveToRelative(0f, -0.91f, 0.25f, -1.76f, 0.68f, -2.49f)
                        lineTo(4.17f, 7f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(12f)
                        horizontalLineTo(16.17f)
                        close()
                        moveTo(14.81f, 11.98f)
                        lineToRelative(2.07f, 2.07f)
                        curveTo(16.96f, 13.71f, 17f, 13.36f, 17f, 13f)
                        curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                        curveToRelative(-0.36f, 0f, -0.71f, 0.04f, -1.06f, 0.12f)
                        lineToRelative(2.07f, 2.07f)
                        curveTo(13.85f, 10.49f, 14.51f, 11.15f, 14.81f, 11.98f)
                        close()
                    }
                }
            }
        }.build()
        
        return _No_photography!!
    }

private var _No_photography: ImageVector? = null

