package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.RunAbove: ImageVector
    get() {
        if (_RunAbove != null) return _RunAbove!!
        
        _RunAbove = ImageVector.Builder(
            name = "run-above",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.854f, 11.853f)
                curveTo(15.756f, 11.95f, 15.628f, 11.999f, 15.5f, 11.999f)
                curveTo(15.372f, 11.999f, 15.244f, 11.951f, 15.146f, 11.853f)
                lineTo(14f, 10.707f)
                verticalLineTo(15.5f)
                curveTo(14f, 15.776f, 13.776f, 16f, 13.5f, 16f)
                curveTo(13.224f, 16f, 13f, 15.776f, 13f, 15.5f)
                verticalLineTo(10.707f)
                lineTo(11.854f, 11.853f)
                curveTo(11.659f, 12.048f, 11.342f, 12.048f, 11.147f, 11.853f)
                curveTo(10.952f, 11.658f, 10.952f, 11.341f, 11.147f, 11.146f)
                lineTo(13.147f, 9.14601f)
                curveTo(13.342f, 8.95101f, 13.659f, 8.95101f, 13.854f, 9.14601f)
                lineTo(15.854f, 11.146f)
                curveTo(16.049f, 11.341f, 16.049f, 11.658f, 15.854f, 11.853f)
                close()
                moveTo(4f, 12.5f)
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
                lineTo(10f, 11.127f)
                verticalLineTo(9.98001f)
                lineTo(4.745f, 12.936f)
                curveTo(4.412f, 13.124f, 4f, 12.883f, 4f, 12.5f)
                close()
            }
        }.build()
        
        return _RunAbove!!
    }

private var _RunAbove: ImageVector? = null

