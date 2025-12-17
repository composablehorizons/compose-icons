package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Align_vertical_top: ImageVector
    get() {
        if (_Align_vertical_top != null) return _Align_vertical_top!!
        
        _Align_vertical_top = ImageVector.Builder(
            name = "align_vertical_top",
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
                moveTo(22f, 3f)
                lineTo(22f, 3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveTo(2.45f, 4f, 2f, 3.55f, 2f, 3f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveTo(21.55f, 2f, 22f, 2.45f, 22f, 3f)
                close()
                moveTo(8.5f, 22f)
                lineTo(8.5f, 22f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                curveTo(10f, 6.67f, 9.33f, 6f, 8.5f, 6f)
                horizontalLineToRelative(0f)
                curveTo(7.67f, 6f, 7f, 6.67f, 7f, 7.5f)
                verticalLineToRelative(13f)
                curveTo(7f, 21.33f, 7.67f, 22f, 8.5f, 22f)
                close()
                moveTo(15.5f, 16f)
                lineTo(15.5f, 16f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveTo(17f, 6.67f, 16.33f, 6f, 15.5f, 6f)
                horizontalLineToRelative(0f)
                curveTo(14.67f, 6f, 14f, 6.67f, 14f, 7.5f)
                verticalLineToRelative(7f)
                curveTo(14f, 15.33f, 14.67f, 16f, 15.5f, 16f)
                close()
            }
        }.build()
        
        return _Align_vertical_top!!
    }

private var _Align_vertical_top: ImageVector? = null

