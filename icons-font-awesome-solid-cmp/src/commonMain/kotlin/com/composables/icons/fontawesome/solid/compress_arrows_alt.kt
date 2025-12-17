package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CompressArrowsAlt: ImageVector
    get() {
        if (_CompressArrowsAlt != null) return _CompressArrowsAlt!!
        
        _CompressArrowsAlt = ImageVector.Builder(
            name = "compress-arrows-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 288f)
                horizontalLineTo(88f)
                curveToRelative(-21.4f, 0f, -32.1f, 25.8f, -17f, 41f)
                lineToRelative(32.9f, 31f)
                lineToRelative(-99.2f, 99.3f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0f, 22.6f)
                lineToRelative(25.4f, 25.4f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0f)
                lineTo(152f, 408f)
                lineToRelative(31.1f, 33f)
                curveToRelative(15.1f, 15.1f, 40.9f, 4.4f, 40.9f, -17f)
                verticalLineTo(312f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
                moveToRelative(112f, -64f)
                horizontalLineToRelative(112f)
                curveToRelative(21.4f, 0f, 32.1f, -25.9f, 17f, -41f)
                lineToRelative(-33f, -31f)
                lineToRelative(99.3f, -99.3f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0f, -22.6f)
                lineTo(481.9f, 4.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0f)
                lineTo(360f, 104f)
                lineToRelative(-31.1f, -33f)
                curveTo(313.8f, 55.9f, 288f, 66.6f, 288f, 88f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                close()
                moveToRelative(96f, 136f)
                lineToRelative(33f, -31.1f)
                curveToRelative(15.1f, -15.1f, 4.4f, -40.9f, -17f, -40.9f)
                horizontalLineTo(312f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 21.4f, 25.9f, 32.1f, 41f, 17f)
                lineToRelative(31f, -32.9f)
                lineToRelative(99.3f, 99.3f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0f)
                lineToRelative(25.4f, -25.4f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0f, -22.6f)
                lineTo(408f, 360f)
                close()
                moveTo(183f, 71.1f)
                lineTo(152f, 104f)
                lineTo(52.7f, 4.7f)
                curveToRelative(-6.2f, -6.2f, -16.4f, -6.2f, -22.6f, 0f)
                lineTo(4.7f, 30.1f)
                curveToRelative(-6.2f, 6.2f, -6.2f, 16.4f, 0f, 22.6f)
                lineTo(104f, 152f)
                lineToRelative(-33f, 31.1f)
                curveTo(55.9f, 198.2f, 66.6f, 224f, 88f, 224f)
                horizontalLineToRelative(112f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(88f)
                curveToRelative(0f, -21.3f, -25.9f, -32f, -41f, -16.9f)
                close()
            }
        }.build()
        
        return _CompressArrowsAlt!!
    }

private var _CompressArrowsAlt: ImageVector? = null

