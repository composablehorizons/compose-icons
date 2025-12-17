package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Satellite: ImageVector
    get() {
        if (_Satellite != null) return _Satellite!!
        
        _Satellite = ImageVector.Builder(
            name = "satellite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(502.60968f, 310.04205f)
                lineToRelative(-96.70393f, 96.71625f)
                arcToRelative(31.88151f, 31.88151f, 0f, false, true, -45.00765f, 0f)
                lineTo(280.572f, 326.34116f)
                lineToRelative(-9.89231f, 9.90759f)
                arcToRelative(190.56343f, 190.56343f, 0f, false, true, -5.40716f, 168.52287f)
                curveToRelative(-4.50077f, 8.50115f, -16.39342f, 9.59505f, -23.20707f, 2.79725f)
                lineTo(134.54715f, 400.0543f)
                lineToRelative(-17.7999f, 17.79929f)
                curveToRelative(0.70324f, 2.60972f, 1.60965f, 5.00067f, 1.60965f, 7.79793f)
                arcToRelative(32.00544f, 32.00544f, 0f, true, true, -32.00544f, -32.00434f)
                curveToRelative(2.79735f, 0f, 5.18838f, 0.90637f, 7.7982f, 1.60959f)
                lineToRelative(17.7999f, -17.79929f)
                lineTo(4.43129f, 269.94287f)
                curveToRelative(-6.798f, -6.81342f, -5.70409f, -18.6119f, 2.79735f, -23.20627f)
                arcToRelative(190.5816f, 190.5816f, 0f, false, true, 168.52864f, -5.407f)
                lineToRelative(9.79854f, -9.79821f)
                lineToRelative(-80.31053f, -80.41716f)
                arcToRelative(32.002f, 32.002f, 0f, false, true, 0f, -45.09987f)
                lineTo(201.96474f, 9.29814f)
                arcTo(31.62639f, 31.62639f, 0f, false, true, 224.46867f, 0f)
                arcToRelative(31.99951f, 31.99951f, 0f, false, true, 22.59759f, 9.29814f)
                lineToRelative(80.32615f, 80.30777f)
                lineToRelative(47.805f, -47.89713f)
                arcToRelative(33.6075f, 33.6075f, 0f, false, true, 47.50808f, 0f)
                lineToRelative(47.50807f, 47.50645f)
                arcToRelative(33.63308f, 33.63308f, 0f, false, true, 0f, 47.50644f)
                lineToRelative(-47.805f, 47.89713f)
                lineTo(502.7191f, 265.036f)
                arcTo(31.78938f, 31.78938f, 0f, false, true, 502.60968f, 310.04205f)
                close()
                moveTo(219.56158f, 197.433f)
                lineToRelative(73.82505f, -73.82252f)
                lineToRelative(-68.918f, -68.9f)
                lineToRelative(-73.80942f, 73.80689f)
                close()
                moveToRelative(237.74352f, 90.106f)
                lineToRelative(-68.90233f, -68.9156f)
                lineToRelative(-73.825f, 73.82252f)
                lineToRelative(68.918f, 68.9f)
                close()
            }
        }.build()
        
        return _Satellite!!
    }

private var _Satellite: ImageVector? = null

