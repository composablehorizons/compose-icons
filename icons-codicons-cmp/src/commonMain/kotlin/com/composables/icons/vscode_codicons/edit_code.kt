package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.EditCode: ImageVector
    get() {
        if (_EditCode != null) return _EditCode!!
        
        _EditCode = ImageVector.Builder(
            name = "edit-code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.854f, 5.146f)
                lineTo(11.824f, 7.116f)
                lineTo(11.117f, 7.823f)
                lineTo(9.147f, 5.853f)
                curveTo(8.952f, 5.658f, 8.952f, 5.341f, 9.147f, 5.146f)
                curveTo(9.342f, 4.951f, 9.659f, 4.951f, 9.854f, 5.146f)
                close()
                moveTo(2f, 12f)
                verticalLineTo(4f)
                curveTo(2f, 2.895f, 2.895f, 2f, 4f, 2f)
                horizontalLineTo(12f)
                curveTo(13.105f, 2f, 14f, 2.895f, 14f, 4f)
                verticalLineTo(6.011f)
                curveTo(14.044f, 6.009f, 14.086f, 5.998f, 14.13f, 5.998f)
                curveTo(14.431f, 5.998f, 14.721f, 6.057f, 15f, 6.146f)
                verticalLineTo(4f)
                curveTo(15f, 2.343f, 13.657f, 1f, 12f, 1f)
                horizontalLineTo(4f)
                curveTo(2.343f, 1f, 1f, 2.343f, 1f, 4f)
                verticalLineTo(12f)
                curveTo(1f, 13.657f, 2.343f, 15f, 4f, 15f)
                horizontalLineTo(6.009f)
                curveTo(6.016f, 14.884f, 6.027f, 14.767f, 6.055f, 14.651f)
                lineTo(6.218f, 14f)
                horizontalLineTo(4f)
                curveTo(2.895f, 14f, 2f, 13.105f, 2f, 12f)
                close()
                moveTo(6.854f, 10.146f)
                lineTo(4.708f, 8f)
                lineTo(6.854f, 5.854f)
                curveTo(7.049f, 5.659f, 7.049f, 5.342f, 6.854f, 5.147f)
                curveTo(6.659f, 4.952f, 6.342f, 4.952f, 6.147f, 5.147f)
                lineTo(3.647f, 7.647f)
                curveTo(3.452f, 7.842f, 3.452f, 8.159f, 3.647f, 8.354f)
                lineTo(6.147f, 10.854f)
                curveTo(6.342f, 11.049f, 6.659f, 11.049f, 6.854f, 10.854f)
                curveTo(7.049f, 10.659f, 7.049f, 10.342f, 6.854f, 10.147f)
                verticalLineTo(10.146f)
                close()
                moveTo(15.452f, 7.546f)
                curveTo(14.722f, 6.816f, 13.538f, 6.816f, 12.807f, 7.546f)
                lineTo(7.978f, 12.375f)
                curveTo(7.696f, 12.657f, 7.497f, 13.009f, 7.4f, 13.396f)
                lineTo(7.026f, 14.894f)
                curveTo(6.863f, 15.545f, 7.453f, 16.135f, 8.105f, 15.973f)
                lineTo(9.603f, 15.598f)
                curveTo(9.989f, 15.501f, 10.342f, 15.302f, 10.624f, 15.02f)
                lineTo(15.453f, 10.191f)
                curveTo(16.183f, 9.461f, 16.183f, 8.277f, 15.453f, 7.546f)
                horizontalLineTo(15.452f)
                close()
            }
        }.build()
        
        return _EditCode!!
    }

private var _EditCode: ImageVector? = null

