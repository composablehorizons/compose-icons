package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolColor: ImageVector
    get() {
        if (_SymbolColor != null) return _SymbolColor!!
        
        _SymbolColor = ImageVector.Builder(
            name = "symbol-color",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.00101f, 1f)
                curveTo(4.13401f, 1f, 1.00101f, 3.8f, 1.00101f, 7.667f)
                curveTo(1.00101f, 8.956f, 2.04501f, 10f, 3.33401f, 10f)
                curveTo(4.75101f, 10f, 4.72101f, 9f, 6.00001f, 9f)
                curveTo(6.64401f, 9f, 7.00001f, 9.606f, 7.00001f, 10.25f)
                verticalLineTo(11.5f)
                curveTo(7.00001f, 13.433f, 8.56701f, 15f, 10.5f, 15f)
                curveTo(13.653f, 15f, 14.999f, 11.215f, 14.999f, 8f)
                curveTo(14.999f, 4.134f, 11.866f, 1f, 8.00001f, 1f)
                horizontalLineTo(8.00101f)
                close()
                moveTo(10.5f, 14f)
                curveTo(9.12201f, 14f, 8.00001f, 12.878f, 8.00001f, 11.5f)
                verticalLineTo(10.25f)
                curveTo(8.00001f, 8.967f, 7.14001f, 8f, 6.00001f, 8f)
                curveTo(5.04001f, 8f, 4.49801f, 8.412f, 4.13901f, 8.685f)
                curveTo(3.85401f, 8.902f, 3.72401f, 9f, 3.33401f, 9f)
                curveTo(2.59901f, 9f, 2.00101f, 8.402f, 2.00101f, 7.667f)
                curveTo(2.00101f, 4.436f, 4.58001f, 2f, 8.00101f, 2f)
                curveTo(11.309f, 2f, 14f, 4.692f, 14f, 8f)
                curveTo(14f, 10.412f, 13.068f, 14f, 10.501f, 14f)
                horizontalLineTo(10.5f)
                close()
                moveTo(12f, 11f)
                curveTo(12f, 11.552f, 11.552f, 12f, 11f, 12f)
                curveTo(10.448f, 12f, 10f, 11.552f, 10f, 11f)
                curveTo(10f, 10.448f, 10.448f, 10f, 11f, 10f)
                curveTo(11.552f, 10f, 12f, 10.448f, 12f, 11f)
                close()
                moveTo(13f, 8f)
                curveTo(13f, 8.552f, 12.552f, 9f, 12f, 9f)
                curveTo(11.448f, 9f, 11f, 8.552f, 11f, 8f)
                curveTo(11f, 7.448f, 11.448f, 7f, 12f, 7f)
                curveTo(12.552f, 7f, 13f, 7.448f, 13f, 8f)
                close()
                moveTo(6.00001f, 5f)
                curveTo(6.00001f, 5.552f, 5.55201f, 6f, 5.00001f, 6f)
                curveTo(4.44801f, 6f, 4.00001f, 5.552f, 4.00001f, 5f)
                curveTo(4.00001f, 4.448f, 4.44801f, 4f, 5.00001f, 4f)
                curveTo(5.55201f, 4f, 6.00001f, 4.448f, 6.00001f, 5f)
                close()
                moveTo(10f, 5f)
                curveTo(10f, 4.448f, 10.448f, 4f, 11f, 4f)
                curveTo(11.552f, 4f, 12f, 4.448f, 12f, 5f)
                curveTo(12f, 5.552f, 11.552f, 6f, 11f, 6f)
                curveTo(10.448f, 6f, 10f, 5.552f, 10f, 5f)
                close()
                moveTo(9.00001f, 4f)
                curveTo(9.00001f, 4.552f, 8.55201f, 5f, 8.00001f, 5f)
                curveTo(7.44801f, 5f, 7.00001f, 4.552f, 7.00001f, 4f)
                curveTo(7.00001f, 3.448f, 7.44801f, 3f, 8.00001f, 3f)
                curveTo(8.55201f, 3f, 9.00001f, 3.448f, 9.00001f, 4f)
                close()
            }
        }.build()
        
        return _SymbolColor!!
    }

private var _SymbolColor: ImageVector? = null

