package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signpost: ImageVector
    get() {
        if (_Signpost != null) return _Signpost!!
        
        _Signpost = ImageVector.Builder(
            name = "signpost",
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
                        moveTo(13f, 10f)
                        lineTo(18f, 10f)
                        lineTo(21f, 7f)
                        lineTo(18f, 4f)
                        lineTo(13f, 4f)
                        lineTo(13f, 2f)
                        lineTo(11f, 2f)
                        lineTo(11f, 4f)
                        lineTo(4f, 4f)
                        lineTo(4f, 10f)
                        lineTo(11f, 10f)
                        lineTo(11f, 12f)
                        lineTo(6f, 12f)
                        lineTo(3f, 15f)
                        lineTo(6f, 18f)
                        lineTo(11f, 18f)
                        lineTo(11f, 22f)
                        lineTo(13f, 22f)
                        lineTo(13f, 18f)
                        lineTo(20f, 18f)
                        lineTo(20f, 12f)
                        lineTo(13f, 12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signpost!!
    }

private var _Signpost: ImageVector? = null

