package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SyncAlt: ImageVector
    get() {
        if (_SyncAlt != null) return _SyncAlt!!
        
        _SyncAlt = ImageVector.Builder(
            name = "sync-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(370.72f, 133.28f)
                curveTo(339.458f, 104.008f, 298.888f, 87.962f, 255.848f, 88f)
                curveToRelative(-77.458f, 0.068f, -144.328f, 53.178f, -162.791f, 126.85f)
                curveToRelative(-1.344f, 5.363f, -6.122f, 9.15f, -11.651f, 9.15f)
                horizontalLineTo(24.103f)
                curveToRelative(-7.498f, 0f, -13.194f, -6.807f, -11.807f, -14.176f)
                curveTo(33.933f, 94.924f, 134.813f, 8f, 256f, 8f)
                curveToRelative(66.448f, 0f, 126.791f, 26.136f, 171.315f, 68.685f)
                lineTo(463.03f, 40.97f)
                curveTo(478.149f, 25.851f, 504f, 36.559f, 504f, 57.941f)
                verticalLineTo(192f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(345.941f)
                curveToRelative(-21.382f, 0f, -32.09f, -25.851f, -16.971f, -40.971f)
                lineToRelative(41.75f, -41.749f)
                close()
                moveTo(32f, 296f)
                horizontalLineToRelative(134.059f)
                curveToRelative(21.382f, 0f, 32.09f, 25.851f, 16.971f, 40.971f)
                lineToRelative(-41.75f, 41.75f)
                curveToRelative(31.262f, 29.273f, 71.835f, 45.319f, 114.876f, 45.28f)
                curveToRelative(77.418f, -0.07f, 144.315f, -53.144f, 162.787f, -126.849f)
                curveToRelative(1.344f, -5.363f, 6.122f, -9.15f, 11.651f, -9.15f)
                horizontalLineToRelative(57.304f)
                curveToRelative(7.498f, 0f, 13.194f, 6.807f, 11.807f, 14.176f)
                curveTo(478.067f, 417.076f, 377.187f, 504f, 256f, 504f)
                curveToRelative(-66.448f, 0f, -126.791f, -26.136f, -171.315f, -68.685f)
                lineTo(48.97f, 471.03f)
                curveTo(33.851f, 486.149f, 8f, 475.441f, 8f, 454.059f)
                verticalLineTo(320f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                close()
            }
        }.build()
        
        return _SyncAlt!!
    }

private var _SyncAlt: ImageVector? = null

