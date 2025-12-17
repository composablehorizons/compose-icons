package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ring: ImageVector
    get() {
        if (_Ring != null) return _Ring!!
        
        _Ring = ImageVector.Builder(
            name = "ring",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 64f)
                curveTo(110.06f, 64f, 0f, 125.91f, 0f, 208f)
                verticalLineToRelative(98.13f)
                curveTo(0f, 384.48f, 114.62f, 448f, 256f, 448f)
                reflectiveCurveToRelative(256f, -63.52f, 256f, -141.87f)
                verticalLineTo(208f)
                curveToRelative(0f, -82.09f, -110.06f, -144f, -256f, -144f)
                close()
                moveToRelative(0f, 64f)
                curveToRelative(106.04f, 0f, 192f, 35.82f, 192f, 80f)
                curveToRelative(0f, 9.26f, -3.97f, 18.12f, -10.91f, 26.39f)
                curveTo(392.15f, 208.21f, 328.23f, 192f, 256f, 192f)
                reflectiveCurveToRelative(-136.15f, 16.21f, -181.09f, 42.39f)
                curveTo(67.97f, 226.12f, 64f, 217.26f, 64f, 208f)
                curveToRelative(0f, -44.18f, 85.96f, -80f, 192f, -80f)
                close()
                moveTo(120.43f, 264.64f)
                curveTo(155.04f, 249.93f, 201.64f, 240f, 256f, 240f)
                reflectiveCurveToRelative(100.96f, 9.93f, 135.57f, 24.64f)
                curveTo(356.84f, 279.07f, 308.93f, 288f, 256f, 288f)
                reflectiveCurveToRelative(-100.84f, -8.93f, -135.57f, -23.36f)
                close()
            }
        }.build()
        
        return _Ring!!
    }

private var _Ring: ImageVector? = null

