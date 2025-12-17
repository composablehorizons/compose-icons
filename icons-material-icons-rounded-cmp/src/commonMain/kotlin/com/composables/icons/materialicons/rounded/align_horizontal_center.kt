package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Align_horizontal_center: ImageVector
    get() {
        if (_Align_horizontal_center != null) return _Align_horizontal_center!!
        
        _Align_horizontal_center = ImageVector.Builder(
            name = "align_horizontal_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineTo(12f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                lineToRelative(6.5f, 0f)
                curveTo(20.33f, 7f, 21f, 7.67f, 21f, 8.5f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(13f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineTo(7.5f)
                curveTo(6.67f, 17f, 6f, 16.33f, 6f, 15.5f)
                verticalLineToRelative(0f)
                curveTo(6f, 14.67f, 6.67f, 14f, 7.5f, 14f)
                horizontalLineTo(11f)
                verticalLineToRelative(-4f)
                horizontalLineTo(4.5f)
                curveTo(3.67f, 10f, 3f, 9.33f, 3f, 8.5f)
                verticalLineToRelative(0f)
                curveTo(3f, 7.67f, 3.67f, 7f, 4.5f, 7f)
                horizontalLineTo(11f)
                lineToRelative(0f, -4f)
                curveTo(11f, 2.45f, 11.45f, 2f, 12f, 2f)
                close()
            }
        }.build()
        
        return _Align_horizontal_center!!
    }

private var _Align_horizontal_center: ImageVector? = null

