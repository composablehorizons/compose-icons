package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Rtt: ImageVector
    get() {
        if (_Rtt != null) return _Rtt!!
        
        _Rtt = ImageVector.Builder(
            name = "rtt",
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
                    moveTo(9.03f, 3f)
                    lineToRelative(-1.11f, 7.07f)
                    horizontalLineToRelative(2.62f)
                    lineToRelative(0.7f, -4.5f)
                    horizontalLineToRelative(2.58f)
                    lineTo(11.8f, 18.43f)
                    horizontalLineTo(9.47f)
                    lineTo(9.06f, 21f)
                    horizontalLineToRelative(7.27f)
                    lineToRelative(0.4f, -2.57f)
                    horizontalLineToRelative(-2.35f)
                    lineToRelative(2f, -12.86f)
                    horizontalLineToRelative(2.58f)
                    lineToRelative(-0.71f, 4.5f)
                    horizontalLineToRelative(2.65f)
                    lineTo(22f, 3f)
                    horizontalLineTo(9.03f)
                    close()
                    moveTo(8f, 5f)
                    horizontalLineTo(4f)
                    lineTo(3.69f, 7f)
                    horizontalLineToRelative(4f)
                    lineTo(8f, 5f)
                    close()
                    moveTo(7.39f, 9f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(-0.31f, 2f)
                    horizontalLineToRelative(4f)
                    lineTo(7.39f, 9f)
                    close()
                    moveTo(8.31f, 17f)
                    horizontalLineToRelative(-6f)
                    lineTo(2f, 19f)
                    horizontalLineToRelative(6f)
                    lineTo(8.31f, 17f)
                    close()
                    moveTo(8.93f, 13f)
                    horizontalLineToRelative(-6f)
                    lineToRelative(-0.31f, 2f)
                    horizontalLineToRelative(6.01f)
                    lineTo(8.93f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Rtt!!
    }

private var _Rtt: ImageVector? = null

