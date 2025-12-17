package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.R_mobiledata: ImageVector
    get() {
        if (_R_mobiledata != null) return _R_mobiledata!!
        
        _R_mobiledata = ImageVector.Builder(
            name = "r_mobiledata",
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
                        moveTo(7.8f, 7.2f)
                        lineTo(9f, 10f)
                        horizontalLineTo(7f)
                        lineTo(5.87f, 7.33f)
                        horizontalLineTo(4f)
                        verticalLineTo(10f)
                        horizontalLineTo(2f)
                        verticalLineTo(2f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(5.2f)
                        horizontalLineTo(7.8f)
                        close()
                        moveTo(7f, 4f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(1.33f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _R_mobiledata!!
    }

private var _R_mobiledata: ImageVector? = null

