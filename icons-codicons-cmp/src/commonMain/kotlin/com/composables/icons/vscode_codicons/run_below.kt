package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RunBelow: ImageVector
    get() {
        if (_RunBelow != null) return _RunBelow!!
        
        _RunBelow = ImageVector.Builder(
            name = "run-below",
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
                curveTo(15.935f, 13.75f, 15.897f, 13.805f, 15.85f, 13.85f)
                lineTo(13.85f, 15.85f)
                curveTo(13.805f, 15.897f, 13.751f, 15.935f, 13.691f, 15.961f)
                curveTo(13.631f, 15.987f, 13.566f, 16f, 13.501f, 16f)
                curveTo(13.436f, 16f, 13.371f, 15.987f, 13.311f, 15.961f)
                curveTo(13.251f, 15.935f, 13.196f, 15.897f, 13.151f, 15.85f)
                lineTo(11.151f, 13.85f)
                curveTo(11.104f, 13.805f, 11.066f, 13.751f, 11.04f, 13.69f)
                curveTo(11.014f, 13.63f, 11.001f, 13.565f, 11.001f, 13.5f)
                curveTo(11.001f, 13.435f, 11.014f, 13.37f, 11.04f, 13.31f)
                curveTo(11.066f, 13.25f, 11.104f, 13.195f, 11.151f, 13.15f)
                curveTo(11.196f, 13.103f, 11.25f, 13.065f, 11.311f, 13.039f)
                curveTo(11.371f, 13.013f, 11.436f, 13f, 11.501f, 13f)
                curveTo(11.566f, 13f, 11.631f, 13.013f, 11.691f, 13.039f)
                curveTo(11.751f, 13.065f, 11.805f, 13.103f, 11.85f, 13.15f)
                lineTo(13f, 14.29f)
                verticalLineTo(9.50001f)
                curveTo(13f, 9.36701f, 13.053f, 9.24001f, 13.146f, 9.14601f)
                curveTo(13.24f, 9.05201f, 13.367f, 9.00001f, 13.5f, 9.00001f)
                curveTo(13.633f, 9.00001f, 13.76f, 9.05301f, 13.854f, 9.14601f)
                curveTo(13.948f, 9.24001f, 14f, 9.36701f, 14f, 9.50001f)
                verticalLineTo(14.29f)
                lineTo(15.15f, 13.15f)
                curveTo(15.195f, 13.103f, 15.249f, 13.065f, 15.31f, 13.039f)
                curveTo(15.37f, 13.013f, 15.435f, 13f, 15.5f, 13f)
                curveTo(15.565f, 13f, 15.63f, 13.013f, 15.69f, 13.039f)
                curveTo(15.75f, 13.065f, 15.804f, 13.103f, 15.849f, 13.15f)
                curveTo(15.896f, 13.195f, 15.934f, 13.249f, 15.96f, 13.31f)
                curveTo(15.986f, 13.37f, 15.999f, 13.435f, 15.999f, 13.5f)
                horizontalLineTo(16f)
                close()
                moveTo(12f, 8.85501f)
                lineTo(4.745f, 12.936f)
                curveTo(4.412f, 13.124f, 4f, 12.883f, 4f, 12.5f)
                verticalLineTo(3.50001f)
                curveTo(4f, 3.11801f, 4.412f, 2.87701f, 4.745f, 3.06401f)
                lineTo(12.745f, 7.56401f)
                curveTo(12.915f, 7.66001f, 13f, 7.83001f, 13f, 8.00001f)
                horizontalLineTo(14f)
                curveTo(14f, 7.49001f, 13.745f, 6.97901f, 13.235f, 6.69301f)
                lineTo(5.235f, 2.19301f)
                curveTo(4.235f, 1.63101f, 3f, 2.35301f, 3f, 3.50001f)
                verticalLineTo(12.5f)
                curveTo(3f, 13.647f, 4.235f, 14.37f, 5.235f, 13.807f)
                lineTo(12f, 10.002f)
                verticalLineTo(8.85501f)
                close()
            }
        }.build()
        
        return _RunBelow!!
    }

private var _RunBelow: ImageVector? = null

