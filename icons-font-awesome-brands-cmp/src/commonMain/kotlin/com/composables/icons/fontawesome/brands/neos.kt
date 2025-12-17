package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Neos: ImageVector
    get() {
        if (_Neos != null) return _Neos!!
        
        _Neos = ImageVector.Builder(
            name = "neos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(415.44f, 512f)
                horizontalLineToRelative(-95.11f)
                lineTo(212.12f, 357.46f)
                verticalLineToRelative(91.1f)
                lineTo(125.69f, 512f)
                horizontalLineTo(28f)
                verticalLineTo(29.82f)
                lineTo(68.47f, 0f)
                horizontalLineToRelative(108.05f)
                lineToRelative(123.74f, 176.13f)
                verticalLineTo(63.45f)
                lineTo(386.69f, 0f)
                horizontalLineToRelative(97.69f)
                verticalLineToRelative(461.5f)
                close()
                moveTo(38.77f, 35.27f)
                verticalLineTo(496f)
                lineToRelative(72f, -52.88f)
                verticalLineTo(194f)
                lineToRelative(215.5f, 307.64f)
                horizontalLineToRelative(84.79f)
                lineToRelative(52.35f, -38.17f)
                horizontalLineToRelative(-78.27f)
                lineTo(69f, 13f)
                close()
                moveToRelative(82.54f, 466.61f)
                lineToRelative(80f, -58.78f)
                verticalLineToRelative(-101f)
                lineToRelative(-79.76f, -114.4f)
                verticalLineToRelative(220.94f)
                lineTo(49f, 501.89f)
                horizontalLineToRelative(72.34f)
                close()
                moveTo(80.63f, 10.77f)
                lineToRelative(310.6f, 442.57f)
                horizontalLineToRelative(82.37f)
                verticalLineTo(10.77f)
                horizontalLineToRelative(-79.75f)
                verticalLineToRelative(317.56f)
                lineTo(170.91f, 10.77f)
                close()
                moveTo(311f, 191.65f)
                lineToRelative(72f, 102.81f)
                verticalLineTo(15.93f)
                lineToRelative(-72f, 53f)
                verticalLineToRelative(122.72f)
                close()
            }
        }.build()
        
        return _Neos!!
    }

private var _Neos: ImageVector? = null

