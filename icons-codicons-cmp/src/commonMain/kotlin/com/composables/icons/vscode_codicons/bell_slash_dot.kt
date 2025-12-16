package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.BellSlashDot: ImageVector
    get() {
        if (_BellSlashDot != null) return _BellSlashDot!!
        
        _BellSlashDot = ImageVector.Builder(
            name = "bell-slash-dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.85398f, 1.14601f)
                curveTo(1.65898f, 0.951006f, 1.34198f, 0.951006f, 1.14698f, 1.14601f)
                curveTo(0.951982f, 1.34101f, 0.951982f, 1.65801f, 1.14698f, 1.85301f)
                lineTo(3.39598f, 4.10201f)
                curveTo(3.14698f, 4.68701f, 2.99998f, 5.32401f, 2.99998f, 5.99901f)
                verticalLineTo(9.90001f)
                lineTo(2.03598f, 12.313f)
                curveTo(1.97398f, 12.467f, 1.99298f, 12.641f, 2.08598f, 12.779f)
                curveTo(2.17898f, 12.916f, 2.33398f, 12.999f, 2.49998f, 12.999f)
                horizontalLineTo(5.99998f)
                curveTo(5.99998f, 14.107f, 6.89198f, 14.999f, 7.99998f, 14.999f)
                curveTo(9.10798f, 14.999f, 9.99998f, 14.107f, 9.99998f, 12.999f)
                horizontalLineTo(12.293f)
                lineTo(14.147f, 14.853f)
                curveTo(14.245f, 14.951f, 14.373f, 14.999f, 14.501f, 14.999f)
                curveTo(14.629f, 14.999f, 14.757f, 14.95f, 14.855f, 14.853f)
                curveTo(15.05f, 14.658f, 15.05f, 14.341f, 14.855f, 14.146f)
                lineTo(1.85398f, 1.14601f)
                close()
                moveTo(7.99998f, 14f)
                curveTo(7.44398f, 14f, 6.99998f, 13.556f, 6.99998f, 13f)
                horizontalLineTo(8.99998f)
                curveTo(8.99998f, 13.556f, 8.55598f, 14f, 7.99998f, 14f)
                close()
                moveTo(3.23798f, 12f)
                lineTo(3.96398f, 10.183f)
                curveTo(3.98798f, 10.124f, 3.99998f, 10.061f, 3.99998f, 9.99701f)
                verticalLineTo(5.99901f)
                curveTo(3.99998f, 5.60701f, 4.05698f, 5.22801f, 4.16298f, 4.86901f)
                lineTo(11.293f, 11.999f)
                horizontalLineTo(3.23798f)
                verticalLineTo(12f)
                close()
                moveTo(13f, 7.85801f)
                verticalLineTo(9.90101f)
                lineTo(13.651f, 11.529f)
                lineTo(12f, 9.87801f)
                verticalLineTo(7.99901f)
                curveTo(12.347f, 7.99901f, 12.678f, 7.94201f, 13f, 7.85801f)
                close()
                moveTo(5.23898f, 3.11801f)
                lineTo(4.53198f, 2.41101f)
                curveTo(5.43198f, 1.54101f, 6.65198f, 1.00001f, 7.99898f, 1.00001f)
                curveTo(8.41098f, 1.00001f, 8.80498f, 1.06401f, 9.18898f, 1.15901f)
                curveTo(8.92398f, 1.42101f, 8.70998f, 1.72701f, 8.52698f, 2.05401f)
                curveTo(8.35298f, 2.03101f, 8.17998f, 2.00101f, 7.99998f, 2.00101f)
                curveTo(6.92798f, 2.00101f, 5.95798f, 2.42901f, 5.23898f, 3.11801f)
                close()
                moveTo(8.99998f, 4.00001f)
                curveTo(8.99998f, 2.34301f, 10.343f, 1.00001f, 12f, 1.00001f)
                curveTo(13.657f, 1.00001f, 15f, 2.34301f, 15f, 4.00001f)
                curveTo(15f, 5.65701f, 13.657f, 7.00001f, 12f, 7.00001f)
                curveTo(10.343f, 7.00001f, 8.99998f, 5.65701f, 8.99998f, 4.00001f)
                close()
            }
        }.build()
        
        return _BellSlashDot!!
    }

private var _BellSlashDot: ImageVector? = null

