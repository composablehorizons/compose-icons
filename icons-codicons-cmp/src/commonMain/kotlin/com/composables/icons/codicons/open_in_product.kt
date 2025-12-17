package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.OpenInProduct: ImageVector
    get() {
        if (_OpenInProduct != null) return _OpenInProduct!!
        
        _OpenInProduct = ImageVector.Builder(
            name = "open-in-product",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 4f)
                verticalLineTo(8.5f)
                curveTo(15f, 8.776f, 14.776f, 9f, 14.5f, 9f)
                curveTo(14.224f, 9f, 14f, 8.776f, 14f, 8.5f)
                verticalLineTo(4f)
                curveTo(14f, 2.895f, 13.105f, 2f, 12f, 2f)
                horizontalLineTo(4f)
                curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
                verticalLineTo(12f)
                curveTo(2f, 13.105f, 2.895f, 14f, 4f, 14f)
                horizontalLineTo(8.5f)
                curveTo(8.776f, 14f, 9f, 14.224f, 9f, 14.5f)
                curveTo(9f, 14.776f, 8.776f, 15f, 8.5f, 15f)
                horizontalLineTo(4f)
                curveTo(2.343f, 15f, 1f, 13.657f, 1f, 12f)
                verticalLineTo(4f)
                curveTo(1f, 2.343f, 2.343f, 1f, 4f, 1f)
                horizontalLineTo(12f)
                curveTo(13.657f, 1f, 15f, 2.343f, 15f, 4f)
                close()
                moveTo(7.707f, 7f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 7f, 12f, 6.776f, 12f, 6.5f)
                curveTo(12f, 6.224f, 11.776f, 6f, 11.5f, 6f)
                horizontalLineTo(6.507f)
                curveTo(6.377f, 5.998f, 6.246f, 6.047f, 6.147f, 6.146f)
                curveTo(6.094f, 6.199f, 6.055f, 6.261f, 6.031f, 6.327f)
                curveTo(6.012f, 6.379f, 6.001f, 6.435f, 6.001f, 6.493f)
                verticalLineTo(6.499f)
                verticalLineTo(11.499f)
                curveTo(6.001f, 11.775f, 6.225f, 11.999f, 6.501f, 11.999f)
                curveTo(6.777f, 11.999f, 7.001f, 11.775f, 7.001f, 11.499f)
                verticalLineTo(7.706f)
                lineTo(13.147f, 13.852f)
                curveTo(13.342f, 14.047f, 13.659f, 14.047f, 13.854f, 13.852f)
                curveTo(14.049f, 13.657f, 14.049f, 13.34f, 13.854f, 13.145f)
                lineTo(7.708f, 6.999f)
                lineTo(7.707f, 7f)
                close()
            }
        }.build()
        
        return _OpenInProduct!!
    }

private var _OpenInProduct: ImageVector? = null

