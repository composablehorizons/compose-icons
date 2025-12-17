package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Deck: ImageVector
    get() {
        if (_Deck != null) return _Deck!!
        
        _Deck = ImageVector.Builder(
            name = "deck",
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
                        moveTo(22f, 9f)
                        lineTo(12f, 2f)
                        lineTo(2f, 9f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(13f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(9f)
                        horizontalLineTo(22f)
                        close()
                        moveTo(12f, 4.44f)
                        lineTo(15.66f, 7f)
                        horizontalLineTo(8.34f)
                        lineTo(12f, 4.44f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4.14f, 12f)
                        lineTo(2.18f, 12.37f)
                        lineTo(3f, 16.74f)
                        lineTo(3f, 22f)
                        lineTo(5f, 22f)
                        lineTo(5.02f, 18f)
                        lineTo(7f, 18f)
                        lineTo(7f, 22f)
                        lineTo(9f, 22f)
                        lineTo(9f, 16f)
                        lineTo(4.9f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.1f, 16f)
                        lineTo(15f, 16f)
                        lineTo(15f, 22f)
                        lineTo(17f, 22f)
                        lineTo(17f, 18f)
                        lineTo(18.98f, 18f)
                        lineTo(19f, 22f)
                        lineTo(21f, 22f)
                        lineTo(21f, 16.74f)
                        lineTo(21.82f, 12.37f)
                        lineTo(19.86f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Deck!!
    }

private var _Deck: ImageVector? = null

