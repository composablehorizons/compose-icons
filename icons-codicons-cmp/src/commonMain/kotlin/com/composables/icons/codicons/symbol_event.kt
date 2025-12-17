package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolEvent: ImageVector
    get() {
        if (_SymbolEvent != null) return _SymbolEvent!!
        
        _SymbolEvent = ImageVector.Builder(
            name = "symbol-event",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.91447f, 1.71442f)
                curveTo(5.04078f, 1.29055f, 5.43053f, 1f, 5.87282f, 1f)
                horizontalLineTo(10.2786f)
                curveTo(10.9768f, 1f, 11.4601f, 1.69737f, 11.2149f, 2.35112f)
                lineTo(10.2216f, 5f)
                horizontalLineTo(12.2511f)
                curveTo(12.8791f, 5f, 13.229f, 5.72572f, 12.8379f, 6.21709f)
                lineTo(6.23096f, 14.5173f)
                curveTo(5.37726f, 15.5898f, 3.66907f, 14.7047f, 4.05299f, 13.3888f)
                lineTo(5.33338f, 9f)
                horizontalLineTo(3.74951f)
                curveTo(3.24769f, 9f, 2.88743f, 8.51673f, 3.03074f, 8.03581f)
                lineTo(4.91447f, 1.71442f)
                close()
                moveTo(10.2786f, 2f)
                horizontalLineTo(5.87282f)
                lineTo(4.08487f, 8f)
                horizontalLineTo(6.00009f)
                curveTo(6.15748f, 8f, 6.30568f, 8.0741f, 6.4001f, 8.20001f)
                curveTo(6.49453f, 8.32593f, 6.52416f, 8.48895f, 6.48008f, 8.64003f)
                lineTo(5.01297f, 13.6688f)
                curveTo(4.98941f, 13.7496f, 5.00096f, 13.8045f, 5.0195f, 13.8434f)
                curveTo(5.04067f, 13.888f, 5.08121f, 13.9314f, 5.13794f, 13.9608f)
                curveTo(5.19467f, 13.9902f, 5.25354f, 13.9983f, 5.30213f, 13.9899f)
                curveTo(5.34467f, 13.9826f, 5.39618f, 13.9603f, 5.44856f, 13.8945f)
                lineTo(11.7326f, 6f)
                horizontalLineTo(9.50009f)
                curveTo(9.3361f, 6f, 9.18254f, 5.91958f, 9.08913f, 5.7848f)
                curveTo(8.99572f, 5.65001f, 8.97435f, 5.47799f, 9.03193f, 5.32444f)
                lineTo(10.2786f, 2f)
                close()
            }
        }.build()
        
        return _SymbolEvent!!
    }

private var _SymbolEvent: ImageVector? = null

