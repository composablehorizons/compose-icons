package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ad_units: ImageVector
    get() {
        if (_Ad_units != null) return _Ad_units!!
        
        _Ad_units = ImageVector.Builder(
            name = "ad_units",
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
                        moveTo(17f, 1f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(3f)
                        curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                        close()
                        moveTo(16f, 19f)
                        horizontalLineTo(8f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(8f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(12f)
                        curveTo(17f, 18.55f, 16.55f, 19f, 16f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 6f)
                        horizontalLineTo(9f)
                        curveTo(8.45f, 6f, 8f, 6.45f, 8f, 7f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(0f)
                        curveTo(16f, 6.45f, 15.55f, 6f, 15f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Ad_units!!
    }

private var _Ad_units: ImageVector? = null

