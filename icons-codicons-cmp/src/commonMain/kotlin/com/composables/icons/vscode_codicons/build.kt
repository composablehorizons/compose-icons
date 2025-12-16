package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Build: ImageVector
    get() {
        if (_Build != null) return _Build!!
        
        _Build = ImageVector.Builder(
            name = "build",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.354f, 5.854f)
                lineTo(10.354f, 3.854f)
                curveTo(10.549f, 3.659f, 10.549f, 3.342f, 10.354f, 3.147f)
                curveTo(10.256f, 3.05f, 10.128f, 3.001f, 10f, 3.001f)
                curveTo(9.872f, 3.001f, 9.744f, 3.049f, 9.646f, 3.147f)
                lineTo(8.5f, 4.293f)
                verticalLineTo(0.5f)
                curveTo(8.5f, 0.224f, 8.276f, 0f, 8f, 0f)
                curveTo(7.724f, 0f, 7.5f, 0.224f, 7.5f, 0.5f)
                verticalLineTo(4.293f)
                lineTo(6.354f, 3.147f)
                curveTo(6.159f, 2.952f, 5.842f, 2.952f, 5.647f, 3.147f)
                curveTo(5.452f, 3.342f, 5.452f, 3.659f, 5.647f, 3.854f)
                lineTo(7.647f, 5.854f)
                curveTo(7.842f, 6.049f, 8.159f, 6.049f, 8.354f, 5.854f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12.5f)
                curveTo(15f, 13.879f, 13.879f, 15f, 12.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.121f, 15f, 1f, 13.879f, 1f, 12.5f)
                verticalLineTo(6.49999f)
                curveTo(1f, 6.22399f, 1.224f, 5.99999f, 1.5f, 5.99999f)
                curveTo(1.776f, 5.99999f, 2f, 6.22399f, 2f, 6.49999f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.327f, 2.673f, 14f, 3.5f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 14f, 14f, 13.327f, 14f, 12.5f)
                verticalLineTo(6.49999f)
                curveTo(14f, 6.22399f, 14.224f, 5.99999f, 14.5f, 5.99999f)
                curveTo(14.776f, 5.99999f, 15f, 6.22399f, 15f, 6.49999f)
                verticalLineTo(12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 9.99999f)
                curveTo(4.55228f, 9.99999f, 5f, 9.55228f, 5f, 8.99999f)
                curveTo(5f, 8.44771f, 4.55228f, 7.99999f, 4f, 7.99999f)
                curveTo(3.44772f, 7.99999f, 3f, 8.44771f, 3f, 8.99999f)
                curveTo(3f, 9.55228f, 3.44772f, 9.99999f, 4f, 9.99999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9.99999f)
                curveTo(8.55228f, 9.99999f, 9f, 9.55228f, 9f, 8.99999f)
                curveTo(9f, 8.44771f, 8.55228f, 7.99999f, 8f, 7.99999f)
                curveTo(7.44772f, 7.99999f, 7f, 8.44771f, 7f, 8.99999f)
                curveTo(7f, 9.55228f, 7.44772f, 9.99999f, 8f, 9.99999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 13f)
                curveTo(6.55228f, 13f, 7f, 12.5523f, 7f, 12f)
                curveTo(7f, 11.4477f, 6.55228f, 11f, 6f, 11f)
                curveTo(5.44772f, 11f, 5f, 11.4477f, 5f, 12f)
                curveTo(5f, 12.5523f, 5.44772f, 13f, 6f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 13f)
                curveTo(10.5523f, 13f, 11f, 12.5523f, 11f, 12f)
                curveTo(11f, 11.4477f, 10.5523f, 11f, 10f, 11f)
                curveTo(9.44771f, 11f, 9f, 11.4477f, 9f, 12f)
                curveTo(9f, 12.5523f, 9.44771f, 13f, 10f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9.99999f)
                curveTo(12.5523f, 9.99999f, 13f, 9.55228f, 13f, 8.99999f)
                curveTo(13f, 8.44771f, 12.5523f, 7.99999f, 12f, 7.99999f)
                curveTo(11.4477f, 7.99999f, 11f, 8.44771f, 11f, 8.99999f)
                curveTo(11f, 9.55228f, 11.4477f, 9.99999f, 12f, 9.99999f)
                close()
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

