package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Colorize: ImageVector
    get() {
        if (_Colorize != null) return _Colorize!!
        
        _Colorize = ImageVector.Builder(
            name = "colorize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.71f, 5.63f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-3.12f, 3.12f)
                lineToRelative(-1.93f, -1.91f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.42f, 1.42f)
                lineTo(3f, 16.25f)
                verticalLineTo(21f)
                horizontalLineToRelative(4.75f)
                lineToRelative(8.92f, -8.92f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.92f, -1.92f)
                lineToRelative(3.12f, -3.12f)
                curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0.01f, -1.42f)
                close()
                moveTo(6.92f, 19f)
                lineTo(5f, 17.08f)
                lineToRelative(8.06f, -8.06f)
                lineToRelative(1.92f, 1.92f)
                lineTo(6.92f, 19f)
                close()
            }
        }.build()
        
        return _Colorize!!
    }

private var _Colorize: ImageVector? = null

