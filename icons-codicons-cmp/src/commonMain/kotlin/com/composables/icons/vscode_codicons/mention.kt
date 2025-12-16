package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Mention: ImageVector
    get() {
        if (_Mention != null) return _Mention!!
        
        _Mention = ImageVector.Builder(
            name = "mention",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2f)
                curveTo(11.3137f, 2f, 14f, 4.68629f, 14f, 8f)
                curveTo(14f, 9.67717f, 12.8661f, 11f, 11.5f, 11f)
                curveTo(10.748f, 11f, 10.2155f, 10.6446f, 9.88999f, 10.0146f)
                curveTo(9.45625f, 10.6143f, 8.80559f, 11f, 8f, 11f)
                curveTo(6.47091f, 11f, 5.5f, 9.61043f, 5.5f, 8f)
                curveTo(5.5f, 6.38957f, 6.47091f, 5f, 8f, 5f)
                curveTo(8.59194f, 5f, 9.10023f, 5.20824f, 9.50092f, 5.55692f)
                lineTo(9.5f, 5.5f)
                curveTo(9.5f, 5.22386f, 9.72386f, 5f, 10f, 5f)
                curveTo(10.2455f, 5f, 10.4496f, 5.17688f, 10.4919f, 5.41012f)
                lineTo(10.5f, 5.5f)
                verticalLineTo(8f)
                curveTo(10.5f, 9.36284f, 10.8534f, 10f, 11.5f, 10f)
                curveTo(12.2767f, 10f, 13f, 9.15616f, 13f, 8f)
                curveTo(13f, 5.23858f, 10.7614f, 3f, 8f, 3f)
                curveTo(5.23858f, 3f, 3f, 5.23858f, 3f, 8f)
                curveTo(3f, 10.7614f, 5.23858f, 13f, 8f, 13f)
                curveTo(8.41606f, 13f, 8.82489f, 12.9493f, 9.22017f, 12.8502f)
                lineTo(9.51399f, 12.7668f)
                lineTo(9.71905f, 12.6968f)
                curveTo(9.97835f, 12.6019f, 10.2655f, 12.7351f, 10.3605f, 12.9944f)
                curveTo(10.4554f, 13.2537f, 10.3222f, 13.5409f, 10.0628f, 13.6358f)
                curveTo(9.98137f, 13.6657f, 9.89921f, 13.6937f, 9.81642f, 13.72f)
                curveTo(9.23377f, 13.9049f, 8.623f, 14f, 8f, 14f)
                curveTo(4.68629f, 14f, 2f, 11.3137f, 2f, 8f)
                curveTo(2f, 4.68629f, 4.68629f, 2f, 8f, 2f)
                close()
                moveTo(8f, 6f)
                curveTo(7.11564f, 6f, 6.5f, 6.8811f, 6.5f, 8f)
                curveTo(6.5f, 9.1189f, 7.11564f, 10f, 8f, 10f)
                curveTo(8.88436f, 10f, 9.5f, 9.1189f, 9.5f, 8f)
                curveTo(9.5f, 6.8811f, 8.88436f, 6f, 8f, 6f)
                close()
            }
        }.build()
        
        return _Mention!!
    }

private var _Mention: ImageVector? = null

