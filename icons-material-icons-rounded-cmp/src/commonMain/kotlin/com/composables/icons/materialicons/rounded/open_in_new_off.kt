package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Open_in_new_off: ImageVector
    get() {
        if (_Open_in_new_off != null) return _Open_in_new_off!!
        
        _Open_in_new_off = ImageVector.Builder(
            name = "open_in_new_off",
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
                moveTo(16.79f, 5.8f)
                lineToRelative(-1.94f, -1.94f)
                curveTo(14.54f, 3.54f, 14.76f, 3f, 15.21f, 3f)
                horizontalLineToRelative(5.29f)
                curveTo(20.78f, 3f, 21f, 3.22f, 21f, 3.5f)
                verticalLineToRelative(5.29f)
                curveToRelative(0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineTo(18.21f, 7.2f)
                lineToRelative(-4.09f, 4.09f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(16.79f, 5.8f)
                close()
                moveTo(19f, 13f)
                verticalLineToRelative(3.17f)
                lineToRelative(2f, 2f)
                verticalLineTo(13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(20f)
                curveTo(19.45f, 12f, 19f, 12.45f, 19f, 13f)
                close()
                moveTo(19.07f, 21.9f)
                lineToRelative(-0.9f, -0.9f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5.83f)
                lineToRelative(-0.9f, -0.9f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0f, 0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(16.97f, 16.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(0f, 0f)
                curveTo(20.09f, 22.29f, 19.46f, 22.29f, 19.07f, 21.9f)
                close()
                moveTo(16.17f, 19f)
                lineToRelative(-4.88f, -4.88f)
                lineTo(10.41f, 15f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(0f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0.88f, -0.88f)
                lineTo(5f, 7.83f)
                verticalLineTo(19f)
                horizontalLineTo(16.17f)
                close()
                moveTo(7.83f, 5f)
                horizontalLineTo(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(5.83f)
                lineTo(7.83f, 5f)
                close()
            }
        }.build()
        
        return _Open_in_new_off!!
    }

private var _Open_in_new_off: ImageVector? = null

