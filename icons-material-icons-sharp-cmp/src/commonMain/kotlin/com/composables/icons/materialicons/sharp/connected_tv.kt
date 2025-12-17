package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Connected_tv: ImageVector
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
                        moveTo(8.57f, 16f)
                        horizontalLineTo(10f)
                        curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                        verticalLineToRelative(1.43f)
                        curveTo(6.97f, 12.43f, 8.57f, 14.03f, 8.57f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11.55f, 16f)
                        horizontalLineTo(13f)
                        curveToRelative(0f, -4.42f, -3.59f, -8f, -8f, -8f)
                        verticalLineToRelative(1.45f)
                        curveTo(8.61f, 9.45f, 11.55f, 12.38f, 11.55f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 14f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        curveTo(7f, 14.89f, 6.11f, 14f, 5f, 14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 3f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(6f)
                        verticalLineTo(3f)
                        close()
                        moveTo(20f, 17f)
                        horizontalLineTo(4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Connected_tv!!
    }

private var _Connected_tv: ImageVector? = null

