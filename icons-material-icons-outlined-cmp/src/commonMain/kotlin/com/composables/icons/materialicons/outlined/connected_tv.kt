package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Connected_tv: ImageVector
    get() {
        if (_Connected_tv != null) return _Connected_tv!!
        
        _Connected_tv = ImageVector.Builder(
            name = "connected_tv",
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
                        moveTo(20f, 3f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                        lineTo(22f, 5f)
                        curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                        close()
                        moveTo(20f, 17f)
                        horizontalLineTo(4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(17f)
                        close()
                        moveTo(5f, 14f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        curveTo(7f, 14.89f, 6.11f, 14f, 5f, 14f)
                        close()
                        moveTo(5f, 11f)
                        verticalLineToRelative(1.43f)
                        curveToRelative(1.97f, 0f, 3.57f, 1.6f, 3.57f, 3.57f)
                        horizontalLineTo(10f)
                        curveTo(10f, 13.24f, 7.76f, 11f, 5f, 11f)
                        close()
                        moveTo(5f, 8f)
                        verticalLineToRelative(1.45f)
                        curveToRelative(3.61f, 0f, 6.55f, 2.93f, 6.55f, 6.55f)
                        horizontalLineTo(13f)
                        curveTo(13f, 11.58f, 9.41f, 8f, 5f, 8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Connected_tv!!
    }

private var _Connected_tv: ImageVector? = null

