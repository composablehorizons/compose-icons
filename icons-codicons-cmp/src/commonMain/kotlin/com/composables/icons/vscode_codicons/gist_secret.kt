package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GistSecret: ImageVector
    get() {
        if (_GistSecret != null) return _GistSecret!!
        
        _GistSecret = ImageVector.Builder(
            name = "gist-secret",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 1f)
                curveTo(4.89543f, 1f, 4f, 1.89543f, 4f, 3f)
                verticalLineTo(5.40135f)
                curveTo(4.30369f, 5.22567f, 4.64104f, 5.1017f, 5f, 5.04148f)
                verticalLineTo(3f)
                curveTo(5f, 2.44772f, 5.44772f, 2f, 6f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(4.5f)
                curveTo(9f, 5.32843f, 9.67157f, 6f, 10.5f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                curveTo(13f, 13.5523f, 12.5523f, 14f, 12f, 14f)
                horizontalLineTo(10f)
                curveTo(10f, 14.3643f, 9.90261f, 14.7058f, 9.73244f, 15f)
                horizontalLineTo(12f)
                curveTo(13.1046f, 15f, 14f, 14.1046f, 14f, 13f)
                verticalLineTo(5.41421f)
                curveTo(14f, 5.01639f, 13.842f, 4.63486f, 13.5607f, 4.35355f)
                lineTo(10.6464f, 1.43934f)
                curveTo(10.3651f, 1.15804f, 9.98361f, 1f, 9.58579f, 1f)
                horizontalLineTo(6f)
                close()
                moveTo(12.7929f, 5f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 5f, 10f, 4.77614f, 10f, 4.5f)
                verticalLineTo(2.20711f)
                lineTo(12.7929f, 5f)
                close()
                moveTo(3.5f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 9f, 2f, 9.44772f, 2f, 10f)
                verticalLineTo(14f)
                curveTo(2f, 14.5523f, 2.44771f, 15f, 3f, 15f)
                horizontalLineTo(8f)
                curveTo(8.55228f, 15f, 9f, 14.5523f, 9f, 14f)
                verticalLineTo(10f)
                curveTo(9f, 9.44772f, 8.55228f, 9f, 8f, 9f)
                horizontalLineTo(7.5f)
                verticalLineTo(8f)
                curveTo(7.5f, 6.89543f, 6.60457f, 6f, 5.5f, 6f)
                curveTo(4.39543f, 6f, 3.5f, 6.89543f, 3.5f, 8f)
                close()
                moveTo(4.5f, 9f)
                verticalLineTo(8f)
                curveTo(4.5f, 7.44772f, 4.94772f, 7f, 5.5f, 7f)
                curveTo(6.05228f, 7f, 6.5f, 7.44772f, 6.5f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(4.5f)
                close()
                moveTo(5.5f, 11.25f)
                curveTo(5.91421f, 11.25f, 6.25f, 11.5858f, 6.25f, 12f)
                curveTo(6.25f, 12.4142f, 5.91421f, 12.75f, 5.5f, 12.75f)
                curveTo(5.08579f, 12.75f, 4.75f, 12.4142f, 4.75f, 12f)
                curveTo(4.75f, 11.5858f, 5.08579f, 11.25f, 5.5f, 11.25f)
                close()
            }
        }.build()
        
        return _GistSecret!!
    }

private var _GistSecret: ImageVector? = null

