package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.E_mobiledata: ImageVector
    get() {
        if (_E_mobiledata != null) return _E_mobiledata!!
        
        _E_mobiledata = ImageVector.Builder(
            name = "e_mobiledata",
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
                        moveTo(16f, 9f)
                        verticalLineTo(7f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-6f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-6f)
                        verticalLineTo(9f)
                        horizontalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _E_mobiledata!!
    }

private var _E_mobiledata: ImageVector? = null

