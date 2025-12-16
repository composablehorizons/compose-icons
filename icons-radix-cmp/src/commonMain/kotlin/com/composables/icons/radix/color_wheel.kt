package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ColorWheel: ImageVector
    get() {
        if (_ColorWheel != null) return _ColorWheel!!
        
        _ColorWheel = ImageVector.Builder(
            name = "color-wheel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49915f, 0.877045f)
                curveTo(11.1566f, 0.877045f, 14.1218f, 3.84178f, 14.1222f, 7.49911f)
                curveTo(14.1222f, 11.1568f, 11.1568f, 14.1222f, 7.49915f, 14.1222f)
                curveTo(3.84181f, 14.1218f, 0.877075f, 11.1565f, 0.877075f, 7.49911f)
                curveTo(0.877487f, 3.84203f, 3.84206f, 0.877456f, 7.49915f, 0.877045f)
                close()
                moveTo(3.78235f, 11.7823f)
                curveTo(4.68397f, 12.5655f, 5.83417f, 13.0681f, 7.09973f, 13.1563f)
                verticalLineTo(8.46591f)
                lineTo(3.78235f, 11.7823f)
                close()
                moveTo(7.90051f, 13.1563f)
                curveTo(9.16548f, 13.068f, 10.3147f, 12.5651f, 11.2159f, 11.7823f)
                lineTo(7.90051f, 8.46689f)
                verticalLineTo(13.1563f)
                close()
                moveTo(1.84192f, 7.90048f)
                curveTo(1.93027f, 9.16525f, 2.43333f, 10.3147f, 3.21594f, 11.2159f)
                lineTo(6.53333f, 7.90048f)
                horizontalLineTo(1.84192f)
                close()
                moveTo(11.7823f, 11.2159f)
                curveTo(12.5651f, 10.3146f, 13.068f, 9.16545f, 13.1564f, 7.90048f)
                horizontalLineTo(8.46692f)
                lineTo(11.7823f, 11.2159f)
                close()
                moveTo(8.46692f, 7.0997f)
                horizontalLineTo(13.1564f)
                curveTo(13.0681f, 5.83414f, 12.5655f, 4.68394f, 11.7823f, 3.78232f)
                lineTo(8.46692f, 7.0997f)
                close()
                moveTo(3.21594f, 3.78232f)
                curveTo(2.43289f, 4.68388f, 1.93013f, 5.83433f, 1.84192f, 7.0997f)
                horizontalLineTo(6.53333f)
                lineTo(3.21594f, 3.78232f)
                close()
                moveTo(7.09973f, 1.84189f)
                curveTo(5.83414f, 1.93012f, 4.68398f, 2.4336f, 3.78235f, 3.21689f)
                lineTo(7.09973f, 6.53329f)
                verticalLineTo(1.84189f)
                close()
                moveTo(7.90051f, 6.53329f)
                lineTo(11.2159f, 3.21689f)
                curveTo(10.3147f, 2.43404f, 9.16551f, 1.93026f, 7.90051f, 1.84189f)
                verticalLineTo(6.53329f)
                close()
            }
        }.build()
        
        return _ColorWheel!!
    }

private var _ColorWheel: ImageVector? = null

