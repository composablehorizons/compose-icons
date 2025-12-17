package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.`4g_plus_mobiledata`: ImageVector
    get() {
        if (_4g_plus_mobiledata != null) return _4g_plus_mobiledata!!
        
        _4g_plus_mobiledata = ImageVector.Builder(
            name = "4g_plus_mobiledata",
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
                        moveTo(13f, 11f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineToRelative(-4f)
                        curveTo(9.9f, 7f, 9f, 7.9f, 9f, 9f)
                        verticalLineToRelative(6f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(4f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4f)
                        horizontalLineTo(13f)
                        close()
                        moveTo(24f, 11f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11f)
                        close()
                        moveTo(7f, 7f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(3f)
                        verticalLineTo(7f)
                        horizontalLineTo(1f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        verticalLineTo(7f)
                        close()
                    }
                }
            }
        }.build()
        
        return _4g_plus_mobiledata!!
    }

private var _4g_plus_mobiledata: ImageVector? = null

