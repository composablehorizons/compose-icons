package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Find_replace: ImageVector
    get() {
        if (_Find_replace != null) return _Find_replace!!
        
        _Find_replace = ImageVector.Builder(
            name = "find_replace",
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
                moveTo(11f, 6f)
                curveToRelative(1.38f, 0f, 2.63f, 0.56f, 3.54f, 1.46f)
                lineTo(12f, 10f)
                horizontalLineToRelative(6f)
                verticalLineTo(4f)
                lineToRelative(-2.05f, 2.05f)
                curveTo(14.68f, 4.78f, 12.93f, 4f, 11f, 4f)
                curveToRelative(-3.53f, 0f, -6.43f, 2.61f, -6.92f, 6f)
                horizontalLineTo(6.1f)
                curveToRelative(0.46f, -2.28f, 2.48f, -4f, 4.9f, -4f)
                close()
                moveToRelative(5.64f, 9.14f)
                curveToRelative(0.66f, -0.9f, 1.12f, -1.97f, 1.28f, -3.14f)
                horizontalLineTo(15.9f)
                curveToRelative(-0.46f, 2.28f, -2.48f, 4f, -4.9f, 4f)
                curveToRelative(-1.38f, 0f, -2.63f, -0.56f, -3.54f, -1.46f)
                lineTo(10f, 12f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                lineToRelative(2.05f, -2.05f)
                curveTo(7.32f, 17.22f, 9.07f, 18f, 11f, 18f)
                curveToRelative(1.55f, 0f, 2.98f, -0.51f, 4.14f, -1.36f)
                lineTo(20f, 21.49f)
                lineTo(21.49f, 20f)
                lineToRelative(-4.85f, -4.86f)
                close()
            }
        }.build()
        
        return _Find_replace!!
    }

private var _Find_replace: ImageVector? = null

