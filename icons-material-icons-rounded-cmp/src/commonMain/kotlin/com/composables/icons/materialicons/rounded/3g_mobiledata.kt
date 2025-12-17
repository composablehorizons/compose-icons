package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`3g_mobiledata`: ImageVector
    get() {
        if (_3g_mobiledata != null) return _3g_mobiledata!!
        
        _3g_mobiledata = ImageVector.Builder(
            name = "3g_mobiledata",
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
                        moveTo(3f, 8f)
                        lineTo(3f, 8f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-1.5f)
                        curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                        curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(4f)
                        curveTo(3.45f, 7f, 3f, 7.45f, 3f, 8f)
                        close()
                        moveTo(21f, 12f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineToRelative(-5f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-1.5f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(20f)
                        curveTo(20.55f, 11f, 21f, 11.45f, 21f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _3g_mobiledata!!
    }

private var _3g_mobiledata: ImageVector? = null

