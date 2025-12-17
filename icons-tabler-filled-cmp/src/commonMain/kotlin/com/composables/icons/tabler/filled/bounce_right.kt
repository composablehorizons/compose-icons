package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.BounceRight: ImageVector
    get() {
        if (_BounceRight != null) return _BounceRight!!
        
        _BounceRight = ImageVector.Builder(
            name = "bounce-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.143f, 11.486f)
                arcToRelative(1f, 1f, 0f, false, true, 1.714f, 1.028f)
                curveToRelative(-1.502f, 2.505f, -2.41f, 4.89f, -2.87f, 7.65f)
                curveToRelative(-0.16f, 0.956f, -1.448f, 1.15f, -1.881f, 0.283f)
                curveToRelative(-2.06f, -4.12f, -3.858f, -4.976f, -6.79f, -3.998f)
                arcToRelative(1f, 1f, 0f, true, true, -0.632f, -1.898f)
                curveToRelative(3.2f, -1.067f, 5.656f, -0.373f, 7.803f, 2.623f)
                lineToRelative(0.091f, 0.13f)
                lineToRelative(0.011f, -0.04f)
                curveToRelative(0.522f, -1.828f, 1.267f, -3.55f, 2.273f, -5.3f)
                lineToRelative(0.28f, -0.478f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 4f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                close()
            }
        }.build()
        
        return _BounceRight!!
    }

private var _BounceRight: ImageVector? = null

