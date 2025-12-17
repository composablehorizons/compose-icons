package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Do_not_disturb_off: ImageVector
    get() {
        if (_Do_not_disturb_off != null) return _Do_not_disturb_off!!
        
        _Do_not_disturb_off = ImageVector.Builder(
            name = "do_not_disturb_off",
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
                moveTo(17f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.46f)
                lineToRelative(4.68f, 4.68f)
                curveTo(21.34f, 16.07f, 22f, 14.11f, 22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                curveToRelative(-2.11f, 0f, -4.07f, 0.66f, -5.68f, 1.78f)
                lineTo(13.54f, 11f)
                horizontalLineTo(17f)
                close()
                moveTo(2.27f, 2.27f)
                lineTo(1f, 3.54f)
                lineToRelative(2.78f, 2.78f)
                curveTo(2.66f, 7.93f, 2f, 9.89f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.11f, 0f, 4.07f, -0.66f, 5.68f, -1.78f)
                lineTo(20.46f, 23f)
                lineToRelative(1.27f, -1.27f)
                lineTo(11f, 11f)
                lineTo(2.27f, 2.27f)
                close()
                moveTo(7f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.46f)
                lineToRelative(2f, 2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Do_not_disturb_off!!
    }

private var _Do_not_disturb_off: ImageVector? = null

