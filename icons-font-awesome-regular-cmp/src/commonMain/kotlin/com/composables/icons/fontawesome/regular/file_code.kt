package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.FileCode: ImageVector
    get() {
        if (_FileCode != null) return _FileCode!!
        
        _FileCode = ImageVector.Builder(
            name = "file-code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(149.9f, 349.1f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-32.8f, -28.9f)
                lineToRelative(32.8f, -28.9f)
                curveToRelative(3.6f, -3.2f, 4f, -8.8f, 0.8f, -12.4f)
                lineToRelative(-0.2f, -0.2f)
                lineToRelative(-17.4f, -18.6f)
                curveToRelative(-3.4f, -3.6f, -9f, -3.7f, -12.4f, -0.4f)
                lineToRelative(-57.7f, 54.1f)
                curveToRelative(-3.7f, 3.5f, -3.7f, 9.4f, 0f, 12.8f)
                lineToRelative(57.7f, 54.1f)
                curveToRelative(1.6f, 1.5f, 3.8f, 2.4f, 6f, 2.4f)
                curveToRelative(2.4f, 0f, 4.8f, -1f, 6.4f, -2.8f)
                lineToRelative(17.4f, -18.6f)
                curveToRelative(3.3f, -3.5f, 3.1f, -9.1f, -0.4f, -12.4f)
                close()
                moveToRelative(220f, -251.2f)
                lineTo(286f, 14f)
                curveTo(277f, 5f, 264.8f, -0.1f, 252.1f, -0.1f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(416f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(131.9f)
                curveToRelative(0f, -12.7f, -5.1f, -25f, -14.1f, -34f)
                close()
                moveTo(256f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                horizontalLineTo(256f)
                close()
                moveTo(336f, 464f)
                horizontalLineTo(48f)
                verticalLineTo(48f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(104f)
                close()
                moveTo(209.6f, 214f)
                curveToRelative(-4.7f, -1.4f, -9.5f, 1.3f, -10.9f, 6f)
                lineTo(144f, 408.1f)
                curveToRelative(-1.4f, 4.7f, 1.3f, 9.6f, 6f, 10.9f)
                lineToRelative(24.4f, 7.1f)
                curveToRelative(4.7f, 1.4f, 9.6f, -1.4f, 10.9f, -6f)
                lineTo(240f, 231.9f)
                curveToRelative(1.4f, -4.7f, -1.3f, -9.6f, -6f, -10.9f)
                close()
                moveToRelative(24.5f, 76.9f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(32.8f, 28.9f)
                lineToRelative(-32.8f, 28.9f)
                curveToRelative(-3.6f, 3.2f, -4f, 8.8f, -0.8f, 12.4f)
                lineToRelative(0.2f, 0.2f)
                lineToRelative(17.4f, 18.6f)
                curveToRelative(3.3f, 3.5f, 8.9f, 3.7f, 12.4f, 0.4f)
                lineToRelative(57.7f, -54.1f)
                curveToRelative(3.7f, -3.5f, 3.7f, -9.4f, 0f, -12.8f)
                lineToRelative(-57.7f, -54.1f)
                curveToRelative(-3.5f, -3.3f, -9.1f, -3.2f, -12.4f, 0.4f)
                lineToRelative(-17.4f, 18.6f)
                curveToRelative(-3.3f, 3.5f, -3.1f, 9.1f, 0.4f, 12.4f)
                close()
            }
        }.build()
        
        return _FileCode!!
    }

private var _FileCode: ImageVector? = null

