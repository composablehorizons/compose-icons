package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BadgeSd: ImageVector
    get() {
        if (_BadgeSd != null) return _BadgeSd!!
        
        _BadgeSd = ImageVector.Builder(
            name = "badge-sd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
                moveTo(0f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(5.077f, 7.114f)
                curveToRelative(-1.524f, 0f, -2.263f, -0.8f, -2.315f, -1.749f)
                horizontalLineToRelative(1.147f)
                curveToRelative(0.079f, 0.466f, 0.527f, 0.809f, 1.234f, 0.809f)
                curveToRelative(0.739f, 0f, 1.13f, -0.339f, 1.13f, -0.83f)
                curveToRelative(0f, -0.418f, -0.3f, -0.634f, -0.923f, -0.779f)
                lineToRelative(-0.927f, -0.215f)
                curveToRelative(-0.932f, -0.21f, -1.52f, -0.747f, -1.52f, -1.657f)
                curveToRelative(0f, -1.098f, 0.918f, -1.815f, 2.24f, -1.815f)
                curveToRelative(1.371f, 0f, 2.162f, 0.77f, 2.22f, 1.692f)
                horizontalLineTo(6.238f)
                curveToRelative(-0.075f, -0.43f, -0.466f, -0.76f, -1.103f, -0.76f)
                curveToRelative(-0.655f, 0f, -1.046f, 0.338f, -1.046f, 0.804f)
                curveToRelative(0f, 0.36f, 0.294f, 0.598f, 0.821f, 0.712f)
                lineToRelative(0.932f, 0.216f)
                curveToRelative(0.971f, 0.22f, 1.613f, 0.685f, 1.613f, 1.691f)
                curveToRelative(0f, 1.117f, -0.857f, 1.881f, -2.378f, 1.881f)
                moveTo(8.307f, 11f)
                verticalLineTo(5.001f)
                horizontalLineToRelative(2.19f)
                curveToRelative(1.823f, 0f, 2.684f, 1.09f, 2.684f, 2.984f)
                curveToRelative(0f, 1.908f, -0.874f, 3.015f, -2.685f, 3.015f)
                close()
                moveToRelative(2.031f, -5.032f)
                horizontalLineToRelative(-0.844f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.844f)
                curveToRelative(1.116f, 0f, 1.622f, -0.667f, 1.622f, -2.02f)
                curveToRelative(0f, -1.354f, -0.51f, -2.04f, -1.622f, -2.04f)
            }
        }.build()
        
        return _BadgeSd!!
    }

private var _BadgeSd: ImageVector? = null

