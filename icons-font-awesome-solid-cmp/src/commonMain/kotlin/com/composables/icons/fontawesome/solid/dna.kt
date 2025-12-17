package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dna: ImageVector
    get() {
        if (_Dna != null) return _Dna!!
        
        _Dna = ImageVector.Builder(
            name = "dna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.1f, 494.1f)
                curveToRelative(-1.1f, 9.5f, 6.3f, 17.8f, 15.9f, 17.8f)
                lineToRelative(32.3f, 0.1f)
                curveToRelative(8.1f, 0f, 14.9f, -5.9f, 16f, -13.9f)
                curveToRelative(0.7f, -4.9f, 1.8f, -11.1f, 3.4f, -18.1f)
                horizontalLineTo(380f)
                curveToRelative(1.6f, 6.9f, 2.9f, 13.2f, 3.5f, 18.1f)
                curveToRelative(1.1f, 8f, 7.9f, 14f, 16f, 13.9f)
                lineToRelative(32.3f, -0.1f)
                curveToRelative(9.6f, 0f, 17.1f, -8.3f, 15.9f, -17.8f)
                curveToRelative(-4.6f, -37.9f, -25.6f, -129f, -118.9f, -207.7f)
                curveToRelative(-17.6f, 12.4f, -37.1f, 24.2f, -58.5f, 35.4f)
                curveToRelative(6.2f, 4.6f, 11.4f, 9.4f, 17f, 14.2f)
                horizontalLineTo(159.7f)
                curveToRelative(21.3f, -18.1f, 47f, -35.6f, 78.7f, -51.4f)
                curveTo(410.5f, 199.1f, 442.1f, 65.8f, 447.9f, 17.9f)
                curveTo(449f, 8.4f, 441.6f, 0.1f, 432f, 0.1f)
                lineTo(399.6f, 0f)
                curveToRelative(-8.1f, 0f, -14.9f, 5.9f, -16f, 13.9f)
                curveToRelative(-0.7f, 4.9f, -1.8f, 11.1f, -3.4f, 18.1f)
                horizontalLineTo(67.8f)
                curveToRelative(-1.6f, -7f, -2.7f, -13.1f, -3.4f, -18.1f)
                curveToRelative(-1.1f, -8f, -7.9f, -14f, -16f, -13.9f)
                lineTo(16.1f, 0.1f)
                curveTo(6.5f, 0.1f, -1f, 8.4f, 0.1f, 17.9f)
                curveTo(5.3f, 60.8f, 31.4f, 171.8f, 160f, 256f)
                curveTo(31.5f, 340.2f, 5.3f, 451.2f, 0.1f, 494.1f)
                close()
                moveTo(224f, 219.6f)
                curveToRelative(-25.1f, -13.7f, -46.4f, -28.4f, -64.3f, -43.6f)
                horizontalLineToRelative(128.5f)
                curveToRelative(-17.8f, 15.2f, -39.1f, 30f, -64.2f, 43.6f)
                close()
                moveTo(355.1f, 96f)
                curveToRelative(-5.8f, 10.4f, -12.8f, 21.1f, -21f, 32f)
                horizontalLineTo(114f)
                curveToRelative(-8.3f, -10.9f, -15.3f, -21.6f, -21f, -32f)
                horizontalLineToRelative(262.1f)
                close()
                moveTo(92.9f, 416f)
                curveToRelative(5.8f, -10.4f, 12.8f, -21.1f, 21f, -32f)
                horizontalLineToRelative(219.4f)
                curveToRelative(8.3f, 10.9f, 15.4f, 21.6f, 21.2f, 32f)
                horizontalLineTo(92.9f)
                close()
            }
        }.build()
        
        return _Dna!!
    }

private var _Dna: ImageVector? = null

