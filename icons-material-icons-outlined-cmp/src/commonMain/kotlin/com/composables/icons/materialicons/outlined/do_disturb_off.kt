package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Do_disturb_off: ImageVector
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
                moveTo(12f, 4f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 1.41f, -0.37f, 2.73f, -1.01f, 3.88f)
                lineToRelative(1.46f, 1.46f)
                curveTo(21.43f, 15.79f, 22f, 13.96f, 22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                curveToRelative(-1.96f, 0f, -3.79f, 0.57f, -5.33f, 1.55f)
                lineToRelative(1.46f, 1.46f)
                curveTo(9.27f, 4.37f, 10.59f, 4f, 12f, 4f)
                close()
                moveToRelative(5f, 7f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(2f, 2f)
                horizontalLineTo(17f)
                close()
                moveTo(2.41f, 2.13f)
                lineTo(1f, 3.54f)
                lineToRelative(2.78f, 2.78f)
                curveTo(2.66f, 7.93f, 2f, 9.89f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.11f, 0f, 4.07f, -0.66f, 5.68f, -1.78f)
                lineTo(20.46f, 23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 2.13f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -1.56f, 0.45f, -3f, 1.23f, -4.23f)
                lineTo(8.46f, 11f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.46f)
                lineToRelative(5.77f, 5.77f)
                curveTo(15f, 19.55f, 13.56f, 20f, 12f, 20f)
                close()
            }
        }.build()
        
        return _Do_disturb_off!!
    }

private var _Do_disturb_off: ImageVector? = null

