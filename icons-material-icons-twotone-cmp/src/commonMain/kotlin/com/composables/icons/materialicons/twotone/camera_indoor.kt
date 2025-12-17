package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Camera_indoor: ImageVector
    get() {
        if (_Camera_indoor != null) return _Camera_indoor!!
        
        _Camera_indoor = ImageVector.Builder(
            name = "camera_indoor",
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
                        moveTo(6f, 10f)
                        verticalLineToRelative(9f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-9f)
                        lineToRelative(-6f, -4.5f)
                        lineTo(6f, 10f)
                        close()
                        moveTo(14f, 12f)
                        verticalLineToRelative(1f)
                        lineToRelative(2f, -1.06f)
                        verticalLineToRelative(4.12f)
                        lineTo(14f, 15f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(9f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(-4f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        curveTo(13.55f, 11f, 14f, 11.45f, 14f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 12f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-1f)
                        lineToRelative(2f, 1.06f)
                        verticalLineToRelative(-4.12f)
                        lineTo(14f, 13f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(9f)
                        curveTo(8.45f, 11f, 8f, 11.45f, 8f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 3f)
                        lineTo(4f, 9f)
                        verticalLineToRelative(12f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(9f)
                        lineTo(12f, 3f)
                        close()
                        moveTo(18f, 19f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-9f)
                        lineToRelative(6f, -4.5f)
                        lineToRelative(6f, 4.5f)
                        verticalLineTo(19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Camera_indoor!!
    }

private var _Camera_indoor: ImageVector? = null

