package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.KeyboardTabBelow: ImageVector
    get() {
        if (_KeyboardTabBelow != null) return _KeyboardTabBelow!!
        
        _KeyboardTabBelow = ImageVector.Builder(
            name = "keyboard-tab-below",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.501f, 13f)
                curveTo(1.777f, 13f, 2.001f, 12.776f, 2.001f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(2.001f, 8.673f, 2.674f, 8f, 3.501f, 8f)
                horizontalLineTo(11.294f)
                lineTo(8.648f, 10.646f)
                curveTo(8.453f, 10.841f, 8.453f, 11.158f, 8.648f, 11.353f)
                curveTo(8.843f, 11.548f, 9.16f, 11.548f, 9.355f, 11.353f)
                lineTo(12.855f, 7.853f)
                curveTo(13.05f, 7.658f, 13.05f, 7.341f, 12.855f, 7.146f)
                lineTo(9.355f, 3.646f)
                curveTo(9.257f, 3.548f, 9.129f, 3.5f, 9.001f, 3.5f)
                curveTo(8.873f, 3.5f, 8.745f, 3.549f, 8.647f, 3.646f)
                curveTo(8.452f, 3.841f, 8.452f, 4.158f, 8.647f, 4.353f)
                lineTo(11.293f, 6.999f)
                horizontalLineTo(3.5f)
                curveTo(2.121f, 6.999f, 1f, 8.12f, 1f, 9.499f)
                verticalLineTo(12.499f)
                curveTo(1f, 12.775f, 1.224f, 12.999f, 1.5f, 12.999f)
                lineTo(1.501f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.00093f)
                verticalLineTo(12.0009f)
                lineTo(14.008f, 12.0909f)
                curveTo(14.0303f, 12.2139f, 14.0977f, 12.324f, 14.1972f, 12.3997f)
                curveTo(14.2966f, 12.4754f, 14.4207f, 12.5111f, 14.5452f, 12.4998f)
                curveTo(14.6696f, 12.4885f, 14.7853f, 12.431f, 14.8695f, 12.3387f)
                curveTo(14.9537f, 12.2464f, 15.0002f, 12.1259f, 15f, 12.0009f)
                verticalLineTo(3.00093f)
                lineTo(14.992f, 2.91093f)
                curveTo(14.9697f, 2.78798f, 14.9023f, 2.67782f, 14.8028f, 2.60215f)
                curveTo(14.7034f, 2.52647f, 14.5793f, 2.49076f, 14.4548f, 2.50205f)
                curveTo(14.3304f, 2.51334f, 14.2147f, 2.57081f, 14.1305f, 2.66314f)
                curveTo(14.0463f, 2.75548f, 13.9998f, 2.87598f, 14f, 3.00093f)
                close()
            }
        }.build()
        
        return _KeyboardTabBelow!!
    }

private var _KeyboardTabBelow: ImageVector? = null

