package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Mixer: ImageVector
    get() {
        if (_Mixer != null) return _Mixer!!
        
        _Mixer = ImageVector.Builder(
            name = "mixer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(114.57f, 76.07f)
                arcToRelative(45.71f, 45.71f, 0f, false, false, -67.51f, -6.41f)
                curveToRelative(-17.58f, 16.18f, -19f, 43.52f, -4.75f, 62.77f)
                lineToRelative(91.78f, 123f)
                lineTo(41.76f, 379.58f)
                curveToRelative(-14.23f, 19.25f, -13.11f, 46.59f, 4.74f, 62.77f)
                arcTo(45.71f, 45.71f, 0f, false, false, 114f, 435.94f)
                lineTo(242.89f, 262.7f)
                arcToRelative(12.14f, 12.14f, 0f, false, false, 0f, -14.23f)
                close()
                moveTo(470.24f, 379.58f)
                lineTo(377.91f, 255.45f)
                lineToRelative(91.78f, -123f)
                curveToRelative(14.22f, -19.25f, 12.83f, -46.59f, -4.75f, -62.77f)
                arcToRelative(45.71f, 45.71f, 0f, false, false, -67.51f, 6.41f)
                lineToRelative(-128f, 172.12f)
                arcToRelative(12.14f, 12.14f, 0f, false, false, 0f, 14.23f)
                lineTo(398f, 435.94f)
                arcToRelative(45.71f, 45.71f, 0f, false, false, 67.51f, 6.41f)
                curveTo(483.35f, 426.17f, 484.47f, 398.83f, 470.24f, 379.58f)
                close()
            }
        }.build()
        
        return _Mixer!!
    }

private var _Mixer: ImageVector? = null

