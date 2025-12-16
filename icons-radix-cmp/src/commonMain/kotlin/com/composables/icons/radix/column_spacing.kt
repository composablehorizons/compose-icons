package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ColumnSpacing: ImageVector
    get() {
        if (_ColumnSpacing != null) return _ColumnSpacing!!
        
        _ColumnSpacing = ImageVector.Builder(
            name = "column-spacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50009f, 1f)
                curveTo(7.77623f, 1f, 8.00009f, 1.22386f, 8.00009f, 1.5f)
                verticalLineTo(13.5f)
                curveTo(8.00009f, 13.7761f, 7.77623f, 14f, 7.50009f, 14f)
                curveTo(7.22395f, 14f, 7.00009f, 13.7761f, 7.00009f, 13.5f)
                verticalLineTo(1.5f)
                curveTo(7.00009f, 1.22386f, 7.22395f, 1f, 7.50009f, 1f)
                close()
                moveTo(11.6817f, 5.18164f)
                curveTo(11.8356f, 5.0278f, 12.0734f, 5.00851f, 12.2481f, 5.12402f)
                lineTo(12.3184f, 5.18164f)
                lineTo(14.3184f, 7.18164f)
                lineTo(14.3761f, 7.25195f)
                curveTo(14.4914f, 7.42662f, 14.4722f, 7.66458f, 14.3184f, 7.81836f)
                lineTo(12.3184f, 9.81836f)
                curveTo(12.1428f, 9.99403f, 11.8575f, 9.9939f, 11.6817f, 9.81836f)
                curveTo(11.506f, 9.64262f, 11.506f, 9.35738f, 11.6817f, 9.18164f)
                lineTo(12.9132f, 7.9502f)
                horizontalLineTo(9.50009f)
                curveTo(9.25174f, 7.95006f, 9.05f, 7.74836f, 9.04989f, 7.5f)
                curveTo(9.04989f, 7.25155f, 9.25167f, 7.04994f, 9.50009f, 7.0498f)
                horizontalLineTo(12.9132f)
                lineTo(11.6817f, 5.81836f)
                lineTo(11.6241f, 5.74805f)
                curveTo(11.5086f, 5.57335f, 11.5279f, 5.33548f, 11.6817f, 5.18164f)
                close()
                moveTo(2.75204f, 5.12402f)
                curveTo(2.92673f, 5.00854f, 3.16462f, 5.02781f, 3.31845f, 5.18164f)
                curveTo(3.47211f, 5.33549f, 3.49153f, 5.57343f, 3.37606f, 5.74805f)
                lineTo(3.31845f, 5.81836f)
                lineTo(2.087f, 7.0498f)
                horizontalLineTo(5.50009f)
                lineTo(5.59091f, 7.05957f)
                curveTo(5.79587f, 7.10161f, 5.95028f, 7.28261f, 5.95028f, 7.5f)
                curveTo(5.95019f, 7.71733f, 5.79584f, 7.89843f, 5.59091f, 7.94043f)
                lineTo(5.50009f, 7.9502f)
                horizontalLineTo(2.087f)
                lineTo(3.31845f, 9.18164f)
                lineTo(3.37606f, 9.25195f)
                curveTo(3.49141f, 9.42662f, 3.47222f, 9.66458f, 3.31845f, 9.81836f)
                curveTo(3.16467f, 9.97214f, 2.92671f, 9.99132f, 2.75204f, 9.87598f)
                lineTo(2.68173f, 9.81836f)
                lineTo(0.681729f, 7.81836f)
                curveTo(0.505993f, 7.64262f, 0.505993f, 7.35738f, 0.681729f, 7.18164f)
                lineTo(2.68173f, 5.18164f)
                lineTo(2.75204f, 5.12402f)
                close()
            }
        }.build()
        
        return _ColumnSpacing!!
    }

private var _ColumnSpacing: ImageVector? = null

