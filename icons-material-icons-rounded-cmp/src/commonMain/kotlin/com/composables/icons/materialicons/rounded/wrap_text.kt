package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wrap_text: ImageVector
    get() {
        if (_Wrap_text != null) return _Wrap_text!!
        
        _Wrap_text = ImageVector.Builder(
            name = "wrap_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 7f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(11.83f, 4f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12.13f)
                curveToRelative(1f, 0f, 1.93f, 0.67f, 2.09f, 1.66f)
                curveToRelative(0.21f, 1.25f, -0.76f, 2.34f, -1.97f, 2.34f)
                horizontalLineTo(15f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.32f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f)
                verticalLineTo(19f)
                horizontalLineToRelative(2f)
                curveToRelative(2.34f, 0f, 4.21f, -2.01f, 3.98f, -4.39f)
                curveToRelative(-0.2f, -2.08f, -2.06f, -3.61f, -4.15f, -3.61f)
                close()
                moveTo(9f, 17f)
                horizontalLineTo(5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Wrap_text!!
    }

private var _Wrap_text: ImageVector? = null

