package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RepoPush: ImageVector
    get() {
        if (_RepoPush != null) return _RepoPush!!
        
        _RepoPush = ImageVector.Builder(
            name = "repo-push",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.85f, 4.85f)
                curveTo(4.755f, 4.95f, 4.627f, 5f, 4.5f, 5f)
                curveTo(4.372f, 5f, 4.245f, 4.95f, 4.15f, 4.85f)
                curveTo(4.05f, 4.755f, 4f, 4.627f, 4f, 4.5f)
                curveTo(4f, 4.373f, 4.05f, 4.245f, 4.15f, 4.15f)
                lineTo(7.15f, 1.15f)
                curveTo(7.245f, 1.05f, 7.372f, 1f, 7.5f, 1f)
                curveTo(7.628f, 1f, 7.755f, 1.05f, 7.85f, 1.15f)
                lineTo(10.85f, 4.15f)
                curveTo(10.95f, 4.245f, 11f, 4.372f, 11f, 4.5f)
                curveTo(11f, 4.628f, 10.95f, 4.755f, 10.85f, 4.85f)
                curveTo(10.755f, 4.95f, 10.627f, 5f, 10.5f, 5f)
                curveTo(10.373f, 5f, 10.245f, 4.95f, 10.15f, 4.85f)
                lineTo(8f, 2.71f)
                verticalLineTo(9.5f)
                curveTo(8f, 9.78f, 7.78f, 10f, 7.5f, 10f)
                curveTo(7.22f, 10f, 7f, 9.78f, 7f, 9.5f)
                verticalLineTo(2.71f)
                lineTo(4.85f, 4.85f)
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
        
        return _RepoPush!!
    }

private var _RepoPush: ImageVector? = null

