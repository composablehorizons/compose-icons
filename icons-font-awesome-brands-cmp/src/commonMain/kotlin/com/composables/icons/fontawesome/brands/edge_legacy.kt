package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.EdgeLegacy: ImageVector
    get() {
        if (_EdgeLegacy != null) return _EdgeLegacy!!
        
        _EdgeLegacy = ImageVector.Builder(
            name = "edge-legacy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(25.71f, 228.16f)
                lineToRelative(0.35f, -0.48f)
                curveToRelative(0f, 0.16f, 0f, 0.32f, -0.07f, 0.48f)
                close()
                moveToRelative(460.58f, 15.51f)
                curveToRelative(0f, -44f, -7.76f, -84.46f, -28.81f, -122.4f)
                curveTo(416.5f, 47.88f, 343.91f, 8f, 258.89f, 8f)
                curveTo(119f, 7.72f, 40.62f, 113.21f, 26.06f, 227.68f)
                curveToRelative(42.42f, -61.31f, 117.07f, -121.38f, 220.37f, -125f)
                curveToRelative(0f, 0f, 109.67f, 0f, 99.42f, 105f)
                horizontalLineTo(170f)
                curveToRelative(6.37f, -37.39f, 18.55f, -59f, 34.34f, -78.93f)
                curveToRelative(-75.05f, 34.9f, -121.85f, 96.1f, -120.75f, 188.32f)
                curveToRelative(0.83f, 71.45f, 50.13f, 144.84f, 120.75f, 172f)
                curveToRelative(83.35f, 31.84f, 192.77f, 7.2f, 240.13f, -21.33f)
                verticalLineTo(363.31f)
                curveTo(363.6f, 419.8f, 173.6f, 424.23f, 172.21f, 295.74f)
                horizontalLineTo(486.29f)
                verticalLineTo(243.67f)
                close()
            }
        }.build()
        
        return _EdgeLegacy!!
    }

private var _EdgeLegacy: ImageVector? = null

