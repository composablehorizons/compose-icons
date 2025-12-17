package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GitStashApply: ImageVector
    get() {
        if (_GitStashApply != null) return _GitStashApply!!
        
        _GitStashApply = ImageVector.Builder(
            name = "git-stash-apply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 7.99998f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 7.99998f, 10f, 8.22398f, 10f, 8.49998f)
                curveTo(10f, 9.60298f, 9.103f, 10.5f, 8f, 10.5f)
                curveTo(6.897f, 10.5f, 6f, 9.60298f, 6f, 8.49998f)
                curveTo(6f, 8.22398f, 5.776f, 7.99998f, 5.5f, 7.99998f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 7.99998f, 1f, 8.22398f, 1f, 8.49998f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.878f, 2.121f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.879f, 15f, 15f, 13.878f, 15f, 12.5f)
                verticalLineTo(8.49998f)
                curveTo(15f, 8.22398f, 14.776f, 7.99998f, 14.5f, 7.99998f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                verticalLineTo(8.99998f)
                horizontalLineTo(5.042f)
                curveTo(5.28f, 10.417f, 6.517f, 11.5f, 8f, 11.5f)
                curveTo(9.483f, 11.5f, 10.72f, 10.417f, 10.958f, 8.99998f)
                horizontalLineTo(14f)
                verticalLineTo(12.5f)
                close()
                moveTo(5.646f, 3.85398f)
                curveTo(5.451f, 3.65898f, 5.451f, 3.34198f, 5.646f, 3.14698f)
                lineTo(7.646f, 1.14698f)
                curveTo(7.841f, 0.951982f, 8.158f, 0.951982f, 8.353f, 1.14698f)
                lineTo(10.353f, 3.14698f)
                curveTo(10.548f, 3.34198f, 10.548f, 3.65898f, 10.353f, 3.85398f)
                curveTo(10.255f, 3.95198f, 10.127f, 3.99998f, 9.999f, 3.99998f)
                curveTo(9.871f, 3.99998f, 9.743f, 3.95098f, 9.645f, 3.85398f)
                lineTo(8.499f, 2.70798f)
                verticalLineTo(3.50098f)
                curveTo(8.499f, 3.77698f, 8.275f, 4.00098f, 7.999f, 4.00098f)
                curveTo(7.723f, 4.00098f, 7.499f, 3.77698f, 7.499f, 3.50098f)
                verticalLineTo(2.70798f)
                lineTo(6.353f, 3.85398f)
                curveTo(6.158f, 4.04898f, 5.841f, 4.04898f, 5.646f, 3.85398f)
                close()
                moveTo(8.5f, 5.49998f)
                curveTo(8.5f, 5.77598f, 8.276f, 5.99998f, 8f, 5.99998f)
                curveTo(7.724f, 5.99998f, 7.5f, 5.77598f, 7.5f, 5.49998f)
                curveTo(7.5f, 5.22398f, 7.724f, 4.99998f, 8f, 4.99998f)
                curveTo(8.276f, 4.99998f, 8.5f, 5.22398f, 8.5f, 5.49998f)
                close()
                moveTo(8.5f, 7.49998f)
                curveTo(8.5f, 7.77598f, 8.276f, 7.99998f, 8f, 7.99998f)
                curveTo(7.724f, 7.99998f, 7.5f, 7.77598f, 7.5f, 7.49998f)
                curveTo(7.5f, 7.22398f, 7.724f, 6.99998f, 8f, 6.99998f)
                curveTo(8.276f, 6.99998f, 8.5f, 7.22398f, 8.5f, 7.49998f)
                close()
            }
        }.build()
        
        return _GitStashApply!!
    }

private var _GitStashApply: ImageVector? = null

