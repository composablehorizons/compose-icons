package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Gavel: ImageVector
    get() {
        if (_Gavel != null) return _Gavel!!
        
        _Gavel = ImageVector.Builder(
            name = "gavel",
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
                        moveTo(5.249565f, 8.068785f)
                        lineTo(8.079565f, 5.2419844f)
                        lineTo(22.213564f, 19.391983f)
                        lineTo(19.383566f, 22.218784f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.485738f, 3.8272243f)
                        lineTo(12.313738f, 0.9984255f)
                        lineTo(17.971338f, 6.654425f)
                        lineTo(15.143337f, 9.483225f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(0.9988861f, 12.314678f)
                        lineTo(3.8272867f, 9.486279f)
                        lineTo(9.484086f, 15.143078f)
                        lineTo(6.6556864f, 17.971478f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 21f)
                        horizontalLineTo(13f)
                        verticalLineTo(23f)
                        horizontalLineTo(1f)
                        verticalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Gavel!!
    }

private var _Gavel: ImageVector? = null

