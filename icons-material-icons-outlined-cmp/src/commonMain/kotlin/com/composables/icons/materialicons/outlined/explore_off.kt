package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Explore_off: ImageVector
    get() {
        if (_Explore_off != null) return _Explore_off!!
        
        _Explore_off = ImageVector.Builder(
            name = "explore_off",
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
                curveToRelative(0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.06f)
                lineToRelative(1.46f, 1.46f)
                curveTo(21.39f, 15.93f, 22f, 14.04f, 22f, 12f)
                curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                curveToRelative(-2.04f, 0f, -3.93f, 0.61f, -5.51f, 1.66f)
                lineToRelative(1.46f, 1.46f)
                curveTo(9.14f, 4.41f, 10.52f, 4f, 12f, 4f)
                close()
                moveToRelative(2.91f, 8.08f)
                lineTo(17.5f, 6.5f)
                lineToRelative(-5.58f, 2.59f)
                lineToRelative(2.99f, 2.99f)
                close()
                moveTo(2.1f, 4.93f)
                lineToRelative(1.56f, 1.56f)
                curveTo(2.61f, 8.07f, 2f, 9.96f, 2f, 12f)
                curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                curveToRelative(2.04f, 0f, 3.93f, -0.61f, 5.51f, -1.66f)
                lineToRelative(1.56f, 1.56f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.51f, 3.51f)
                lineTo(2.1f, 4.93f)
                close()
                moveToRelative(3.02f, 3.01f)
                lineToRelative(3.98f, 3.98f)
                lineToRelative(-2.6f, 5.58f)
                lineToRelative(5.58f, -2.59f)
                lineToRelative(3.98f, 3.98f)
                curveToRelative(-1.2f, 0.7f, -2.58f, 1.11f, -4.06f, 1.11f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

