package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mp: ImageVector
    get() {
        if (_Mp != null) return _Mp!!
        
        _Mp = ImageVector.Builder(
            name = "mp",
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
                        moveTo(7f, 9f)
                        horizontalLineToRelative(4.5f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(4.25f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        horizontalLineToRelative(0f)
                        curveTo(11.34f, 15f, 11f, 14.66f, 11f, 14.25f)
                        verticalLineTo(10.5f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(2.25f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                        verticalLineTo(10.5f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(3.75f)
                        curveTo(7.5f, 14.66f, 7.16f, 15f, 6.75f, 15f)
                        horizontalLineToRelative(0f)
                        curveTo(6.34f, 15f, 6f, 14.66f, 6f, 14.25f)
                        verticalLineTo(10f)
                        curveTo(6f, 9.45f, 6.45f, 9f, 7f, 9f)
                        close()
                        moveTo(14.25f, 15f)
                        lineTo(14.25f, 15f)
                        curveToRelative(-0.41f, 0f, -0.75f, -0.33f, -0.75f, -0.75f)
                        verticalLineTo(10f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(17f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(2.5f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(0.75f)
                        curveTo(15f, 14.66f, 14.66f, 15f, 14.25f, 15f)
                        close()
                        moveTo(15f, 12f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineTo(15f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mp!!
    }

private var _Mp: ImageVector? = null

