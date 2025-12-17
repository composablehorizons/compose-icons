package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Compare_arrows: ImageVector
    get() {
        if (_Compare_arrows != null) return _Compare_arrows!!
        
        _Compare_arrows = ImageVector.Builder(
            name = "compare_arrows",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(9.01f, 14f)
                            horizontalLineTo(2f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(7.01f)
                            verticalLineToRelative(3f)
                            lineTo(13f, 15f)
                            lineToRelative(-3.99f, -4f)
                            verticalLineTo(14f)
                            close()
                            moveTo(14.99f, 13f)
                            verticalLineToRelative(-3f)
                            horizontalLineTo(22f)
                            verticalLineTo(8f)
                            horizontalLineToRelative(-7.01f)
                            verticalLineTo(5f)
                            lineTo(11f, 9f)
                            lineTo(14.99f, 13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Compare_arrows!!
    }

private var _Compare_arrows: ImageVector? = null

