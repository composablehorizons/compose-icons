package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`4g_mobiledata`: ImageVector
    get() {
        if (_4g_mobiledata != null) return _4g_mobiledata!!
        
        _4g_mobiledata = ImageVector.Builder(
            name = "4g_mobiledata",
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
                        moveTo(9f, 7f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(5f)
                        verticalLineTo(7f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(7f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(9f)
                        verticalLineTo(7f)
                        close()
                        moveTo(17f, 11f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(7f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(-9f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-6f)
                        horizontalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _4g_mobiledata!!
    }

private var _4g_mobiledata: ImageVector? = null

