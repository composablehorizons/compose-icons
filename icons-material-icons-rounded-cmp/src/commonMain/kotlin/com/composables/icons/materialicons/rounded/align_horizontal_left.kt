package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Align_horizontal_left: ImageVector
    get() {
        if (_Align_horizontal_left != null) return _Align_horizontal_left!!
        
        _Align_horizontal_left = ImageVector.Builder(
            name = "align_horizontal_left",
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
                moveTo(3f, 22f)
                lineTo(3f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(18f)
                curveTo(4f, 21.55f, 3.55f, 22f, 3f, 22f)
                close()
                moveTo(20.5f, 7f)
                horizontalLineToRelative(-13f)
                curveTo(6.67f, 7f, 6f, 7.67f, 6f, 8.5f)
                verticalLineToRelative(0f)
                curveTo(6f, 9.33f, 6.67f, 10f, 7.5f, 10f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0f)
                curveTo(22f, 7.67f, 21.33f, 7f, 20.5f, 7f)
                close()
                moveTo(14.5f, 14f)
                horizontalLineToRelative(-7f)
                curveTo(6.67f, 14f, 6f, 14.67f, 6f, 15.5f)
                verticalLineToRelative(0f)
                curveTo(6f, 16.33f, 6.67f, 17f, 7.5f, 17f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0f)
                curveTo(16f, 14.67f, 15.33f, 14f, 14.5f, 14f)
                close()
            }
        }.build()
        
        return _Align_horizontal_left!!
    }

private var _Align_horizontal_left: ImageVector? = null

