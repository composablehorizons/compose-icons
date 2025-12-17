package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.AzureDevops: ImageVector
    get() {
        if (_AzureDevops != null) return _AzureDevops!!
        
        _AzureDevops = ImageVector.Builder(
            name = "azure-devops",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3.62172f)
                verticalLineTo(12.1336f)
                lineTo(11.5f, 15f)
                lineTo(6.075f, 13.025f)
                verticalLineTo(14.9825f)
                lineTo(3.00375f, 10.9713f)
                lineTo(11.955f, 11.6704f)
                verticalLineTo(4.00624f)
                lineTo(15f, 3.62172f)
                close()
                moveTo(12.0163f, 4.04994f)
                lineTo(6.99375f, 1f)
                verticalLineTo(3.00125f)
                lineTo(2.3825f, 4.35581f)
                lineTo(1f, 6.12984f)
                verticalLineTo(10.1586f)
                lineTo(2.9775f, 11.0325f)
                verticalLineTo(5.86767f)
                lineTo(12.0163f, 4.04994f)
                close()
            }
        }.build()
        
        return _AzureDevops!!
    }

private var _AzureDevops: ImageVector? = null

