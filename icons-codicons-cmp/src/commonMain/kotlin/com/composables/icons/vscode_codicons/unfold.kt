package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Unfold: ImageVector
    get() {
        if (_Unfold != null) return _Unfold!!
        
        _Unfold = ImageVector.Builder(
            name = "unfold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.854f, 10.146f)
                curveTo(12.049f, 10.341f, 12.049f, 10.658f, 11.854f, 10.853f)
                lineTo(8.35401f, 14.353f)
                curveTo(8.15901f, 14.548f, 7.84201f, 14.548f, 7.64701f, 14.353f)
                lineTo(4.14701f, 10.853f)
                curveTo(3.95201f, 10.658f, 3.95201f, 10.341f, 4.14701f, 10.146f)
                curveTo(4.34201f, 9.95098f, 4.65901f, 9.95098f, 4.85401f, 10.146f)
                lineTo(8.00001f, 13.293f)
                lineTo(11.146f, 10.146f)
                curveTo(11.341f, 9.95098f, 11.658f, 9.95098f, 11.853f, 10.146f)
                horizontalLineTo(11.854f)
                close()
                moveTo(4.85401f, 5.85398f)
                lineTo(8.00001f, 2.70798f)
                lineTo(11.146f, 5.85398f)
                curveTo(11.341f, 6.04898f, 11.658f, 6.04898f, 11.853f, 5.85398f)
                curveTo(12.048f, 5.65898f, 12.048f, 5.34198f, 11.853f, 5.14698f)
                lineTo(8.35301f, 1.64698f)
                curveTo(8.15801f, 1.45198f, 7.84101f, 1.45198f, 7.64601f, 1.64698f)
                lineTo(4.14601f, 5.14698f)
                curveTo(3.95101f, 5.34198f, 3.95101f, 5.65898f, 4.14601f, 5.85398f)
                curveTo(4.34101f, 6.04898f, 4.65901f, 6.04898f, 4.85401f, 5.85398f)
                close()
            }
        }.build()
        
        return _Unfold!!
    }

private var _Unfold: ImageVector? = null

