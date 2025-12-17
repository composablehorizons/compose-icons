package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ship: ImageVector
    get() {
        if (_Ship != null) return _Ship!!
        
        _Ship = ImageVector.Builder(
            name = "ship",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496.616f, 372.639f)
                lineToRelative(70.012f, -70.012f)
                curveToRelative(16.899f, -16.9f, 9.942f, -45.771f, -12.836f, -53.092f)
                lineTo(512f, 236.102f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.673f, -14.327f, -32f, -32f, -32f)
                horizontalLineToRelative(-64f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(248f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                verticalLineToRelative(140.102f)
                lineToRelative(-41.792f, 13.433f)
                curveToRelative(-22.753f, 7.313f, -29.754f, 36.173f, -12.836f, 53.092f)
                lineToRelative(70.012f, 70.012f)
                curveTo(125.828f, 416.287f, 85.587f, 448f, 24f, 448f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                curveToRelative(61.023f, 0f, 107.499f, -20.61f, 143.258f, -59.396f)
                curveTo(181.677f, 487.432f, 216.021f, 512f, 256f, 512f)
                horizontalLineToRelative(128f)
                curveToRelative(39.979f, 0f, 74.323f, -24.568f, 88.742f, -59.396f)
                curveTo(508.495f, 491.384f, 554.968f, 512f, 616f, 512f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                curveToRelative(-60.817f, 0f, -101.542f, -31.001f, -119.384f, -75.361f)
                close()
                moveTo(192f, 128f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(87.531f)
                lineToRelative(-118.208f, -37.995f)
                arcToRelative(31.995f, 31.995f, 0f, false, false, -19.584f, 0f)
                lineTo(192f, 215.531f)
                verticalLineTo(128f)
                close()
            }
        }.build()
        
        return _Ship!!
    }

private var _Ship: ImageVector? = null

