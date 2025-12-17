package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VmRunning: ImageVector
    get() {
        if (_VmRunning != null) return _VmRunning!!
        
        _VmRunning = ImageVector.Builder(
            name = "vm-running",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.607f, 14f)
                curveTo(6.79f, 14.357f, 7.017f, 14.689f, 7.275f, 15f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 15f, 3f, 14.776f, 3f, 14.5f)
                curveTo(3f, 14.224f, 3.224f, 14f, 3.5f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                curveTo(1.895f, 12f, 1f, 11.105f, 1f, 10f)
                verticalLineTo(3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(13f)
                curveTo(14.105f, 1f, 15f, 1.895f, 15f, 3f)
                verticalLineTo(7.293f)
                curveTo(14.69f, 7.036f, 14.357f, 6.816f, 14f, 6.633f)
                verticalLineTo(3f)
                curveTo(14f, 2.448f, 13.552f, 2f, 13f, 2f)
                horizontalLineTo(3f)
                curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
                verticalLineTo(10f)
                curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
                horizontalLineTo(6.024f)
                curveTo(5.994f, 11.332f, 6.004f, 11.666f, 6.034f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(6.607f)
                close()
                moveTo(16f, 11.5f)
                curveTo(16f, 12.39f, 15.736f, 13.26f, 15.242f, 14f)
                curveTo(14.748f, 14.74f, 14.045f, 15.317f, 13.222f, 15.657f)
                curveTo(12.4f, 15.998f, 11.495f, 16.087f, 10.622f, 15.913f)
                curveTo(9.749f, 15.739f, 8.947f, 15.311f, 8.318f, 14.681f)
                curveTo(7.689f, 14.052f, 7.26f, 13.25f, 7.086f, 12.377f)
                curveTo(6.912f, 11.504f, 7.001f, 10.599f, 7.342f, 9.777f)
                curveTo(7.683f, 8.955f, 8.259f, 8.252f, 8.999f, 7.757f)
                curveTo(9.739f, 7.264f, 10.609f, 7f, 11.499f, 7f)
                curveTo(12.692f, 7f, 13.837f, 7.474f, 14.681f, 8.318f)
                curveTo(15.525f, 9.162f, 16f, 10.307f, 16f, 11.5f)
                close()
                moveTo(13.97f, 11.499f)
                curveTo(13.97f, 11.41f, 13.946f, 11.323f, 13.901f, 11.246f)
                curveTo(13.856f, 11.17f, 13.791f, 11.106f, 13.713f, 11.063f)
                lineTo(10.743f, 9.413f)
                curveTo(10.667f, 9.371f, 10.581f, 9.349f, 10.494f, 9.35f)
                curveTo(10.407f, 9.351f, 10.322f, 9.375f, 10.247f, 9.419f)
                curveTo(10.171f, 9.463f, 10.109f, 9.526f, 10.066f, 9.602f)
                curveTo(10.023f, 9.677f, 10f, 9.763f, 10f, 9.85f)
                verticalLineTo(13.15f)
                curveTo(10f, 13.237f, 10.023f, 13.322f, 10.066f, 13.398f)
                curveTo(10.11f, 13.474f, 10.172f, 13.537f, 10.247f, 13.581f)
                curveTo(10.322f, 13.625f, 10.407f, 13.649f, 10.494f, 13.65f)
                curveTo(10.581f, 13.65f, 10.667f, 13.629f, 10.743f, 13.587f)
                lineTo(13.713f, 11.937f)
                curveTo(13.791f, 11.892f, 13.856f, 11.829f, 13.901f, 11.752f)
                curveTo(13.946f, 11.676f, 13.97f, 11.588f, 13.97f, 11.499f)
                close()
            }
        }.build()
        
        return _VmRunning!!
    }

private var _VmRunning: ImageVector? = null

