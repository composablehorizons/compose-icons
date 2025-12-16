package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PlusCircled: ImageVector
    get() {
        if (_PlusCircled != null) return _PlusCircled!!
        
        _PlusCircled = ImageVector.Builder(
            name = "plus-circled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49915f, 0.876907f)
                curveTo(11.1566f, 0.876907f, 14.1218f, 3.84164f, 14.1222f, 7.49898f)
                curveTo(14.1222f, 11.1566f, 11.1568f, 14.122f, 7.49915f, 14.122f)
                curveTo(3.84181f, 14.1216f, 0.877075f, 11.1564f, 0.877075f, 7.49898f)
                curveTo(0.877487f, 3.8419f, 3.84206f, 0.877318f, 7.49915f, 0.876907f)
                close()
                moveTo(7.49915f, 1.82613f)
                curveTo(4.36673f, 1.82654f, 1.82671f, 4.36657f, 1.82629f, 7.49898f)
                curveTo(1.82629f, 10.6317f, 4.36648f, 13.1714f, 7.49915f, 13.1718f)
                curveTo(10.6321f, 13.1718f, 13.172f, 10.632f, 13.172f, 7.49898f)
                curveTo(13.1716f, 4.36631f, 10.6319f, 1.82613f, 7.49915f, 1.82613f)
                close()
                moveTo(7.50012f, 3.99995f)
                curveTo(7.7762f, 4f, 8.00009f, 4.22387f, 8.00012f, 4.49995f)
                verticalLineTo(6.99995f)
                horizontalLineTo(10.5001f)
                curveTo(10.7762f, 7f, 11.0001f, 7.22387f, 11.0001f, 7.49995f)
                curveTo(11.0001f, 7.77607f, 10.7762f, 7.9999f, 10.5001f, 7.99995f)
                horizontalLineTo(8.00012f)
                verticalLineTo(10.5f)
                curveTo(8.00012f, 10.7761f, 7.77622f, 10.9999f, 7.50012f, 11f)
                curveTo(7.22398f, 11f, 7.00012f, 10.7761f, 7.00012f, 10.5f)
                verticalLineTo(7.99995f)
                horizontalLineTo(4.50012f)
                curveTo(4.22398f, 7.99995f, 4.00012f, 7.7761f, 4.00012f, 7.49995f)
                curveTo(4.00015f, 7.22384f, 4.224f, 6.99995f, 4.50012f, 6.99995f)
                horizontalLineTo(7.00012f)
                verticalLineTo(4.49995f)
                curveTo(7.00015f, 4.22384f, 7.224f, 3.99995f, 7.50012f, 3.99995f)
                close()
            }
        }.build()
        
        return _PlusCircled!!
    }

private var _PlusCircled: ImageVector? = null

