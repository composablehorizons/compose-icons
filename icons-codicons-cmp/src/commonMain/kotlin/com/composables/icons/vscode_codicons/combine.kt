package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Combine: ImageVector
    get() {
        if (_Combine != null) return _Combine!!
        
        _Combine = ImageVector.Builder(
            name = "combine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 1f)
                horizontalLineTo(2f)
                curveTo(1.449f, 1f, 1f, 1.449f, 1f, 2f)
                verticalLineTo(4f)
                curveTo(1f, 4.551f, 1.449f, 5f, 2f, 5f)
                horizontalLineTo(4f)
                curveTo(4.551f, 5f, 5f, 4.551f, 5f, 4f)
                verticalLineTo(2f)
                curveTo(5f, 1.449f, 4.551f, 1f, 4f, 1f)
                close()
                moveTo(2f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                curveTo(1.449f, 6f, 1f, 6.449f, 1f, 7f)
                verticalLineTo(9f)
                curveTo(1f, 9.551f, 1.449f, 10f, 2f, 10f)
                horizontalLineTo(4f)
                curveTo(4.551f, 10f, 5f, 9.551f, 5f, 9f)
                verticalLineTo(7f)
                curveTo(5f, 6.449f, 4.551f, 6f, 4f, 6f)
                close()
                moveTo(2f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5f)
                horizontalLineTo(15f)
                curveTo(15.551f, 5f, 16f, 5.449f, 16f, 6f)
                verticalLineTo(11f)
                curveTo(16f, 11.551f, 15.551f, 12f, 15f, 12f)
                horizontalLineTo(13f)
                curveTo(12.449f, 12f, 12f, 11.551f, 12f, 11f)
                verticalLineTo(6f)
                curveTo(12f, 5.449f, 12.449f, 5f, 13f, 5f)
                close()
                moveTo(13.001f, 11f)
                horizontalLineTo(15.001f)
                verticalLineTo(9f)
                horizontalLineTo(13.001f)
                verticalLineTo(11f)
                close()
                moveTo(13f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 11f)
                horizontalLineTo(2f)
                curveTo(1.449f, 11f, 1f, 11.449f, 1f, 12f)
                verticalLineTo(14f)
                curveTo(1f, 14.551f, 1.449f, 15f, 2f, 15f)
                horizontalLineTo(4f)
                curveTo(4.551f, 15f, 5f, 14.551f, 5f, 14f)
                verticalLineTo(12f)
                curveTo(5f, 11.449f, 4.551f, 11f, 4f, 11f)
                close()
                moveTo(2f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.647f, 6.64601f)
                curveTo(8.842f, 6.45101f, 9.159f, 6.45101f, 9.354f, 6.64601f)
                lineTo(9.355f, 6.64501f)
                lineTo(10.855f, 8.14501f)
                curveTo(11.05f, 8.34001f, 11.05f, 8.65701f, 10.855f, 8.85201f)
                lineTo(9.355f, 10.352f)
                curveTo(9.257f, 10.449f, 9.129f, 10.498f, 9.001f, 10.498f)
                curveTo(8.873f, 10.498f, 8.745f, 10.45f, 8.647f, 10.352f)
                curveTo(8.452f, 10.157f, 8.452f, 9.84001f, 8.647f, 9.64501f)
                lineTo(9.293f, 8.99901f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 8.99901f, 6f, 8.77501f, 6f, 8.49901f)
                curveTo(6f, 8.22301f, 6.224f, 7.99901f, 6.5f, 7.99901f)
                horizontalLineTo(9.293f)
                lineTo(8.647f, 7.35301f)
                curveTo(8.452f, 7.15801f, 8.452f, 6.84101f, 8.647f, 6.64601f)
                close()
            }
        }.build()
        
        return _Combine!!
    }

private var _Combine: ImageVector? = null

