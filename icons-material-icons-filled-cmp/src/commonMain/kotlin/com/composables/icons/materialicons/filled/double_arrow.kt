package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Double_arrow: ImageVector
    get() {
        if (_Double_arrow != null) return _Double_arrow!!
        
        _Double_arrow = ImageVector.Builder(
            name = "double_arrow",
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
                        moveTo(15.5f, 5f)
                        lineTo(11f, 5f)
                        lineTo(16f, 12f)
                        lineTo(11f, 19f)
                        lineTo(15.5f, 19f)
                        lineTo(20.5f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8.5f, 5f)
                        lineTo(4f, 5f)
                        lineTo(9f, 12f)
                        lineTo(4f, 19f)
                        lineTo(8.5f, 19f)
                        lineTo(13.5f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Double_arrow!!
    }

private var _Double_arrow: ImageVector? = null

