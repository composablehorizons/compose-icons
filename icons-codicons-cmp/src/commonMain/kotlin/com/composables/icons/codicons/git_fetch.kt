package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitFetch: ImageVector
    get() {
        if (_GitFetch != null) return _GitFetch!!
        
        _GitFetch = ImageVector.Builder(
            name = "git-fetch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.872f, 8.834f)
                lineTo(8.37196f, 13.834f)
                curveTo(8.27596f, 13.939f, 8.14196f, 14f, 7.99996f, 14f)
                curveTo(7.85796f, 14f, 7.72396f, 13.94f, 7.62796f, 13.834f)
                lineTo(3.12796f, 8.834f)
                curveTo(2.94296f, 8.629f, 2.95996f, 8.313f, 3.16496f, 8.128f)
                curveTo(3.36996f, 7.943f, 3.68596f, 7.959f, 3.87196f, 8.165f)
                lineTo(7.49996f, 12.196f)
                verticalLineTo(10.499f)
                curveTo(7.49996f, 10.223f, 7.72396f, 9.999f, 7.99996f, 9.999f)
                curveTo(8.27596f, 9.999f, 8.49996f, 10.223f, 8.49996f, 10.499f)
                verticalLineTo(12.196f)
                lineTo(12.128f, 8.165f)
                curveTo(12.315f, 7.96f, 12.63f, 7.944f, 12.835f, 8.128f)
                curveTo(13.04f, 8.313f, 13.057f, 8.629f, 12.872f, 8.834f)
                close()
                moveTo(7.99996f, 5f)
                curveTo(8.27596f, 5f, 8.49996f, 4.776f, 8.49996f, 4.5f)
                verticalLineTo(2.5f)
                curveTo(8.49996f, 2.224f, 8.27596f, 2f, 7.99996f, 2f)
                curveTo(7.72396f, 2f, 7.49996f, 2.224f, 7.49996f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(7.49996f, 4.776f, 7.72396f, 5f, 7.99996f, 5f)
                close()
                moveTo(7.99996f, 9f)
                curveTo(8.27596f, 9f, 8.49996f, 8.776f, 8.49996f, 8.5f)
                verticalLineTo(6.5f)
                curveTo(8.49996f, 6.224f, 8.27596f, 6f, 7.99996f, 6f)
                curveTo(7.72396f, 6f, 7.49996f, 6.224f, 7.49996f, 6.5f)
                verticalLineTo(8.5f)
                curveTo(7.49996f, 8.776f, 7.72396f, 9f, 7.99996f, 9f)
                close()
            }
        }.build()
        
        return _GitFetch!!
    }

private var _GitFetch: ImageVector? = null

