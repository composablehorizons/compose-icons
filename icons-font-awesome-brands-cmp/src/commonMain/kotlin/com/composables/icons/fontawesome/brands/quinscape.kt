package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Quinscape: ImageVector
    get() {
        if (_Quinscape != null) return _Quinscape!!
        
        _Quinscape = ImageVector.Builder(
            name = "quinscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313.6f, 474.6f)
                horizontalLineToRelative(-1f)
                arcToRelative(158.1f, 158.1f, 0f, false, true, 0f, -316.2f)
                curveToRelative(94.9f, 0f, 168.2f, 83.1f, 157f, 176.6f)
                curveToRelative(4f, 5.1f, 8.2f, 9.6f, 11.2f, 15.3f)
                curveToRelative(13.4f, -30.3f, 20.3f, -62.4f, 20.3f, -97.7f)
                curveTo(501.1f, 117.5f, 391.6f, 8f, 256.5f, 8f)
                reflectiveCurveTo(12f, 117.5f, 12f, 252.6f)
                reflectiveCurveToRelative(109.5f, 244.6f, 244.5f, 244.6f)
                arcToRelative(237.36f, 237.36f, 0f, false, false, 70.4f, -10.1f)
                curveToRelative(-5.2f, -3.5f, -8.9f, -8.1f, -13.3f, -12.5f)
                close()
                moveToRelative(-0.1f, -0.1f)
                lineToRelative(0.4f, 0.1f)
                close()
                moveToRelative(78.4f, -168.9f)
                arcToRelative(99.2f, 99.2f, 0f, true, false, 99.2f, 99.2f)
                arcToRelative(99.18f, 99.18f, 0f, false, false, -99.2f, -99.2f)
                close()
            }
        }.build()
        
        return _Quinscape!!
    }

private var _Quinscape: ImageVector? = null

