package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DiamondHalf: ImageVector
    get() {
        if (_DiamondHalf != null) return _DiamondHalf!!
        
        _DiamondHalf = ImageVector.Builder(
            name = "diamond-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0f, -2.098f)
                close()
                moveTo(8f, 0.989f)
                curveToRelative(0.127f, 0f, 0.253f, 0.049f, 0.35f, 0.145f)
                lineToRelative(6.516f, 6.516f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, 0.7f)
                lineTo(8.35f, 14.866f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.35f, 0.145f)
                close()
            }
        }.build()
        
        return _DiamondHalf!!
    }

private var _DiamondHalf: ImageVector? = null

