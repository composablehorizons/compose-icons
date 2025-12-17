package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Align_vertical_bottom: ImageVector
    get() {
        if (_Align_vertical_bottom != null) return _Align_vertical_bottom!!
        
        _Align_vertical_bottom = ImageVector.Builder(
            name = "align_vertical_bottom",
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
                moveTo(21f, 22f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(0f)
                curveTo(22f, 21.55f, 21.55f, 22f, 21f, 22f)
                close()
                moveTo(8.5f, 2f)
                lineTo(8.5f, 2f)
                curveTo(7.67f, 2f, 7f, 2.67f, 7f, 3.5f)
                verticalLineToRelative(13f)
                curveTo(7f, 17.33f, 7.67f, 18f, 8.5f, 18f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                curveTo(10f, 2.67f, 9.33f, 2f, 8.5f, 2f)
                close()
                moveTo(15.5f, 8f)
                lineTo(15.5f, 8f)
                curveTo(14.67f, 8f, 14f, 8.67f, 14f, 9.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-7f)
                curveTo(17f, 8.67f, 16.33f, 8f, 15.5f, 8f)
                close()
            }
        }.build()
        
        return _Align_vertical_bottom!!
    }

private var _Align_vertical_bottom: ImageVector? = null

