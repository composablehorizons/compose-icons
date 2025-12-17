package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.PiedPiper: ImageVector
    get() {
        if (_PiedPiper != null) return _PiedPiper!!
        
        _PiedPiper = ImageVector.Builder(
            name = "pied-piper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(455.93f, 23.2f)
                curveTo(429.23f, 30f, 387.79f, 51.69f, 341.35f, 90.66f)
                arcTo(206f, 206f, 0f, false, false, 240f, 64f)
                curveTo(125.13f, 64f, 32f, 157.12f, 32f, 272f)
                reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
                reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
                arcToRelative(207.25f, 207.25f, 0f, false, false, -58.75f, -144.81f)
                arcToRelative(155.35f, 155.35f, 0f, false, false, -17f, 27.4f)
                arcTo(176.16f, 176.16f, 0f, false, true, 417.1f, 272f)
                curveToRelative(0f, 97.66f, -79.44f, 177.11f, -177.09f, 177.11f)
                arcToRelative(175.81f, 175.81f, 0f, false, true, -87.63f, -23.4f)
                curveToRelative(82.94f, -107.33f, 150.79f, -37.77f, 184.31f, -226.65f)
                curveToRelative(5.79f, -32.62f, 28f, -94.26f, 126.23f, -160.18f)
                curveTo(471f, 33.45f, 465.35f, 20.8f, 455.93f, 23.2f)
                close()
                moveTo(125f, 406.4f)
                arcTo(176.66f, 176.66f, 0f, false, true, 62.9f, 272f)
                curveTo(62.9f, 174.34f, 142.35f, 94.9f, 240f, 94.9f)
                arcToRelative(174f, 174f, 0f, false, true, 76.63f, 17.75f)
                curveTo(250.64f, 174.76f, 189.77f, 265.52f, 125f, 406.4f)
                close()
            }
        }.build()
        
        return _PiedPiper!!
    }

private var _PiedPiper: ImageVector? = null

