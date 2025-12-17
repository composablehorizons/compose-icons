package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ios_share: ImageVector
    get() {
        if (_Ios_share != null) return _Ios_share!!
        
        _Ios_share = ImageVector.Builder(
            name = "ios_share",
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
                        moveTo(20f, 8f)
                        lineTo(15f, 8f)
                        lineTo(15f, 10f)
                        lineTo(18f, 10f)
                        lineTo(18f, 21f)
                        lineTo(6f, 21f)
                        lineTo(6f, 10f)
                        lineTo(9f, 10f)
                        lineTo(9f, 8f)
                        lineTo(4f, 8f)
                        lineTo(4f, 23f)
                        lineTo(20f, 23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(11f, 16f)
                        lineTo(13f, 16f)
                        lineTo(13f, 5f)
                        lineTo(16f, 5f)
                        lineTo(12f, 1f)
                        lineTo(8f, 5f)
                        lineTo(11f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Ios_share!!
    }

private var _Ios_share: ImageVector? = null

