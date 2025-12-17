package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Align_vertical_center: ImageVector
    get() {
        if (_Align_vertical_center != null) return _Align_vertical_center!!
        
        _Align_vertical_center = ImageVector.Builder(
            name = "align_vertical_center",
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
                moveTo(21f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7.5f)
                curveTo(17f, 6.67f, 16.33f, 6f, 15.5f, 6f)
                horizontalLineToRelative(0f)
                curveTo(14.67f, 6f, 14f, 6.67f, 14f, 7.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4.5f)
                curveTo(10f, 3.67f, 9.33f, 3f, 8.5f, 3f)
                horizontalLineToRelative(0f)
                curveTo(7.67f, 3f, 7f, 3.67f, 7f, 4.5f)
                verticalLineTo(11f)
                horizontalLineTo(2.84f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineTo(7f)
                verticalLineToRelative(6.5f)
                curveTo(7f, 20.33f, 7.67f, 21f, 8.5f, 21f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(13f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(0f)
                curveTo(22f, 11.45f, 21.55f, 11f, 21f, 11f)
                close()
            }
        }.build()
        
        return _Align_vertical_center!!
    }

private var _Align_vertical_center: ImageVector? = null

