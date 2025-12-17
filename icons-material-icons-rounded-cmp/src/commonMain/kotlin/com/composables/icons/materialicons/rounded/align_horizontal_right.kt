package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Align_horizontal_right: ImageVector
    get() {
        if (_Align_horizontal_right != null) return _Align_horizontal_right!!
        
        _Align_horizontal_right = ImageVector.Builder(
            name = "align_horizontal_right",
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
                moveTo(21f, 2f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(3f)
                curveTo(20f, 2.45f, 20.45f, 2f, 21f, 2f)
                close()
                moveTo(3.5f, 10f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0f)
                curveTo(18f, 7.67f, 17.33f, 7f, 16.5f, 7f)
                horizontalLineToRelative(-13f)
                curveTo(2.67f, 7f, 2f, 7.67f, 2f, 8.5f)
                verticalLineToRelative(0f)
                curveTo(2f, 9.33f, 2.67f, 10f, 3.5f, 10f)
                close()
                moveTo(9.5f, 17f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(0f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-7f)
                curveTo(8.67f, 14f, 8f, 14.67f, 8f, 15.5f)
                verticalLineToRelative(0f)
                curveTo(8f, 16.33f, 8.67f, 17f, 9.5f, 17f)
                close()
            }
        }.build()
        
        return _Align_horizontal_right!!
    }

private var _Align_horizontal_right: ImageVector? = null

