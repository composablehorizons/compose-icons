package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolMisc: ImageVector
    get() {
        if (_SymbolMisc != null) return _SymbolMisc!!
        
        _SymbolMisc = ImageVector.Builder(
            name = "symbol-misc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.9999f, 3f)
                curveTo(10.1399f, 3f, 8.56988f, 4.27f, 8.12988f, 6f)
                horizontalLineTo(9.17988f)
                curveTo(9.58988f, 4.84f, 10.6999f, 4f, 11.9999f, 4f)
                curveTo(13.6499f, 4f, 14.9999f, 5.35f, 14.9999f, 7f)
                curveTo(14.9999f, 8.3f, 14.1599f, 9.41f, 12.9999f, 9.82f)
                verticalLineTo(10.87f)
                curveTo(14.7299f, 10.43f, 15.9999f, 8.86f, 15.9999f, 7f)
                curveTo(15.9999f, 4.79f, 14.2099f, 3f, 11.9999f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 15f)
                horizontalLineTo(5.5f)
                curveTo(4.673f, 15f, 4f, 14.327f, 4f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.673f, 4.673f, 7f, 5.5f, 7f)
                horizontalLineTo(10.5f)
                curveTo(11.327f, 7f, 12f, 7.673f, 12f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(12f, 14.327f, 11.327f, 15f, 10.5f, 15f)
                close()
                moveTo(5.5f, 8f)
                curveTo(5.224f, 8f, 5f, 8.225f, 5f, 8.5f)
                verticalLineTo(13.5f)
                curveTo(5f, 13.775f, 5.224f, 14f, 5.5f, 14f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 14f, 11f, 13.775f, 11f, 13.5f)
                verticalLineTo(8.5f)
                curveTo(11f, 8.225f, 10.776f, 8f, 10.5f, 8f)
                horizontalLineTo(5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.42973f, 2.25008f)
                curveTo(4.24973f, 1.94008f, 3.74973f, 1.94008f, 3.56973f, 2.25008f)
                lineTo(0.0997266f, 8.25008f)
                curveTo(0.00972656f, 8.40008f, 0.00972656f, 8.60008f, 0.0997266f, 8.75008f)
                curveTo(0.189727f, 8.90008f, 0.359727f, 9.00008f, 0.539727f, 9.00008f)
                horizontalLineTo(2.99973f)
                verticalLineTo(8.50008f)
                curveTo(2.99973f, 8.33008f, 3.01973f, 8.16008f, 3.04973f, 8.00008f)
                horizontalLineTo(1.39973f)
                lineTo(3.99973f, 3.50008f)
                lineTo(5.44973f, 6.00008f)
                horizontalLineTo(6.59973f)
                lineTo(4.42973f, 2.25008f)
                close()
            }
        }.build()
        
        return _SymbolMisc!!
    }

private var _SymbolMisc: ImageVector? = null

