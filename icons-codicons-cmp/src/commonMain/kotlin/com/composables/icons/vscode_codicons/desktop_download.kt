package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DesktopDownload: ImageVector
    get() {
        if (_DesktopDownload != null) return _DesktopDownload!!
        
        _DesktopDownload = ImageVector.Builder(
            name = "desktop-download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 13.5f)
                curveTo(16f, 13.565f, 15.987f, 13.63f, 15.961f, 13.69f)
                curveTo(15.935f, 13.751f, 15.897f, 13.805f, 15.85f, 13.85f)
                lineTo(13.85f, 15.85f)
                curveTo(13.804f, 15.897f, 13.75f, 15.935f, 13.69f, 15.961f)
                curveTo(13.63f, 15.987f, 13.565f, 16f, 13.5f, 16f)
                curveTo(13.435f, 16f, 13.371f, 15.987f, 13.31f, 15.961f)
                curveTo(13.249f, 15.935f, 13.195f, 15.897f, 13.15f, 15.85f)
                lineTo(11.15f, 13.85f)
                curveTo(11.103f, 13.804f, 11.065f, 13.75f, 11.039f, 13.69f)
                curveTo(11.013f, 13.63f, 11f, 13.565f, 11f, 13.5f)
                curveTo(11f, 13.435f, 11.013f, 13.37f, 11.039f, 13.31f)
                curveTo(11.065f, 13.249f, 11.103f, 13.195f, 11.15f, 13.15f)
                curveTo(11.196f, 13.103f, 11.25f, 13.065f, 11.31f, 13.039f)
                curveTo(11.37f, 13.013f, 11.435f, 13f, 11.5f, 13f)
                curveTo(11.565f, 13f, 11.629f, 13.013f, 11.69f, 13.039f)
                curveTo(11.751f, 13.065f, 11.805f, 13.103f, 11.85f, 13.15f)
                lineTo(13f, 14.29f)
                verticalLineTo(9.5f)
                curveTo(13f, 9.367f, 13.052f, 9.24f, 13.146f, 9.146f)
                curveTo(13.24f, 9.053f, 13.367f, 9f, 13.5f, 9f)
                curveTo(13.633f, 9f, 13.76f, 9.052f, 13.854f, 9.146f)
                curveTo(13.947f, 9.24f, 14f, 9.367f, 14f, 9.5f)
                verticalLineTo(14.29f)
                lineTo(15.15f, 13.15f)
                curveTo(15.196f, 13.103f, 15.25f, 13.065f, 15.31f, 13.039f)
                curveTo(15.37f, 13.013f, 15.435f, 13f, 15.5f, 13f)
                curveTo(15.565f, 13f, 15.629f, 13.013f, 15.69f, 13.039f)
                curveTo(15.751f, 13.065f, 15.805f, 13.103f, 15.85f, 13.15f)
                curveTo(15.897f, 13.196f, 15.935f, 13.25f, 15.961f, 13.31f)
                curveTo(15.987f, 13.37f, 16f, 13.435f, 16f, 13.5f)
                close()
                moveTo(11f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
                verticalLineTo(3f)
                curveTo(2f, 2.448f, 2.448f, 2f, 3f, 2f)
                horizontalLineTo(13f)
                curveTo(13.552f, 2f, 14f, 2.448f, 14f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                curveTo(15f, 1.895f, 14.105f, 1f, 13f, 1f)
                horizontalLineTo(3f)
                curveTo(1.895f, 1f, 1f, 1.895f, 1f, 3f)
                verticalLineTo(10f)
                curveTo(1f, 11.105f, 1.895f, 12f, 3f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 14f, 3f, 14.224f, 3f, 14.5f)
                curveTo(3f, 14.776f, 3.224f, 15f, 3.5f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(13.5f)
                curveTo(10f, 13.295f, 10.041f, 13.097f, 10.122f, 12.91f)
                curveTo(10.203f, 12.723f, 10.319f, 12.559f, 10.466f, 12.421f)
                curveTo(10.565f, 12.317f, 10.725f, 12.204f, 10.905f, 12.125f)
                curveTo(10.936f, 12.111f, 10.968f, 12.106f, 11f, 12.095f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _DesktopDownload!!
    }

private var _DesktopDownload: ImageVector? = null

