package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.H_plus_mobiledata: ImageVector
    get() {
        if (_H_plus_mobiledata != null) return _H_plus_mobiledata!!
        
        _H_plus_mobiledata = ImageVector.Builder(
            name = "h_plus_mobiledata",
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
                        moveTo(12f, 11f)
                        horizontalLineTo(6f)
                        verticalLineTo(7f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-4f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(11f)
                        close()
                        moveTo(22f, 11f)
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
                    }
                }
            }
        }.build()
        
        return _H_plus_mobiledata!!
    }

private var _H_plus_mobiledata: ImageVector? = null

