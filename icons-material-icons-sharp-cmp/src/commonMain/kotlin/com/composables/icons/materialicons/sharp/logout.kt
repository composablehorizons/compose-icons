package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Logout: ImageVector
    get() {
        if (_Logout != null) return _Logout!!
        
        _Logout = ImageVector.Builder(
            name = "logout",
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
                        moveTo(5f, 5f)
                        lineTo(12f, 5f)
                        lineTo(12f, 3f)
                        lineTo(3f, 3f)
                        lineTo(3f, 21f)
                        lineTo(12f, 21f)
                        lineTo(12f, 19f)
                        lineTo(5f, 19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21f, 12f)
                        lineTo(17f, 8f)
                        lineTo(17f, 11f)
                        lineTo(9f, 11f)
                        lineTo(9f, 13f)
                        lineTo(17f, 13f)
                        lineTo(17f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Logout!!
    }

private var _Logout: ImageVector? = null

