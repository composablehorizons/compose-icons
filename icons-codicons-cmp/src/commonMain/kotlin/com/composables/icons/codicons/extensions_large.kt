package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ExtensionsLarge: ImageVector
    get() {
        if (_ExtensionsLarge != null) return _ExtensionsLarge!!
        
        _ExtensionsLarge = ImageVector.Builder(
            name = "extensions-large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 7.21878f)
                curveTo(23f, 6.63842f, 22.7741f, 6.09232f, 22.3644f, 5.68323f)
                lineTo(18.3008f, 1.61583f)
                curveTo(17.4814f, 0.794722f, 16.0519f, 0.794722f, 15.2325f, 1.61583f)
                lineTo(12f, 4.85135f)
                verticalLineTo(4.64974f)
                curveTo(12f, 3.4352f, 11.0134f, 2.44771f, 9.8f, 2.44771f)
                horizontalLineTo(3.2f)
                curveTo(1.98658f, 2.44771f, 1f, 3.4352f, 1f, 4.64974f)
                verticalLineTo(20.798f)
                curveTo(1f, 22.0125f, 1.98658f, 23f, 3.2f, 23f)
                horizontalLineTo(19.3333f)
                curveTo(20.5468f, 23f, 21.5333f, 22.0125f, 21.5333f, 20.798f)
                verticalLineTo(14.1919f)
                curveTo(21.5333f, 12.9773f, 20.5468f, 11.9898f, 19.3333f, 11.9898f)
                horizontalLineTo(19.1319f)
                lineTo(22.3644f, 8.75531f)
                curveTo(22.7741f, 8.34524f, 23f, 7.80012f, 23f, 7.21878f)
                close()
                moveTo(3.2f, 3.91573f)
                horizontalLineTo(9.8f)
                curveTo(10.2038f, 3.91573f, 10.5333f, 4.24457f, 10.5333f, 4.64974f)
                verticalLineTo(11.9898f)
                horizontalLineTo(2.46667f)
                verticalLineTo(4.64974f)
                curveTo(2.46667f, 4.24457f, 2.79618f, 3.91573f, 3.2f, 3.91573f)
                close()
                moveTo(2.46667f, 20.798f)
                verticalLineTo(13.4579f)
                horizontalLineTo(10.5333f)
                verticalLineTo(21.532f)
                horizontalLineTo(3.2f)
                curveTo(2.79618f, 21.532f, 2.46667f, 21.2022f, 2.46667f, 20.798f)
                close()
                moveTo(20.0667f, 14.1919f)
                verticalLineTo(20.798f)
                curveTo(20.0667f, 21.2022f, 19.7372f, 21.532f, 19.3333f, 21.532f)
                horizontalLineTo(12f)
                verticalLineTo(13.4579f)
                horizontalLineTo(19.3333f)
                curveTo(19.7372f, 13.4579f, 20.0667f, 13.7867f, 20.0667f, 14.1919f)
                close()
                moveTo(12f, 11.9898f)
                verticalLineTo(9.58523f)
                lineTo(14.4024f, 11.9898f)
                horizontalLineTo(12f)
                close()
                moveTo(21.327f, 7.71595f)
                lineTo(17.2634f, 11.7833f)
                curveTo(16.9974f, 12.0495f, 16.5359f, 12.0495f, 16.269f, 11.7833f)
                lineTo(12.2053f, 7.71595f)
                curveTo(12.0724f, 7.58383f, 11.999f, 7.40669f, 11.999f, 7.21878f)
                curveTo(11.999f, 7.03087f, 12.0724f, 6.85471f, 12.2053f, 6.72161f)
                lineTo(16.269f, 2.65421f)
                curveTo(16.402f, 2.52111f, 16.578f, 2.44771f, 16.7657f, 2.44771f)
                curveTo(16.9534f, 2.44771f, 17.1294f, 2.52111f, 17.2624f, 2.65421f)
                lineTo(21.326f, 6.72161f)
                curveTo(21.459f, 6.85373f, 21.5324f, 7.03087f, 21.5324f, 7.21878f)
                curveTo(21.5324f, 7.40669f, 21.46f, 7.58285f, 21.327f, 7.71595f)
                close()
            }
        }.build()
        
        return _ExtensionsLarge!!
    }

private var _ExtensionsLarge: ImageVector? = null

