package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Do_disturb_off: ImageVector
    get() {
        if (_Do_disturb_off != null) return _Do_disturb_off!!
        
        _Do_disturb_off = ImageVector.Builder(
            name = "do_disturb_off",
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
                horizontalLineToRelative(-0.88f)
                lineToRelative(4.33f, 4.33f)
                curveTo(21.43f, 15.79f, 22f, 13.96f, 22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                curveToRelative(-1.96f, 0f, -3.79f, 0.57f, -5.33f, 1.55f)
                lineTo(14.12f, 11f)
                horizontalLineTo(17f)
                close()
                moveToRelative(4.17f, 9.88f)
                lineTo(3.12f, 2.83f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.07f, 2.07f)
                curveTo(2.66f, 7.93f, 2f, 9.89f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.11f, 0f, 4.07f, -0.66f, 5.68f, -1.78f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
                moveTo(7f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.46f)
                lineToRelative(2f, 2f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _Do_disturb_off!!
    }

private var _Do_disturb_off: ImageVector? = null

