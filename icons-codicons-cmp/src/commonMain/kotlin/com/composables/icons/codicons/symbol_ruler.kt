package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolRuler: ImageVector
    get() {
        if (_SymbolRuler != null) return _SymbolRuler!!
        
        _SymbolRuler = ImageVector.Builder(
            name = "symbol-ruler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.9999f, 3.4997f)
                curveTo(10.9999f, 2.67127f, 10.3284f, 1.99969f, 9.49994f, 1.99969f)
                horizontalLineTo(6.49994f)
                curveTo(5.67151f, 1.99969f, 4.99994f, 2.67127f, 4.99994f, 3.49969f)
                verticalLineTo(12.5003f)
                curveTo(4.99994f, 13.3287f, 5.67151f, 14.0003f, 6.49994f, 14.0003f)
                horizontalLineTo(9.49994f)
                curveTo(10.3284f, 14.0003f, 10.9999f, 13.3287f, 10.9999f, 12.5003f)
                lineTo(10.9999f, 3.4997f)
                close()
                moveTo(9.49994f, 2.99969f)
                curveTo(9.77608f, 2.9997f, 9.99994f, 3.22355f, 9.99994f, 3.4997f)
                lineTo(9.99994f, 12.5003f)
                curveTo(9.99994f, 12.7764f, 9.77608f, 13.0003f, 9.49994f, 13.0003f)
                horizontalLineTo(6.49994f)
                curveTo(6.2238f, 13.0003f, 5.99994f, 12.7764f, 5.99994f, 12.5003f)
                verticalLineTo(11f)
                horizontalLineTo(7.49997f)
                curveTo(7.77611f, 11f, 7.99997f, 10.7761f, 7.99997f, 10.5f)
                curveTo(7.99997f, 10.2238f, 7.77611f, 9.99997f, 7.49997f, 9.99997f)
                horizontalLineTo(5.99997f)
                lineTo(5.99994f, 8.49997f)
                curveTo(5.99993f, 8.49997f, 5.99995f, 8.49997f, 5.99994f, 8.49997f)
                horizontalLineTo(7.99997f)
                curveTo(8.27611f, 8.49997f, 8.49997f, 8.27611f, 8.49997f, 7.99997f)
                curveTo(8.49997f, 7.72383f, 8.27611f, 7.49997f, 7.99997f, 7.49997f)
                horizontalLineTo(5.99997f)
                curveTo(5.99996f, 7.49997f, 5.99998f, 7.49997f, 5.99997f, 7.49997f)
                lineTo(5.99994f, 5.99997f)
                horizontalLineTo(7.49997f)
                curveTo(7.77611f, 5.99997f, 7.99997f, 5.77611f, 7.99997f, 5.49997f)
                curveTo(7.99997f, 5.22383f, 7.77611f, 4.99997f, 7.49997f, 4.99997f)
                horizontalLineTo(5.99997f)
                lineTo(5.99994f, 3.49969f)
                curveTo(5.99994f, 3.22355f, 6.2238f, 2.99969f, 6.49994f, 2.99969f)
                lineTo(9.49994f, 2.99969f)
                close()
            }
        }.build()
        
        return _SymbolRuler!!
    }

private var _SymbolRuler: ImageVector? = null

