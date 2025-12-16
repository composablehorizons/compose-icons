package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Button: ImageVector
    get() {
        if (_Button != null) return _Button!!
        
        _Button = ImageVector.Builder(
            name = "button",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.2041f, 4.01074f)
                curveTo(14.2128f, 4.113f, 15f, 4.96435f, 15f, 6f)
                verticalLineTo(9f)
                lineTo(14.9893f, 9.2041f)
                curveTo(14.8938f, 10.1457f, 14.1457f, 10.8938f, 13.2041f, 10.9893f)
                lineTo(13f, 11f)
                horizontalLineTo(2f)
                lineTo(1.7959f, 10.9893f)
                curveTo(0.854346f, 10.8938f, 0.1062f, 10.1457f, 0.0107422f, 9.2041f)
                lineTo(0f, 9f)
                verticalLineTo(6f)
                curveTo(0f, 4.96435f, 0.787223f, 4.113f, 1.7959f, 4.01074f)
                lineTo(2f, 4f)
                horizontalLineTo(13f)
                lineTo(13.2041f, 4.01074f)
                close()
                moveTo(2f, 5f)
                curveTo(1.48232f, 5f, 1.05621f, 5.39333f, 1.00488f, 5.89746f)
                lineTo(1f, 6f)
                verticalLineTo(9f)
                curveTo(1f, 9.55228f, 1.44772f, 10f, 2f, 10f)
                horizontalLineTo(13f)
                curveTo(13.5523f, 10f, 14f, 9.55228f, 14f, 9f)
                verticalLineTo(6f)
                curveTo(14f, 5.48232f, 13.6067f, 5.05621f, 13.1025f, 5.00488f)
                lineTo(13f, 5f)
                horizontalLineTo(2f)
                close()
                moveTo(4.5f, 6.75f)
                curveTo(4.91421f, 6.75f, 5.25f, 7.08579f, 5.25f, 7.5f)
                curveTo(5.25f, 7.91421f, 4.91421f, 8.25f, 4.5f, 8.25f)
                curveTo(4.08579f, 8.25f, 3.75f, 7.91421f, 3.75f, 7.5f)
                curveTo(3.75f, 7.08579f, 4.08579f, 6.75f, 4.5f, 6.75f)
                close()
                moveTo(7.5f, 6.75f)
                curveTo(7.91421f, 6.75f, 8.25f, 7.08579f, 8.25f, 7.5f)
                curveTo(8.25f, 7.91421f, 7.91421f, 8.25f, 7.5f, 8.25f)
                curveTo(7.08579f, 8.25f, 6.75f, 7.91421f, 6.75f, 7.5f)
                curveTo(6.75f, 7.08579f, 7.08579f, 6.75f, 7.5f, 6.75f)
                close()
                moveTo(10.5f, 6.75f)
                curveTo(10.9142f, 6.75f, 11.25f, 7.08579f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91421f, 10.9142f, 8.25f, 10.5f, 8.25f)
                curveTo(10.0858f, 8.25f, 9.75f, 7.91421f, 9.75f, 7.5f)
                curveTo(9.75f, 7.08579f, 10.0858f, 6.75f, 10.5f, 6.75f)
                close()
            }
        }.build()
        
        return _Button!!
    }

private var _Button: ImageVector? = null

