package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Leaf: ImageVector
    get() {
        if (_Leaf != null) return _Leaf!!
        
        _Leaf = ImageVector.Builder(
            name = "leaf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(546.2f, 9.7f)
                curveToRelative(-5.6f, -12.5f, -21.6f, -13f, -28.3f, -1.2f)
                curveTo(486.9f, 62.4f, 431.4f, 96f, 368f, 96f)
                horizontalLineToRelative(-80f)
                curveTo(182f, 96f, 96f, 182f, 96f, 288f)
                curveToRelative(0f, 7f, 0.8f, 13.7f, 1.5f, 20.5f)
                curveTo(161.3f, 262.8f, 253.4f, 224f, 384f, 224f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                curveTo(132.6f, 256f, 26f, 410.1f, 2.4f, 468f)
                curveToRelative(-6.6f, 16.3f, 1.2f, 34.9f, 17.5f, 41.6f)
                curveToRelative(16.4f, 6.8f, 35f, -1.1f, 41.8f, -17.3f)
                curveToRelative(1.5f, -3.6f, 20.9f, -47.9f, 71.9f, -90.6f)
                curveToRelative(32.4f, 43.9f, 94f, 85.8f, 174.9f, 77.2f)
                curveTo(465.5f, 467.5f, 576f, 326.7f, 576f, 154.3f)
                curveToRelative(0f, -50.2f, -10.8f, -102.2f, -29.8f, -144.6f)
                close()
            }
        }.build()
        
        return _Leaf!!
    }

private var _Leaf: ImageVector? = null

