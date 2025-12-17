package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolVariable: ImageVector
    get() {
        if (_SymbolVariable != null) return _SymbolVariable!!
        
        _SymbolVariable = ImageVector.Builder(
            name = "symbol-variable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.279f, 5.78975f)
                lineTo(8.799f, 5.06575f)
                curveTo(8.59f, 5.00575f, 8.372f, 5.01475f, 8.168f, 5.08975f)
                lineTo(4.648f, 6.40975f)
                curveTo(4.26f, 6.55575f, 4f, 6.93175f, 4f, 7.34675f)
                verticalLineTo(9.13975f)
                curveTo(4f, 9.57075f, 4.274f, 9.95175f, 4.684f, 10.0877f)
                lineTo(7.165f, 10.9147f)
                curveTo(7.268f, 10.9497f, 7.376f, 10.9667f, 7.483f, 10.9667f)
                curveTo(7.611f, 10.9667f, 7.739f, 10.9427f, 7.859f, 10.8937f)
                lineTo(11.376f, 9.46475f)
                curveTo(11.755f, 9.31175f, 12f, 8.94775f, 12f, 8.53875f)
                verticalLineTo(6.74975f)
                curveTo(12f, 6.30775f, 11.703f, 5.91275f, 11.279f, 5.78975f)
                close()
                moveTo(11f, 8.53875f)
                lineTo(7.483f, 9.96775f)
                lineTo(5f, 9.13975f)
                verticalLineTo(7.34675f)
                lineTo(8.521f, 6.02675f)
                lineTo(11f, 6.75075f)
                verticalLineTo(8.53975f)
                verticalLineTo(8.53875f)
                close()
                moveTo(7.48f, 7.46675f)
                lineTo(8.807f, 6.91375f)
                curveTo(9.06f, 6.80875f, 9.355f, 6.92775f, 9.461f, 7.18275f)
                curveTo(9.566f, 7.43775f, 9.446f, 7.73075f, 9.191f, 7.83675f)
                lineTo(7.999f, 8.33375f)
                verticalLineTo(8.62575f)
                curveTo(7.999f, 8.90175f, 7.775f, 9.12575f, 7.499f, 9.12575f)
                curveTo(7.223f, 9.12575f, 6.999f, 8.90175f, 6.999f, 8.62575f)
                verticalLineTo(8.36075f)
                lineTo(6.591f, 8.22475f)
                curveTo(6.329f, 8.13775f, 6.188f, 7.85475f, 6.275f, 7.59275f)
                curveTo(6.364f, 7.33075f, 6.647f, 7.19175f, 6.908f, 7.27675f)
                lineTo(7.48f, 7.46675f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 14f, 11f, 13.776f, 11f, 13.5f)
                curveTo(11f, 13.224f, 11.224f, 13f, 11.5f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 13f, 13f, 12.775f, 13f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 3.225f, 12.776f, 3f, 12.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 3f, 11f, 2.776f, 11f, 2.5f)
                curveTo(11f, 2.224f, 11.224f, 2f, 11.5f, 2f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                close()
                moveTo(5f, 13.5f)
                curveTo(5f, 13.224f, 4.776f, 13f, 4.5f, 13f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 13f, 3f, 12.775f, 3f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(3f, 3.225f, 3.224f, 3f, 3.5f, 3f)
                horizontalLineTo(4.5f)
                curveTo(4.776f, 3f, 5f, 2.776f, 5f, 2.5f)
                curveTo(5f, 2.224f, 4.776f, 2f, 4.5f, 2f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 2f, 2f, 2.673f, 2f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.327f, 2.673f, 14f, 3.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(4.776f, 14f, 5f, 13.776f, 5f, 13.5f)
                close()
            }
        }.build()
        
        return _SymbolVariable!!
    }

private var _SymbolVariable: ImageVector? = null

