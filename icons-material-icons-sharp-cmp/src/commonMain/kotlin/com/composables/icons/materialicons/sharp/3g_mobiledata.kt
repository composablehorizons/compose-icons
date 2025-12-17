package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`3g_mobiledata`: ImageVector
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
                        moveTo(3f, 7f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(7f)
                        verticalLineTo(7f)
                        horizontalLineTo(3f)
                        close()
                        moveTo(21f, 11f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(-9f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-7f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _3g_mobiledata!!
    }

private var _3g_mobiledata: ImageVector? = null

