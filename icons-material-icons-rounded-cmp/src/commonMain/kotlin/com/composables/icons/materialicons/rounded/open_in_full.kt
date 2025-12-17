package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Open_in_full: ImageVector
    get() {
        if (_Open_in_full != null) return _Open_in_full!!
        
        _Open_in_full = ImageVector.Builder(
            name = "open_in_full",
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
                moveTo(21f, 8.59f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.59f)
                curveToRelative(-0.89f, 0f, -1.34f, 1.08f, -0.71f, 1.71f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(-10f, 10f)
                lineToRelative(-1.59f, -1.59f)
                curveTo(4.08f, 14.08f, 3f, 14.52f, 3f, 15.41f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.59f)
                curveToRelative(0.89f, 0f, 1.34f, -1.08f, 0.71f, -1.71f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(10f, -10f)
                lineToRelative(1.59f, 1.59f)
                curveTo(19.92f, 9.92f, 21f, 9.48f, 21f, 8.59f)
                close()
            }
        }.build()
        
        return _Open_in_full!!
    }

private var _Open_in_full: ImageVector? = null

