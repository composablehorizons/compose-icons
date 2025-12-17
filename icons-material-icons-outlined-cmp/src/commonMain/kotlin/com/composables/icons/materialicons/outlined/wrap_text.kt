package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wrap_text: ImageVector
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
                moveTo(4f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 5f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineTo(5f)
                close()
                moveToRelative(-3f, 6f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(13.25f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineTo(15f)
                verticalLineToRelative(-2f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.build()
        
        return _Wrap_text!!
    }

private var _Wrap_text: ImageVector? = null

