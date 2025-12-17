package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Security_update_warning: ImageVector
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
                        moveTo(5.01f, 1f)
                        verticalLineToRelative(22f)
                        horizontalLineTo(19f)
                        verticalLineTo(1f)
                        horizontalLineTo(5.01f)
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

