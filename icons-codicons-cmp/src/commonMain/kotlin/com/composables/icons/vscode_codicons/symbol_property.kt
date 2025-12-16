package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolProperty: ImageVector
    get() {
        if (_SymbolProperty != null) return _SymbolProperty!!
        
        _SymbolProperty = ImageVector.Builder(
            name = "symbol-property",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.99989f, 5f)
                curveTo(6.99989f, 2.79086f, 8.79075f, 1f, 10.9999f, 1f)
                curveTo(11.5087f, 1f, 11.9964f, 1.09524f, 12.4454f, 1.26931f)
                curveTo(12.603f, 1.3304f, 12.719f, 1.46698f, 12.7539f, 1.63235f)
                curveTo(12.7888f, 1.79773f, 12.7377f, 1.96953f, 12.6182f, 2.08904f)
                lineTo(10.7072f, 4.00012f)
                lineTo(12.0001f, 5.29302f)
                lineTo(13.911f, 3.38207f)
                curveTo(14.0305f, 3.26254f, 14.2023f, 3.2115f, 14.3677f, 3.24637f)
                curveTo(14.5331f, 3.28125f, 14.6697f, 3.39732f, 14.7307f, 3.55493f)
                curveTo(14.9047f, 4.0038f, 14.9999f, 4.49138f, 14.9999f, 5f)
                curveTo(14.9999f, 7.20914f, 13.209f, 9f, 10.9999f, 9f)
                curveTo(10.6198f, 9f, 10.2514f, 8.94684f, 9.90215f, 8.84736f)
                lineTo(4.89566f, 13.9192f)
                curveTo(4.18171f, 14.6425f, 3.03692f, 14.7101f, 2.24289f, 14.0757f)
                curveTo(1.32876f, 13.3455f, 1.24088f, 11.9872f, 2.05327f, 11.1453f)
                lineTo(7.10411f, 5.91061f)
                curveTo(7.03588f, 5.61771f, 6.99989f, 5.31279f, 6.99989f, 5f)
                close()
                moveTo(10.9999f, 2f)
                curveTo(9.34303f, 2f, 7.99989f, 3.34315f, 7.99989f, 5f)
                curveTo(7.99989f, 5.31548f, 8.04841f, 5.61868f, 8.13805f, 5.90305f)
                curveTo(8.19313f, 6.07781f, 8.14821f, 6.26869f, 8.02099f, 6.40054f)
                lineTo(2.7729f, 11.8396f)
                curveTo(2.3696f, 12.2576f, 2.41323f, 12.9319f, 2.86703f, 13.2944f)
                curveTo(3.26123f, 13.6093f, 3.82955f, 13.5758f, 4.18398f, 13.2167f)
                lineTo(9.40817f, 7.9243f)
                curveTo(9.54702f, 7.78364f, 9.75569f, 7.73797f, 9.9406f, 7.80777f)
                curveTo(10.2693f, 7.93186f, 10.6261f, 8f, 10.9999f, 8f)
                curveTo(12.6567f, 8f, 13.9999f, 6.65685f, 13.9999f, 5f)
                curveTo(13.9999f, 4.9056f, 13.9955f, 4.81228f, 13.987f, 4.72023f)
                lineTo(12.3537f, 6.35368f)
                curveTo(12.2599f, 6.44745f, 12.1327f, 6.50013f, 12.0001f, 6.50013f)
                curveTo(11.8675f, 6.50013f, 11.7403f, 6.44745f, 11.6466f, 6.35368f)
                lineTo(9.64655f, 4.35368f)
                curveTo(9.45129f, 4.15842f, 9.45129f, 3.84185f, 9.64655f, 3.64658f)
                lineTo(11.2802f, 2.01289f)
                curveTo(11.188f, 2.00436f, 11.0945f, 2f, 10.9999f, 2f)
                close()
            }
        }.build()
        
        return _SymbolProperty!!
    }

private var _SymbolProperty: ImageVector? = null

