package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.PinnedDirty: ImageVector
    get() {
        if (_PinnedDirty != null) return _PinnedDirty!!
        
        _PinnedDirty = ImageVector.Builder(
            name = "pinned-dirty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12f)
                curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
                curveTo(10.343f, 15f, 9.00001f, 13.657f, 9.00001f, 12f)
                curveTo(9.00001f, 10.343f, 10.343f, 9f, 12f, 9f)
                curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
                close()
                moveTo(12.85f, 6.65f)
                curveTo(13.08f, 6.88f, 13.02f, 7.28f, 12.73f, 7.44f)
                lineTo(12f, 7.829f)
                verticalLineTo(8f)
                horizontalLineTo(13.596f)
                curveTo(14.112f, 7.431f, 14.138f, 6.528f, 13.55f, 5.94f)
                lineTo(10.07f, 2.44f)
                curveTo(9.36001f, 1.73f, 8.16001f, 1.91f, 7.68001f, 2.8f)
                lineTo(5.66001f, 6.59f)
                lineTo(2.85001f, 7.52f)
                curveTo(2.69001f, 7.58f, 2.56001f, 7.71f, 2.52001f, 7.88f)
                curveTo(2.48001f, 8.05f, 2.53001f, 8.23f, 2.65001f, 8.35f)
                lineTo(4.80001f, 10.5f)
                lineTo(2.15001f, 13.14f)
                lineTo(2.01001f, 14f)
                lineTo(2.86001f, 13.85f)
                lineTo(5.51001f, 11.2f)
                lineTo(7.66001f, 13.35f)
                curveTo(7.75101f, 13.441f, 7.87301f, 13.476f, 8.00001f, 13.478f)
                verticalLineTo(12f)
                horizontalLineTo(7.81001f)
                lineTo(7.79001f, 12.07f)
                lineTo(7.72001f, 12f)
                lineTo(7.50001f, 11.78f)
                lineTo(3.93001f, 8.22f)
                lineTo(6.17001f, 7.47f)
                curveTo(6.29001f, 7.43f, 6.39001f, 7.35f, 6.45001f, 7.23f)
                lineTo(8.56001f, 3.27f)
                curveTo(8.72001f, 2.97f, 9.12001f, 2.91f, 9.36001f, 3.15f)
                lineTo(12.85f, 6.65f)
                close()
            }
        }.build()
        
        return _PinnedDirty!!
    }

private var _PinnedDirty: ImageVector? = null

