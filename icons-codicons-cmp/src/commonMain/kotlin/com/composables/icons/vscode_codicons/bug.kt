package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Bug: ImageVector
    get() {
        if (_Bug != null) return _Bug!!
        
        _Bug = ImageVector.Builder(
            name = "bug",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                curveTo(13f, 5.63f, 12.898f, 5.283f, 12.722f, 4.985f)
                lineTo(13.853f, 3.854f)
                curveTo(14.048f, 3.659f, 14.048f, 3.342f, 13.853f, 3.147f)
                curveTo(13.658f, 2.952f, 13.341f, 2.952f, 13.146f, 3.147f)
                lineTo(12.015f, 4.278f)
                curveTo(11.717f, 4.102f, 11.37f, 4f, 11f, 4f)
                curveTo(11f, 2.346f, 9.654f, 1f, 8f, 1f)
                curveTo(6.346f, 1f, 5f, 2.346f, 5f, 4f)
                curveTo(4.63f, 4f, 4.283f, 4.102f, 3.985f, 4.278f)
                lineTo(2.854f, 3.147f)
                curveTo(2.659f, 2.952f, 2.342f, 2.952f, 2.147f, 3.147f)
                curveTo(1.952f, 3.342f, 1.952f, 3.659f, 2.147f, 3.854f)
                lineTo(3.278f, 4.985f)
                curveTo(3.102f, 5.283f, 3f, 5.63f, 3f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 8f, 1f, 8.224f, 1f, 8.5f)
                curveTo(1f, 8.776f, 1.224f, 9f, 1.5f, 9f)
                horizontalLineTo(3f)
                curveTo(3f, 10.199f, 3.424f, 11.3f, 4.13f, 12.163f)
                lineTo(2.396f, 13.897f)
                curveTo(2.201f, 14.092f, 2.201f, 14.409f, 2.396f, 14.604f)
                curveTo(2.494f, 14.702f, 2.622f, 14.75f, 2.75f, 14.75f)
                curveTo(2.878f, 14.75f, 3.006f, 14.701f, 3.104f, 14.604f)
                lineTo(4.838f, 12.87f)
                curveTo(5.7f, 13.576f, 6.802f, 14f, 8.001f, 14f)
                curveTo(9.2f, 14f, 10.301f, 13.576f, 11.164f, 12.87f)
                lineTo(12.898f, 14.604f)
                curveTo(12.996f, 14.702f, 13.124f, 14.75f, 13.252f, 14.75f)
                curveTo(13.38f, 14.75f, 13.508f, 14.701f, 13.606f, 14.604f)
                curveTo(13.801f, 14.409f, 13.801f, 14.092f, 13.606f, 13.897f)
                lineTo(11.872f, 12.163f)
                curveTo(12.578f, 11.301f, 13.002f, 10.199f, 13.002f, 9f)
                horizontalLineTo(14.502f)
                curveTo(14.778f, 9f, 15.002f, 8.776f, 15.002f, 8.5f)
                curveTo(15.002f, 8.224f, 14.778f, 8f, 14.502f, 8f)
                horizontalLineTo(14.5f)
                close()
                moveTo(8f, 2f)
                curveTo(9.103f, 2f, 10f, 2.897f, 10f, 4f)
                horizontalLineTo(6f)
                curveTo(6f, 2.897f, 6.897f, 2f, 8f, 2f)
                close()
                moveTo(12f, 9f)
                curveTo(12f, 11.206f, 10.206f, 13f, 8f, 13f)
                curveTo(5.794f, 13f, 4f, 11.206f, 4f, 9f)
                verticalLineTo(6f)
                curveTo(4f, 5.449f, 4.448f, 5f, 5f, 5f)
                horizontalLineTo(11f)
                curveTo(11.552f, 5f, 12f, 5.449f, 12f, 6f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Bug!!
    }

private var _Bug: ImageVector? = null

