package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Checkbox: ImageVector
    get() {
        if (_Checkbox != null) return _Checkbox!!
        
        _Checkbox = ImageVector.Builder(
            name = "checkbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.1025f, 2.00488f)
                curveTo(12.6067f, 2.05621f, 13f, 2.48232f, 13f, 3f)
                verticalLineTo(12f)
                lineTo(12.9951f, 12.1025f)
                curveTo(12.9472f, 12.573f, 12.573f, 12.9472f, 12.1025f, 12.9951f)
                lineTo(12f, 13f)
                horizontalLineTo(3f)
                lineTo(2.89746f, 12.9951f)
                curveTo(2.42703f, 12.9472f, 2.05278f, 12.573f, 2.00488f, 12.1025f)
                lineTo(2f, 12f)
                verticalLineTo(3f)
                curveTo(2f, 2.48232f, 2.39333f, 2.05621f, 2.89746f, 2.00488f)
                lineTo(3f, 2f)
                horizontalLineTo(12f)
                lineTo(12.1025f, 2.00488f)
                close()
                moveTo(3f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                close()
                moveTo(9.52539f, 4.94531f)
                curveTo(9.6817f, 4.71784f, 9.99311f, 4.66021f, 10.2207f, 4.81641f)
                curveTo(10.448f, 4.97276f, 10.5058f, 5.28418f, 10.3496f, 5.51172f)
                lineTo(7.09082f, 10.2607f)
                curveTo(7.00213f, 10.3898f, 6.8576f, 10.4704f, 6.70117f, 10.4775f)
                curveTo(6.54468f, 10.4847f, 6.39306f, 10.4174f, 6.29297f, 10.2969f)
                lineTo(4.42773f, 8.04785f)
                lineTo(4.37109f, 7.96387f)
                curveTo(4.2615f, 7.75883f, 4.30741f, 7.49807f, 4.49316f, 7.34375f)
                curveTo(4.67904f, 7.18956f, 4.94366f, 7.19251f, 5.125f, 7.33789f)
                lineTo(5.19727f, 7.40918f)
                lineTo(6.63965f, 9.14746f)
                lineTo(9.52539f, 4.94531f)
                close()
            }
        }.build()
        
        return _Checkbox!!
    }

private var _Checkbox: ImageVector? = null

