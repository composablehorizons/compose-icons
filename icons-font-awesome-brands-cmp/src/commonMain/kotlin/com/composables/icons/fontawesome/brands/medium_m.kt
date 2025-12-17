package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.MediumM: ImageVector
    get() {
        if (_MediumM != null) return _MediumM!!
        
        _MediumM = ImageVector.Builder(
            name = "medium-m",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(71.5f, 142.3f)
                curveToRelative(0.6f, -5.9f, -1.7f, -11.8f, -6.1f, -15.8f)
                lineTo(20.3f, 72.1f)
                verticalLineTo(64f)
                horizontalLineToRelative(140.2f)
                lineToRelative(108.4f, 237.7f)
                lineTo(364.2f, 64f)
                horizontalLineToRelative(133.7f)
                verticalLineToRelative(8.1f)
                lineToRelative(-38.6f, 37f)
                curveToRelative(-3.3f, 2.5f, -5f, 6.7f, -4.3f, 10.8f)
                verticalLineToRelative(272f)
                curveToRelative(-0.7f, 4.1f, 1f, 8.3f, 4.3f, 10.8f)
                lineToRelative(37.7f, 37f)
                verticalLineToRelative(8.1f)
                horizontalLineTo(307.3f)
                verticalLineToRelative(-8.1f)
                lineToRelative(39.1f, -37.9f)
                curveToRelative(3.8f, -3.8f, 3.8f, -5f, 3.8f, -10.8f)
                verticalLineTo(171.2f)
                lineTo(241.5f, 447.1f)
                horizontalLineToRelative(-14.7f)
                lineTo(100.4f, 171.2f)
                verticalLineToRelative(184.9f)
                curveToRelative(-1.1f, 7.8f, 1.5f, 15.6f, 7f, 21.2f)
                lineToRelative(50.8f, 61.6f)
                verticalLineToRelative(8.1f)
                horizontalLineToRelative(-144f)
                verticalLineToRelative(-8f)
                lineTo(65f, 377.3f)
                curveToRelative(5.4f, -5.6f, 7.9f, -13.5f, 6.5f, -21.2f)
                verticalLineTo(142.3f)
                close()
            }
        }.build()
        
        return _MediumM!!
    }

private var _MediumM: ImageVector? = null

