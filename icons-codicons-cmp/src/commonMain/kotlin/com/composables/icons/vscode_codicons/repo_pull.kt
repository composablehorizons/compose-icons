package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RepoPull: ImageVector
    get() {
        if (_RepoPull != null) return _RepoPull!!
        
        _RepoPull = ImageVector.Builder(
            name = "repo-pull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.85f, 6.15f)
                curveTo(4.755f, 6.05f, 4.627f, 6f, 4.5f, 6f)
                curveTo(4.372f, 6f, 4.245f, 6.05f, 4.15f, 6.15f)
                curveTo(4.05f, 6.245f, 4f, 6.373f, 4f, 6.5f)
                curveTo(4f, 6.627f, 4.05f, 6.755f, 4.15f, 6.85f)
                lineTo(7.15f, 9.85f)
                curveTo(7.245f, 9.95f, 7.372f, 10f, 7.5f, 10f)
                curveTo(7.628f, 10f, 7.755f, 9.95f, 7.85f, 9.85f)
                lineTo(10.85f, 6.85f)
                curveTo(10.95f, 6.755f, 11f, 6.628f, 11f, 6.5f)
                curveTo(11f, 6.372f, 10.95f, 6.245f, 10.85f, 6.15f)
                curveTo(10.755f, 6.05f, 10.627f, 6f, 10.5f, 6f)
                curveTo(10.373f, 6f, 10.245f, 6.05f, 10.15f, 6.15f)
                lineTo(8f, 8.29f)
                verticalLineTo(1.5f)
                curveTo(8f, 1.22f, 7.78f, 1f, 7.5f, 1f)
                curveTo(7.22f, 1f, 7f, 1.22f, 7f, 1.5f)
                verticalLineTo(8.29f)
                lineTo(4.85f, 6.15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.95f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 13f, 13f, 13.22f, 13f, 13.5f)
                curveTo(13f, 13.78f, 12.78f, 14f, 12.5f, 14f)
                horizontalLineTo(9.95f)
                curveTo(9.72f, 15.14f, 8.71f, 16f, 7.5f, 16f)
                curveTo(6.29f, 16f, 5.28f, 15.14f, 5.05f, 14f)
                horizontalLineTo(2.5f)
                curveTo(2.22f, 14f, 2f, 13.78f, 2f, 13.5f)
                curveTo(2f, 13.22f, 2.22f, 13f, 2.5f, 13f)
                horizontalLineTo(5.05f)
                curveTo(5.28f, 11.86f, 6.29f, 11f, 7.5f, 11f)
                curveTo(8.71f, 11f, 9.72f, 11.86f, 9.95f, 13f)
                close()
                moveTo(6.09f, 14f)
                curveTo(6.29f, 14.58f, 6.85f, 15f, 7.5f, 15f)
                curveTo(8.15f, 15f, 8.71f, 14.58f, 8.91f, 14f)
                curveTo(8.97f, 13.84f, 9f, 13.68f, 9f, 13.5f)
                curveTo(9f, 13.32f, 8.97f, 13.16f, 8.91f, 13f)
                curveTo(8.71f, 12.42f, 8.15f, 12f, 7.5f, 12f)
                curveTo(6.85f, 12f, 6.29f, 12.42f, 6.09f, 13f)
                curveTo(6.03f, 13.16f, 6f, 13.32f, 6f, 13.5f)
                curveTo(6f, 13.68f, 6.03f, 13.84f, 6.09f, 14f)
                close()
            }
        }.build()
        
        return _RepoPull!!
    }

private var _RepoPull: ImageVector? = null

