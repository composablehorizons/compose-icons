package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Security_update_warning: ImageVector
    get() {
        if (_Security_update_warning != null) return _Security_update_warning!!
        
        _Security_update_warning = ImageVector.Builder(
            name = "security_update_warning",
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
                        moveTo(11f, 15f)
                        horizontalLineTo(13f)
                        verticalLineTo(17f)
                        horizontalLineTo(11f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 7f)
                        horizontalLineTo(13f)
                        verticalLineTo(13f)
                        horizontalLineTo(11f)
                        verticalLineTo(7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 1f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 1f, 5.01f, 1.9f, 5.01f, 3f)
                        verticalLineToRelative(18f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(3f)
                        curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                        close()
                        moveTo(17f, 18f)
                        horizontalLineTo(7f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Security_update_warning!!
    }

private var _Security_update_warning: ImageVector? = null

