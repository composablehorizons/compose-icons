package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FolderOpened: ImageVector
    get() {
        if (_FolderOpened != null) return _FolderOpened!!
        
        _FolderOpened = ImageVector.Builder(
            name = "folder-opened",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.5f)
                verticalLineTo(9.10022f)
                lineTo(2.92389f, 7.5f)
                curveTo(3.45979f, 6.5718f, 4.45017f, 6f, 5.52196f, 6f)
                lineTo(11.9146f, 6f)
                curveTo(11.7087f, 5.4174f, 11.1531f, 5f, 10.5f, 5f)
                horizontalLineTo(7f)
                curveTo(6.86739f, 5f, 6.74021f, 4.94732f, 6.64645f, 4.85355f)
                lineTo(4.93934f, 3.14645f)
                curveTo(4.84557f, 3.05268f, 4.71839f, 3f, 4.58579f, 3f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 3f, 2f, 3.67157f, 2f, 4.5f)
                close()
                moveTo(7.06895f, 13.9953f)
                curveTo(7.04641f, 13.9984f, 7.02339f, 14f, 7f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 14f, 1f, 12.8807f, 1f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(1f, 3.11929f, 2.11929f, 2f, 3.5f, 2f)
                horizontalLineTo(4.58579f)
                curveTo(4.98361f, 2f, 5.36514f, 2.15804f, 5.64645f, 2.43934f)
                lineTo(7.20711f, 4f)
                horizontalLineTo(10.5f)
                curveTo(11.724f, 4f, 12.7426f, 4.87965f, 12.958f, 6.04127f)
                curveTo(14.605f, 6.34148f, 15.5443f, 8.22106f, 14.6616f, 9.75f)
                lineTo(13.0766f, 12.4953f)
                curveTo(12.5407f, 13.4235f, 11.5503f, 13.9953f, 10.4785f, 13.9953f)
                horizontalLineTo(7.06895f)
                close()
                moveTo(5.52196f, 7f)
                curveTo(4.80743f, 7f, 4.14718f, 7.3812f, 3.78991f, 8f)
                lineTo(2.20492f, 10.7453f)
                curveTo(1.62757f, 11.7453f, 2.34926f, 12.9953f, 3.50396f, 12.9953f)
                lineTo(10.4785f, 12.9953f)
                curveTo(11.193f, 12.9953f, 11.8533f, 12.6141f, 12.2105f, 11.9953f)
                lineTo(13.7955f, 9.25f)
                curveTo(14.3729f, 8.25f, 13.6512f, 7f, 12.4965f, 7f)
                lineTo(5.52196f, 7f)
                close()
            }
        }.build()
        
        return _FolderOpened!!
    }

private var _FolderOpened: ImageVector? = null

