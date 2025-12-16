package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.KeyboardTabAbove: ImageVector
    get() {
        if (_KeyboardTabAbove != null) return _KeyboardTabAbove!!
        
        _KeyboardTabAbove = ImageVector.Builder(
            name = "keyboard-tab-above",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.501f, 3f)
                curveTo(1.777f, 3f, 2.001f, 3.224f, 2.001f, 3.5f)
                verticalLineTo(6.5f)
                curveTo(2.001f, 7.327f, 2.674f, 8f, 3.501f, 8f)
                horizontalLineTo(11.294f)
                lineTo(8.648f, 5.354f)
                curveTo(8.453f, 5.159f, 8.453f, 4.842f, 8.648f, 4.647f)
                curveTo(8.843f, 4.452f, 9.16f, 4.452f, 9.355f, 4.647f)
                lineTo(12.855f, 8.147f)
                curveTo(13.05f, 8.342f, 13.05f, 8.659f, 12.855f, 8.854f)
                lineTo(9.355f, 12.354f)
                curveTo(9.257f, 12.452f, 9.129f, 12.5f, 9.001f, 12.5f)
                curveTo(8.873f, 12.5f, 8.745f, 12.451f, 8.647f, 12.354f)
                curveTo(8.452f, 12.159f, 8.452f, 11.842f, 8.647f, 11.647f)
                lineTo(11.293f, 9.001f)
                horizontalLineTo(3.5f)
                curveTo(2.121f, 9.001f, 1f, 7.88f, 1f, 6.501f)
                verticalLineTo(3.501f)
                curveTo(1f, 3.225f, 1.224f, 3.001f, 1.5f, 3.001f)
                lineTo(1.501f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.00093f)
                verticalLineTo(13.0009f)
                lineTo(14.008f, 13.0909f)
                curveTo(14.0303f, 13.2139f, 14.0977f, 13.324f, 14.1972f, 13.3997f)
                curveTo(14.2966f, 13.4754f, 14.4207f, 13.5111f, 14.5452f, 13.4998f)
                curveTo(14.6696f, 13.4885f, 14.7853f, 13.431f, 14.8695f, 13.3387f)
                curveTo(14.9537f, 13.2464f, 15.0002f, 13.1259f, 15f, 13.0009f)
                verticalLineTo(4.00093f)
                lineTo(14.992f, 3.91093f)
                curveTo(14.9697f, 3.78798f, 14.9023f, 3.67782f, 14.8028f, 3.60215f)
                curveTo(14.7034f, 3.52647f, 14.5793f, 3.49076f, 14.4548f, 3.50205f)
                curveTo(14.3304f, 3.51334f, 14.2147f, 3.57081f, 14.1305f, 3.66314f)
                curveTo(14.0463f, 3.75548f, 13.9998f, 3.87598f, 14f, 4.00093f)
                close()
            }
        }.build()
        
        return _KeyboardTabAbove!!
    }

private var _KeyboardTabAbove: ImageVector? = null

