package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Domain_verification: ImageVector
    get() {
        if (_Domain_verification != null) return _Domain_verification!!
        
        _Domain_verification = ImageVector.Builder(
            name = "domain_verification",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
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
                        moveTo(16.6f, 10.88f)
                        lineTo(15.18f, 9.46f)
                        lineTo(10.94f, 13.71f)
                        lineTo(8.82f, 11.58f)
                        lineTo(7.4f, 13f)
                        lineTo(10.94f, 16.54f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 4f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(18f)
                        verticalLineTo(4f)
                        horizontalLineTo(3f)
                        close()
                        moveTo(19f, 18f)
                        horizontalLineTo(5f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Domain_verification!!
    }

private var _Domain_verification: ImageVector? = null

