package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolBoolean: ImageVector
    get() {
        if (_SymbolBoolean != null) return _SymbolBoolean!!
        
        _SymbolBoolean = ImageVector.Builder(
            name = "symbol-boolean",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.646f, 10.646f)
                curveTo(10.548f, 10.744f, 10.5f, 10.872f, 10.5f, 11f)
                curveTo(10.5f, 11.276f, 10.724f, 11.5f, 11f, 11.5f)
                curveTo(11.128f, 11.5f, 11.256f, 11.451f, 11.354f, 11.354f)
                lineTo(13.853f, 8.855f)
                curveTo(13.979f, 8.729f, 14f, 8.578f, 14f, 8.501f)
                curveTo(14f, 8.424f, 13.98f, 8.273f, 13.853f, 8.147f)
                lineTo(11.354f, 5.648f)
                curveTo(11.256f, 5.55f, 11.128f, 5.502f, 11f, 5.502f)
                curveTo(10.724f, 5.502f, 10.5f, 5.726f, 10.5f, 6.002f)
                curveTo(10.5f, 6.13f, 10.549f, 6.258f, 10.646f, 6.356f)
                lineTo(12.292f, 8.002f)
                horizontalLineTo(7.999f)
                verticalLineTo(9.002f)
                horizontalLineTo(12.292f)
                lineTo(10.646f, 10.648f)
                verticalLineTo(10.646f)
                close()
                moveTo(13.5f, 3f)
                horizontalLineTo(2.5f)
                curveTo(1.119f, 3f, 0f, 4.119f, 0f, 5.5f)
                verticalLineTo(11.5f)
                curveTo(0f, 12.881f, 1.119f, 14f, 2.5f, 14f)
                horizontalLineTo(13.5f)
                curveTo(14.881f, 14f, 16f, 12.881f, 16f, 11.5f)
                verticalLineTo(5.5f)
                curveTo(16f, 4.119f, 14.881f, 3f, 13.5f, 3f)
                close()
                moveTo(15f, 11.5f)
                curveTo(15f, 12.328f, 14.328f, 13f, 13.5f, 13f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(3.706f)
                lineTo(5.353f, 10.647f)
                curveTo(5.451f, 10.745f, 5.499f, 10.873f, 5.499f, 11.001f)
                curveTo(5.499f, 11.277f, 5.275f, 11.501f, 4.999f, 11.501f)
                curveTo(4.871f, 11.501f, 4.743f, 11.452f, 4.645f, 11.355f)
                lineTo(2.145f, 8.855f)
                curveTo(2.019f, 8.729f, 1.998f, 8.578f, 1.998f, 8.501f)
                curveTo(1.998f, 8.424f, 2.018f, 8.273f, 2.145f, 8.147f)
                lineTo(4.645f, 5.647f)
                curveTo(4.743f, 5.549f, 4.871f, 5.501f, 4.998f, 5.501f)
                curveTo(5.274f, 5.501f, 5.498f, 5.725f, 5.498f, 6.001f)
                curveTo(5.498f, 6.129f, 5.449f, 6.257f, 5.352f, 6.355f)
                lineTo(3.705f, 8.002f)
                horizontalLineTo(7.999f)
                verticalLineTo(4.002f)
                horizontalLineTo(13.499f)
                curveTo(14.327f, 4.002f, 14.999f, 4.674f, 14.999f, 5.502f)
                verticalLineTo(11.502f)
                lineTo(15f, 11.5f)
                close()
            }
        }.build()
        
        return _SymbolBoolean!!
    }

private var _SymbolBoolean: ImageVector? = null

