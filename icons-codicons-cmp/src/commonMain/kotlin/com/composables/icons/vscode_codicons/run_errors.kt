package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RunErrors: ImageVector
    get() {
        if (_RunErrors != null) return _RunErrors!!
        
        _RunErrors = ImageVector.Builder(
            name = "run-errors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 8f)
                curveTo(14f, 8.542f, 13.706f, 9.043f, 13.233f, 9.309f)
                lineTo(9.981f, 11.138f)
                curveTo(9.957f, 10.777f, 9.899f, 10.427f, 9.809f, 10.088f)
                lineTo(12.744f, 8.437f)
                curveTo(12.902f, 8.348f, 13f, 8.181f, 13f, 8f)
                curveTo(13f, 7.819f, 12.902f, 7.652f, 12.745f, 7.564f)
                lineTo(4.744f, 3.063f)
                curveTo(4.669f, 3.021f, 4.587f, 3f, 4.5f, 3f)
                curveTo(4.225f, 3f, 4f, 3.225f, 4f, 3.5f)
                verticalLineTo(6.025f)
                curveTo(3.656f, 6.056f, 3.323f, 6.121f, 3f, 6.213f)
                verticalLineTo(3.5f)
                curveTo(3f, 2.673f, 3.673f, 2f, 4.5f, 2f)
                curveTo(4.756f, 2f, 5.01f, 2.066f, 5.233f, 2.191f)
                lineTo(13.233f, 6.691f)
                curveTo(13.706f, 6.957f, 14f, 7.458f, 14f, 8f)
                close()
                moveTo(9f, 11.5f)
                curveTo(9f, 13.985f, 6.985f, 16f, 4.5f, 16f)
                curveTo(2.015f, 16f, 0f, 13.985f, 0f, 11.5f)
                curveTo(0f, 9.015f, 2.015f, 7f, 4.5f, 7f)
                curveTo(6.985f, 7f, 9f, 9.015f, 9f, 11.5f)
                close()
                moveTo(5.208f, 11.5f)
                lineTo(6.502f, 10.206f)
                curveTo(6.697f, 10.011f, 6.697f, 9.694f, 6.502f, 9.499f)
                curveTo(6.307f, 9.304f, 5.99f, 9.304f, 5.795f, 9.499f)
                lineTo(4.501f, 10.793f)
                lineTo(3.207f, 9.499f)
                curveTo(3.012f, 9.304f, 2.695f, 9.304f, 2.5f, 9.499f)
                curveTo(2.305f, 9.694f, 2.305f, 10.011f, 2.5f, 10.206f)
                lineTo(3.794f, 11.5f)
                lineTo(2.5f, 12.7314f)
                curveTo(2.305f, 12.9264f, 2.305f, 13.2434f, 2.5f, 13.4384f)
                curveTo(2.695f, 13.6334f, 3.012f, 13.6334f, 3.207f, 13.4384f)
                lineTo(4.501f, 12.207f)
                lineTo(5.795f, 13.501f)
                curveTo(5.99f, 13.696f, 6.307f, 13.696f, 6.502f, 13.501f)
                curveTo(6.697f, 13.306f, 6.697f, 12.989f, 6.502f, 12.794f)
                lineTo(5.208f, 11.5f)
                close()
            }
        }.build()
        
        return _RunErrors!!
    }

private var _RunErrors: ImageVector? = null

