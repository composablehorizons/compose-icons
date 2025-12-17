package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Line_axis: ImageVector
    get() {
        if (_Line_axis != null) return _Line_axis!!
        
        _Line_axis = ImageVector.Builder(
            name = "line_axis",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 7.43f)
                    lineTo(20.59f, 6.02f)
                    lineTo(16.56f, 10.55f)
                    lineTo(9.5f, 4f)
                    lineTo(2f, 11.51f)
                    lineTo(3.5f, 13.01f)
                    lineTo(9.64f, 6.86f)
                    lineTo(15.23f, 12.04f)
                    lineTo(13.5f, 13.99f)
                    lineTo(9.5f, 9.99f)
                    lineTo(2f, 17.5f)
                    lineTo(3.5f, 19f)
                    lineTo(9.5f, 12.99f)
                    lineTo(13.5f, 16.99f)
                    lineTo(16.69f, 13.4f)
                    lineTo(20.59f, 17.01f)
                    lineTo(22f, 15.6f)
                    lineTo(18.02f, 11.9f)
                    close()
                }
            }
        }.build()
        
        return _Line_axis!!
    }

private var _Line_axis: ImageVector? = null

