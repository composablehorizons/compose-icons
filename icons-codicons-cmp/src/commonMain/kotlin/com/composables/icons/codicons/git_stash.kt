package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitStash: ImageVector
    get() {
        if (_GitStash != null) return _GitStash!!
        
        _GitStash = ImageVector.Builder(
            name = "git-stash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 8f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 8f, 10f, 8.224f, 10f, 8.5f)
                curveTo(10f, 9.603f, 9.103f, 10.5f, 8f, 10.5f)
                curveTo(6.897f, 10.5f, 6f, 9.603f, 6f, 8.5f)
                curveTo(6f, 8.224f, 5.776f, 8f, 5.5f, 8f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 8f, 1f, 8.224f, 1f, 8.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.878f, 2.121f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.879f, 15f, 15f, 13.878f, 15f, 12.5f)
                verticalLineTo(8.5f)
                curveTo(15f, 8.224f, 14.776f, 8f, 14.5f, 8f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                verticalLineTo(9f)
                horizontalLineTo(5.042f)
                curveTo(5.28f, 10.417f, 6.517f, 11.5f, 8f, 11.5f)
                curveTo(9.483f, 11.5f, 10.72f, 10.417f, 10.958f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                close()
                moveTo(5.646f, 5.854f)
                curveTo(5.451f, 5.659f, 5.451f, 5.342f, 5.646f, 5.147f)
                curveTo(5.841f, 4.952f, 6.158f, 4.952f, 6.353f, 5.147f)
                lineTo(7.499f, 6.293f)
                verticalLineTo(1.5f)
                curveTo(7.499f, 1.224f, 7.723f, 1f, 7.999f, 1f)
                curveTo(8.275f, 1f, 8.499f, 1.224f, 8.499f, 1.5f)
                verticalLineTo(6.293f)
                lineTo(9.645f, 5.147f)
                curveTo(9.84f, 4.952f, 10.157f, 4.952f, 10.352f, 5.147f)
                curveTo(10.547f, 5.342f, 10.547f, 5.659f, 10.352f, 5.854f)
                lineTo(8.352f, 7.854f)
                curveTo(8.254f, 7.952f, 8.126f, 8f, 7.998f, 8f)
                curveTo(7.87f, 8f, 7.742f, 7.951f, 7.644f, 7.854f)
                lineTo(5.644f, 5.854f)
                horizontalLineTo(5.646f)
                close()
            }
        }.build()
        
        return _GitStash!!
    }

private var _GitStash: ImageVector? = null

